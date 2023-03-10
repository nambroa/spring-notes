package com.springnotes.services;

import com.springnotes.factory.NoteFactory;
import com.springnotes.model.api.CreateNoteRequest;
import com.springnotes.model.domain.Note;
import com.springnotes.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;

@Component
public class DefaultNoteService implements NoteService {

    private final NoteRepository noteRepository;

    private final NoteFactory noteFactory;


    @Autowired
    public DefaultNoteService(NoteRepository noteRepository, NoteFactory noteFactory) {
        this.noteRepository = noteRepository;
        this.noteFactory = noteFactory;
    }

    public Note createNote(CreateNoteRequest createNoteRequest) {
        Note note = this.noteFactory.createFrom(createNoteRequest);
        this.noteRepository.save(note);
        return note;
    }

    public List<Note> getAllNotes() {
        return this.noteRepository.findAll();
    }

    public Optional<Note> getNote(String noteId) {
        return this.noteRepository.findById(Long.valueOf(noteId));
    }
}
