package fr.afpa.formation.exception;



public class AnimalAlreadyExistsException extends Exception {


	private static final long serialVersionUID = 1L;

	public AnimalAlreadyExistsException(String pMessage) {
        super(pMessage);
    }
}
