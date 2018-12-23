package com.anhong.web.controller;

import com.anhong.entity.Document;
import com.anhong.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Objects;

@Controller
@RequestMapping("document")
public class DocumentController {
    @Autowired
    DocumentService documentService;

    @RequestMapping("form")
    public String form(Model model, Long id){
        if(Objects.nonNull(id)){
            model.addAttribute("document",documentService.queryById(id));
        }
        model.addAttribute("test","123123");
        return "/document/form";
    }

    @PostMapping("save")
    public String save(Document document){
        documentService.save(document);
        return  "redirect:list";
    }

    @RequestMapping("list")
    public String list(Model model){
        List<Document> documents = documentService.queryAll();
        Document document = new Document();
        document.setTitle("xiaomin");
        document.setId(1L);
        documents.add(document);
        model.addAttribute("documentList",documents);
        return "/document/list";
    }
    @RequestMapping("delete")
    public String delete(Model model,Long id){
        documentService.delete(id);
        return "/document/list";
    }
}
