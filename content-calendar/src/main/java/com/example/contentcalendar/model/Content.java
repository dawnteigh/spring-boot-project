package com.example.contentcalendar.model;

import java.time.LocalDateTime;

/**
 * Content
 */
public record Content(
    Integer id,
    String title,
    String desc,
    Status status,
    Type contentType,
    LocalDateTime dateCreated,
    LocalDateTime dateUpdated,
    String url) {

}