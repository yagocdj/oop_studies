package modelo;

public class Convidado extends Participante {
	private String empresa;

	public Convidado(String email, String nome, int idade, String empresa) {
		super(email, nome, idade);
		this.empresa = empresa;
	}
	
	@Override
	public int getPercentual() {
		int idade = super.getIdade();
		if (idade < 18)
			return 100;
		else if (idade < 60)
			return 50;
		else
			return 70;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
}
