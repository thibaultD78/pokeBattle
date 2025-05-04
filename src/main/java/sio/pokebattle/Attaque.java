package sio.pokebattle;

import java.util.ArrayList;

public class Attaque {
    private String nom;
    private String typeAttaque;
    private int degat;
    private String effet;
    private ArrayList<energie> energies;

    public Attaque(String nom, String typeAttaque, int degat, String effet) {
        this.nom = nom;
        this.typeAttaque = typeAttaque;
        this.degat = degat;
        this.effet = effet;
        this.energies=new ArrayList<>();
    }

    public ArrayList<energie> getEnergies() {
        return energies;
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

    public void ajouterEnergies(energie a){
        energies.add(a);
    }
    public void ajouterEnergies(energie a,energie b){
        energies.add(a);
        energies.add(b);
    }
    public void ajouterEnergies(energie a,energie b,energie c){
        energies.add(a);
        energies.add(b);
        energies.add(c);
    }
    public void ajouterEnergies(energie a,energie b,energie c, energie d){
        energies.add(a);
        energies.add(b);
        energies.add(c);
        energies.add(d);
    }

    public String toString() {
        return nom + " (" + degat + " dégâts)";
    }
}
