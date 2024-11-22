package it.epicode.media_player;

import it.epicode.media_player.Interface.IShowable; // INTERFACCIA

public class Immagine extends ElementoMultimediale implements IShowable { // IMMAGINE ESTENDE L'ELEMENTO MULTIMEDIALE E IMPLEMENTA ISHOWABLE
    private int luminosita;

    //MI CREO IL COSTRUTTORRE E LO RICHIAMO CON DURATA
    public Immagine(String titolo, int luminosita) {
        super(titolo, 0);
        this.luminosita = luminosita;
    }
    // AUMENTARE LA LUMINOSITA' CON INCREMENTO
    public void aumentaLuminosita() {
        this.luminosita++;
        System.out.println("La Luminosità dell'immagine è stata aumentata a: " + luminosita);
    }
    // RIDUCO LA LUMINOSITA' , USO MATH.MAX E NON PERMETTO DI AVERE VALORI NEGATIVI
    public void diminuisciLuminosita() {
        this.luminosita = Math.max(0, this.luminosita - 1);
        System.out.println("La luminosità dell'immagine è stata diminuita a: " + luminosita);
    }
    // OVERRIDE DOVE VEDO L'IMMAGINE E UNO DOVE CHIAMO PLAU PER LO SHOW IMG
    @Override
    public void show() {
        System.out.println(titolo + " " + "*".repeat(luminosita));
    }

    @Override
    public void play() {
        show();

    }
}