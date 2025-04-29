package sio.pokebattle;

import java.util.ArrayList;

public class Personages {
    private int nbPts;
    private ArrayList<Cartes> deck;
    private boolean evoJoues;
    private boolean supporterJoues;
    private ArrayList<Cartes> cartesPosedes;
    private int argent;

    public Personages(int nbPts, boolean evoJoues, boolean supporterJoues) {
        this.nbPts = nbPts;
        this.deck =new ArrayList<>();
        this.evoJoues = evoJoues;
        this.supporterJoues = supporterJoues;
        this.cartesPosedes =new ArrayList<>();
        this.argent=2000;
    }

    public int getNbPts() {
        return nbPts;
    }

    public ArrayList<Cartes> getDeck() {
        return deck;
    }

    public boolean isEvoJoues() {
        return evoJoues;
    }

    public boolean isSupporterJoues() {
        return supporterJoues;
    }

    public ArrayList<Cartes> getCartesPosedes() {
        return cartesPosedes;
    }

    public int getArgent() {
        return argent;
    }

    public void setNbPts(int nbPts) {
        this.nbPts = nbPts;
    }

    public void setDeck(ArrayList<Cartes> deck) {
        this.deck = deck;
    }

    public void setEvoJoues(boolean evoJoues) {
        this.evoJoues = evoJoues;
    }

    public void setSupporterJoues(boolean supporterJoues) {
        this.supporterJoues = supporterJoues;
    }

    public void setCartesPosedes(ArrayList<Cartes> cartesPosedes) {
        this.cartesPosedes = cartesPosedes;
    }

    public void setArgent(int argent) {
        this.argent = argent;
    }
}
