package mediator;

import javax.swing.*;
import components.NoteComponent;


//Common mediator interface.

public interface Mediator {
    void addNewNote(Note note);
    void deleteNote();
    void getInfoFromList(Note note);
    void saveChanges();
    void markNote();
    void clear();
    void sendToFilter(ListModel listModel);
    void setElementsList(ListModel list);
    void registerComponent(NoteComponent component);
    void hideElements(boolean flag);
    void createGUI();
}