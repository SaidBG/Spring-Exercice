package fr.afpa.formation.service;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.afpa.formation.entity.BoutiqueItem;
import fr.afpa.formation.entity.Commande;
import fr.afpa.formation.entity.CommandeItem;
import fr.afpa.formation.repository.BoutiqueItemRepository;
import fr.afpa.formation.repository.CommandeItemRepository;
import fr.afpa.formation.repository.CommandeRepository;
@Service
public class CommandeService {

	@Autowired
	CommandeRepository commandeRepository;
	@Autowired
	BoutiqueItemRepository bRepo;
	@Autowired
	CommandeItemRepository ciRepo;
	public List<Commande> findAll() {
		return (List<Commande>) commandeRepository.findAll(); 
	}


	public Commande create(List<PanierItem> list) {
		Commande cmd = new Commande();
		Set<CommandeItem> listSet = new HashSet<>();
		for(PanierItem pi : list ) {
			CommandeItem ci = new CommandeItem();
			BoutiqueItem bi = bRepo.findByCode(pi.getCode());
			ci.setBoutiqueItem(bi);
			ci.setNbItem(pi.getQuantite());
			ci.setCommandes(cmd);
			listSet.add(ci);
		}
		cmd.setDate(new Date());
		cmd.setCommandeItem(listSet);
		return commandeRepository.save(cmd);
	}

	

}


