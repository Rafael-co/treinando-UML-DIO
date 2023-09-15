package org.example.aplicativos;

public class ReprodutorDeMusica {

    protected String musica;
    protected String Album;

    public void abrirAlbum(String album){
        System.out.println("abrindo album" + album );
    }

    public void trocarMusica(String musica){
        System.out.println("reproduzindo musica " + musica );
    }


    public void aumentarVolume(){
        System.out.println("volume aumentado");
    }

    public void diminuirVolume() {
        System.out.println("volume diminuido");
    }

    public void pausarMusicar() {
        System.out.println("musica pausada");
    }

    public void excluirAlbum(String album) {
        System.out.println("album "+ album + " excluido");
    }

    public void excluirMusica(String musica) {
        System.out.println("musica " + musica+ " excluída");
    }

    public void salvarMusica(String musica) {
        System.out.println("musica "+ musica + " salva  com sucesso");
    }

    public void salvarAlbum(String  album) {
        System.out.println("album "+album + " salvo  com sucesso");
    }
}
