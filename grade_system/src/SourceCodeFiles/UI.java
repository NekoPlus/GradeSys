package SourceCodeFiles;
import java.util.Scanner;
import SourceCodeFiles.*;
/** ***********************************************************************
class UI (user interface)  aUI�B�z�ϥάɭ�

checkID(ID) 
promptCommand()
promptID()
showFinishMsg()
showWelcomeMsg(name)
UI()  �غc aUI
************************************************************************ */


public class UI {
	private Scanner input = new Scanner(System.in);
	GradeSystems aGradeSystem;
	/*----------------------------------------------------------------------------------------------------------
	checkID(ID) throws IDExceptions1, IDExceptions2

	exception: IDExceptions1  print ���oID�t�r�� ���F!��
	         IDExceptions2  print ���oID���פ��� ���F!��
	returns  boolean
	-------------------------------------------------------------------------------------------------------------- */
	public boolean checkID(String ID) throws IDExceptions1,IDExceptions2,IDExceptions3 {
		boolean result=true;
		
		/*
		 * �oID�t�r�� ���F
		 */
		for(int i=0;i<ID.length();i++) {
			if(Character.isLetter(ID.charAt(i))) {
				result=false;
				throw new IDExceptions1();
			}
		}
		/*
		 * �oID���פ��� ���F
		 */
		if(ID.length()!=9) {
			result=false;
			throw new IDExceptions2();
		}
		/*
		 * �L�oID ���F
		 */
		if(!aGradeSystem.containID(ID)) {
			result=false;
			throw new IDExceptions3();
		}
		
		
		return result;
	}
	
	/*-------------------------------------------------------------------------------------------------------------
	promptCommand () �߰ݫ��O

	returns  command  G (Grade), R (Rank), W (Weights), or E (Exit)
	-----------------------------------------------------------------------------------------------------------------*/
	String promptCommand(){
		System.out.println("��J���O\n1) G ��ܦ��Z (Grade)\n2) R ��ܱƦW (Rank)\n3) W ��s�t�� (Weight)\n4) E ���}��� (Exit)");
		return input.next();
	}
	
	/*-----------------------------------------------------------------------------------------------------------
	promptID()  �߰�ID
	returns  ID  
	----------------------------------------------------------------------------------------------------------------*/
	public String promptID(){
		System.out.println("��JID�� Q (�����ϥ�)?");
		return input.next();
	}
	
	/* ---------------------------------------------------------------------------------------------------------
	showFinishMsg()
	---------------------------------------------------------------------------------------------------------- */
	void showFinishMsg() {
		System.out.println("�����F");
	}
	int showWelcomeMsg(String name){
		return 0;
	}
	
	/*-----------------------------------------------------------------------------------------------------------
	1.calls UI() �غc aUI
	2.calls GradeSystems() �غc aGradeSystem
	
	3.loop1 until Q (Quit)
		try
		1.	aUI calls promptID() to get user ID  ��JID�� Q (�����ϥ�)?
		2.	aUI calls checkID(ID) �� ID�O�_��2�ز��` (���`1�GID�t�r���A���`2�GID���פ���)
		3.	aGradeSystem calls containID(ID) �� ID �O�_�b��(���`3�G�L��ID)
		4.	aGradeSystem calls getName(ID) to get name
		5.	aUI calls showWelcomeMsg (name)  ex. Welcome���§�
		6.	loop2 until E (Exit)
			1.	aUI calls promptCommand() to prompt user for a command 
			2.	if command is E (Exit) then break
				else: G aGradeSystem calls showGrade(ID), R showRank(ID), W updateWeights() 
			end if
	    end loop2
	end try
	catch (IDExceptions1 e1) {print ���oID�t�r�� ���F!��}
	catch (IDExceptions2 e2) {print ���oID���פ��� ���F!��}
	catch (IDExceptions3 e3) {print ���L�oID ���F!��}
	end loop1
	
	4. aUI calls showFinishMsg()  �����F
	----------------------------------------------------------------------------------------------------------------*/
	public UI() throws IDExceptions1,IDExceptions2,IDExceptions3{
		aGradeSystem = new GradeSystems();
		try {
			
			while(true){
				String ID = promptID();
				if (ID.equals("Q")) {
					break;
				}
				if(!checkID(ID)) {
					continue;
				}
				showWelcomeMsg(aGradeSystem.getName(ID));
				while (true) {
					boolean exit = false;
					String command ;
					command = promptCommand();
					switch (command) {
					case "G":
						aGradeSystem.showGrade(ID);
						break;
					case "R":
						aGradeSystem.showRank(ID);
						break;
					case "W":
						aGradeSystem.updateWeights();
						break;
					case "E":
						exit = true;
						break;
					}
					if (exit) {
						showFinishMsg();
						break;
					}
						
				}
			}
		}finally {
			
		}
	
		
	}
	
}
