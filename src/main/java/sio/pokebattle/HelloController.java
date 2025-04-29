package sio.pokebattle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    public ImageView carteObtenue;
    public ImageView btnDeck;
    public ImageView btnBooster;
    public ImageView btnCollection;
    public AnchorPane apBooster;
    public AnchorPane apHome;
    public AnchorPane apDeck;
    public ImageView btnHome;
    public ImageView btnHome2;
    public ImageView btnAchat;
    public Label lblArgent;
    public AnchorPane apCollection;
    public ImageView imgCard;
    public Label lblNom;
    public Label lblPv;
    public Label lblType;
    public Label lblEffet;
    public Label lblAttaque;
    public Label lblAttaque2;
    public Label lblCpRetaite;
    public Label lblSousEvo;
    public ImageView btnPrecedent;
    public ImageView btnSuivant;
    public ImageView btnHome3;
    public ImageView imgCarte20;
    public ImageView imgCarte19;
    public ImageView imgCarte18;
    public ImageView imgCarte17;
    public ImageView imgCarte16;
    public ImageView imgCarte15;
    public ImageView imgCarte14;
    public ImageView imgCarte12;
    public ImageView imgCarte11;
    public ImageView imgCarte10;
    public ImageView imgCarte9;
    public ImageView imgCarte13;
    public ImageView imgCarte8;
    public ImageView imgCarte7;
    public ImageView imgCarte6;
    public ImageView imgCarte5;
    public ImageView imgCarte4;
    public ImageView imgCarte3;
    public ImageView imgCarte2;
    public ImageView imgCarte1;
    Personages j1;
    Personages j2;
    Cartes eeau;
    Cartes alakazam;
    Cartes aspicot;
    Cartes epsy;
    Cartes eelec;
    Cartes eplante;
    Cartes efeu;
    Cartes ecombat;
    Cartes echange;
    Cartes potion;
    Cartes abra;
    Cartes arcanin;
    Cartes attPlus;
    Cartes raffaleVent;
    Cartes maintenance;
    Cartes totalSoin;
    Cartes rappel;
    Cartes marchandPoke;
    Cartes fauxProfChen;
    Cartes bulbizard;
    Cartes carabaffe;
    Cartes ratatac;
    Cartes minidraco;
    Cartes lamentine;
    Cartes magmar;
    Cartes leviator;
    Cartes sprayDesevoluant;
    Cartes sacdeneu;
    Cartes stari;
    Cartes staros;
    Cartes carapuce;
    Cartes sabelette;
    Cartes ratata;
    Cartes ponyta;
    Cartes ptitard;
    Cartes pikachu;
    Cartes nidoran;
    Cartes canarticho;
    Cartes tortank;
    Cartes chrisacier;
    Cartes magneti;
    Cartes machoc;
    Cartes fantominus;
    Cartes salameche;
    Cartes chenipan;
    Cartes otaria;
    Cartes tetarte;
    Cartes magikarp;
    Cartes machopeur;
    Cartes kadabra;
    Cartes herbizard;
    Cartes caninos;
    Cartes dracofeu;
    Cartes draco;
    Cartes dardargnan;
    Cartes florizard;
    Cartes raichu;
    Cartes tartard;
    Cartes feunard;
    Cartes magneton;
    Cartes macogneur;
    Cartes levenard;
    Cartes cherchObj;
    Cartes voltorbe;
    Cartes electrode;
    Cartes electek;
    Cartes elector;
    Cartes suppEnergie;
    Cartes profChen;
    Cartes pokedex;
    Cartes pokeflute;
    Cartes centrePoke;
    Cartes recupEnergie;
    Cartes defPlus;
    Cartes supSuppEnergie;
    Cartes fillette;
    Cartes rechercheInfo;
    Cartes topiqueur;
    Cartes melofee;
    Cartes spectrum;
    Cartes reptincelle;
    Cartes triopiqueur;
    Cartes mewtwo;
    Cartes supPoton;
    Cartes goupix;
    Cartes roucool;
    Cartes doduo;
    Cartes lipoutou;
    Cartes roucoups;
    Cartes onix;
    Cartes tygon;
    Cartes smogo;
    Cartes soporifik;
    Cartes porygon;
    Cartes nidorino;
    Cartes coconfort;
    Cartes nidoking;
    Cartes reanimation;
    Cartes bill;
    Cartes boosterOuvert;
    Cartes booster;
    ArrayList<Cartes> listCartes = new ArrayList<>();
    ArrayList<Cartes> listEnergies = new ArrayList<>();
    ArrayList<Cartes> listDresseurs = new ArrayList<>();
    ArrayList<Cartes> listPoke = new ArrayList<>();
    int nombreCliques=0;
    ArrayList<Cartes> listCartesObtenu = new ArrayList<>();
    ArrayList<Cartes> deck = new ArrayList<>();
    int argent=2000;
    boolean achat= false;
    int indice=0;
    ArrayList<Cartes> listCartesUtilisables = new ArrayList<>();
    int nbClick;

    public void changeImageViewImg(ImageView imgView, String linkImage){
        imgView.setImage(
                new Image(
                        getClass().getResource(
                                "/images/"+linkImage
                        ).toExternalForm()
                )
        );
    }

    public void invisible(AnchorPane apCourante){apCourante.setVisible(false);return;}
    public void visible(AnchorPane apCourante){apCourante.setVisible(true);return;}

    public void clearAll()
    {
        invisible(apBooster);
        invisible(apDeck);
        invisible(apHome);
        invisible(apCollection);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        j1 = new Personages(0,false,false);
        j2 = new Personages(0,false,false);
        boosterOuvert=new Cartes("","","","pokemonOuvert.png");
        booster=new Cartes("","","","pokemon.png");
        eeau= new Cartes("energie eau","energie","apporte une ernergie eau","365_102.png" );
        epsy= new Cartes("energie psy","energie","apporte une ernergie psy","364_101.png" );
        eelec= new Cartes("energie électrique","energie","apporte une ernergie électrique","363_100.png" );
        eplante= new Cartes("energie plante","energie","apporte une ernergie plante","362_99.png" );
        efeu= new Cartes("energie feu","energie","apporte une ernergie feu","361_98.png" );
        ecombat= new Cartes("energie combat","energie","apporte une ernergie combat","360_97.png" );
        echange= new Cartes("échange","dresseur","échange 1 pokemon de ton banc \navec ton pokemon actif","358_95.png");
        potion= new Cartes("potion","dresseur","soigne de 20 pv un pokemon","357_94.png");
        raffaleVent= new Cartes("raffale de vent","dresseur","échange un pokemon du banc \nde ton adversaire avec son pokemon \nactif","356_93.png");
        suppEnergie= new Cartes("suppression d'energie","dresseur","détruit une energie attachée \nau pokemon adverse","355_92.png");
        bill= new Cartes("Bill","dresseur","pioche deux cartes","354_91.png");
        supPoton= new Cartes("super potion","dresseur","soigne 40 pv en echange détrusez une \nenergie de votre pokemon","353_90.png");
        reanimation= new Cartes("réanimation","dresseur","mettez un pokemon de base de \nvotre pile de défausse a votre banc \navec la moitié de sa vie \n(arrondie a 10 pres)","352_89.png");
        profChen= new Cartes("professeur Chen","dresseur","détrusez votre main, piochez 7 cartes","351_88.png");
        pokedex= new Cartes("pokedex","dresseur","regardez les 5 cartes du dessus de \nvotre deck et remettez  les  comme \nvous le voulez","350_87.png");
        pokeflute= new Cartes("pokeflûte","dresseur","choisis un pokemon de base de \nla pile de défausse de ton adversaire \net met le sur son banc","349_86.png");
        centrePoke= new Cartes("centre pokemon","dresseur","détruit toutes les energie sur ton \nterrain, soigne tout tes pokemon \nau maximum de leurs pv","348_85.png");
        attPlus= new Cartes("attaque plus","dresseur","ton pokemon inflige 10 dégats \nsupplémentaires","347_84.png");
        maintenance= new Cartes("maintenance","dresseur","melange deux cartes de ta main au \ndeck, pioche 2 cartes","346_83.png");
        totalSoin= new Cartes("total soin","dresseur","soigne les effets de status","345_82.png");
        recupEnergie= new Cartes("récuperation d'energie","dresseur","échange une carte de ta main contre \ndeux energies de ta pile de défausse","344_81.png");
        defPlus= new Cartes("defence plus","dresseur","la prochaine attaque de votre adversaire \ninfilgera 20 pv de moins","343_80.png");
        supSuppEnergie= new Cartes("super suppression d'energie","dresseur","détrusez une energie de votre \npokemon et deux du pokemon \nadverse","342_79.png");
        rappel= new Cartes("rappel","dresseur","fait revenir un pokemon de \nvotre adversaire a ca main","341_78.png");
        marchandPoke=new Cartes("marchand de pokemon","dresseur","échange un pokemon de ta main avec \nun pokemon de ton deck","340_77.png");
        fillette= new Cartes("fillette","dresseur","montrez votre main, votre adversaire \nfera de meme ensuite mélanger toute \nvos cartes dresseurs dans votre \ndeck","338_75.png");
        cherchObj= new Cartes("cherch'objet","dresseur","détruisez deux cartes de votre \nmain puis ajoutez une carte dresseur \nde votre pile de défausse a votre \nmain","337_74.png");
        fauxProfChen= new Cartes("faux professeur Chen","dresseur","votre adversaire melange sa main \ndans son deck puis pioche \n7 cartes","336_73.png");
        sprayDesevoluant= new Cartes("spray dés-évoluant","dresseur","votre  pokemon retourne a un stade \ninferieur et se soigne de tout \nses status","335_72.png");
        rechercheInfo= new Cartes("recherche informatique","dresseur","détrusez 2 cartes et choisissez en \nune de votre deck a ajouter a \nvotre main","334_71.png");
        alakazam=new Cartes("alakazam","pokemon","vous pouvez déplacer autant de dégats \nque vous voulez d'un de vos \npokémon a un autre de vos \npokémons","264_1.png",80,"psy",3,true,"kadabra");
        aspicot=new Cartes("aspicot","pokemon","","332_69.png",40,"plante",1,false,"base");
        goupix=new Cartes("goupix","pokemon","","331_68.png",50,"feu",1,false,"base");
        voltorbe=new Cartes("voltorbe","pokemon","","330_67.png",40,"electrique",1,false,"base");
        sacdeneu=new Cartes("sacdeneu","pokemon","","329_66.png",50,"plante",2,false,"base");
        stari=new Cartes("stari","pokemon","","328_65.png",40,"eau",1,false,"base");
        staros=new Cartes("staros","pokemon","","327_64.png",60,"eau",1,true,"stari");
        carapuce=new Cartes("carapuce","pokemon","","326_63.png",40,"eau",1,false,"base");
        sabelette=new Cartes("sabelette","pokemon","","325_62.png",40,"combat",1,false,"base");
        ratata=new Cartes("ratata","pokemon","","324_61.png",30,"normal",0,false,"base");
        ponyta=new Cartes("ponyta","pokemon","","323_60.png",40,"feu",1,false,"base");
        ptitard=new Cartes("ptitard","pokemon","","322_59.png",40,"eau",1,false,"base");
        pikachu=new Cartes("pikachu","pokemon","","321_58.png",40,"electrique",1,false,"base");
        roucool=new Cartes("roucool","pokemon","","320_57.png",40,"normal",1,false,"base");
        onix=new Cartes("onix","pokemon","","319_56.png",90,"combat",3,false,"base");
        nidoran=new Cartes("nidoran","pokemon","","318_55.png",40,"psy",1,false,"base");
        tygon=new Cartes("tygnon","pokemon","","270_7.png",70,"combat",2,false,"base");
        tortank=new Cartes("tortank","pokemon","vous pouvez déplacer autant \nd'énergies eau que vous voulez \nd'un de vos pokemon a un autre","265_2.png",100,"eau",3,true,"carabaffe");
        chrisacier=new Cartes("chrisacier","pokemon","","317_54.png",70,"plante",2,true,"chenipan");
        magneti=new Cartes("magnéti","pokemon","","316_53.png",40,"electrique",1,false,"base");
        machoc=new Cartes("machoc","pokemon","","315_52.png",50,"combat",1,false,"base");
        smogo=new Cartes("smogo","pokemon","","314_51.png",50,"plante",1,false,"base");
        fantominus=new Cartes("fantominus","pokemon","","313_50.png",30,"psy",0,false,"base");
        soporifik=new Cartes("soporifik","pokemon","","312_49.png",50,"psy",1,false,"base");
        doduo=new Cartes("doduo","pokemon","","311_48.png",50,"normal",0,false,"base");
        topiqueur=new Cartes("topiqueur","pokemon","","310_47.png",30,"combat",0,false,"base");
        salameche=new Cartes("salamèche","pokemon","","309_46.png",50,"feu",0,false,"base");
        chenipan=new Cartes("chenipan","pokemon","","308_45.png",40,"plante",1,false,"base");
        bulbizard=new Cartes("bulbizard","pokemon","","307_44.png",40,"plante",1,false,"base");
        abra=new Cartes("abra","pokemon","","306_43.png",30,"psy",0,false,"base");
        carabaffe=new Cartes("carabaffe","pokemon","","305_42.png",70,"eau",1,true,"carapuce");
        otaria=new Cartes("otaria","pokemon","","304_41.png",60,"eau",1,false,"base");
        ratatac=new Cartes("ratatac","pokemon","","303_40.png",60,"normal",1,true,"ratata");
        leviator=new Cartes("léviator","pokemon","","269_6.png",100,"eau",3,true,"magicarp");
        melofee=new Cartes("mélofée","pokemon","","268_5.png",40,"normal",1,false,"base");
        porygon=new Cartes("porygon","pokemon","","302_39.png",30,"normal",1,false,"base");
        tetarte=new Cartes("tétarte","pokemon","","301_38.png",60,"eau",1,true,"ptitard");
        nidorino=new Cartes("nidorino","pokemon","","300_37.png",60,"plante",1,true,"nidoran");
        magmar=new Cartes("magmar","pokemon","","299_36.png",50,"feu",2,false,"base");
        magikarp=new Cartes("magikarp","pokemon","","298_35.png",30,"eau",1,false,"base");
        machopeur=new Cartes("machopeur","pokemon","","297_34.png",80,"combat",3,true,"machoc");
        coconfort=new Cartes("coconfort","pokemon","","296_33.png",80,"plante",2,true,"aspicot");
        kadabra=new Cartes("kadabra","pokemon","","295_32.png",60,"psy",3,true,"abra");
        lipoutou=new Cartes("lipoutou","pokemon","","294_31.png",70,"psy",2,false,"base");
        herbizard=new Cartes("herbizard","pokemon","","393_30.png",60,"plante",1,true,"bulbizard");
        spectrum=new Cartes("spectrum","pokemon","","292_29.png",60,"psy",1,true,"fantominus");
        caninos=new Cartes("caninos","pokemon","","291_28.png",60,"feu",1,false,"base");
        canarticho=new Cartes("canarticho","pokemon","","290_27.png",50,"normal",1,false,"base");
        minidraco=new Cartes("minidraco","pokemon","","289_26.png",40,"normal",1,false,"base");
        lamentine=new Cartes("lamentine","pokemon","","288_25.png",80,"eau",3,true,"otaria");
        dracofeu=new Cartes("dracofeu","pokemon","vous pouvez déplacer autant \nd'énergies feu que vous voulez \nd'un de vos pokemon a un autre","267_4.png",120,"feu",3,true,"reptincelle");
        reptincelle=new Cartes("reptincelle","pokemon","","287_24.png",80,"feu",1,true,"salamèche");
        arcanin=new Cartes("arcanin","pokemon","","286_23.png",100,"feu",3,true,"caninos");
        roucoups=new Cartes("roucoups","pokemon","","285_22.png",60,"normal",1,true,"roucool");
        electrode=new Cartes("électrode","pokemon","vous pouvez transformer ce \npokemon en deux énergies de \nvotre choix et les attacher \nà un de vos pokemon","284_21.png",80,"électrique",1,true,"voltorbe");
        electek=new Cartes("électèk","pokemon","","283_20.png",70,"électrique",2,false,"base");
        triopiqueur=new Cartes("triopiqueur","pokemon","","282_19.png",70,"combat",2,true,"topiqueur");
        draco=new Cartes("draco","pokemon","","281_18.png",80,"normal",2,true,"minidraco");
        dardargnan=new Cartes("dardargnan","pokemon","","280_17.png",80,"plante",0,true,"coconfort");
        elector=new Cartes("élector","pokemon","","279_16.png",90,"électrique",3,false,"base");
        florizard=new Cartes("florizard","pokemon","vous pouvez déplacer autant \nd'énergies plantes que vous voulez \nd'un de vos pokemon a un autre","278_15.png",100,"plante",2,true,"herbizard");
        raichu=new Cartes("raichu","pokemon","","277_14.png",80,"électrique",1,true,"pikachu");
        tartard=new Cartes("tartard","pokemon","","276_13.png",90,"eau",3,true,"tétarte");
        feunard=new Cartes("feunard","pokemon","","275_12.png",80,"feu",1,true,"goupix");
        nidoking=new Cartes("nidoking","pokemon","","274_11.png",90,"plante",3,true,"nidorino");
        mewtwo=new Cartes("mewtwo","pokemon","","273_10.png",80,"psy",3,false,"base");
        magneton=new Cartes("magnéton","pokemon","","272_9.png",60,"électrique",1,true,"magnéti");
        macogneur=new Cartes("macogneur","pokemon","infigez 10 dégats au pokemon qui \nattaque macogneur","271_8.png",100,"combat",3,true,"machopeur");
        levenard=new Cartes("levénard","pokemon","","266_3.png",120,"normal",1,false,"base");
        listCartes.add(eeau);
        listCartes.add(epsy);
        listCartes.add(eelec);
        listCartes.add(eplante);
        listCartes.add(efeu);
        listCartes.add(ecombat);
        listCartes.add(echange);
        listCartes.add(potion);
        listCartes.add(raffaleVent);
        listCartes.add(suppEnergie);
        listCartes.add(bill);
        listCartes.add(supPoton);
        listCartes.add(reanimation);
        listCartes.add(profChen);
        listCartes.add(pokedex);
        listCartes.add(pokeflute);
        listCartes.add(centrePoke);
        listCartes.add(attPlus);
        listCartes.add(maintenance);
        listCartes.add(totalSoin);
        listCartes.add(recupEnergie);
        listCartes.add(defPlus);
        listCartes.add(supSuppEnergie);
        listCartes.add(rappel);
        listCartes.add(marchandPoke);
        listCartes.add(fillette);
        listCartes.add(cherchObj);
        listCartes.add(fauxProfChen);
        listCartes.add(sprayDesevoluant);
        listCartes.add(rechercheInfo);
        listCartes.add(alakazam);
        listCartes.add(aspicot);
        listCartes.add(goupix);
        listCartes.add(voltorbe);
        listCartes.add(sacdeneu);
        listCartes.add(stari);
        listCartes.add(staros);
        listCartes.add(carapuce);
        listCartes.add(sabelette);
        listCartes.add(ratata);
        listCartes.add(ponyta);
        listCartes.add(ptitard);
        listCartes.add(pikachu);
        listCartes.add(roucool);
        listCartes.add(onix);
        listCartes.add(nidoran);
        listCartes.add(tygon);
        listCartes.add(tortank);
        listCartes.add(chrisacier);
        listCartes.add(magneti);
        listCartes.add(machoc);
        listCartes.add(smogo);
        listCartes.add(fantominus);
        listCartes.add(soporifik);
        listCartes.add(doduo);
        listCartes.add(topiqueur);
        listCartes.add(salameche);
        listCartes.add(chenipan);
        listCartes.add(bulbizard);
        listCartes.add(abra);
        listCartes.add(carabaffe);
        listCartes.add(otaria);
        listCartes.add(ratatac);
        listCartes.add(leviator);
        listCartes.add(melofee);
        listCartes.add(porygon);
        listCartes.add(tetarte);
        listCartes.add(nidorino);
        listCartes.add(magmar);
        listCartes.add(magikarp);
        listCartes.add(machopeur);
        listCartes.add(coconfort);
        listCartes.add(kadabra);
        listCartes.add(lipoutou);
        listCartes.add(herbizard);
        listCartes.add(spectrum);
        listCartes.add(caninos);
        listCartes.add(canarticho);
        listCartes.add(minidraco);
        listCartes.add(lamentine);
        listCartes.add(dracofeu);
        listCartes.add(reptincelle);
        listCartes.add(arcanin);
        listCartes.add(roucoups);
        listCartes.add(electrode);
        listCartes.add(electek);
        listCartes.add(triopiqueur);
        listCartes.add(draco);
        listCartes.add(dardargnan);
        listCartes.add(elector);
        listCartes.add(florizard);
        listCartes.add(raichu);
        listCartes.add(tartard);
        listCartes.add(feunard);
        listCartes.add(nidoking);
        listCartes.add(mewtwo);
        listCartes.add(magneton);
        listCartes.add(macogneur);
        listCartes.add(levenard);
        for (Cartes c : listCartes) {
            if (c.getType().equals("pokemon")) {
                listPoke.add(c);
            }
            if (c.getType().equals("dresseur")) {
                listDresseurs.add(c);
            }
            if (c.getType().equals("energie")) {
                listEnergies.add(c);
            }
        }
        clearAll();
        visible(apHome);
    }
    public void clickSuivante(MouseEvent mouseEvent) {
        if (achat) {
            if (nombreCliques == 0) {
                changeImageViewImg(carteObtenue, boosterOuvert.getURLimage());
                nombreCliques = nombreCliques + 1;
            } else if (nombreCliques <= 2) {
                Cartes c = listEnergies.get(Cartes.getRandomNumber(listEnergies));
                listCartesObtenu.add(c);
                listCartesUtilisables.add(c);
                changeImageViewImg(carteObtenue, c.getURLimage());
                nombreCliques = nombreCliques + 1;
            } else if (nombreCliques <= 4) {
                Cartes c = listDresseurs.get(Cartes.getRandomNumber(listDresseurs));
                listCartesObtenu.add(c);
                listCartesUtilisables.add(c);
                changeImageViewImg(carteObtenue, c.getURLimage());
                nombreCliques = nombreCliques + 1;
            } else if (nombreCliques <= 10) {
                Cartes c = listPoke.get(Cartes.getRandomNumber(listPoke));
                listCartesObtenu.add(c);
                listCartesUtilisables.add(c);
                changeImageViewImg(carteObtenue, c.getURLimage());
                nombreCliques = nombreCliques + 1;
            }
            else{
                changeImageViewImg(carteObtenue, booster.getURLimage());
                achat=false;
                nombreCliques=0;
                btnAchat.setVisible(true);
            }

        }
    }
    public void affCarte (Cartes c){
        changeImageViewImg(imgCard,c.getURLimage());
        lblNom.setText("nom : "+c.getNom());
        lblPv.setText("PV : "+ c.getPv());
        lblType.setText("Type : "+c.getPokeType());
        lblEffet.setText("Effet : "+c.getEffet());
        lblSousEvo.setText("Sous-évolution : "+c.getFormeAnterieure());
        lblCpRetaite.setText("coup de retraite : "+c.getCpRetraite());
    }
    public void affDeck(){
        changeImageViewImg(imgCarte1,deck.getFirst().getURLimage());
        changeImageViewImg(imgCarte2,deck.get(1).getURLimage());
        changeImageViewImg(imgCarte3,deck.get(2).getURLimage());
        changeImageViewImg(imgCarte4,deck.get(3).getURLimage());
        changeImageViewImg(imgCarte5,deck.get(4).getURLimage());
        changeImageViewImg(imgCarte6,deck.get(5).getURLimage());
        changeImageViewImg(imgCarte7,deck.get(6).getURLimage());
        changeImageViewImg(imgCarte8,deck.get(7).getURLimage());
        changeImageViewImg(imgCarte9,deck.get(8).getURLimage());
        changeImageViewImg(imgCarte10,deck.get(9).getURLimage());
        changeImageViewImg(imgCarte11,deck.get(10).getURLimage());
        changeImageViewImg(imgCarte12,deck.get(11).getURLimage());
        changeImageViewImg(imgCarte13,deck.get(12).getURLimage());
        changeImageViewImg(imgCarte14,deck.get(13).getURLimage());
        changeImageViewImg(imgCarte15,deck.get(14).getURLimage());
        changeImageViewImg(imgCarte16,deck.get(15).getURLimage());
        changeImageViewImg(imgCarte17,deck.get(16).getURLimage());
        changeImageViewImg(imgCarte18,deck.get(17).getURLimage());
        changeImageViewImg(imgCarte19,deck.get(18).getURLimage());
        changeImageViewImg(imgCarte20,deck.get(19).getURLimage());
    }
    public void clickDeck(MouseEvent mouseEvent) {
        clearAll();
        visible(apDeck);
        affDeck();
    }

    public void clickBooster(MouseEvent mouseEvent) {
        clearAll();
        visible(apBooster);
        changeImageViewImg(carteObtenue,booster.getURLimage());
    }

    public void clickCollection(MouseEvent mouseEvent) {
        clearAll();
        visible(apCollection);
        affCarte(listCartesObtenu.getFirst());
        indice=0;
    }

    public void clickHome(MouseEvent mouseEvent) {
        clearAll();
        visible(apHome);
    }

    public void clickAchat(MouseEvent mouseEvent) {
        if (argent-500>=0) {
            argent = argent - 500;
            lblArgent.setText(String.valueOf(argent));
            achat = true;
            btnAchat.setVisible(false);
        }
    }

    public void clickPrecedent(MouseEvent mouseEvent) {
        if (indice>0){
            indice=indice-1;
            affCarte(listCartesObtenu.get(indice));
        }
    }

    public void clickSuivant(MouseEvent mouseEvent) {
        if (indice<listCartesObtenu.size()){
            indice=indice+1;
            affCarte(listCartesObtenu.get(indice));
        }
    }

    public void clickAddDeck(MouseEvent mouseEvent) {
        if (deck.size()<20) {
            if (listCartesObtenu.get(indice).getNbDansDeck()<=listCartesObtenu.get(indice).getNbObtenu()){
                deck.add(listCartesObtenu.get(indice));
                listCartesObtenu.get(indice).incrementNbDansDeck();
            }
        }
    }
}

