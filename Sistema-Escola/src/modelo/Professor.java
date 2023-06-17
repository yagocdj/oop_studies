package modelo;
/**********************************
 * IFPB - Curso Superior de Tec. em Sist. para Internet
 * Programação Orientada a Objetos
 * Prof. Fausto Maranhão Ayres
 **********************************/

public class Professor
{
	private String nome;
	private double salario;
	private Turma turma;

	public Professor(String n, double s)   throws Exception  {
		nome = n;
		salario = s;
	} 
	public String getNome()    {
		return nome;
	}
	public double getSalario()    {
		return salario;
	}
	public void setSalario(double s)    {
		salario = s;
	}

	//---------- RELACIONAMENTO COM TURMA --------------------
	//--------------------------------------------------------
	public Turma getTurma()    {
		return turma;
	}
	public void setTurma(Turma t) {
		turma = t;
	}   
	public boolean estaAlocado() {	//esta alocado em alguma turma
		return turma != null;   
	}


	public String toString(){
		String s = "nome=" + getNome() + ", salario=" + getSalario();
		if(turma!=null)
			s=s+", turma=" + getTurma().getId(); 
		else
			s=s+", ainda sem turma"; 
		return s;
	}



}