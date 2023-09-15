package org.example;


import org.example.aplicativos.Safari;

public abstract class SO {
    protected Object googleMaps;
    protected Object Widgets;
    protected Object YahooMail;
    protected Safari safari = new Safari();
    protected Object fotos;


    public void abriApk(String apk){
        System.out.println("Abrindo "+ apk);
    }


    public void fecharApk(String apk){
        System.out.println("fechando "+ apk);
    }
}
