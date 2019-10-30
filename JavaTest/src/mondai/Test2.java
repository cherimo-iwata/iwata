package mondai;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		System.out.println("値を入力して下さい");

		Scanner sc = new Scanner(System.in);

		int a = 0;
		int b = 5;
		int count = 0;

		boolean flg = false;

		a = sc.nextInt();

		while (flg) {

			System.out.print(count);
			count++; //countに1を足していく

			a = a + 1;
			if (a < b) {
				flg = false;
			}
			//aがbより大きくなるまで

			System.out.println("繰り返した回数は" + count + "回です");
		}
		sc.close();
	}

}
