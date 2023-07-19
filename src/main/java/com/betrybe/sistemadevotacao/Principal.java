package com.betrybe.sistemadevotacao;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {


  public static void main(String[] args) {
    GerenciamentoVotacao gerenciamentoVotacao = new GerenciamentoVotacao();
    candidateRegister(gerenciamentoVotacao);
  }


  private static void candidateRegister(GerenciamentoVotacao gerenciamentoVotacao) {

    boolean running = true;

    while (running) {
      System.out.println("Cadastrar pessoa candidata?");
      System.out.println("1 - sim");
      System.out.println("2 - não");

      Scanner sc = new Scanner(System.in);
      int escolha = sc.nextInt();

      if (escolha == 1) {
        System.out.println("Entre com o nome da pessoa candidata:");
        sc.next();
        String nomeCandidato = sc.nextLine();
        System.out.println("Entre com o numero da pessoa candidata:");
        int numeroCandidato = sc.nextInt();
        gerenciamentoVotacao.cadastrarPessoaCandidata(nomeCandidato, numeroCandidato);

      } else if (escolha == 2) {
        running = false;
      }
    }
  }
}
