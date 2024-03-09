package com.example.contentcalendar.repository;

import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;

@Repository
public class ContentJdbcTemplateRepository {

  private final JdbcTemplate jdbcTemplate;

  public ContentJdbcTemplateRepository(JdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }

}
