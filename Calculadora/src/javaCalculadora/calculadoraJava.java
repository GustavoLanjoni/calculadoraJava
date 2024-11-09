package javaCalculadora;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class calculadoraJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double numero1 = scanner.nextDouble();

        System.out.println("Digite o segundo número:");
        double numero2 = scanner.nextDouble();

        
        System.out.println("Escolha a operação (+, -, *, /):");
        String operacao = scanner.next();

        double resultado = 0;
        boolean operacaoValida = true;

        if (operacao.equals("+")) {
            resultado = numero1 + numero2;
        } else if (operacao.equals("-")) {
            resultado = numero1 - numero2;
        } else if (operacao.equals("*")) {
            resultado = numero1 * numero2;
        } else if (operacao.equals("/")) {
            if (numero2 != 0) {
                resultado = numero1 / numero2;
            } else {
                System.out.println("Erro: divisão por zero não é permitida.");
                operacaoValida = false; // Define como inválida se houver divisão por zero
            }
        } else {
            System.out.println("Operação inválida! Por favor, escolha +, -, * ou /.");
            operacaoValida = false; // Define como inválida se a operação não for reconhecida
        }

        // Exibe o resultado apenas se a operação for válida
        if (operacaoValida) {
            System.out.println("Resultado: " + resultado);
        }

        scanner.close();
    }
}
