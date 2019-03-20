package com.javacourse.entity;

import lombok.Data;
import java.util.Arrays;
import java.util.Date;


@Data
public class NoteBook {

    private String noteBookName;
    private Note[] notes = {new Note("Note1", new Date(), NoteType.NOTE)
        ,new Note("Note2", new Date(), NoteType.TASK)
        ,new Note("Note3", new Date(), NoteType.NOTE)};

    public NoteBook(String noteBookName) {
        this.noteBookName = noteBookName;
    }

    public int notesCount(){
        return notes.length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NoteBook)) return false;
        if (!super.equals(o)) return false;

        NoteBook noteBook = (NoteBook) o;

        if (noteBookName != null ? !noteBookName.equals(noteBook.noteBookName) : noteBook.noteBookName != null)
            return false;

        return Arrays.equals(notes, noteBook.notes);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (noteBookName != null ? noteBookName.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(notes);
        return result;
    }

    @Override
    public String toString() {
        return "NoteBook{" + "noteBookName='" + noteBookName + '\'' +
                ", notes=" + Arrays.toString(notes) +
                '}';
    }
}
