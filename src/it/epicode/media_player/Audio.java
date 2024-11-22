package it.epicode.media_player;

import it.epicode.media_player.Interface.IPlayable; // INTERFACCIA

public class Audio extends ElementoMultimediale implements IPlayable { // AUDIO ESTENDE L'ELEMENTO MULTIMEDIALE E IMPLEMENTA IPLAYABLE
    private int volume;

    //MI CREO IL COSTRUTTORE E LO RICHIAMO
    public Audio(String titolo, int durata, int volume) {
        super(titolo, durata);
        this.volume = volume;
    }
    // AUMENTO VOLUME E SOTTO LO INCREMENTO
    public void alzaVolume() {
        this.volume++;
        System.out.println(" Il volume è stato aumentato a: " + volume);
    }
    // RIDUCO IL VOLUME , USO MATH.MAX E NON PERMETTO DI AVERE VALORI NEGATIVI
    public void abbassaVolume() {
        this.volume = Math.max(0, this.volume - 1);
        System.out.println("Il volume è stato diminuito a: " + volume);
    }
    // OVERRIDE METODO PER RIPRODURRE L'AUDIO CON CICLATO CON IL FOR PER DURATA SECONDI
    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {
            System.out.println(titolo + " " + "!".repeat(volume));
        }
    }
}
