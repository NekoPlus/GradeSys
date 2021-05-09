package SourceCodeFiles;

import java.util.TreeMap;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/** ***************************************************
class GradeSystems  aGradeSystem儲存a tree of anEntry objects with key ID and value aGrade

containID (ID)  //看aGradeSystem有否含此ID
getName(ID)   //取得ID的name
GradeSystems () //建構 aGradeSystem
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
	containID(ID)  看aGradeSystem是否含此ID

	parameters  ID   a user ID  ex: 123456789
	exceptions   IDExceptions3   print “無這ID 錯了!”
	returns  boolean
	time    O(log n)  n is aGradeSystem 內全班人數
	-----------------------------------------------------------------------------------------------------------------*/
	
	/*----------------------------------------------------------------------------------------------------------------------------
	showGrade(ID)  show 此 ID 的各項分數 及 total grade 
	returns boolean
	----------------------------------------------------------------------------------------------------------------------------*/
	
	/*----------------------------------------------------------------------------------------------------------------------------
	showRank(ID)  show 此 ID的 rank
	returns boolean
	----------------------------------------------------------------------------------------------------------------------------*/
	
	/*----------------------------------------------------------------------------------------------------------------------------
	updateWeights () 更新weights
	returns  boolean
	----------------------------------------------------------------------------------------------------------------------------*/
	
	/* getName(ID) 學生自行補上 */
	
}
