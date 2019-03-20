package com.javacourse.entity;

public enum NoteType {
    NOTE("Запись"),
    TASK("Задача");

    private String noteType;

    NoteType(String type) {
        this.noteType = type;
    }

    public String getRusName(){
        return noteType;
    }
}
