package com.javacourse.provider.impl;

import com.javacourse.entity.Note;
import com.javacourse.entity.NoteBook;
import com.javacourse.provider.NoteBookProvider;
import com.javacourse.util.CrazyLogger;

import java.util.Random;


public class InMemoryNoteBookProvider implements NoteBookProvider {

    private static InMemoryNoteBookProvider instance;
    private NoteBook[] noteBooks;
    private CrazyLogger logger = CrazyLogger.getInstance();

    {
        noteBooks = new NoteBook[]{new NoteBook("NoteBook1"), new NoteBook("NoteBook2")};
        logger.addMessageToLogger("Initialised a noteBooks massive");
    }

    private InMemoryNoteBookProvider() {
    }

    public static InMemoryNoteBookProvider getInstance(){
        if (instance == null){
            instance = new InMemoryNoteBookProvider();
        }
        return instance;
    }

    @Override
    public NoteBook getRandomNoteBook(){
        return noteBooks[new Random().nextInt(noteBooks.length)];
    }

    @Override
    public Note getRandomNote() {
        NoteBook noteBook = getRandomNoteBook();
        Note[] notes = noteBook.getNotes();
        return notes[new Random().nextInt(notes.length)];
    }

    @Override
    public NoteBook[] getNoteBooks() {
        return noteBooks;
    }
}
