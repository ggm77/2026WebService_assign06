package com.seohamin.simple_note_html.dto;

import com.seohamin.simple_note_html.domain.Note;

import java.time.Instant;

public record NoteResponseDto(
        Long id,
        String title,
        String author,
        String category,
        String content,
        String tags,
        Instant createdAt,
        Instant updatedAt
) {

    public static NoteResponseDto of(final Note note) {
        return new NoteResponseDto(
                note.getId(),
                note.getTitle(),
                note.getAuthor(),
                note.getCategory(),
                note.getContent(),
                note.getTags(),
                note.getCreatedAt(),
                note.getUpdatedAt()
        );
    }
}
