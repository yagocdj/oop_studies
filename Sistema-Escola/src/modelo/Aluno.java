package modelo;
/**********************************
 * IFPB - Curso Superior de Tec. em Sist. para Internet
 * Programação Orientada a Objetos
 * Prof. Fausto Maranhão Ayres
 **********************************/

public class Aluno {
    private String nome;
    private double media;
	private Turma turma;		// o aluno possui apena uma turma
        
    public Aluno(String n, double m)  throws Exception  {
        nome = n;
        media = m;
    }
    public String getNome()    {
        return nome;
    }
    public double getMedia()    {
    	return media;
    }
    
    //---------- RELACIONAMENTO COM TURMA --------------------
    //--------------------------------------------------------
    public Turma getTurma()    {
    	return turma;
    }
    public void setTurma(Turma t) {
    	turma = t;
    }   
    
    public boolean estaMatriculado(){
    	return turma != null;
    }


    public String toString(){
    	String s = "nome=" + getNome() + ", media=" + getMedia();
    	if(turma!=null)
    		s=s+", turma=" + getTurma().getId(); 
    	else
    		s=s+", ainda sem turma"; 
    	return s;
    }
}
