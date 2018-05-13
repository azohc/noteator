package components;

import mediator.Mediator;

//Interface for the components that would normally be related
public interface NoteComponent {
    void setMediator(Mediator mediator);	//There will be a relation through the mediator
    String getName();
}
