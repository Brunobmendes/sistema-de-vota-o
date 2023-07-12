package com.betrybe.sistemadevotacao;

import java.util.ArrayList;

public class GerenciamentoVotacao implements GerenciamentoVotacaoInterface {
  private ArrayList<PessoaCandidata> pessoasCandidatas = new ArrayList<PessoaCandidata>();
  private ArrayList<PessoaEleitora> pessoasEleitoras = new ArrayList<PessoaEleitora>();
  private ArrayList<String> cpfsComputados = new ArrayList<String>();

  @Override
  public void cadastrarPessoaCandidata(String nome, int numero) {
    PessoaCandidata candidato = new PessoaCandidata(nome, numero) {
      @Override
      public int getNumero() {
        return super.getNumero();
      }
    };

    if (pessoasCandidatas.contains(candidato)) {
      System.out.println("Número da pessoa candidata já utilizado!");
    } else {
      pessoasCandidatas.add(candidato);
    }

  }

  @Override
  public void cadastrarPessoaEleitora(String nome, String cpf) {
    PessoaEleitora eleitor = new PessoaEleitora(nome, cpf) {
      @Override
      public String getCpf() {
        return super.getCpf();
      }
    };

    if (pessoasEleitoras.contains(eleitor)) {
      System.out.println("Pessoa eleitora já cadastrada!");
    } else {
      pessoasEleitoras.add(eleitor);
    }
  }

  @Override
  public void votar(String cpfPessoaEleitora, int numeroPessoaCandidata) {
    if (cpfsComputados.contains(cpfPessoaEleitora)) {
      System.out.println("Pessoa eleitora já votou!");
    } else {
      System.out.println("ainda não votou");
    }
  }

  @Override
  public void mostrarResultado() {

  }
}
