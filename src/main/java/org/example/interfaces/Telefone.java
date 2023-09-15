package org.example.interfaces;

public interface Telefone {
    public void abrirCorreioDeVoz();

    public void executarCorreioDeVoz(String chamada);

    public void limparCorreioDeVoz();

    public void salvarNaAgenda(String nomeContato);

    public void editarContato(String contato);

    public void excluirContato(String contato);

    public void fazerLigacao(String contato);

    public void atenderLigacao(String contato);
}
