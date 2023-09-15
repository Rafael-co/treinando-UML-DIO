package org.example;

import org.example.aplicativos.ReprodutorDeMusica;
import org.example.interfaces.Telefone;

public class Iphone extends SO implements Telefone {

    private Boolean ligado;
    private Boolean comInternet;
    protected  ReprodutorDeMusica reprodutorDeMusica = new ReprodutorDeMusica();



    public void ligar() {
        System.out.println("seu aparelho esta ligado");
    }
    public void desligar(){
        System.out.println("seu aparelho está desligando");
    }

    public void conectarNaInternet(){
        System.out.println("seu celular foi conectado a internet");
    }

    @Override
    public void abrirCorreioDeVoz() {
        System.out.println("abrindo correio de voz");
    }

    @Override
    public void executarCorreioDeVoz(String chamada) {
        System.out.println("reproduzindo chamada de " + chamada);
    }

    @Override
    public void limparCorreioDeVoz() {
        System.out.println("correio de voz limpo");
    }

    @Override
    public void salvarNaAgenda(String nomeContato) {
        System.out.println("contato salvo com sucesso " + nomeContato);
    }

    @Override
    public void editarContato(String contato) {
        System.out.println("contato editado com sucesso " + contato);
    }

    @Override
    public void excluirContato(String contato) {
        System.out.println("contato excluido com sucesso " + contato);
    }

    @Override
    public void fazerLigacao(String contato) {
        System.out.println("fazendo ligacao para contato : " + contato);
    }

    @Override
    public void atenderLigacao(String contato) {
        System.out.println("Atendendo chamada: " + contato);
    }
}
