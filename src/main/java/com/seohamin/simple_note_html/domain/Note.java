package com.seohamin.simple_note_html.domain;

import java.time.Instant;

public class Note {

    private Long id;

    private String title;

    private String author;

    private String category;

    private String content;

    private String tags;

    private Instant createdAt;

    private Instant updatedAt;

    public Note(
            final Long id,
            final String title,
            final String author,
            final String category,
            final String content,
            final String tags,
            final Instant createdAt,
            final Instant updatedAt
    ) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.category = category;
        this.content = content;
        this.tags = tags;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }
}
