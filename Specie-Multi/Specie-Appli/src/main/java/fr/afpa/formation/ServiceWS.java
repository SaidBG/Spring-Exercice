package fr.afpa.formation;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
@Component
public class ServiceWS {
	static final String BASE_URL = "http://10.111.61.31:8080/rest/species";





	public List<SpecieDTO> findAll() {
		RestTemplate rt = new RestTemplate();
		List<SpecieDTO> list;		
		SpecieDTO[] sps = rt.getForObject(BASE_URL, SpecieDTO[].class);		
		return Arrays.asList(sps);


	}


	public void delete(Long id) {
		RestTemplate rt = new RestTemplate();
		rt.delete(BASE_URL+"/"+ id);
	}

	public void create (SpecieDTO sp) {
		RestTemplate rt = new RestTemplate();		
		HttpHeaders head = new HttpHeaders();
		head.add("Accept", MediaType.APPLICATION_JSON_VALUE);
		head.setContentType(MediaType.APPLICATION_JSON);		
		HttpEntity<SpecieDTO> body = new HttpEntity<>(sp,head);
		rt.postForObject(BASE_URL, body, Long.class);
	}

	public SpecieDTO findById(Long id) {
		RestTemplate rt = new RestTemplate();				
		HttpHeaders head = new HttpHeaders();
		head.add("Accept", MediaType.APPLICATION_JSON_VALUE);
		head.setContentType(MediaType.APPLICATION_JSON);
		SpecieDTO sp = rt.getForObject(BASE_URL + "/" + id, SpecieDTO.class);
		return sp; 	
	}

	public void update (SpecieDTO sp) {
		RestTemplate rt = new RestTemplate();				
		HttpHeaders head = new HttpHeaders();
		head.add("Accept", MediaType.APPLICATION_JSON_VALUE);
		head.setContentType(MediaType.APPLICATION_JSON);
		
		
		rt.put(BASE_URL+ "/" + sp.getId() , sp, SpecieDTO.class);
	}


}
