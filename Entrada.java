package entradaDados;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome;
        int idade;
        double peso;
        double altura;

        System.out.print("Informe seu nome: " );
        nome = entrada.nextLine();
        System.out.print("Informe sua idade: ");
        idade = entrada.nextInt();
        System.out.print("Informe seu peso: ");
        peso = entrada.nextDouble();
        System.out.print("Informe sua altura: ");
        altura = entrada.nextDouble();
        System.out.println();
        System.out.println("------------------------------------");
        System.out.println("Bem vindo(a), "+nome+".");
        System.out.println("\nSua idade é: "+ idade + " anos.");
        System.out.println("Seu peso é: "+ peso + " kg.");
        System.out.println("Sua altura é: "+ altura + " m.");

        entrada.close();
    }
}
