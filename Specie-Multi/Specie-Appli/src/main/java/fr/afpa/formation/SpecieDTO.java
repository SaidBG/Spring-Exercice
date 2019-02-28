package fr.afpa.formation;


public class SpecieDTO {
	
	
	public SpecieDTO() {
	}
	public SpecieDTO(Long id, String commonName, String latinName) {
		super();
		this.id = id;
		this.commonName = commonName;
		this.latinName = latinName;
	}
	public SpecieDTO( String commonName, String latinName) {
		super();
		this.commonName = commonName;
		this.latinName = latinName;
	}

	private Long id;
	private String commonName;
	private String latinName;

	@Override
	public String toString() {
		return "Specie [id=" + id + ", commonName=" + commonName + ", latinName=" + latinName + "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCommonName() {
		return commonName;
	}
	public void setCommonName(String commonName) {
		this.commonName = commonName;
	}
	public String getLatinName() {
		return latinName;
	}
	public void setLatinName(String latinName) {
		this.latinName = latinName;
	}


}
