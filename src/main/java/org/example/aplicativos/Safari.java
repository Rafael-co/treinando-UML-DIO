package org.example.aplicativos;

public class Safari {

    private String url;
    private Integer abas;

    public void acessarSite(String url){
        System.out.println("Acessando o site " + url);
        this.url = url;
    }

    public void maisZoom(){
        System.out.println("aumentando o zoom");
    }

    public void menosZoom(){
        System.out.println("diminuindo o zoom");
    }

    public void criarNovaAba(String url){
        System.out.println("criando outra aba com o  site " + url);

    };

    public void trocarAba(String aba){
        System.out.println("Trocando a aba para " + aba );
    };

    public void fecharAba(String aba){
        System.out.println("fechando Aba " + aba);

    };
}
