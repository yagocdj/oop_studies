package alunoFlex;

public class AlunoFlex {

	private String name;
	private double[] grades;
	
	public AlunoFlex(String name, double... grades) {
		this.name = name;
		this.grades = grades;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAverage() {
		double gradesSum = 0.0;
		
		for (double grade : grades) {
			gradesSum += grade;
		}
		
		return (int) Math.round(gradesSum / grades.length);
	}
	
	public void setGrade(int order, double grade) {
		if (order < 1 || order > grades.length) {
			throw new ArrayIndexOutOfBoundsException("Erro -> ordem inválida.");
		}
		
		int index = order - 1;
		grades[index] = grade;
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
