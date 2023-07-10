package estruturaCondicional;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horaInicial, horaFinal, gameDuration ;

        horaInicial = sc.nextInt();
        horaFinal = sc.nextInt();

        if (horaInicial < horaFinal) {
                  gameDuration = horaFinal - horaInicial;

        } else {
                  gameDuration = 24 - horaInicial + horaFinal;
        }
        System.out.printf("o jogo durou %d horas %n", gameDuration);
          sc.close();
    }
}
