/**
 * SI - POO - Prof. Fausto Ayres
 *
 */


public class Convidado extends Participante {
	private String empresa;

	public Convidado(String email, String nome, int idade, String empresa) {
		super(email, nome, idade);
		this.empresa = empresa;
	}

	@Override
	public int getPercentual() {
		
		return super.getPercentual() + 50;
	}
	
	@Override
	public String toString() {
		String texto =  super.toString() + "\nempresa = " + empresa ;
		texto += "\neventos:";
		return texto;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
		
	

}
