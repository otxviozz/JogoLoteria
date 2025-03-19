package Arquivo;
import java.util.Scanner;

public class JogoLoteria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número de jogos: ");
        int njogos = scanner.nextInt();
        int contadorjogo = 1;
        String numeros = "";
        
        for (contadorjogo = 1; contadorjogo <= njogos; contadorjogo++) {
            for (int i = 1; i <= 6; i++) {
                int nrandom = (int)(Math.random() * 60) + 1;
                numeros = numeros + nrandom + "| ";
            }
            System.out.println("Jogo " + contadorjogo + ": |" + numeros);
            numeros = "";
        }
        scanner.close();
    }
}