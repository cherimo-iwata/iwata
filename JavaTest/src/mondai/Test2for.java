package mondai;

import java.util.Scanner;

public class Test2for {

	public static void main(String[] args) {

		System.out.print("値を入力して下さい");
		Scanner sc = new Scanner(System.in);

		int a = 0;
		int b = 5;

		a = sc.nextInt();
		//もしも変数aが変数b未満の時

		for (int count = 0; a < b; count++) {
			System.out.print(count);

			if (a >= b) { //変数aの値が変数b以上ならループ処理が終わる
				break;

			}
			a = a + 1;

			System.out.println("繰り返した回数は" + count + "回です");

		}
		sc.close();
	}

}
