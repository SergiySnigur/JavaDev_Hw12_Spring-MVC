package com.goit7.testapp.features.note;

import com.goit7.testapp.features.note.Note;

import java.util.List;

public interface NoteRepository {
    Note add(Note note);

    Note getById(long id);

    List<Note> listAll();

    void update(Note note);

    void deleteById(long id);

}
