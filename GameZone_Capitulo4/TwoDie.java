package GameZone_Capitulo4;

public class TwoDie {

	private Die dado1;
	private Die dado2;
	
	public TwoDie() {
		this.dado1=new Die();
		this.dado2=new Die();
	}

	public Die getDado1() {
		return dado1;
	}

	public void setDado1(Die dado1) {
		this.dado1 = dado1;
	}

	public Die getDado2() {
		return dado2;
	}

	public void setDado2(Die dao2) {
		this.dado2 = dao2;
	}
	
	
}
