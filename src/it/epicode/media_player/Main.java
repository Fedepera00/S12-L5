package it.epicode.media_player;

import java.util.Scanner; // SCANNNERR

public class Main {
    public static void main(String[] args) {
        PlayerMultimediale player = new PlayerMultimediale();
        Scanner scanner = new Scanner(System.in);


        // CREAZIONE DEI 5 ELEMENTI MULTIMEDIALI , UTILIZZO DEL CICLO FOR E LETTURA
        for (int i = 0; i < 5; i++) {
            System.out.println("Creiamo un elemento multimediale, per farlo scegli un comando :) (1 = Immagine, 2 = Video, 3 = Audio):");
            int tipo = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Inserisci il nome del tuo elemento :");
            String titolo = scanner.nextLine();

            // USO SWITCH E GESTISCO LA CREAZIONE DELL'ELEMENTO IN BASE AL TIPO CHE SCEGLIE L'UTENTE
            switch (tipo) {
                // ABBIAMO 3 CASISTICHE DIFFERENTI
                case 1 -> {
                    // LUMINOSITA' , IMMAGINE
                    System.out.println("Inserisci la luminosità del tuo progetto:");
                    int luminosita = scanner.nextInt();
                    player.aggiungiElemento(new Immagine(titolo, luminosita)); // COSI AGGIUNGIAMO AL LETTORE
                }
                case 2 -> {
                    // CREAZIONE DEL VIDEO , DURATA , VOLUME E LUMINOSITA'
                    System.out.println("Inserisci la durata in secondi:");
                    int durata = scanner.nextInt();
                    System.out.println("Inserisci il volume, obbligatorio il numero positivo altrimenti non sentirai l'audio ;)");
                    int volume = scanner.nextInt();
                    System.out.println("Inserisci la luminosità del tuo progetto: ");
                    int luminosita = scanner.nextInt();
                    player.aggiungiElemento(new Video(titolo, durata, volume, luminosita)); // COSI AGGIUNGIAMO AL LETTORE
                }
                case 3 -> {
                    // CREAZIONE DI UN AUDIO , DURATA E VOLUME
                    System.out.println("Inserisci la durata in secondi:");
                    int durata = scanner.nextInt();
                    System.out.println("Inserisci il volume, obbligatorio il numero positivo altrimenti non sentirai l'audio ;)");
                    int volume = scanner.nextInt();
                    player.aggiungiElemento(new Audio(titolo, durata, volume)); // COSI AGGIUNGIAMO AL LETTORE
                }
                default -> {
                    // IL DEFAULT SI USA SE L'UTENTE USA UN TIPO NON VALIDO  POI USO L'INDICE DI DECREMENTO PER RIPETERE L'ITERAZIONE CORRENTE DEL CICLO
                    System.out.println("Tipo non valido. RIPROVA:(");
                    i--;
                }
            }
        }

        // Menu interattivo per eseguire gli elementi
        int scelta;
        do {
            System.out.println("Inserisci un numero da 1 a 5 per eseguire un elemento creato, oppure 0 per uscire:");
            scelta = scanner.nextInt(); // Legge la scelta dell'utente

            if (scelta > 0 && scelta <= 5) { // Se la scelta è valida
                ElementoMultimediale elemento = player.getElemento(scelta - 1); // Ottiene l'elemento corrispondente
                elemento.play(); // Esegue il metodo play() sull'elemento
            } else if (scelta != 0) { // Caso in cui la scelta è non valida
                System.out.println("ERRORE. OPZIONE NON VALIDA :(.");
            }
        } while (scelta != 0); // Continua finché l'utente non sceglie di uscire

        System.out.println("Uscita dal programma tutto ho funzionato correttamente capo Gzzzzzz."); // Messaggio di chiusura del programma
        scanner.close(); // Chiude lo Scanner
    }
}