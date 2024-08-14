package com.gjleon;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Bem vindo ao cadastro de contas !!!!\n\n");

        System.out.println("Por favor, digite o nome do cliente !");
        String nomeCliente = sc.nextLine();

        System.out.println("\nPor favor, número da Agência !");
        String agenciaConta = sc.next();

        System.out.println("\nPor favor, digite o número da conta !");
        int numeroConta = sc.nextInt();

        System.out.println("\nPor favor, digite o valor do saldoConta !");
        double saldoConta = sc.nextDouble();

        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agenciaConta +", conta " + numeroConta + " e seu saldo " + saldoConta + " já está disponível para saque");

    }
}