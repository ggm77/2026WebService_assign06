package com.seohamin.simple_note_html.controller;

import com.seohamin.simple_note_html.dto.NoteRequestDto;
import com.seohamin.simple_note_html.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/notes")
public class NoteWebController {

    private final NoteService noteService;

    @Autowired
    public NoteWebController(final NoteService noteService) {
        this.noteService = noteService;
    }

    @GetMapping("")
    public String list(final Model model) {
        model.addAttribute("notes", noteService.getAllNotes());

        return "notes/list";
    }

    @GetMapping("/new")
    public String form() {
        return "notes/form";
    }

    @PostMapping("")
    public String create(@ModelAttribute final NoteRequestDto noteRequestDto) {
        noteService.createNote(noteRequestDto);

        return "redirect:/notes";
    }
}
