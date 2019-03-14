package com.javacourse;

import com.javacourse.provider.NoteBookProvider;
import com.javacourse.view.NoteBookConsoleView;

public class Application {

    private static NoteBookProvider provider = NoteBookProvider.getInstance();
    private static NoteBookConsoleView view = new NoteBookConsoleView();

    public static void main(String[] args) {

        System.out.println("RandomNote: ");
        view.print(provider.getRandomNote());
        System.out.println("Notes: ");
        view.print(provider.getRandomNoteBook().getNotes());
        System.out.println("RandomNoteBook: ");
        view.print(provider.getRandomNoteBook());
        System.out.println("NoteBooks: ");
        view.print(provider.getNoteBooks());
    }
}
