package fr.afpa.formation.exception;

/**
 * <b>EXCEPTION DU TYPE CI-DESSOUS :</b><br/>
 * TYPE : 'COMMANDE EXISTE DEJA'
 */

public class CommandeAlreadyExistsException extends RuntimeException {


    /**
	 * */
	private static final long serialVersionUID = 1L;

	/**
     * <b>CONSTRUCTEUR AVEC UN ARGUMENT</b><br/>
     * @param pMessage Le message de l'exception
     */
	public CommandeAlreadyExistsException (String pMessage) {
        super(pMessage);
    }
}
