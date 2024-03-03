package com.example.contentcalendar.repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.example.contentcalendar.model.Content;
import com.example.contentcalendar.model.Status;
import com.example.contentcalendar.model.Type;

import jakarta.annotation.PostConstruct;

@Repository
public class ContentCollectionRepository {

  private final List<Content> contentList = new ArrayList<>();

  public ContentCollectionRepository() {

  }

  public List<Content> findAll() {
    return contentList;
  }

  public Optional<Content> findById(Integer id) {
    return contentList.stream().filter(c -> c.id().equals(id)).findFirst();
  }

  public void save(Content content) {
    contentList.removeIf(c -> c.id().equals(content.id())); // so the update function works; this is just a temporary
                                                            // in-memory repository anyway
    contentList.add(content);
  }

  public Boolean existsById(Integer id) {
    return contentList.stream().filter(c -> c.id().equals(id)).count() == 1;
  }

  @PostConstruct
  private void init() {
    Content content = new Content(
        1,
        "My First Blog Post",
        "My first post",
        Status.IDEA,
        Type.ARTICLE,
        LocalDateTime.now(),
        null,
        "");

    contentList.add(content);
  }
}
