package it.epicode.media_player;

    // CLASSE ASTRATTA PER L'ELEMENTO MULTIMEDIALE CON ATTRIBUTI PROTETTI PER TITOLO E DURATA DELL'ELEMENTO
public abstract class ElementoMultimediale {
    protected String titolo;
    protected int durata;

    //COSTRUTTORE
    public ElementoMultimediale(String titolo, int durata) {
        this.titolo = titolo;
        this.durata = durata;
    }
    // METODO ASTRATTO PER IL PLAY
    public abstract void play();
}
