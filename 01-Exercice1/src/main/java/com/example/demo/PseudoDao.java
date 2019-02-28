package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class PseudoDao {
	
	public List<String> list() {
		List<String> list = new ArrayList<>();
		list.add("Numéro 1");
		list.add("Numéro 2");
		list.add("Numéro 3");
		list.add("Numéro 4");
		list.add("Numéro 5");
		return list;
	}

}
