package SourceCodeFiles;

/* ##################################################################
A grade system 讓使用者取得他的總成績(total grade)及排名(rank)，
總成績依配分(weights)計算，而配分可更新(update)。

  Input file: 全班學生的分數 例如:
             962001044 凌宗廷 87 86 98 88 87
962001051 李威廷 81 98 84 90 93
           上面各欄位的名稱如下: 
          ID     name lab1 lab2 lab3 midtermExam finalExam
#################################################################### */

public class Main {

	public static void main(String[] args) {
		try{
			UI aUI = new UI();
			GradeSystems aGradeSystem = new GradeSystems();
			try {
				
				while(true){
					String ID = aUI.promptID();
					if (ID.equals("Q")) {
						break;
					}
					if(!aUI.checkID(ID)) {
						continue;
					}
					aUI.showWelcomeMsg(aGradeSystem.getName(ID));
					while (true) {
						boolean exit = false;
						String command ;
						command = aUI.promptCommand();
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
							aUI.showFinishMsg();
							break;
						}
							
					}
				}
			}finally {
				
			}
		}
		catch (IDExceptions1 e1) {
			System.out.println("這ID含字母 錯了!");
        }
		catch (IDExceptions2 e2) {
			System.out.println("這ID長度不對 錯了!");
		}
		catch (IDExceptions3 e3) {
			System.out.println ("無這ID 錯了!");
		}

		/*------------------------------------------------------------------------------------------------------
		main()
		Exceptions: IDExceptions1, IDExceptions2, IDExceptions3
		---------------------------------------------------------------------------------------------------------*/

	}
}
