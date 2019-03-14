package com.javacourse.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Note {

    private String text;
    private Date recordDate;

    public Note(String text, Date recordDate) {
        this.text = text;
        this.recordDate = recordDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Note)) return false;

        Note note = (Note) o;

        if (text != null ? !text.equals(note.text) : note.text != null) return false;
        return recordDate != null ? recordDate.equals(note.recordDate) : note.recordDate == null;
    }

    @Override
    public int hashCode() {
        int result = text != null ? text.hashCode() : 0;
        result = 31 * result + (recordDate != null ? recordDate.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Note{" + "text='" + text + '\'' +
                ", recordDate=" + recordDate +
                '}';
    }
}
