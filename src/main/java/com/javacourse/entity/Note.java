package com.javacourse.entity;

import lombok.Data;
import java.util.Date;


@Data
public class Note {

    private String text;
    private Date recordDate;
    private NoteType noteType;

    public Note(String text, Date recordDate, NoteType noteType) {
        this.text = text;
        this.recordDate = recordDate;
        this.noteType = noteType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Note)) return false;
        if (!super.equals(o)) return false;

        Note note = (Note) o;

        if (text != null ? !text.equals(note.text) : note.text != null) return false;
        if (recordDate != null ? !recordDate.equals(note.recordDate) : note.recordDate != null) return false;
        return noteType == note.noteType;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (text != null ? text.hashCode() : 0);
        result = 31 * result + (recordDate != null ? recordDate.hashCode() : 0);
        result = 31 * result + (noteType != null ? noteType.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Note{" + "text='" + text + '\'' +
                ", recordDate=" + recordDate +
                ", noteType=" + noteType +
                '}';
    }
}
