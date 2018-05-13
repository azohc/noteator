package components;

import javax.swing.*;

import mediator.Mediator;

import java.awt.event.KeyEvent;

@SuppressWarnings("serial")
public class Title extends JTextField implements NoteComponent {
	
//  Concrete components don't reference each other. 
//  They have only one way of communicating: sending requests to the mediator.
	
    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void processComponentKeyEvent(KeyEvent keyEvent) {
        mediator.markNote();
    }

    @Override
    public String getName() {
        return "Title";
    }
}