package fr.afpa.formation.exception;




public class AnimalNotFoundException extends RuntimeException {


    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	public AnimalNotFoundException(String pMessage) {
        super(pMessage);
    }
}
