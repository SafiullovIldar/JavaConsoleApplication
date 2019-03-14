package com.javacourse.provider;

import com.javacourse.entity.Note;
import com.javacourse.entity.NoteBook;
import java.util.Random;

public class NoteBookProvider {

    private NoteBook[] noteBooks;

    {
        noteBooks = new NoteBook[]{new NoteBook("NoteBook1"), new NoteBook("NoteBook2")};
    }

    private NoteBookProvider() {
    }

    private static NoteBookProvider instance;

    public static NoteBookProvider getInstance(){
        if (instance == null){
            instance = new NoteBookProvider();
        }
        return instance;
    }

    public NoteBook getRandomNoteBook(){
        return noteBooks[new Random().nextInt(noteBooks.length)];
    }

    public Note getRandomNote() {
        NoteBook noteBook = getRandomNoteBook();
        Note[] notes = noteBook.getNotes();
        return notes[new Random().nextInt(notes.length)];
    }

    public NoteBook[] getNoteBooks() {
        return noteBooks;
    }
}
