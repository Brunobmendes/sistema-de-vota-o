package com.betrybe.sistemadevotacao;

/** class for candidates people object.
 * @author Bruno Mendes
 * @version 1.0
 *
 */
public abstract class PessoaCandidata extends Pessoa {
  private int numero;
  private int votos;

  /** PessoaCandidata constructor.
   * @param nome String - candidate name
   * @param numero int - candidate number id
   */

  public PessoaCandidata(String nome, int numero) {
    this.nome = nome;
    this.numero = numero;
    this.votos = 0;

  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public int getVotos() {
    return votos;
  }

  public void setVotos(int votos) {
    this.votos = votos;
  }

  public void receberVotos() {
    this.votos += 1;
  }

}
