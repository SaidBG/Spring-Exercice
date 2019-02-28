package fr.afpa.formation.exception;


/**
 * <b>EXCEPTION DU TYPE CI-DESSOUS :</b><br/>
 * TYPE : 'COMMNDE -ID EXISTE PAS'
*/
public class CommandeNotAvailableException extends RuntimeException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * <b>CONSTRUCTEUR AVEC UN ARGUMENT</b><br/>
     * @param pMessage Le message de l'exception
     */
	public CommandeNotAvailableException(String pMessage) {
        super(pMessage);
    }
}
