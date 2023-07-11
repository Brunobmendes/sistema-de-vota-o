package com.betrybe.sistemadevotacao;

public abstract class PessoaEleitora extends Pessoa {
  private String cpf;

  public PessoaEleitora(String cpf, String nome) {
    this.cpf = cpf;
    this.nome = nome;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
}
