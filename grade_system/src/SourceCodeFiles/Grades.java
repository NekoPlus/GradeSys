package SourceCodeFiles;

/** **********************************************************************
class Grades  aGrade儲存name, lab1, lab2, lab3, midtermExam, finalExam, totalGrade

calculateTotalGrade (weights)
Grades () { } 
************************************************************************/

public class Grades {
	public String name;
	public int lab1, lab2, lab3;
	public int midtermExam, finalExam;
	public float totalGrade;
	public Grades (String aname,int alab1,int alab2,int alab3,int amidtermExam,int afinalExam) { 
		name = aname;
		lab1 = alab1;
		lab2 = alab2;
		lab3 = alab3;
		midtermExam = amidtermExam;
		finalExam = afinalExam;
	}
	public int calculateTotalGrade(float[] weights) {
		int aTotalGrade = Math.round(lab1 * weights[0] + lab2 * weights[1]
				+ lab3 * weights[2] + midtermExam * weights[3] + finalExam
				* weights[4]);
		totalGrade = aTotalGrade;
		return aTotalGrade;
	}
}
/*-------------------------------------------------------------------------------------------------------------
public Grades () { } 
public calculateTotalGrade(weights)  注意: totalGrade須四捨五入
end class Grades
-----------------------------------------------------------------------------------------------------------------*/