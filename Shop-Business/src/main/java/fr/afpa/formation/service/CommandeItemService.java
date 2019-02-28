package fr.afpa.formation.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.afpa.formation.entity.CommandeItem;
import fr.afpa.formation.repository.CommandeItemRepository;
@Service
public class CommandeItemService {
	@Autowired
	CommandeItemRepository commandeItemRepository;

	public List<CommandeItem> findAll() {
		return (List<CommandeItem>) commandeItemRepository.findAll(); 
	}


	public CommandeItem create(CommandeItem cmd) {
		return commandeItemRepository.save(cmd);
	}
	public CommandeItem findById(Long id) {
		return commandeItemRepository.findById(id).get();
	}
	public CommandeItem convert(HttpSession session,List<PanierItem> list) {
		
		return null;
		
	}
}
