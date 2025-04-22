package nivel1.ex2;

import java.util.Scanner;

public class MainStart {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        String input = "";

        while (!input.equalsIgnoreCase("Salir")) {
            System.out.println("Diga los numeros del DNI (o 'salir' para terminar):");
            input = user.nextLine();

            if (input.equalsIgnoreCase("salir")) {
                break;
            }
            try {
                int userNumber = Integer.parseInt(input);
                CalculoDni calculo = new CalculoDni(userNumber);
                System.out.println("La letra es: " + calculo.getLetterExpected());
            } catch (NumberFormatException e) {
                System.out.println("El número no es válido. Debe ser solo el número sin letras.");

            }
        }
        user.close();
    }
}
