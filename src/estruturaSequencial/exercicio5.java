package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int code1, code2, pieceAmount1, pieceAmount2;
        double pieceValue1, pieceValue2, totalPiece1, totalPiece2, totalValue;


        System.out.println("digite o código da peça 1: ");
        code1 = sc.nextInt();

        System.out.println("digite o código da peça 2: ");
        code2 = sc.nextInt();

        System.out.println("número de peças 1: ");
        pieceAmount1 = sc.nextInt();

        System.out.println("número de peças 2: ");
        pieceAmount2 = sc.nextInt();

        System.out.println("valor unitário de cada peça 1: ");
        pieceValue1 = sc.nextDouble();

        System.out.println("valor unitário de cada peça 2: ");
        pieceValue2 = sc.nextDouble();

         totalPiece1 = pieceAmount1 * pieceValue1;
         totalPiece2 = pieceAmount2 * pieceValue2;

         totalValue = totalPiece1 + totalPiece2;

        System.out.printf("VALOR A PAGAR: R$ %.2f", totalValue);



        sc.close();
    }
}
