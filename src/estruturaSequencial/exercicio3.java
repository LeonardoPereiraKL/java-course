package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int A, B, C, D, diff;

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        diff = A * B - C * D;

        System.out.println("DIFERENCA= " + diff);

    }
}
