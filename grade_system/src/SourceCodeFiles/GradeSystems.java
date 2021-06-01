package SourceCodeFiles;

import java.util.TreeMap;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.Scanner;

/** ***************************************************
class GradeSystems  aGradeSystem�x�sa tree of anEntry objects with key ID and value aGrade

containID (ID)  //��aGradeSystem���_�t��ID
getName(ID)   //���oID��name
GradeSystems () //�غc aGradeSystem
showGrade (ID)
showRank (ID)
updateWeights ()   
********************************************************/

public class GradeSystems {
	private float[] weights = {0.1f, 0.1f, 0.1f, 0.3f, 0.4f};
	public TreeMap <String, Grades> aTree = new TreeMap<String, Grades>();
	Scanner scanner ;
	public GradeSystems() {
		
		try {
			File file = new File("grade_system/src/SourceCodeFiles/gradeInput.txt");
			scanner = new Scanner(file, "utf-8");
			scanner = new Scanner(new InputStreamReader(
					new FileInputStream(file)));
			while(scanner.hasNext()) {
				
				String id_input=scanner.next();
				Grades ng = new Grades(scanner.next(),
						scanner.nextInt(),
						scanner.nextInt(),
						scanner.nextInt(),
						scanner.nextInt(),
						scanner.nextInt());
				aTree.put(id_input, ng);
				//System.out.println(aTree.containsKey(id_input));
				aTree.get(id_input).calculateTotalGrade(weights);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/*-------------------------------------------------------------------------------------------------------------
	containID(ID)  ��aGradeSystem�O�_�t��ID

	parameters  ID   a user ID  ex: 123456789
	exceptions   IDExceptions3   print ���L�oID ���F!��
	returns  boolean
	time    O(log n)  n is aGradeSystem �����Z�H��
	-----------------------------------------------------------------------------------------------------------------*/
	public boolean containID(String ID) {
		
		return aTree.containsKey(ID);
	}
	
	
	/*----------------------------------------------------------------------------------------------------------------------------
	showGrade(ID)  show �� ID ���U������ �� total grade 
	returns boolean
	----------------------------------------------------------------------------------------------------------------------------*/
	public boolean showGrade(String ID) {
		if(containID(ID)) {
			System.out.print(aTree.get(ID).name+" "+aTree.get(ID).lab1+" "+aTree.get(ID).lab2+" "+aTree.get(ID).lab3+" "+aTree.get(ID).midtermExam+" "+aTree.get(ID).finalExam+'\n');
			return true;
		}else {
			return false;
		}
		
	}
	/*----------------------------------------------------------------------------------------------------------------------------
	showRank(ID)  show �� ID�� rank
	returns boolean
	----------------------------------------------------------------------------------------------------------------------------*/
	public boolean showRank(String ID) {
		float target=aTree.get(ID).totalGrade;
		Integer rank=1;
		Iterator<String> anEntry = aTree.keySet().iterator(); 
		while (anEntry.hasNext()) {  
			if(target < aTree.get(anEntry.next()).totalGrade) {
				rank++;
			}
		}
		System.out.print(aTree.get(ID).name + "�ƦW��" + rank.toString()+"\n");
		return true;
	}
	
	/*----------------------------------------------------------------------------------------------------------------------------
	updateWeights () ��sweights
	returns  boolean
	----------------------------------------------------------------------------------------------------------------------------*/
	public boolean updateWeights() {
		scanner = new Scanner(System.in);
		float newWeight[] = {0, 0, 0, 0, 0};
		String str = "�нT�{�°t��\n" + "lab1\t" + weights[0] + "%\n" + 
				"lab2\t" + weights[1] + "%\n" +
				"lab3\t" + weights[2] + "%\n" +
				"mid-term\t" + weights[3] + "%\n" +
				"fianl exam\t" + weights[4] + "%\n";
		System.out.print(str);
		
		System.out.print("��J�s�t��\nlab1\t");
		newWeight[0] = Integer.parseInt(scanner.nextLine());
		System.out.print("lab2\t");
		newWeight[1] = Integer.parseInt(scanner.nextLine());
		System.out.print("lab3\t");
		newWeight[2] = Integer.parseInt(scanner.nextLine());
		System.out.print("mid-term\t");
		newWeight[3] = Integer.parseInt(scanner.nextLine());
		System.out.print("final exam\t");
		newWeight[4] = Integer.parseInt(scanner.nextLine());
		
		str = "�нT�{�s�t��\n" + "lab1\t" + newWeight[0] + "%\n" + 
				"lab2\t" + newWeight[1] + "%\n" +
				"lab3\t" + newWeight[2] + "%\n" +
				"mid-term\t" + newWeight[3] + "%\n" +
				"fianl exam\t" + newWeight[4] + "%\n" + 
				"�H�W���T��? Y(Yes) �� N(No)\n" + 
				"�ϥΪ̿�J�G";
		System.out.print(str);
		String comString = scanner.nextLine();
		
		if (comString.equals("Y")) {
			int all = 0;
			for (float w : newWeight) {
				all += w;
			}
			if (all == 100) {
				for (int i=0; i<5; i++) {
					weights[i] = newWeight[i] / 100.0f;
				}
			}
			else {
				System.out.println("�t����ҦX�p�ݭn100%, ���ˬd");
			}
		} 
		for (int i = 0; i<5; i++) {  
			weights[i] = newWeight[i] / 100.0f;
		}
		Iterator<String> anEntry = aTree.keySet().iterator(); 
		while (anEntry.hasNext()) {  
			aTree.get(anEntry.next()).calculateTotalGrade(weights);
		}
		return true;
	}
	
	/* getName(ID) �ǥͦۦ�ɤW */
	public String getName(String ID) {	
		return aTree.get(ID).name;
	}
}
