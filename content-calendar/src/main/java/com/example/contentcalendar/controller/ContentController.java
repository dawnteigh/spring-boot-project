package com.example.contentcalendar.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.contentcalendar.model.Content;
import com.example.contentcalendar.repository.ContentCollectionRepository;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/content")
public class ContentController {

  private final ContentCollectionRepository repository;

  public ContentController(ContentCollectionRepository contentCollectionRepository) {
    this.repository = contentCollectionRepository;
  }

  @GetMapping("")
  public List<Content> findAll() {
    return repository.findAll();
  }
}
