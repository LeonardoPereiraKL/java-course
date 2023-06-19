package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int employee,workedHours;
        double salary, hourlyPay;

        System.out.println("digite número do funcionário: ");
        employee = sc.nextInt();

        System.out.println("digite as horas trabalhadas: ");
        workedHours = sc.nextInt();

        System.out.println("digite o valor que recebe por hora: ");
        hourlyPay = sc.nextDouble();

        salary = hourlyPay * workedHours;

        System.out.println("Number = " + employee);
        System.out.printf("Salary = U$%.2f%n ", salary);


        sc.close();
    }
}
