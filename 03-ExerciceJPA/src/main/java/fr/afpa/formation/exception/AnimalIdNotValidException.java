package fr.afpa.formation.exception;

/**
 * <b>EXCEPTION DU TYPE CI-DESSOUS :</b><br/>
 * TYPE : 'PERSONNE-ID NON VALIDE'
*/
public class AnimalIdNotValidException extends Exception {


    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * <b>CONSTRUCTEUR AVEC UN ARGUMENT</b><br/>
     * @param pMessage Le message de l'exception
     */
	public AnimalIdNotValidException(String pMessage) {
        super(pMessage);
    }
}
