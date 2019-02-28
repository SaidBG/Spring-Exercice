package fr.afpa.formation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.afpa.formation.entity.BoutiqueItem;
import fr.afpa.formation.exception.BoutiqueItemNotAvailableException;
import fr.afpa.formation.exception.BoutiqueItemNotFoundException;
import fr.afpa.formation.exception.BoutiqueItemNotValidException;
import fr.afpa.formation.repository.BoutiqueItemRepository;
@Service
public class BoutiqueItemService implements IService<BoutiqueItem, Exception> {

	@Autowired
	BoutiqueItemRepository boutiqueItemRepository;

	public List<BoutiqueItem> findAll() {

		return (List<BoutiqueItem>) boutiqueItemRepository.findAll(); 
	}


	public BoutiqueItem create(BoutiqueItem bt) {
		if (bt == null) {
			throw new BoutiqueItemNotValidException("L'espèce fournie est non valide");
		} else if (bt.getId()!=null) {
				Long idARechercher = bt.getId();
				Optional<BoutiqueItem> btOptional = boutiqueItemRepository.findById(idARechercher);
				if (btOptional.isPresent()) {
					throw new BoutiqueItemNotValidException("Le produit existe déjà");
				} 
		}
	// CAS NOMINAL
		BoutiqueItem btcreated = boutiqueItemRepository.save(bt);
		return btcreated;
		}
		



	public BoutiqueItem findById(Long id) {
		if (id == null) {
			throw new BoutiqueItemNotFoundException("L'espèce recherchée est introuvable");
		}
		return boutiqueItemRepository.findById(id).get();
	}
	
	
	public BoutiqueItem update(BoutiqueItem bt) throws BoutiqueItemNotValidException, BoutiqueItemNotAvailableException {
	
		BoutiqueItem btUpdated = boutiqueItemRepository.save(bt);
		return btUpdated;
	}
	
	public void delete(Long id) throws BoutiqueItemNotFoundException {
		if (id == null) {
			throw new BoutiqueItemNotFoundException("L'espèce recherchée est introuvable");
		} 
		boutiqueItemRepository.deleteById(id);
	}

}
