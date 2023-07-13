package com.betrybe.sistemadevotacao;

import java.util.ArrayList;

public class GerenciamentoVotacao implements GerenciamentoVotacaoInterface {
  private ArrayList<PessoaCandidata> pessoasCandidatas = new ArrayList<PessoaCandidata>();
  private ArrayList<PessoaEleitora> pessoasEleitoras = new ArrayList<PessoaEleitora>();
  private ArrayList<String> cpfsComputados = new ArrayList<String>();

  @Override
  public void cadastrarPessoaCandidata(String nome, int numero) {
    boolean exist = false;

    for (PessoaCandidata candidato : pessoasCandidatas) {
      if (candidato.getNumero() == numero) {
        exist = true;
        break;
      }
    }

    if (exist) {
      System.out.println("Número da pessoa candidata já utilizado!");
    } else {
      PessoaCandidata candidato = new PessoaCandidata(nome, numero);
      pessoasCandidatas.add(candidato);
    }
  }

  @Override
  public void cadastrarPessoaEleitora(String nome, String cpf) {
    boolean exist = false;

    for (PessoaEleitora eleitor : pessoasEleitoras) {
      if (eleitor.getCpf().equals(cpf)) {
        exist = true;
        break;
      }
    }

    if (exist) {
      System.out.println("Pessoa eleitora já cadastrada!");
    } else {
      PessoaEleitora eleitor = new PessoaEleitora(nome, cpf);
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
