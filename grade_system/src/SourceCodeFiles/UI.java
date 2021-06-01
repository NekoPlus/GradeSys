package SourceCodeFiles;
import java.util.Scanner;
import SourceCodeFiles.*;
/** ***********************************************************************
class UI (user interface)  aUI處理使用界面

checkID(ID) 
promptCommand()
promptID()
showFinishMsg()
showWelcomeMsg(name)
UI()  建構 aUI
************************************************************************ */


public class UI {
	private Scanner input = new Scanner(System.in);
	
	/*----------------------------------------------------------------------------------------------------------
	checkID(ID) throws IDExceptions1, IDExceptions2

	exception: IDExceptions1  print “這ID含字母 錯了!”
	         IDExceptions2  print “這ID長度不對 錯了!”
	returns  boolean
	-------------------------------------------------------------------------------------------------------------- */
	public boolean checkID(String ID) throws IDExceptions1,IDExceptions2,IDExceptions3 {
		boolean result=true;
		
		/*
		 * 這ID含字母 錯了
		 */
		for(int i=0;i<ID.length();i++) {
			if(Character.isLetter(ID.charAt(i))) {
				result=false;
				throw new IDExceptions1();
			}
		}
		/*
		 * 這ID長度不對 錯了
		 */
		if(ID.length()!=9) {
			result=false;
			throw new IDExceptions2();
		}
		/*
		 * 無這ID 錯了
		 */
		if(!new GradeSystems().containID(ID)) {
			result=false;
			throw new IDExceptions3();
		}
		
		
		return result;
	}
	
	/*-------------------------------------------------------------------------------------------------------------
	promptCommand () 詢問指令

	returns  command  G (Grade), R (Rank), W (Weights), or E (Exit)
	-----------------------------------------------------------------------------------------------------------------*/
	public String promptCommand(){
		System.out.print("輸入指令\n1) G 顯示成績 (Grade)\n2) R 顯示排名 (Rank)\n3) W 更新配分 (Weight)\n4) E 離開選單 (Exit)\n");

		return input.next();
	}
	
	/*-----------------------------------------------------------------------------------------------------------
	promptID()  詢問ID
	returns  ID  
	----------------------------------------------------------------------------------------------------------------*/
	public String promptID(){
		System.out.print("輸入ID或 Q (結束使用)?\n");
		return input.next();
	}
	
	/* ---------------------------------------------------------------------------------------------------------
	showFinishMsg()
	---------------------------------------------------------------------------------------------------------- */
	public void showFinishMsg() {
		System.out.print("結束了\n");
	}

	public boolean showWelcomeMsg(String name){
		System.out.print("Welcome "+name+"\n");
		return true;
	}
	
	/*-----------------------------------------------------------------------------------------------------------
	1.calls UI() 建構 aUI
	2.calls GradeSystems() 建構 aGradeSystem
	
	3.loop1 until Q (Quit)
		try
		1.	aUI calls promptID() to get user ID  輸入ID或 Q (結束使用)?
		2.	aUI calls checkID(ID) 看 ID是否有2種異常 (異常1：ID含字母，異常2：ID長度不對)
		3.	aGradeSystem calls containID(ID) 看 ID 是否在內(異常3：無此ID)
		4.	aGradeSystem calls getName(ID) to get name
		5.	aUI calls showWelcomeMsg (name)  ex. Welcome李威廷
		6.	loop2 until E (Exit)
			1.	aUI calls promptCommand() to prompt user for a command 
			2.	if command is E (Exit) then break
				else: G aGradeSystem calls showGrade(ID), R showRank(ID), W updateWeights() 
			end if
	    end loop2
	end try
	catch (IDExceptions1 e1) {print “這ID含字母 錯了!”}
	catch (IDExceptions2 e2) {print “這ID長度不對 錯了!”}
	catch (IDExceptions3 e3) {print “無這ID 錯了!”}
	end loop1
	
	4. aUI calls showFinishMsg()  結束了
	----------------------------------------------------------------------------------------------------------------*/
	public UI() {
		
	
		
	}
	
}
