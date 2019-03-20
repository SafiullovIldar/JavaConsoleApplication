package com.javacourse.provider;

import com.javacourse.entity.Note;
import com.javacourse.entity.NoteBook;


public interface NoteBookProvider {

    NoteBook getRandomNoteBook();
    Note getRandomNote();
    NoteBook[] getNoteBooks();
}
