package fr.afpa.formation.exception;


/**
 * <b>EXCEPTION DU TYPE CI-DESSOUS :</b><br/>
 * TYPE : 'COMMANDE NON TROUVE'
 */

public class CommanndeNotFoundException extends RuntimeException {


    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * <b>CONSTRUCTEUR AVEC UN ARGUMENT</b><br/>
     * @param pMessage Le message de l'exception
     */
	public CommanndeNotFoundException(String pMessage) {
        super(pMessage);
    }
}
