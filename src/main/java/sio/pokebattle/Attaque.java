package sio.pokebattle;

public class Attaque {
    private String nom;
    private String typeAttaque;
    private int degat;
    private String effet;

    public Attaque(String nom, String typeAttaque, int degat, String effet) {
        this.nom = nom;
        this.typeAttaque = typeAttaque;
        this.degat = degat;
        this.effet = effet;
    }

    public String getNom() {
        return nom;
    }

    public String getTypeAttaque() {
        return typeAttaque;
    }

    public int getDegat() {
        return degat;
    }

    public String getEffet() {
        return effet;
    }
}
