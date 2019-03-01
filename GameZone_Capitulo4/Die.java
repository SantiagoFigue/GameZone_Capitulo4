package GameZone_Capitulo4;

public class Die {

	private Integer dato;

	public Die() {
		this.dato=random();
	}
	
	public Integer getDato() {
		return dato;
	}

	public void setDato(Integer dato) {
		this.dato = dato;
	}
	
	private Integer random() {
		return (int) (Math.random()*6)+1;
	}
	
}
