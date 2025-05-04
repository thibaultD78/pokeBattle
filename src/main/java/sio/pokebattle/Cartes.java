package sio.pokebattle;

import java.util.ArrayList;
import java.util.Random;

public class Cartes {
    private String nom;
    private String type;
    private String effet;
    private String URLimage;
    private int pv;
    private String pokeType;
    private int cpRetraite;
    private boolean estUneEvo;
    private String formeAnterieure;
    private ArrayList<Attaque> attaques;
    private int nbDansDeck;
    private int nbObtenu;
    private String faiblesse;
    private String resistance;


    public Cartes(String nom, String type, String effet, String URLimage) {
        this.nom = nom;
        this.type = type;
        this.effet = effet;
        this.URLimage = URLimage;
        this.nbDansDeck=0;
        this.nbObtenu=0;
    }

    public Cartes(String nom, String type, String effet, String URLimage, int pv, String pokeType, int cpRetraite, boolean estUneEvo, String formeAnterieure, String faiblesse, String resistance) {
        this.nom = nom;
        this.type = type;
        this.effet = effet;
        this.URLimage = URLimage;
        this.pv = pv;
        this.pokeType = pokeType;
        this.cpRetraite = cpRetraite;
        this.estUneEvo = estUneEvo;
        this.formeAnterieure = formeAnterieure;
        this.attaques= new ArrayList<>();
        this.nbDansDeck=0;
        this.nbObtenu=0;
        this.faiblesse=faiblesse;
        this.resistance=resistance;
    }

    public String getFaiblesse() {
        return faiblesse;
    }

    public String getResistance() {
        return resistance;
    }

    public int getNbDansDeck() {
        return nbDansDeck;
    }

    public int getNbObtenu() {
        return nbObtenu;
    }

    public String getNom() {
        return nom;
    }

    public String getType() {
        return type;
    }

    public String getEffet() {
        return effet;
    }

    public String getURLimage() {
        return URLimage;
    }

    public int getPv() {
        return pv;
    }

    public String getPokeType() {
        return pokeType;
    }

    public int getCpRetraite() {
        return cpRetraite;
    }

    public boolean isEstUneEvo() {
        return estUneEvo;
    }

    public String getFormeAnterieure() {
        return formeAnterieure;
    }

    public ArrayList<Attaque> getAttaques() {
        return attaques;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setEffet(String effet) {
        this.effet = effet;
    }

    public void setURLimage(String URLimage) {
        this.URLimage = URLimage;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }

    public void setPokeType(String pokeType) {
        this.pokeType = pokeType;
    }

    public void setCpRetraite(int cpRetraite) {
        this.cpRetraite = cpRetraite;
    }

    public void setEstUneEvo(boolean estUneEvo) {
        this.estUneEvo = estUneEvo;
    }

    public void setFormeAnterieure(String formeAnterieure) {
        this.formeAnterieure = formeAnterieure;
    }

    public void setAttaques(ArrayList<Attaque> attaques) {
        this.attaques = attaques;
    }
    public static int getRandomNumber(ArrayList<Cartes> c){
        Random random = new Random();
        return random.nextInt((c.size()+1));
    }
    public void incrementNbDansDeck(){
        this.nbDansDeck=this.nbDansDeck+1;
    }
    public void decrementNbDansDeck(){
        this.nbDansDeck=this.nbDansDeck-1;
    }
    public void incrementNbObtenu(){
        this.nbObtenu=this.nbObtenu+1;
    }
    public void decrementNbObtenu(){
        this.nbObtenu=this.nbObtenu-1;
    }
    public void ajouterAttque(Attaque a){
        attaques.add(a);
    }
    public void ajouterAttque(Attaque a,Attaque b){
        attaques.add(a);
        attaques.add(b);
    }
}
