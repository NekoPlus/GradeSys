package SourceCodeFiles;

import java.util.TreeMap;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
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
	private Double[] weights = {0.1, 0.1, 0.1, 0.3, 0.4};
	public TreeMap <String, Grades> aTree;
	Scanner scanner;
	
	public GradeSystems() {
		scanner = new Scanner(System.in);
		try {
			Scanner input = new Scanner(new InputStreamReader(
					new FileInputStream(new File("gradeInput.txt")), "UTF8"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
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
	
	/*----------------------------------------------------------------------------------------------------------------------------
	showGrade(ID)  show �� ID ���U������ �� total grade 
	returns boolean
	----------------------------------------------------------------------------------------------------------------------------*/
	
	/*----------------------------------------------------------------------------------------------------------------------------
	showRank(ID)  show �� ID�� rank
	returns boolean
	----------------------------------------------------------------------------------------------------------------------------*/
	
	/*----------------------------------------------------------------------------------------------------------------------------
	updateWeights () ��sweights
	returns  boolean
	----------------------------------------------------------------------------------------------------------------------------*/
	
	/* getName(ID) �ǥͦۦ�ɤW */
	
}
