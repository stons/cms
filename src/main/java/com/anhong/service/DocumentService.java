package com.anhong.service;

import com.anhong.entity.Document;

import java.util.List;

public interface DocumentService {
    void save(Document document);
    void delete(Long id);
    Document queryById(Long id);
    List<Document> queryAll();
}
