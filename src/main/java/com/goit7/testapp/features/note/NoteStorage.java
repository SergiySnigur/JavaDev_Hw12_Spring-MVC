package com.goit7.testapp.features.note;

import lombok.Data;

import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.Map;

@Data
@Service
public class NoteStorage {
    private Map<Long, Note> storage = new LinkedHashMap<>();
}
