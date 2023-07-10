package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int itemCode, itemQuantity;
        double total = 0;

        itemCode = sc.nextInt();
        itemQuantity = sc.nextInt();

        if ( itemCode == 1 ) {
            total = itemQuantity * 4.00;

        } else if ( itemCode == 2 ) {
            total = itemQuantity * 4.50;

        } else if ( itemCode == 3 ) {
            total = itemQuantity * 5.00;

        } else if ( itemCode == 4 ) {
            total = itemQuantity * 2.00;

        } else if ( itemCode == 5 ) {
            total = itemQuantity * 1.50;
        } else {
            System.out.println("esse item não existe no menu");
        }

        System.out.printf("Total: R$ %.2f ", total);

        sc.close();
    }
}
