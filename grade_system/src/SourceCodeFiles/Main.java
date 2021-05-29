package SourceCodeFiles;

/* ##################################################################
A grade system ���ϥΪ̨��o�L���`���Z(total grade)�αƦW(rank)�A
�`���Z�̰t��(weights)�p��A�Ӱt���i��s(update)�C

  Input file: ���Z�ǥͪ����� �Ҧp:
             962001044 ��v�� 87 86 98 88 87
962001051 ���§� 81 98 84 90 93
           �W���U��쪺�W�٦p�U: 
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
			System.out.println("�oID�t�r�� ���F!");
        }
		catch (IDExceptions2 e2) {
			System.out.println("�oID���פ��� ���F!");
		}
		catch (IDExceptions3 e3) {
			System.out.println ("�L�oID ���F!");
		}

		/*------------------------------------------------------------------------------------------------------
		main()
		Exceptions: IDExceptions1, IDExceptions2, IDExceptions3
		---------------------------------------------------------------------------------------------------------*/

	}
}
