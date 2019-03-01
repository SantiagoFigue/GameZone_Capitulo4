package GameZone_Capitulo4;

public class FiveDie {
	private Die dado1;
	private Die dado2;
	private Die dado3;
	private Die dado4;
	private Die dado5;
	
	public FiveDie() {
		this.dado1=new Die();
		this.dado2=new Die();
		this.dado3=new Die();
		this.dado4=new Die();
		this.dado5=new Die();
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

	public void setDado2(Die dado2) {
		this.dado2 = dado2;
	}

	public Die getDado3() {
		return dado3;
	}

	public void setDado3(Die dado3) {
		this.dado3 = dado3;
	}

	public Die getDado4() {
		return dado4;
	}

	public void setDado4(Die dado4) {
		this.dado4 = dado4;
	}

	public Die getDado5() {
		return dado5;
	}

	public void setDado5(Die dado5) {
		this.dado5 = dado5;
	}
	
	

}
