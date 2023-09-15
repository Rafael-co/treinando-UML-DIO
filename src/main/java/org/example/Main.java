package org.example;

public class Main {
    public static void main(String[] args) {
       Iphone iphone = new Iphone();

       iphone.ligar();
       iphone.conectarNaInternet();
       //Site

       /*iphone.safari.acessarSite("google");
       iphone.safari.criarNovaAba("DIO.me");
       iphone.safari.trocarAba("Dio.me");
       iphone.safari.fecharAba("gooogle");
       iphone.safari.maisZoom();
       iphone.safari.menosZoom();*/

       //telefone

       /*
       iphone.abrirCorreioDeVoz();
       iphone.executarCorreioDeVoz("Rafael");
       iphone.atenderLigacao("Peterson");
       iphone.salvarNaAgenda("Jeferson");
       iphone.editarContato("Jeferson novo");
       iphone.excluirContato("Jeferson novo ");
       iphone.fazerLigacao("Rafael");
       iphone.limparCorreioDeVoz();*/

       //reprodutor de musica
       iphone.reprodutorDeMusica.abrirAlbum("the beatles");
       iphone.reprodutorDeMusica.excluirMusica("help");
       iphone.reprodutorDeMusica.salvarMusica("yesterday");
       iphone.reprodutorDeMusica.trocarMusica("june");
       iphone.reprodutorDeMusica.aumentarVolume();
       iphone.reprodutorDeMusica.aumentarVolume();
       iphone.reprodutorDeMusica.excluirAlbum("the beatles");
       iphone.reprodutorDeMusica.salvarAlbum(" KDA ");
    }
}