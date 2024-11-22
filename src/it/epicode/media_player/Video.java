package it.epicode.media_player;

import it.epicode.media_player.Interface.IPlayable; // INTERFACCIA

public class Video extends ElementoMultimediale implements IPlayable { // VIDEO ESTENDE L'ELEMENTO MULTIMEDIALE E IMPLEMENTA IPLAYABLE
    private int volume;
    private int luminosita;

    // MI CREO IL COSTRUTTORE E LO RICHIAMO PER TITOLP E DURATA
    public Video(String titolo, int durata, int volume, int luminosita) {
        super(titolo, durata);
        this.volume = volume;
        this.luminosita = luminosita;
    }
    // ALZO IL VOLUME E SOTTO LO INCREMENTO
    public void alzaVolume() {
        this.volume++;
        System.out.println("Hai aumentato il volume del video a: " + volume);
    }

    //  RIDUCO IL VOLUME , USO MATH.MAX E NON PERMETTO DI AVERE VALORI NEGATIVI
    public void abbassaVolume() {
        this.volume = Math.max(0, this.volume - 1);
        System.out.println("Hai diminuito il volume del video a: " + volume);
    }

    // ALZO LA LUMINOSITA' E SOTTO LA INCREMENTO
    public void aumentaLuminosita() {
        this.luminosita++;
        System.out.println("La luminosità è stata aumentata a: " + luminosita);
    }

    // COME RIGA 22 SOLO CON LA LUMINOSITA'
    public void diminuisciLuminosita() {
        this.luminosita = Math.max(0, this.luminosita - 1);
        System.out.println("La luminosità è stata diminuita a: " + luminosita);
    }

    // RIPRODUCO VIDEO CON CICLO FOR PER LA DURATA DI ESSO
    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {
            System.out.println(titolo + " " + "!".repeat(volume) + " " + "*".repeat(luminosita));
        }
    }

}