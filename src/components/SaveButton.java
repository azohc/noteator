package components;

import java.awt.event.ActionEvent;

import javax.swing.*;

import mediator.Mediator;

public class SaveButton extends JButton implements NoteComponent {
	
//  Concrete components don't reference each other. 
//  They have only one way of communicating: sending requests to the mediator.
	
	private Mediator mediator;

    public SaveButton() {
        super("Save");
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void fireActionPerformed(ActionEvent actionEvent) {
        mediator.saveChanges();
    }

    @Override
    public String getName() {
        return "SaveButton";
    }
}
