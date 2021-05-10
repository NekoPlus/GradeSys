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
class GradeSystems  aGradeSystem儲存a tree of anEntry objects with key ID and value aGrade

containID (ID)  //看aGradeSystem有否含此ID
getName(ID)   //取得ID的name
GradeSystems () //建構 aGradeSystem
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
			File file = new File("C:\\Users\\eric1\\OneDrive\\桌面\\作業\\敏捷方法\\GradeSys\\grade_system\\src\\SourceCodeFiles\\gradeInput.txt");
			//scanner = new Scanner(file, "utf-8");
			scanner = new Scanner(new InputStreamReader(
					new FileInputStream(file), "UTF8"));
			
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
	containID(ID)  看aGradeSystem是否含此ID

	parameters  ID   a user ID  ex: 123456789
	exceptions   IDExceptions3   print “無這ID 錯了!”
	returns  boolean
	time    O(log n)  n is aGradeSystem 內全班人數
	-----------------------------------------------------------------------------------------------------------------*/
	public boolean containID(String ID) {
		
		return aTree.containsKey(ID);
	}
	
	
	/*----------------------------------------------------------------------------------------------------------------------------
	showGrade(ID)  show 此 ID 的各項分數 及 total grade 
	returns boolean
	----------------------------------------------------------------------------------------------------------------------------*/
	public boolean showGrade(String ID) {
		if(containID(ID)) {
			System.out.println(aTree.get(ID).name+" "+aTree.get(ID).lab1+" "+aTree.get(ID).lab2+" "+aTree.get(ID).lab3+" "+aTree.get(ID).midtermExam+" "+aTree.get(ID).finalExam);
			return true;
		}else {
			return false;
		}
		
	}
	/*----------------------------------------------------------------------------------------------------------------------------
	showRank(ID)  show 此 ID的 rank
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
		System.out.println(aTree.get(ID).name + "排名第" + rank.toString());
		return true;
	}
	
	/*----------------------------------------------------------------------------------------------------------------------------
	updateWeights () 更新weights
	returns  boolean
	----------------------------------------------------------------------------------------------------------------------------*/
	public boolean updateWeights() {
		scanner = new Scanner(System.in);
		float newWeight[] = {0, 0, 0, 0, 0};
		String str = "請確認新配分\n" + "lab1\t" + weights[0] + "%\n" + 
				"lab2\t" + weights[1] + "%\n" +
				"lab3\t" + weights[2] + "%\n" +
				"mid-term\t" + weights[3] + "%\n" +
				"fianl exam\t" + weights[4] + "%\n";
		System.out.print(str);
		
		System.out.print("輸入新配分\nlab1\t");
		newWeight[0] = Integer.parseInt(scanner.nextLine());
		System.out.print("lab2\t");
		newWeight[1] = Integer.parseInt(scanner.nextLine());
		System.out.print("lab3\t");
		newWeight[2] = Integer.parseInt(scanner.nextLine());
		System.out.print("mid-term\t");
		newWeight[3] = Integer.parseInt(scanner.nextLine());
		System.out.print("final exam\t");
		newWeight[4] = Integer.parseInt(scanner.nextLine());
		
		str = "請確認新配分\n" + "lab1\t" + newWeight[0] + "%\n" + 
				"lab2\t" + newWeight[1] + "%\n" +
				"lab3\t" + newWeight[2] + "%\n" +
				"mid-term\t" + newWeight[3] + "%\n" +
				"fianl exam\t" + newWeight[4] + "%\n" + 
				"以上正確嗎? Y(Yes) 或 N(No)\n" + 
				"使用者輸入：";
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
				System.out.println("配分比例合計需要100%, 請檢查");
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
	
	/* getName(ID) 學生自行補上 */
	public String getName(String ID) {	
		return aTree.get(ID).name;
	}
}
