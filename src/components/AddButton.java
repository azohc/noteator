package components;

import java.awt.event.ActionEvent;
import javax.swing.*;
import mediator.*;

@SuppressWarnings("serial")
public class AddButton extends JButton implements NoteComponent {
	
//  Concrete components don't reference each other. 
//  They have only one way of communicating: sending requests to the mediator.
	
    private Mediator mediator;

    public AddButton() {
        super("Add");
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void fireActionPerformed(ActionEvent actionEvent) {
        mediator.addNewNote(new Note());
    }

    @Override
    public String getName() {
        return "AddButton";
    }
}
