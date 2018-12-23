package com.anhong.service.impl;

import com.anhong.entity.Document;
import com.anhong.repository.DocumentRepository;
import com.anhong.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DocumentServiceImpl implements DocumentService {
    @Autowired
    DocumentRepository documentRepository;
    @Override
    public void save(Document document) {
        documentRepository.save(document);
    }

    @Override
    public void delete(Long id) {
        documentRepository.delete(documentRepository.getOne(id));
    }

    @Override
    public Document queryById(Long id) {
        return documentRepository.getOne(id);
    }

    @Override
    public List<Document> queryAll() {
        return documentRepository.findAll();
    }
}
