package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class B {
	@Autowired
	C myC;
	public String getStringA() {
		
	return "     ▄█    ▄████████         ▄████████ ███    █▄   ▄█     ▄████████      ▀█████████▄  \r\n" + 
			"    ███   ███    ███        ███    ███ ███    ███ ███    ███    ███        ███    ███ \r\n" + 
			"    ███   ███    █▀         ███    █▀  ███    ███ ███▌   ███    █▀         ███    ███ \r\n" + 
			"    ███  ▄███▄▄▄            ███        ███    ███ ███▌   ███              ▄███▄▄▄██▀  \r\n" + 
			"    ███ ▀▀███▀▀▀          ▀███████████ ███    ███ ███▌ ▀███████████      ▀▀███▀▀▀██▄  \r\n" + 
			"    ███   ███    █▄                ███ ███    ███ ███           ███        ███    ██▄ \r\n" + 
			"    ███   ███    ███         ▄█    ███ ███    ███ ███     ▄█    ███        ███    ███ \r\n" + 
			"█▄ ▄███   ██████████       ▄████████▀  ████████▀  █▀    ▄████████▀       ▄█████████▀  \r\n" + 
			"▀▀▀▀▀▀                                                                                "+ myC.getMyString();
	}
	
}
