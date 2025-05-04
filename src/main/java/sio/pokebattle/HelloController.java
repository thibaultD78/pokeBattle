package sio.pokebattle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
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
    public ImageView imgEnergie1;
    public ImageView imgEnergie2;
    public ImageView imgEnergie3;
    public ImageView imgEnergie4;
    public ImageView imgEnergie5;
    public ImageView imgEnergie6;
    public ImageView imgEnergie7;
    public ImageView imgEnergie8;
    public ImageView btnInfo2;
    public ImageView btnInfo1;
    public ImageView btnRetrer1;
    public ImageView btnRetrer2;
    public ImageView btnRetrer3;
    public ImageView btnRetrer4;
    public ImageView btnRetrer5;
    public ImageView btnRetrer6;
    public ImageView btnRetrer7;
    public ImageView btnRetrer8;
    public ImageView btnRetrer9;
    public ImageView btnRetrer10;
    public ImageView btnRetrer11;
    public ImageView btnRetrer12;
    public ImageView btnRetrer13;
    public ImageView btnRetrer14;
    public ImageView btnRetrer15;
    public ImageView btnRetrer16;
    public ImageView btnRetrer17;
    public ImageView btnRetrer18;
    public ImageView btnRetrer19;
    public ImageView btnRetrer20;
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
    Attaque confuseRay;
    Attaque hydroPump;
    Attaque scrunch;
    Attaque doubleEdge;
    Attaque fireSpin;
    Attaque sing;
    Attaque metronome;
    Attaque dragonRage;
    Attaque bubbleBeam;
    Attaque jab;
    Attaque specialPunch;
    Attaque seismicToss;
    Attaque tunderWave;
    Attaque selfdestruct;
    Attaque psychic;
    Attaque barrier;
    Attaque thrash;
    Attaque toxic;
    Attaque lure;
    Attaque fireBlast;
    Attaque waterGun;
    Attaque whirlpool;
    Attaque agility;
    Attaque thunder;
    Attaque solarbeam;
    Attaque thunderbolt;
    Attaque twineedle;
    Attaque poisonString;
    Attaque slam;
    Attaque hyperBeam;
    Attaque slash;
    Attaque slashRep;
    Attaque earthquake;
    Attaque thundershock;
    Attaque thunderpunch;
    Attaque electricShock;
    Attaque whirlwind;
    Attaque mirrorMove;
    Attaque flamethrower;
    Attaque takeDwn;
    Attaque auroraBeam;
    Attaque iceBeam;
    Attaque pound;
    Attaque leekSlap;
    Attaque potSmash;
    Attaque flare;
    Attaque hypnosis;
    Attaque dreamEater;
    Attaque vineWhip;
    Attaque poisonpowder;
    Attaque doubleslap;
    Attaque meditate;
    Attaque recover;
    Attaque superPsy;
    Attaque stiffen;
    Attaque karateChop;
    Attaque submission;
    Attaque tackle;
    Attaque flail;
    Attaque firePunch;
    Attaque doubleKick;
    Attaque hornDrill;
    Attaque amnesia;
    Attaque doubleslapTet;
    Attaque conversion1;
    Attaque conversion2;
    Attaque biteRata;
    Attaque superFang;
    Attaque headbutt;
    Attaque biteCara;
    Attaque withdraw;
    Attaque psyshock;
    Attaque leechSeed;
    Attaque stringShot;
    Attaque scratch;
    Attaque ember;
    Attaque dig;
    Attaque mudSlap;
    Attaque furryAttack;
    Attaque confuseRaySopo;
    Attaque sleepingGaz;
    Attaque destinyBond;
    Attaque foulGas;
    Attaque lowKick;
    Attaque thunderWave;
    Attaque selfdestructMagne;
    Attaque stunSpore;
    Attaque hornHazard;
    Attaque rockThrow;
    Attaque whirlwindRoo;
    Attaque harden;
    Attaque gnaw;
    Attaque thunderJolt;
    Attaque waterGunpti;
    Attaque smashKick;
    Attaque flameTail;
    Attaque sandAtt;
    Attaque bubble;
    Attaque starFreeze;
    Attaque slap;
    Attaque bind;
    Attaque poisonSting;
    Attaque tackleElec;
    Attaque poisonpowderCocon;
    Attaque recoverSta;
    Attaque confuseRayGoup;
    Cartes missingNo;
    energie eau;
    energie elec;
    energie plante;
    energie feu;
    energie combat;
    energie normal;
    energie psy;
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
        normal= new energie("energieNormal.png");
        eau= new energie("energieEau.png");
        feu= new energie("energieFeu.png");
        plante= new energie("energiePlante.png");
        elec= new energie("energieElec.png");
        combat= new energie("energieCombat.png");
        psy= new energie("energiePsy.png");
        missingNo=new Cartes("","","","imageBase.png");
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
        confuseRayGoup=new Attaque("Confuse Ray","feu",10,"lancez une pièce si c'est face le pokemon adverse est confu");
        recoverSta=new Attaque("Recover","eau",0,"soigne staros en echange d'une energie eau");
        confuseRay=new Attaque("Confuse Ray","psy",30,"lancer une pièce si c'est face le pokemon adverse est confu");
        hydroPump=new Attaque("Hydro Pump","eau",40,"inflige 10 degats pour chaques energiers supplémentaires sur tortank");
        scrunch=new Attaque("Scrunch","normal",0,"lancer une piece si c'est face levenard suit 0 dégats au prochain tour");
        doubleEdge=new Attaque("Double_edge","normal",80,"perd 80 pv");
        fireSpin=new Attaque("Fire Spin","feu",100,"défaussez deux energies de dracofeu");
        sing=new Attaque("Sing","normal",0,"lancer une piece si c'est face le pokemon adverse est endormi");
        metronome=new Attaque("Métronome","normal",0,"utilise une attaque du pokemon adverse");
        dragonRage=new Attaque("Dragon Rage","eau",50,"");
        bubbleBeam=new Attaque("Bubblebeam","eau",40,"lancez une piece si c'est face le pokemon adverse est paralizé");
        jab=new Attaque("Jab","combat",20,"");
        poisonpowderCocon=new Attaque("Poisonpowder","plante",2,"lancez une pièce si c'est face le pokemon adverse est empoisoné");
        specialPunch=new Attaque("Special Punch","combat",40,"");
        seismicToss=new Attaque("Seismic Toss","combat",60,"");
        tunderWave=new Attaque("Thunder Wave","électrique",30,"lancez une piece si c'est face le pokemon adverse est paralizé");
        selfdestruct=new Attaque("Selfdestruct","électrique",80,"infilige 20 dégats a tout les pokemons de banc et magnéton meurt");
        psychic=new Attaque("Psychic","psy",10,"inflige 10 dégats supplémentaires pour chaques énergies sur le pokémon adverse");
        barrier=new Attaque("Barrier","psy",0,"défaussez une energie psy la prochane attaque du pokemon adverse ne fera rien");
        thrash=new Attaque("Thrash","plante",30,"lancez une pièce si c'est face l'attaque infligera 10 dégats supplémentaire si c'est pile l'attaque infligera 10 dégas a nidoking");
        toxic=new Attaque("Toxic","plante",20,"le pokémon adverse est empoisoné il recois 20 dégats par tours au lieu de 10");
        lure=new Attaque("Lure","feu",0,"échanger un pokémon de banc de l'adversaire avec son pokemon actif");
        fireBlast=new Attaque("Fire Blast","feu",80,"défaussez une energie feu");
        waterGun=new Attaque("Water Gun","eau",30,"inflige 10 dégats supplémentaire pour chaques energies eau supplémentaires au coup energétique de l'attaque");
        whirlpool=new Attaque("Whirlpool","eau",40,"défaussez une energie attachée au pokemon adverse");
        agility=new Attaque("Agility","électrique",20,"lancez une pièce si c'est face l'attaque du pokemon adverse ne fera rien");
        thunder=new Attaque("Thunder","électrique",60,"lancez une pièce si c'est pile ce pokemon s'infilge 30");
        solarbeam=new Attaque("Solarbeam","plante",60,"");
        thunderbolt=new Attaque("Thunderbolt","électrique",100,"défaussez toutes les energies de se pokemon");
        twineedle=new Attaque("Twineedle","plante",30,"lancez deux pièces infligez 30 fois le nombre de faces");
        poisonString=new Attaque("Poison String","plante",40,"lancez une pièce si c'est face le pokemon adverse est empoisonné");
        slam=new Attaque("Slam","normal",30,"lancez deux pièces infligez 30 fois le nombre de faces");
        hyperBeam=new Attaque("Hyper Beam","psy",20,"déffaussez une energie du pokemon adverse");
        slash=new Attaque("Slash","combat",40,"");
        earthquake=new Attaque("Earthquake","combat",70,"infligez 10 dégats a tout les pokemon de banc");
        thundershock=new Attaque("Thundershock","électrique",10,"lancez une pièce si c'est face le pokemon adverse est paralizé");
        thunderpunch=new Attaque("Thunderpunch","électrique",30,"lancez une pièce si c'est face l'attaque infligera 10 dégats supplémentaire si c'est pile l'attaque infligera 10 dégas a électek");
        electricShock=new Attaque("Electric Shock","électrique",50,"lancez une pièce si c'est pile prenez 10 dégats");
        whirlwind=new Attaque("Whirlwind","normal",20,"échange un pokémon du banc de ton adversaire avec son pokemon actif");
        mirrorMove=new Attaque("Mirror Move","normal",0,"infligez des dégats égaux a la dèrnière attaque d'adversaire");
        flamethrower=new Attaque("Flamethrower","feu",50,"défausez une energie feu de ce pokemon");
        takeDwn=new Attaque("Take Down","feu",80,"recevez 30 dégats");
        slashRep=new Attaque("Slash","feu",30,"");
        auroraBeam=new Attaque("Aurora Beam","eau",50,"");
        iceBeam=new Attaque("Ice Beam","eau",30,"lancez une pièce si c'est face le pokemon adverse paralizé");
        pound=new Attaque("Pound","normal",10,"");
        leekSlap=new Attaque("Leek Slap","normal",30,"utilisable qu'une fois, lancez une pièce si c'est pile l'attaque ne fait rien");
        potSmash=new Attaque("Pot Smash","normal",30,"");
        flare=new Attaque("Flare","feu",20,"");
        hypnosis=new Attaque("Hypnosis","psy",0,"le pokemon adverse est endormi");
        dreamEater=new Attaque("Dream Eater","psy",50,"ne marche que si le pokemon adverse est endormi");
        vineWhip=new Attaque("Vine Whip","plante",30,"");
        poisonpowder=new Attaque("Poisonpowder","plante",20,"le pokemon adverse est empoisonné");
        doubleslap=new Attaque("Doubleslap","psy",10,"lancez 2 pices infilgez le nombre de faces fois10");
        meditate=new Attaque("Meditate","psy",20,"inflige 10 dégats supplémentaires tout les 10 dégats sur le pokemon adverse");
        recover=new Attaque("Recover","psy",0,"soigne kadbra en echange d'une energie psy");
        superPsy=new Attaque("Super Psy","psy",50,"");
        stiffen=new Attaque("Stiffen","plante",0,"lancez une pièce si c'est face coconfort ne prends pas de dégats");
        karateChop=new Attaque("Karate Chop","combat",50,"inflige 10 dégats de moins tout les 10 dégats infligez a machopeur");
        submission=new Attaque("Submission","combat",60,"machopeur subit 20 dégats");
        tackle=new Attaque("Tacke","eau",10,"");
        flail=new Attaque("Flail","eau",10,"infilge 10 dégats fois le le nombre de dégats infligé a magicarpe divisé par 10");
        firePunch=new Attaque("Fire Punch","feu",30,"");
        doubleKick=new Attaque("Double Kick","plante",30,"lancez deux pièces inflige 30 fois le nombre de faces");
        hornDrill=new Attaque("Horn Drill","plante",50,"");
        amnesia=new Attaque("Amnesia","eau",0,"le pokemon adverse ne peux utiliser une de ces attaques");
        doubleslapTet=new Attaque("Doubleslap","eau",30,"lancez deux pièces inflige 30 fois le nombre de faces");
        conversion1=new Attaque("Conversion1","normal",0,"changez la faiblesse du pokemon adverse par celle que vous voulez");
        conversion2=new Attaque("Conversion2","normal",0,"changez la résistance de porygon par celle que vous voulez");
        biteRata=new Attaque("Bite","normal",20,"");
        superFang=new Attaque("Super Fang","normal",0,"inflique la moitiée des pv du pokemon adverse");
        headbutt=new Attaque("Headbutt","eau",10,"");
        biteCara=new Attaque("Bite","eau",40,"");
        withdraw=new Attaque("Withdraw","eau",0,"lancez une pièce si c'est face ce pokemon recois aucun dommages");
        psyshock=new Attaque("Psyshock","psy",10,"lancez une pièce si c'est face le pokemon adverse est paralizé");
        leechSeed=new Attaque("Leech Seed","plante",20,"soignez 10 a ce pokemon");
        stringShot=new Attaque("String Shot","plante",10,"lancez une pièce si c'est face le pokemon adverse est paralizé");
        scratch=new Attaque("Scratch","feu",10,"");
        ember=new Attaque("Ember","feu",30,"défaussez une energie feu de ce pokemon");
        dig=new Attaque("Dig","combat",10,"");
        mudSlap=new Attaque("Mud Slap","combat",30,"");
        furryAttack=new Attaque("Furry Attack","normal",10,"lancez deux pièces infligez 10 fois le nombre de faces");
        confuseRaySopo=new Attaque("Confuse Ray","psy",10,"lancez une pièce si c'est face le pokemon adverse est confu");
        sleepingGaz=new Attaque("Sleeping Gaz","psy",0,"lancez une pièce si c'est face le pokemon adverse est endormi");
        destinyBond=new Attaque("Destiny Bond","psy",0,"défaussez une enrgie psy de se pokémon metez k.O le pokémon adverse si fantominus est K.O se tour");
        foulGas=new Attaque("Foul Gas","plante",10,"lancez une pièce si c'est face le pokemon adverse est empoisonné si c'est pile le pokemon adverse est confu");
        lowKick=new Attaque("Low Kick","combat",20,"");
        thunderWave=new Attaque("Thunder Wave","électrique",10,"lancez une pièce si c'est face le pokemon adverse est paralizé");
        selfdestructMagne=new Attaque("Selfdestruct","électrique",40,"infligez 10 a tout les pokemons de banc et magnéti meurt");
        stunSpore=new Attaque("Stun Spore","plante",20,"lancez une pièce si c'est face le pokemon adverse est paralisé");
        hornHazard=new Attaque("Horn Hazard","plante",30,"lancez une pièce si c'est pile cette attaque ne fais rien");
        rockThrow=new Attaque("Rock Throw","combat",10,"");
        whirlwindRoo=new Attaque("Whirlwind","normal",0,"échangez le pkemon actif de votre adversaire avec une de ses pokemons de banc");
        harden=new Attaque("Harden","combat",0,"onix recois 30 dégats de moins sur chaques attaques au prochains tour");
        gnaw=new Attaque("Gnaw","électrique",10,"");
        thunderJolt=new Attaque("Thunder Jolt","électrique",30,"lancez une pièce si c'est pile recevez 10 dégats");
        waterGunpti=new Attaque("Water Gun","eau",10,"infligez 10 dégats supplémentaires pour chaques enerdies eau en plus du coup de l'attaque");
        smashKick=new Attaque("Smash Kick","feu",20,"");
        flameTail=new Attaque("Flame Tail","feu",30,"");
        sandAtt=new Attaque("Sand-attaque","combat",10,"au prochain tour de votre adversaire si il essaye d'attaquer il lance une pièce si c'est pile l'attaque ne fais rien");
        bubble=new Attaque("Bubble","eau",10,"lancez une pièce si c'est face le pokemon adverse est paralizé");
        starFreeze=new Attaque("Star Freeze","eau",20,"détrusez une energie eau de se pokemon la prochain attage de l'adversaire ne fais rien");
        slap=new Attaque("Slap","eau",20,"");
        bind=new Attaque("Bind","plante",20,"lancez une pièce si c'est face le pokemon adverse est paralizé");
        tackleElec=new Attaque("Tackle","électrique",10,"");
        poisonSting=new Attaque("Poison Sting","plante",10,"lancez une pièce si c'est face le pokemon adverse est paralisé");
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
        alakazam.ajouterAttque(confuseRay);
        tortank.ajouterAttque(hydroPump);
        levenard.ajouterAttque(scrunch,doubleEdge);
        dracofeu.ajouterAttque(fireBlast);
        melofee.ajouterAttque(sing,metronome);
        leviator.ajouterAttque(dragonRage,bubbleBeam);
        tygon.ajouterAttque(jab,specialPunch);
        macogneur.ajouterAttque(seismicToss);
        magneton.ajouterAttque(tunderWave,selfdestruct);
        mewtwo.ajouterAttque(psychic,barrier);
        nidoking.ajouterAttque(thrash,toxic);
        feunard.ajouterAttque(lure,fireBlast);
        tartard.ajouterAttque(waterGun,whirlpool);
        raichu.ajouterAttque(agility,thunder);
        florizard.ajouterAttque(solarbeam);
        elector.ajouterAttque(thunder,thunderbolt);
        dardargnan.ajouterAttque(twineedle,poisonString);
        draco.ajouterAttque(slam,hyperBeam);
        triopiqueur.ajouterAttque(slash,earthquake);
        electek.ajouterAttque(thunderpunch,thundershock);
        electrode.ajouterAttque(electricShock);
        roucoups.ajouterAttque(whirlwind,mirrorMove);
        arcanin.ajouterAttque(flamethrower,takeDwn);
        reptincelle.ajouterAttque(slashRep,flamethrower);
        lamentine.ajouterAttque(auroraBeam,iceBeam);
        minidraco.ajouterAttque(pound);
        canarticho.ajouterAttque(leekSlap,potSmash);
        caninos.ajouterAttque(flare);
        spectrum.ajouterAttque(hypnosis,dreamEater);
        herbizard.ajouterAttque(vineWhip,poisonpowder);
        lipoutou.ajouterAttque(doubleslap,meditate);
        kadabra.ajouterAttque(recover,superPsy);
        coconfort.ajouterAttque(stiffen,poisonpowderCocon);
        machopeur.ajouterAttque(karateChop,submission);
        magikarp.ajouterAttque(tackle,flail);
        magmar.ajouterAttque(firePunch,flamethrower);
        nidorino.ajouterAttque(doubleKick,hornDrill);
        tetarte.ajouterAttque(amnesia,doubleslap);
        porygon.ajouterAttque(conversion1,conversion2);
        ratatac.ajouterAttque(biteRata,superFang);
        otaria.ajouterAttque(headbutt);
        carabaffe.ajouterAttque(withdraw,biteCara);
        abra.ajouterAttque(psyshock);
        bulbizard.ajouterAttque(leechSeed);
        chenipan.ajouterAttque(stringShot);
        salameche.ajouterAttque(scratch,ember);
        topiqueur.ajouterAttque(dig,mudSlap);
        doduo.ajouterAttque(furryAttack);
        soporifik.ajouterAttque(pound,confuseRaySopo);
        fantominus.ajouterAttque(sleepingGaz,destinyBond);
        smogo.ajouterAttque(foulGas);
        machoc.ajouterAttque(lowKick);
        magneti.ajouterAttque(thunderWave,selfdestructMagne);
        coconfort.ajouterAttque(stiffen,stunSpore);
        nidoran.ajouterAttque(hornHazard);
        onix.ajouterAttque(rockThrow,harden);
        roucool.ajouterAttque(whirlwindRoo);
        pikachu.ajouterAttque(gnaw,thunderJolt);
        ptitard.ajouterAttque(waterGun);
        ponyta.ajouterAttque(smashKick,flameTail);
        ratata.ajouterAttque(biteRata);
        sabelette.ajouterAttque(sandAtt);
        carapuce.ajouterAttque(bubble,withdraw);
        staros.ajouterAttque(recoverSta,starFreeze);
        stari.ajouterAttque(slap);
        sacdeneu.ajouterAttque(bind,poisonpowder);
        voltorbe.ajouterAttque(tackleElec);
        goupix.ajouterAttque(confuseRayGoup);
        aspicot.ajouterAttque(poisonSting);
        confuseRay.ajouterEnergies(psy,psy,psy);
        hydroPump.ajouterEnergies(eau,eau,eau);
        scrunch.ajouterEnergies(normal,normal);
        doubleEdge.ajouterEnergies(normal,normal,normal,normal);
        fireSpin.ajouterEnergies(feu,feu,feu,feu);
        sing.ajouterEnergies(normal);
        metronome.ajouterEnergies(normal,normal,normal);
        dragonRage.ajouterEnergies(eau,eau,eau);
        bubbleBeam.ajouterEnergies(eau,eau,eau,eau);
        jab.ajouterEnergies(combat);
        specialPunch.ajouterEnergies(combat,combat,normal);
        seismicToss.ajouterEnergies(combat,combat,combat,normal);
        tunderWave.ajouterEnergies(elec,elec,normal);
        selfdestruct.ajouterEnergies(elec,elec,normal,normal);
        psychic.ajouterEnergies(psy,normal);
        barrier.ajouterEnergies(psy,psy);
        thrash.ajouterEnergies(plante,normal,normal);
        toxic.ajouterEnergies(plante,plante,plante);
        lure.ajouterEnergies(normal,normal);
        fireBlast.ajouterEnergies(feu,feu,feu,feu);
        waterGun.ajouterEnergies(eau,eau,normal);
        whirlpool.ajouterEnergies(eau,eau,normal,normal);
        agility.ajouterEnergies(elec,normal,normal);
        thunder.ajouterEnergies(elec,elec,elec,normal);
        solarbeam.ajouterEnergies(plante,plante,plante,plante);
        thunderbolt.ajouterEnergies(elec,elec,elec,elec);
        twineedle.ajouterEnergies(normal,normal,normal);
        poisonString.ajouterEnergies(plante,plante,plante);
        slam.ajouterEnergies(normal,normal,normal);
        hyperBeam.ajouterEnergies(normal,normal,normal,normal);
        slash.ajouterEnergies(combat,combat,normal);
        earthquake.ajouterEnergies(combat,combat,combat,combat);
        thundershock.ajouterEnergies(elec);
        thunderpunch.ajouterEnergies(elec,normal);
        electricShock.ajouterEnergies(elec,elec,elec,elec);
        whirlwind.ajouterEnergies(normal,normal);
        mirrorMove.ajouterEnergies(normal,normal,normal);
        flamethrower.ajouterEnergies(feu,feu,normal);
        takeDwn.ajouterEnergies(feu,feu,normal,normal);
        slash.ajouterEnergies(normal,normal,normal);
        auroraBeam.ajouterEnergies(eau,eau,normal);
        iceBeam.ajouterEnergies(eau,eau,normal,normal);
        pound.ajouterEnergies(normal);
        leekSlap.ajouterEnergies(normal);
        potSmash.ajouterEnergies(normal,normal,normal);
        flare.ajouterEnergies(feu,normal);
        hypnosis.ajouterEnergies(psy);
        dreamEater.ajouterEnergies(psy,psy);
        vineWhip.ajouterEnergies(plante,normal,normal);
        poisonpowder.ajouterEnergies(plante,plante,plante);
        doubleslap.ajouterEnergies(psy);
        meditate.ajouterEnergies(psy,psy,normal);
        recover.ajouterEnergies(psy,psy);
        superPsy.ajouterEnergies(psy,psy,normal);
        stiffen.ajouterEnergies(normal,normal);
        poisonpowderCocon.ajouterEnergies(plante,plante);
        karateChop.ajouterEnergies(combat,combat,normal);
        submission.ajouterEnergies(combat,combat,normal,normal);
        tackle.ajouterEnergies(normal);
        flail.ajouterEnergies(eau);
        firePunch.ajouterEnergies(feu,feu);
        doubleKick.ajouterEnergies(plante,normal,normal);
        hornDrill.ajouterEnergies(plante,plante,normal,normal);
        amnesia.ajouterEnergies(eau,eau);
        doubleslapTet.ajouterEnergies(eau,eau,normal);
        conversion1.ajouterEnergies(normal);
        conversion2.ajouterEnergies(normal,normal);
        biteRata.ajouterEnergies(normal);
        superFang.ajouterEnergies(normal,normal,normal);
        headbutt.ajouterEnergies(eau);
        withdraw.ajouterEnergies(eau,normal);
        biteCara.ajouterEnergies(eau,normal,normal);
        psyshock.ajouterEnergies(psy);
        leechSeed.ajouterEnergies(plante,plante);
        stringShot.ajouterEnergies(plante);
        scratch.ajouterEnergies(normal);
        ember.ajouterEnergies(feu,normal);
        dig.ajouterEnergies(combat);
        mudSlap.ajouterEnergies(combat,combat);
        furryAttack.ajouterEnergies(normal);
        confuseRaySopo.ajouterEnergies(psy,psy);
        sleepingGaz.ajouterEnergies(psy);
        destinyBond.ajouterEnergies(psy,normal);
        foulGas.ajouterEnergies(plante,plante);
        lowKick.ajouterEnergies(combat);
        thunderWave.ajouterEnergies(elec);
        selfdestructMagne.ajouterEnergies(elec,normal);
        stunSpore.ajouterEnergies(plante,plante);
        hornHazard.ajouterEnergies(plante);
        rockThrow.ajouterEnergies(combat);
        harden.ajouterEnergies(combat,combat);
        whirlwind.ajouterEnergies(normal,normal);
        gnaw.ajouterEnergies(normal);
        thunderJolt.ajouterEnergies(elec,normal);
        waterGunpti.ajouterEnergies(eau);
        smashKick.ajouterEnergies(normal,normal);
        flameTail.ajouterEnergies(feu,feu);
        sandAtt.ajouterEnergies(combat);
        bubble.ajouterEnergies(eau);
        recoverSta.ajouterEnergies(eau,eau);
        starFreeze.ajouterEnergies(eau,normal,normal);
        slap.ajouterEnergies(eau);
        bind.ajouterEnergies(plante,normal);
        tackleElec.ajouterEnergies(normal);
        confuseRayGoup.ajouterEnergies(feu,feu);
        poisonSting.ajouterEnergies(plante);
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
                c.incrementNbObtenu();
                changeImageViewImg(carteObtenue, c.getURLimage());
                nombreCliques = nombreCliques + 1;
            } else if (nombreCliques <= 4) {
                Cartes c = listDresseurs.get(Cartes.getRandomNumber(listDresseurs));
                listCartesObtenu.add(c);
                c.incrementNbObtenu();
                changeImageViewImg(carteObtenue, c.getURLimage());
                nombreCliques = nombreCliques + 1;
            } else if (nombreCliques <= 10) {
                Cartes c = listPoke.get(Cartes.getRandomNumber(listPoke));
                listCartesObtenu.add(c);
                c.incrementNbObtenu();
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
        if (c.getType().equals("pokemon") ) {
            changeImageViewImg(imgCard, c.getURLimage());
            lblNom.setText("nom : " + c.getNom());
            lblPv.setText("PV : " + c.getPv());
            lblType.setText("Type : " + c.getPokeType());
            lblEffet.setText("Effet : " + c.getEffet());
            lblSousEvo.setText("Sous-évolution : " + c.getFormeAnterieure());
            lblCpRetaite.setText("coup de retraite : " + c.getCpRetraite());
            lblAttaque.setText("attaque 1 : "+ c.getAttaques().getFirst().toString());
            imgEnergie1.setVisible(true);
            imgEnergie2.setVisible(true);
            imgEnergie3.setVisible(true);
            imgEnergie4.setVisible(true);
            imgEnergie5.setVisible(true);
            imgEnergie6.setVisible(true);
            imgEnergie7.setVisible(true);
            imgEnergie8.setVisible(true);
            btnInfo1.setVisible(true);
            btnInfo2.setVisible(false);
            ArrayList<energie> energies1 = c.getAttaques().getFirst().getEnergies();
            changeImageViewImg(imgEnergie1,energies1.getFirst().getURL());
            if (energies1.size() > 1){
                changeImageViewImg(imgEnergie2, energies1.get(1).getURL());
            }
            else {
                imgEnergie2.setVisible(false);
            }
            if (energies1.size() > 2){
                changeImageViewImg(imgEnergie3, energies1.get(2).getURL());
            }
            else{
                imgEnergie3.setVisible(false);
            }
            if (energies1.size() > 3){
                changeImageViewImg(imgEnergie4, energies1.get(3).getURL());
            }
            else{
                imgEnergie4.setVisible(false);
            }

            if(c.getAttaques().size()>1){
                lblAttaque2.setText("attaque 2 : "+ c.getAttaques().get(1).toString());
                btnInfo2.setVisible(true);
                if (c.getAttaques().size() > 1) {
                    ArrayList<energie> energies2 = c.getAttaques().get(1).getEnergies();
                    lblAttaque2.setText("attaque 2 : " + c.getAttaques().get(1).toString());
                    changeImageViewImg(imgEnergie5, energies2.get(0).getURL());
                    if (energies2.size() > 1) {
                        changeImageViewImg(imgEnergie6, energies2.get(1).getURL());
                    }
                    else {
                        imgEnergie6.setVisible(false);
                    }
                    if (energies2.size() > 2){
                        changeImageViewImg(imgEnergie7, energies2.get(2).getURL());
                    }
                    else{
                        imgEnergie7.setVisible(false);
                    }
                    if (energies2.size() > 3) {
                        changeImageViewImg(imgEnergie8, energies2.get(3).getURL());
                    }
                    else {
                        imgEnergie8.setVisible(false);
                    }
                }
            }
            else {
                lblAttaque2.setText("");
                imgEnergie5.setVisible(false);
                imgEnergie6.setVisible(false);
                imgEnergie7.setVisible(false);
                imgEnergie8.setVisible(false);
            }
        }
        else {
            changeImageViewImg(imgCard, c.getURLimage());
            lblNom.setText("nom : " + c.getNom());
            lblPv.setText("");
            lblType.setText("");
            lblEffet.setText("Effet : " + c.getEffet());
            lblSousEvo.setText("");
            lblCpRetaite.setText("");
            lblAttaque.setText("");
            lblAttaque2.setText("");
            imgEnergie1.setVisible(false);
            imgEnergie2.setVisible(false);
            imgEnergie3.setVisible(false);
            imgEnergie4.setVisible(false);
            imgEnergie5.setVisible(false);
            imgEnergie6.setVisible(false);
            imgEnergie7.setVisible(false);
            imgEnergie8.setVisible(false);
            btnInfo1.setVisible(false);
            btnInfo2.setVisible(false);

        }
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
    public void resetDeck(){
        changeImageViewImg(imgCarte1,missingNo.getURLimage());
        changeImageViewImg(imgCarte2,missingNo.getURLimage());
        changeImageViewImg(imgCarte3,missingNo.getURLimage());
        changeImageViewImg(imgCarte4,missingNo.getURLimage());
        changeImageViewImg(imgCarte5,missingNo.getURLimage());
        changeImageViewImg(imgCarte6,missingNo.getURLimage());
        changeImageViewImg(imgCarte7,missingNo.getURLimage());
        changeImageViewImg(imgCarte8,missingNo.getURLimage());
        changeImageViewImg(imgCarte9,missingNo.getURLimage());
        changeImageViewImg(imgCarte10,missingNo.getURLimage());
        changeImageViewImg(imgCarte11,missingNo.getURLimage());
        changeImageViewImg(imgCarte12,missingNo.getURLimage());
        changeImageViewImg(imgCarte13,missingNo.getURLimage());
        changeImageViewImg(imgCarte14,missingNo.getURLimage());
        changeImageViewImg(imgCarte15,missingNo.getURLimage());
        changeImageViewImg(imgCarte16,missingNo.getURLimage());
        changeImageViewImg(imgCarte17,missingNo.getURLimage());
        changeImageViewImg(imgCarte18,missingNo.getURLimage());
        changeImageViewImg(imgCarte19,missingNo.getURLimage());
        changeImageViewImg(imgCarte20,missingNo.getURLimage());
    }
    public void clickDeck(MouseEvent mouseEvent) {
        clearAll();
        visible(apDeck);
        affDeck();
    }

    public void clickBooster(MouseEvent mouseEvent) {
        clearAll();
        lblArgent.setText(String.valueOf(argent));
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
        if (indice<listCartesObtenu.size()-1){
            indice=indice+1;
            affCarte(listCartesObtenu.get(indice));
        }
    }

    public void clickAddDeck(MouseEvent mouseEvent) {
        if (deck.size()<20) {
            if (listCartesObtenu.get(indice).getNbDansDeck()<listCartesObtenu.get(indice).getNbObtenu()){
                deck.add(listCartesObtenu.get(indice));
                listCartesObtenu.get(indice).incrementNbDansDeck();
            }
        }
    }

    public void clickVendre(MouseEvent mouseEvent) {
        Cartes c= listCartesObtenu.get(indice);
        deck.remove(c);
        resetDeck();
        listCartesObtenu.remove(indice);
        argent=argent+50;
        affCarte(listCartesObtenu.get(indice));
    }

    public void clickInfo1(MouseEvent mouseEvent) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(listCartesObtenu.get(indice).getAttaques().getFirst().getNom());
        alert.setContentText(listCartesObtenu.get(indice).getAttaques().getFirst().getEffet());
        alert.showAndWait();
    }

    public void clickInfo2(MouseEvent mouseEvent) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(listCartesObtenu.get(indice).getAttaques().get(1).getNom());
        alert.setContentText(listCartesObtenu.get(indice).getAttaques().get(1).getEffet());
        alert.showAndWait();
    }

    public void clickretirer1(MouseEvent mouseEvent) {
        if(!deck.isEmpty()) {
            deck.getFirst().decrementNbDansDeck();
            deck.removeFirst();
            resetDeck();
            affDeck();
        }
    }
    public void clickretirer2(MouseEvent mouseEvent) {
        if(deck.size()>1) {
            deck.get(1).decrementNbDansDeck();
            deck.remove(1);
            resetDeck();
            affDeck();
        }
    }
    public void clickretirer3(MouseEvent mouseEvent) {
        if(deck.size()>2) {
            deck.get(2).decrementNbDansDeck();
            deck.remove(2);
            resetDeck();
            affDeck();
        }
    }
    public void clickretirer4(MouseEvent mouseEvent) {
        if(deck.size()>3) {
            deck.get(3).decrementNbDansDeck();
            deck.remove(3);
            resetDeck();
            affDeck();
        }
    }
    public void clickretirer5(MouseEvent mouseEvent) {
        if(deck.size()>4) {
            deck.get(4).decrementNbDansDeck();
            deck.remove(4);
            resetDeck();
            affDeck();
        }
    }
    public void clickretirer6(MouseEvent mouseEvent) {
        if(deck.size()>5) {
            deck.get(5).decrementNbDansDeck();
            deck.remove(5);
            resetDeck();
            affDeck();
        }
    }
    public void clickretirer7(MouseEvent mouseEvent) {
        if(deck.size()>6) {
            deck.get(6).decrementNbDansDeck();
            deck.remove(6);
            resetDeck();
            affDeck();
        }
    }
    public void clickretirer8(MouseEvent mouseEvent) {
        if(deck.size()>7) {
            deck.get(7).decrementNbDansDeck();
            deck.remove(7);
            resetDeck();
            affDeck();
        }
    }
    public void clickretirer9(MouseEvent mouseEvent) {
        if(deck.size()>8) {
            deck.get(8).decrementNbDansDeck();
            deck.remove(8);
            resetDeck();
            affDeck();
        }
    }
    public void clickretirer10(MouseEvent mouseEvent) {
        if(deck.size()>9) {
            deck.get(9).decrementNbDansDeck();
            deck.remove(9);
            resetDeck();
            affDeck();
        }
    }
    public void clickretirer11(MouseEvent mouseEvent) {
        if(deck.size()>10) {
            deck.get(10).decrementNbDansDeck();
            deck.remove(10);
            resetDeck();
            affDeck();
        }
    }
    public void clickretirer12(MouseEvent mouseEvent) {
        if(deck.size()>11) {
            deck.get(11).decrementNbDansDeck();
            deck.remove(11);
            resetDeck();
            affDeck();
        }
    }
    public void clickretirer13(MouseEvent mouseEvent) {
        if(deck.size()>12) {
            deck.get(12).decrementNbDansDeck();
            deck.remove(12);
            resetDeck();
            affDeck();
        }
    }
    public void clickretirer14(MouseEvent mouseEvent) {
        if(deck.size()>13) {
            deck.get(13).decrementNbDansDeck();
            deck.remove(13);
            resetDeck();
            affDeck();
        }
    }
    public void clickretirer15(MouseEvent mouseEvent) {
        if(deck.size()>14) {
            deck.get(14).decrementNbDansDeck();
            deck.remove(14);
            resetDeck();
            affDeck();
        }
    }
    public void clickretirer16(MouseEvent mouseEvent) {
        if(deck.size()>15) {
            deck.get(15).decrementNbDansDeck();
            deck.remove(15);
            resetDeck();
            affDeck();
        }
    }
    public void clickretirer17(MouseEvent mouseEvent) {
        if(deck.size()>16) {
            deck.get(16).decrementNbDansDeck();
            deck.remove(16);
            resetDeck();
            affDeck();
        }
    }
    public void clickretirer18(MouseEvent mouseEvent) {
        if(deck.size()>17) {
            deck.get(17).decrementNbDansDeck();
            deck.remove(17);
            resetDeck();
            affDeck();
        }
    }
    public void clickretirer19(MouseEvent mouseEvent) {
        if(deck.size()>18) {
            deck.get(18).decrementNbDansDeck();
            deck.remove(18);
            resetDeck();
            affDeck();
        }
    }
    public void clickretirer20(MouseEvent mouseEvent) {
        if(deck.size()>19) {
            deck.get(19).decrementNbDansDeck();
            deck.remove(19);
            resetDeck();
            affDeck();
        }
    }
}

