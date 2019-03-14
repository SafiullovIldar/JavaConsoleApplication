package com.javacourse.view;

import com.javacourse.entity.Note;
import com.javacourse.entity.NoteBook;

public class NoteBookConsoleView {

    public void print(Note note) {
        System.out.println(note.toString());
    }

    public void print(Note...notes) {
        for (Note note : notes) {
            System.out.println(note.toString());
        }
    }

    public void print(NoteBook noteBook) {
        System.out.println(noteBook.toString());
    }

    public void print(NoteBook...noteBooks) {
        for (NoteBook noteBook : noteBooks) {
            System.out.println(noteBook.toString());
        }
    }

}
