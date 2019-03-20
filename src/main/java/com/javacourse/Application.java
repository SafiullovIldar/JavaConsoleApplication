package com.javacourse;

import com.javacourse.entity.Note;
import com.javacourse.provider.impl.InMemoryNoteBookProvider;
import com.javacourse.view.NoteBookConsoleView;
import com.javacourse.view.NoteBookView;


public class Application {

    private static InMemoryNoteBookProvider provider = InMemoryNoteBookProvider.getInstance();
    private static NoteBookConsoleView view = new NoteBookConsoleView();

    public static void main(String[] args) {

        System.out.println("RandomNote: ");
        new NoteBookView() {
            @Override
            public void print(Note note) {
                System.out.println(note.toString());
            }
        }.print(provider.getRandomNote());

        System.out.println("Notes: ");
        view.print(provider.getRandomNoteBook().getNotes());

        System.out.println("RandomNoteBook: ");
        view.print(provider.getRandomNoteBook());

        System.out.println("NoteBooks: ");
        view.print(provider.getNoteBooks());

    }
}
