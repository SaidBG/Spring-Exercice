package fr.afpa.formation.exception;


/**
 * <b>EXCEPTION DU TYPE CI-DESSOUS :</b><br/>
 * TYPE : 'BOUTIQUE ITEM INTROUVABLE'
 */

public class BoutiqueItemNotFoundException extends RuntimeException {


    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * <b>CONSTRUCTEUR AVEC UN ARGUMENT</b><br/>
     * @param pMessage Le message de l'exception
     */
	public BoutiqueItemNotFoundException(String pMessage) {
        super(pMessage);
    }
}
