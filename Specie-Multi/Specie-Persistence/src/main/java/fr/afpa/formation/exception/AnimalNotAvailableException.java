package fr.afpa.formation.exception;

public class AnimalNotAvailableException extends Exception {
	 
	private static final long serialVersionUID = 1L;

	/**
    * <b>CONSTRUCTEUR AVEC UN ARGUMENT</b><br/>
    * @param pMessage Le message de l'exception
    */
	public AnimalNotAvailableException(String pMessage) {
       super(pMessage);
   }
}

