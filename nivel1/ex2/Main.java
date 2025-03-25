package nivel1.ex2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner user = new Scanner(System.in);
		System.out.println("Diga los numeros del DNI");
		int userNumber = user.nextInt();
		CalculoDni calculo = new CalculoDni(userNumber);
		System.out.println(calculo.getTotal());
		System.out.println(calculo.getLetterExpected());
	}

}
