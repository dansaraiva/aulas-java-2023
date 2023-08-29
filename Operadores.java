package operadores;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Operadores {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //System.out.print("Informe um número: ");
        //double num1 = entrada.nextDouble();
        //System.out.print("Informe um número: ");
        //double num2 = entrada.nextDouble();

        double num1 = 
        Double.parseDouble(JOptionPane.showInputDialog(
            "Informe um número"));
            
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Informe um número"));

        double soma = num1 + num2;
        double sub = num1 - num2;
        double mult = num1 * num2;
        double div = num1 / num2;
        double exp = Math.pow(num1,num2);
        double raiz1 = Math.sqrt(num1);
        double raiz2 = Math.sqrt(num2);
        
        JOptionPane.showMessageDialog(null,"A soma vale: "+soma);
        //System.out.println("Num1: "+num1);
        System.out.println("Num2: "+num2);
        System.out.println("A soma vale: "+ soma);
        System.out.println("A sub vale: "+ sub);
        System.out.println("A mult vale: "+ mult);
        System.out.println("A div vale: "+ div);
        System.out.println("A exp vale: "+ exp);
        System.out.println("A raiz1 vale: "+ raiz1);
        System.out.println("A raiz2 vale: "+ raiz2);

        entrada.close();
    }
}
