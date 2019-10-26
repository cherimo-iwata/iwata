package mondai;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {


   System.out.println("年齢を入力してください");

   Scanner scanner = new Scanner(System.in);

   int nenrei = 0;
   int kakaku = 0;


    if (nenrei == 0){


	   kakaku =scanner.nextInt(); //年齢が0歳だったら

	   System.out.println("年齢が0の時、価格は "+ kakaku + " 円です");

    }else {
	   kakaku = scanner.nextInt();  //年齢が0歳でなかったら

	   System.out.println("年齢が0歳ではない時、価格は " + kakaku + " 円です");
    }

    scanner.close();
	}

}
