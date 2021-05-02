package storge;

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
			new UI();
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
