package it.epicode.media_player;

import java.util.ArrayList; // ARRAYLIST JAVA.UTIL FRAMEWORKS
import java.util.List; // INTERFACCIA LIST JAVA.UTIL

    //ELEMENTO MULTIMEDIALE RAPPRESENTATO CON PLAYLISTI PER SALVARE GLI ELEMENTI
public class PlayerMultimediale {
    private List<ElementoMultimediale> playlist;

    public PlayerMultimediale() {
        this.playlist = new ArrayList<>();
    }

    // AGGIUNGO ELEMENTO ALA PLAYLIST
    public void aggiungiElemento(ElementoMultimediale elemento) {
        playlist.add(elemento);
    }

    // OTTENGO UN ELEMTO DELLA PLAYLIST, VERIFICO SE E' GIUSTO SE NON E' GIUSTO ERRORE
    public ElementoMultimediale getElemento(int index) {
        if (index >= 0 && index < playlist.size()) {
            return playlist.get(index);
        } else {
            System.out.println("GRRRR.INDICE NON VALIDO.");
            return null;
        }

    }
    // ESEGUO L'ELEMENTO VERIFICO CHE SIA VALIDO E GLI CHIAMO IL PLAY ALTRIMENTI GRRR, INDICE NON VALIDO
    public void eseguiElemento(int index) {
        if (index >= 0 && index < playlist.size()) {
            playlist.get(index).play();
        } else {
            System.out.println("GRRRR.INDICE NON VALIDO");
        }
    }
}