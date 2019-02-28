package fr.afpa.formation.exception;

/**
 * <b>EXCEPTION DU TYPE CI-DESSOUS :</b><br/>
 * TYPE : 'PERSONNE EXISTE DEJA'
 */

public class BoutiqueItemOutOfStockException extends RuntimeException {


    /**
	 * */
	private static final long serialVersionUID = 1L;

	/**
     * <b>CONSTRUCTEUR AVEC UN ARGUMENT</b><br/>
     * @param pMessage Le message de l'exception
     */
	public BoutiqueItemOutOfStockException(String pMessage) {
        super(pMessage);
    }
}
