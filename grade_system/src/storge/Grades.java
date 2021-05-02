package storge;

/** **********************************************************************
class Grades  aGrade¿x¶sname, lab1, lab2, lab3, midtermExam, finalExam, totalGrade

calculateTotalGrade (weights)
Grades () { } 
************************************************************************/

public class Grades {
	public String name;
	public int lab1, lab2, lab3;
	public int midtermExam, finalExam;
	public int totalGrade;
	
	public int calculateTotalGrade(float[] weights) {
		int aTotalGrade = Math.round(lab1 * weights[0] + lab2 * weights[1]
				+ lab3 * weights[2] + midtermExam * weights[3] + finalExam
				* weights[4]);
		return aTotalGrade;
	}
}