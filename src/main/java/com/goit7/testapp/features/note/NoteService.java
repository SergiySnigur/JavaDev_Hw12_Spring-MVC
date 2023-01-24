package com.goit7.testapp.features.note;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;

@RequiredArgsConstructor
@Service
public class NoteService implements NoteRepository {
    private final NoteStorage notes;

    @Override
    public Note add(Note note) {
        note.setId((note.getTitle() + note.getContent()).hashCode());
        notes.getStorage().put(note.getId(), note);
        return note;
    }

    @Override
    public Note getById(long id) {
        return notes.getStorage().get(id);
    }

    @Override
    public List<Note> listAll() {
        return notes.getStorage().values().stream().toList();
    }

    @Override
    public void update(Note note) {
        notes.getStorage().put(note.getId(), note);
    }

    @Override
    public void deleteById(long id) {
        notes.getStorage().remove(id);
    }
}
