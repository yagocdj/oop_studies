package oop_classes;

public class Aluno {
	
	private String name;
	private int grade1;
	private int grade2;
	
	public Aluno(String name, int grade1, int grade2) {
		this.name = name;
		this.grade1 = grade1;
		this.grade2 = grade2;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAverage() {
		int result = (this.grade1 + this.grade2) / 2;
		return result;
	}
	
	public void setGrade1(int grade) {
		this.grade1 = grade;
	}
	
	public void setGrade2(int grade) {
		this.grade2 = grade;
	}
	
	public String getStatus() {
		int average = this.getAverage();
		
		if (average < 40)
			return "Reprovado";
		else if (average < 70)
			return "Final";
		else
			return "Aprovado";
	}
}
