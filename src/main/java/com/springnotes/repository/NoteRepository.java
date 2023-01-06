package com.springnotes.repository;

import com.springnotes.model.domain.Note;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface NoteRepository extends CrudRepository<Note, Long> {
    List<Note> findByTitle(String title);
}
