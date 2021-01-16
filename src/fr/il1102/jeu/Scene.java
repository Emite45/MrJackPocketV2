package fr.il1102.jeu;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.util.Arrays;

import java.util.Collections;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import fr.il1102.objet.Alibi;
import fr.il1102.objet.Detective;
import fr.il1102.objet.Tuile;


@SuppressWarnings("serial")
public class Scene extends JPanel {

	// Variables 
	
    private ImageIcon icoFondLondres; // ecran d'accueil
	private Image imgFondLondres;

	private ImageIcon icoFond; // ecran noir en fond
	@SuppressWarnings("unused")
	private Image imgFond;

	// On déclare toute nos positions de tuiles
	public Tuile T1;
	public Tuile T1_90;
	public Tuile T1_180;
	public Tuile T1_r90;

	public Tuile T2;
	public Tuile T2_90;
	public Tuile T2_180;
	public Tuile T2_r90;

	public Tuile T3;
	public Tuile T3_90;
	public Tuile T3_180;
	public Tuile T3_r90;

	public Tuile T4;
	public Tuile T4_90;
	public Tuile T4_180;
	public Tuile T4_r90;

	public Tuile T5;
	public Tuile T5_90;
	public Tuile T5_180;
	public Tuile T5_r90;

	public Tuile T6;
	public Tuile T6_90;
	public Tuile T6_180;
	public Tuile T6_r90;

	public Tuile T7;
	public Tuile T7_90;
	public Tuile T7_180;
	public Tuile T7_r90;

	public Tuile T8;
	public Tuile T8_90;
	public Tuile T8_180;
	public Tuile T8_r90;

	public Tuile T9;
	public Tuile T9_90;
	public Tuile T9_180;
	public Tuile T9_r90;

	public Tuile[][] tabTuile = { { T1, T1_90, T1_180, T1_r90 }, { T2, T2_90, T2_180, T2_r90 },
			{ T3, T3_90, T3_180, T3_r90 }, { T4, T4_90, T4_180, T4_r90 }, { T5, T5_90, T5_180, T5_r90 },
			{ T6, T6_90, T6_180, T6_r90 }, { T7, T7_90, T7_180, T7_r90 }, { T8, T8_90, T8_180, T8_r90 },
			{ T9, T9_90, T9_180, T9_r90 } };
	

	
	public int tChange1; //Indice de la première tuile que l'on veut changer
	public int tChange2;
	public int tChange;
	public boolean JTchange; //Temporaire
	public boolean changeSelect;
	public int tRotat;
	public boolean JTrot;
	
	
	public Tuile[][] tabShuffleTuile;
	
	//Il existe en 12 positions possible pour les détectives ce qui fait 12 combinaisons en tout avec 5 différentes en x et 5 en y
	private int xDetec1;
	private int xDetec2;
	private int xDetec3;
	private int xDetec4;
	private int xDetec5;
	private int yDetec1;
	private int yDetec2;
	private int yDetec3;
	private int yDetec4;
	private int yDetec5;
	
	// On declare nos détectives
	public Detective Sherlock;
	private int xSherlock, ySherlock; 	//Position de Sherlock sur la table de jeu
	public Detective Watson;
	private int xWatson, yWatson;		//Position de Watson sur la table de jeu
	public Detective Tobi;
	private int xTobi, yTobi;			//Position de Tobi sur la table de jeu

	private ImageIcon icoJT1;
	private Image imgJT1;

	private ImageIcon icoJT2;
	private Image imgJT2;

	private ImageIcon icoJT3;
	private Image imgJT3;

	private ImageIcon icoJT4;
	private Image imgJT4;

	private ImageIcon icoJT5;
	private Image imgJT5;

	private ImageIcon icoJT6;
	private Image imgJT6;

	private ImageIcon icoJT7;
	private Image imgJT7;

	private ImageIcon icoJT8;
	private Image imgJT8;

	// on declare nos différents Alibis
	public Alibi InspLestrade;
	public Alibi JeremyBert;
	public Alibi JohnPizer;
	public Alibi JohnSmith;
	public Alibi JosephLane;
	public Alibi Madame;
	public Alibi MissStealthy;
	public Alibi SgtGoodley;
	public Alibi WilliamGull;
	
	// On declare un tableau pour pouvoir mélanger nos alibis
	public Alibi[] tabShuffleAlibi;
	public Alibi alibiCarte; // Carte Alibi Face Caché

	// Tableau qui mélange les Alibis
	public Alibi[] tabAlibi = { InspLestrade, JeremyBert, JohnPizer, JohnSmith, JosephLane, Madame, MissStealthy,
			SgtGoodley, WilliamGull };
	
	public boolean idJack; //Indique si Jack est prêt à découvrir son alibi

	public boolean ecranAlibi;  // deuxième écran de découverte de l'alibi de Jack
	
	public boolean ecranAccueil;

	public int nAlibi; // Compteur de carte Alibi en enlevant la carte de Jack
	public int nAlibiFC; // Compteur de carte Alibi face caché

	// Constructeurs
	
	public Scene() {

		super();

		icoFond = new ImageIcon(getClass().getResource("/images/background.png"));
		this.imgFond = this.icoFond.getImage();
		
		icoFondLondres = new ImageIcon(getClass().getResource("/images/fondJackWelcome.png"));
		this.imgFondLondres = this.icoFondLondres.getImage();

		icoJT1 = new ImageIcon(getClass().getResource("/images/Jeton_Temps1_face_Tour_de_jeu.png"));
		this.imgJT1 = this.icoJT1.getImage();
		icoJT2 = new ImageIcon(getClass().getResource("/images/Jeton_Temps2_face_Tour_de_jeu.png"));
		this.imgJT2 = this.icoJT2.getImage();
		icoJT3 = new ImageIcon(getClass().getResource("/images/Jeton_Temps3_face_Tour_de_jeu.png"));
		this.imgJT3 = this.icoJT3.getImage();
		icoJT4 = new ImageIcon(getClass().getResource("/images/Jeton_Temps4_face_Tour_de_jeu.png"));
		this.imgJT4 = this.icoJT4.getImage();
		icoJT5 = new ImageIcon(getClass().getResource("/images/Jeton_Temps5_face_Tour_de_jeu.png"));
		this.imgJT5 = this.icoJT5.getImage();
		icoJT6 = new ImageIcon(getClass().getResource("/images/Jeton_Temps6_face_Tour_de_jeu.png"));
		this.imgJT6 = this.icoJT6.getImage();
		icoJT7 = new ImageIcon(getClass().getResource("/images/Jeton_Temps7_face_Tour_de_jeu.png"));
		this.imgJT7 = this.icoJT7.getImage();
		icoJT8 = new ImageIcon(getClass().getResource("/images/Jeton_Temps8_face_Tour_de_jeu.png"));
		this.imgJT8 = this.icoJT8.getImage();

		// On instancie toute nos tuiles
		this.T1 = new Tuile("/images/tuile_de_rue_face_suspect1.png");
		this.T1_90 = new Tuile("/images/tuile_de_rue_face_suspect1_90.png");
		this.T1_180 = new Tuile("/images/tuile_de_rue_face_suspect1_180.png");
		this.T1_r90 = new Tuile("/images/tuile_de_rue_face_suspect1_-90.png");

		this.T2 = new Tuile("/images/tuile_de_rue_face_suspect2.png");
		this.T2_90 = new Tuile("/images/tuile_de_rue_face_suspect2_90.png");
		this.T2_180 = new Tuile("/images/tuile_de_rue_face_suspect2_180.png");
		this.T2_r90 = new Tuile("/images/tuile_de_rue_face_suspect2_-90.png");

		this.T3 = new Tuile("/images/tuile_de_rue_face_suspect3.png");
		this.T3_90 = new Tuile("/images/tuile_de_rue_face_suspect3_90.png");
		this.T3_180 = new Tuile("/images/tuile_de_rue_face_suspect3_180.png");
		this.T3_r90 = new Tuile("/images/tuile_de_rue_face_suspect3_-90.png");

		this.T4 = new Tuile("/images/tuile_de_rue_face_suspect4.png");
		this.T4_90 = new Tuile("/images/tuile_de_rue_face_suspect4_90.png");
		this.T4_180 = new Tuile("/images/tuile_de_rue_face_suspect4_180.png");
		this.T4_r90 = new Tuile("/images/tuile_de_rue_face_suspect4_-90.png");

		this.T5 = new Tuile("/images/tuile_de_rue_face_suspect5.png");
		this.T5_90 = new Tuile("/images/tuile_de_rue_face_suspect5_90.png");
		this.T5_180 = new Tuile("/images/tuile_de_rue_face_suspect5_180.png");
		this.T5_r90 = new Tuile("/images/tuile_de_rue_face_suspect5_-90.png");

		this.T6 = new Tuile("/images/tuile_de_rue_face_suspect6.png");
		this.T6_90 = new Tuile("/images/tuile_de_rue_face_suspect6_90.png");
		this.T6_180 = new Tuile("/images/tuile_de_rue_face_suspect6_180.png");
		this.T6_r90 = new Tuile("/images/tuile_de_rue_face_suspect6_m90.png");

		this.T7 = new Tuile("/images/tuile_de_rue_face_suspect7.png");
		this.T7_90 = new Tuile("/images/tuile_de_rue_face_suspect7_90.png");
		this.T7_180 = new Tuile("/images/tuile_de_rue_face_suspect7_180.png");
		this.T7_r90 = new Tuile("/images/tuile_de_rue_face_suspect7_-90.png");

		this.T8 = new Tuile("/images/tuile_de_rue_face_suspect8.png");
		this.T8_90 = new Tuile("/images/tuile_de_rue_face_suspect8_90.png");
		this.T8_180 = new Tuile("/images/tuile_de_rue_face_suspect8_180.png");
		this.T8_r90 = new Tuile("/images/tuile_de_rue_face_suspect8_-90.png");

		this.T9 = new Tuile("/images/tuile_de_rue_face_suspect9.png");
		this.T9_90 = new Tuile("/images/tuile_de_rue_face_suspect9_90.png");
		this.T9_180 = new Tuile("/images/tuile_de_rue_face_suspect9_180.png");
		this.T9_r90 = new Tuile("/images/tuile_de_rue_face_suspect9_m90.png");
		

		
		// Tableau de tuile que l'on mélange
		this.tabShuffleTuile = Tuile.tuileMelange(T1, T1_90, T1_180, T1_r90, T2, T2_90, T2_180, T2_r90, T3, T3_90, T3_180,
				T3_r90, T4, T4_90, T4_180, T4_r90, T5, T5_90, T5_180, T5_r90, T6, T6_90, T6_180, T6_r90, T7, T7_90,
				T7_180, T7_r90, T8, T8_90, T8_180, T8_r90, T9, T9_90, T9_180, T9_r90);
		
		this.tChange = 0;
		this.tChange1 = 0;
		this.tChange2 = 0;
		this.changeSelect = false;
		this.JTchange = false;
		
		this.tRotat = 0;
		this.JTrot = false;


		// On instancie tout nos Alibis
		this.InspLestrade = new Alibi("/images/InspLestrade-alibi.png");
		this.JeremyBert = new Alibi("/images/JeremyBert-alibi.png");
		this.JohnPizer = new Alibi("/images/JohnPizer-alibi.png");
		this.JohnSmith = new Alibi("/images/JohnSmith-alibi.png");
		this.JosephLane = new Alibi("/images/JosephLane-alibi.png");
		this.Madame = new Alibi("/images/Madame-alibi.png");
		this.MissStealthy = new Alibi("/images/MissStealthy-alibi.png");
		this.SgtGoodley = new Alibi("/images/SgtGoodley-alibi.png");
		this.WilliamGull = new Alibi("/images/WilliamGull-alibi.png");

		this.alibiCarte = new Alibi("/images/alibi-card.png"); //Carte Alibi Face caché
		
		this.idJack = false;

		//tableau des cartes Alibis que l'on mélange
		this.tabShuffleAlibi = Alibi.shuffleAlibi(InspLestrade, JeremyBert, JohnPizer, JohnSmith, JosephLane, Madame,
				MissStealthy, SgtGoodley, WilliamGull);

		//On instancie nos 3 detectives
		this.Sherlock = new Detective("/images/Sherlock.png");
		this.Watson = new Detective ("/images/Watson.png");
		this.Tobi = new Detective ("/images/Tobi.png");

		//On instancie nos positions possibles pour les détectives
		// Il faut imaginer en tableau en 5x5 avec seulement les positions des bords du tableaux comme position possibles
		xDetec1 = 300 - 80 - 10; 	// position [1,y]
		xDetec2 = 300 + 55;			// position [2,y]
		xDetec3 = 300 + 190 + 55;	// position [3,y]
		xDetec4 = 300 + 2* 190 + 55;// position [4,y]
		xDetec5 = 300 + 3* 190 + 10;// position [5,y]
		yDetec1 = 100 - 80 - 10;	// position [x,1]
		yDetec2 = 100 + 55;			// position [x,2]
		yDetec3 = 100 + 190 + 55;	// position [x,3]
		yDetec4 = 100 + 2* 190 + 55;// position [x,4]
		yDetec5 = 100 + 3* 190 + 10;// position [x,5]
		
		// On affecte des positions de bases à nos detectives
		xSherlock = xDetec1;
		ySherlock = yDetec2;
		xWatson = xDetec5;
		yWatson = yDetec2;
		xTobi = xDetec3;
		yTobi = yDetec5;
		

		this.setFocusable(true);  // Permet d'utiliser la classe clavier
		this.requestFocusInWindow();
		this.addKeyListener(new Clavier());
		
		this.ecranAccueil = true ;
		this.ecranAlibi = false ;

		this.nAlibi = 1;
		this.nAlibiFC = 9;
	}

	// Getters

	

	public Alibi[] getTabShuffleAlibi() {
		return tabShuffleAlibi;
	}

	public int gettRotat() {
		return tRotat;
	}


	public boolean isEcranAccueil() {
		return ecranAccueil;
	}
	
	public boolean isEcranAlibi() {
		return ecranAlibi;
	}

	public boolean isChangeSelect() {
		return changeSelect;
	}
	
	// Setters

	public void settRotat(int tRotat) {
		this.tRotat = tRotat;
	}
	public void setSelect(boolean selec) {
		this.changeSelect = selec;
	}
	public void settChange1(int tChange1) {
		this.tChange1 = tChange1;
	}
	public void settChange(int tChange) {
		this.tChange = tChange;
	}
	public void settChange2(int tChange2) {
		this.tChange2 = tChange2;
	}
	public void setEcranAccueil(boolean ecranAccueil) {
		this.ecranAccueil = ecranAccueil;
	}
	public void setEcranAlibi(boolean ecranAlibi) {
		this.ecranAlibi = ecranAlibi;
	}


	// Methodes
	
	public void posSherlock() { //Gère le deplacement de Sherlock
	if(xSherlock == xDetec1) {														//Analyse la position des détectives
			if (ySherlock == yDetec2) {xSherlock =xDetec2; ySherlock =yDetec1;}		//Modifie la position du detective à la position suivante
			else if (ySherlock == yDetec3) { ySherlock =yDetec2;}
			else { ySherlock= yDetec3;}
		}
		else if(ySherlock == yDetec1) {
			if (xSherlock == xDetec2) {xSherlock =xDetec3;}
			else if (xSherlock == xDetec3) { xSherlock =xDetec4;}
			else { xSherlock= xDetec5; ySherlock= yDetec2;}
		}
		else if(xSherlock == xDetec5) {
			if (ySherlock == yDetec2) {ySherlock= yDetec3;}
			else if (ySherlock == yDetec3) { ySherlock =yDetec4;}
			else { xSherlock =xDetec4; ySherlock =yDetec5;}
		}
		else if(ySherlock == yDetec5) {
			if (xSherlock == xDetec4) {xSherlock =xDetec3;}
			else if (xSherlock == xDetec3) { xSherlock =xDetec2;}
			else { xSherlock= xDetec1; ySherlock= yDetec4;}
		}
	}
	
	public void posWatson() { //Gère le deplacement de Watson
		if(xWatson == xDetec1) {
			if (yWatson == yDetec2) {xWatson =xDetec2; yWatson =yDetec1;}
			else if (yWatson == yDetec3) { yWatson =yDetec2;}
			else { yWatson= yDetec3;}
		}
		else if(yWatson == yDetec1) {
			if (xWatson == xDetec2) {xWatson =xDetec3;}
			else if (xWatson == xDetec3) { xWatson =xDetec4;}
			else { xWatson= xDetec5; yWatson= yDetec2;}
		}
		else if(xWatson == xDetec5) {
			if (yWatson == yDetec2) {yWatson= yDetec3;}
			else if (yWatson == yDetec3) { yWatson =yDetec4;}
			else { xWatson =xDetec4; yWatson =yDetec5;}
		}
		else if(yWatson == yDetec5) {
			if (xWatson == xDetec4) {xWatson =xDetec3;}
			else if (xWatson == xDetec3) { xWatson =xDetec2;}
			else { xWatson= xDetec1; yWatson= yDetec4;}
		}
	}
	
	public void posTobi() { //Gère le deplacement de Tobi
		if(xTobi == xDetec1) {
			if (yTobi == yDetec2) {xTobi =xDetec2; yTobi =yDetec1;}
			else if (yTobi == yDetec3) { yTobi =yDetec2;}
			else { yTobi= yDetec3;}
		}
		else if(yTobi == yDetec1) {
			if (xTobi == xDetec2) {xTobi =xDetec3;}
			else if (xTobi == xDetec3) { xTobi =xDetec4;}
			else { xTobi= xDetec5; yTobi= yDetec2;}
		}
		else if(xTobi == xDetec5) {
			if (yTobi == yDetec2) {yTobi= yDetec3;}
			else if (yTobi == yDetec3) { yTobi =yDetec4;}
			else { xTobi =xDetec4; yTobi =yDetec5;}
		}
		else if(yTobi == yDetec5) {
			if (xTobi == xDetec4) {xTobi =xDetec3;}
			else if (xTobi == xDetec3) { xTobi =xDetec2;}
			else { xTobi= xDetec1; yTobi= yDetec4;}
		}
	}
	
	public void echangerTuile(int tChange1, int tChange2) {  // Echange deux grandes listes du tableaux
		List<Tuile []> listTuile = Arrays.asList(tabShuffleTuile);
		Collections.swap(listTuile, tChange1, tChange2);
	}
	
	public void rotateTuile(int tRotat) {					// Change l'ordre des petites cases dans le bon sens pour une rotation à 90°
		List<Tuile> listTuile = Arrays.asList(tabShuffleTuile[tRotat]);
		if (listTuile.contains(T1) ==true) {
			if (tabShuffleTuile[tRotat][0] == T1) {tabShuffleTuile[tRotat][0] = T1_r90; tabShuffleTuile[tRotat][1] = T1_180; tabShuffleTuile[tRotat][2] = T1_r90; tabShuffleTuile[tRotat][3] = T1;} 
			else if (tabShuffleTuile[tRotat][0] == T1_90) {tabShuffleTuile[tRotat][0] = T1; tabShuffleTuile[tRotat][1] = T1_r90; tabShuffleTuile[tRotat][2] = T1_180; tabShuffleTuile[tRotat][3] = T1_90;} 
			else if (tabShuffleTuile[tRotat][0] == T1_180) {tabShuffleTuile[tRotat][0] = T1_90; tabShuffleTuile[tRotat][1] = T1; tabShuffleTuile[tRotat][2] = T1_r90; tabShuffleTuile[tRotat][3] = T1_180;} 
			else if (tabShuffleTuile[tRotat][0] == T1_r90) {tabShuffleTuile[tRotat][0] = T1_180; tabShuffleTuile[tRotat][1] = T1_90; tabShuffleTuile[tRotat][2] = T1; tabShuffleTuile[tRotat][3] = T1_r90;} 
		}
		else if (listTuile.contains(T2) ==true) {
			if (tabShuffleTuile[tRotat][0] == T2) {tabShuffleTuile[tRotat][0] = T2_r90; tabShuffleTuile[tRotat][1] = T2_180; tabShuffleTuile[tRotat][2] = T2_r90; tabShuffleTuile[tRotat][3] = T2;} 
			else if (tabShuffleTuile[tRotat][0] == T2_90) {tabShuffleTuile[tRotat][0] = T2; tabShuffleTuile[tRotat][1] = T2_r90; tabShuffleTuile[tRotat][2] = T2_180; tabShuffleTuile[tRotat][3] = T2_90;} 
			else if (tabShuffleTuile[tRotat][0] == T2_180) {tabShuffleTuile[tRotat][0] = T2_90; tabShuffleTuile[tRotat][1] = T2; tabShuffleTuile[tRotat][2] = T2_r90; tabShuffleTuile[tRotat][3] = T2_180;} 
			else if (tabShuffleTuile[tRotat][0] == T2_r90) {tabShuffleTuile[tRotat][0] = T2_180; tabShuffleTuile[tRotat][1] = T2_90; tabShuffleTuile[tRotat][2] = T2; tabShuffleTuile[tRotat][3] = T2_r90;} 
		}
		else if (listTuile.contains(T3) ==true) {
			if (tabShuffleTuile[tRotat][0] == T3) {tabShuffleTuile[tRotat][0] = T3_r90; tabShuffleTuile[tRotat][1] = T3_180; tabShuffleTuile[tRotat][2] = T3_r90; tabShuffleTuile[tRotat][3] = T3;} 
			else if (tabShuffleTuile[tRotat][0] == T3_90) {tabShuffleTuile[tRotat][0] = T3; tabShuffleTuile[tRotat][1] = T3_r90; tabShuffleTuile[tRotat][2] = T3_180; tabShuffleTuile[tRotat][3] = T3_90;} 
			else if (tabShuffleTuile[tRotat][0] == T3_180) {tabShuffleTuile[tRotat][0] = T3_90; tabShuffleTuile[tRotat][1] = T3; tabShuffleTuile[tRotat][2] = T3_r90; tabShuffleTuile[tRotat][3] = T3_180;} 
			else if (tabShuffleTuile[tRotat][0] == T3_r90) {tabShuffleTuile[tRotat][0] = T3_180; tabShuffleTuile[tRotat][1] = T3_90; tabShuffleTuile[tRotat][2] = T3; tabShuffleTuile[tRotat][3] = T3_r90;} 
		}
		else if (listTuile.contains(T4) ==true) {
			if (tabShuffleTuile[tRotat][0] == T4) {tabShuffleTuile[tRotat][0] = T4_r90; tabShuffleTuile[tRotat][1] = T4_180; tabShuffleTuile[tRotat][2] = T4_r90; tabShuffleTuile[tRotat][3] = T4;} 
			else if (tabShuffleTuile[tRotat][0] == T4_90) {tabShuffleTuile[tRotat][0] = T4; tabShuffleTuile[tRotat][1] = T4_r90; tabShuffleTuile[tRotat][2] = T4_180; tabShuffleTuile[tRotat][3] = T4_90;} 
			else if (tabShuffleTuile[tRotat][0] == T4_180) {tabShuffleTuile[tRotat][0] = T4_90; tabShuffleTuile[tRotat][1] = T4; tabShuffleTuile[tRotat][2] = T4_r90; tabShuffleTuile[tRotat][3] = T4_180;} 
			else if (tabShuffleTuile[tRotat][0] == T4_r90) {tabShuffleTuile[tRotat][0] = T4_180; tabShuffleTuile[tRotat][1] = T4_90; tabShuffleTuile[tRotat][2] = T4; tabShuffleTuile[tRotat][3] = T4_r90;} 
		}
		else if (listTuile.contains(T5) ==true) {
			if (tabShuffleTuile[tRotat][0] == T5) {tabShuffleTuile[tRotat][0] = T5_r90; tabShuffleTuile[tRotat][1] = T5_180; tabShuffleTuile[tRotat][2] = T5_r90; tabShuffleTuile[tRotat][3] = T5;} 
			else if (tabShuffleTuile[tRotat][0] == T5_90) {tabShuffleTuile[tRotat][0] = T5; tabShuffleTuile[tRotat][1] = T5_r90; tabShuffleTuile[tRotat][2] = T5_180; tabShuffleTuile[tRotat][3] = T5_90;} 
			else if (tabShuffleTuile[tRotat][0] == T5_180) {tabShuffleTuile[tRotat][0] = T5_90; tabShuffleTuile[tRotat][1] = T5; tabShuffleTuile[tRotat][2] = T5_r90; tabShuffleTuile[tRotat][3] = T5_180;} 
			else if (tabShuffleTuile[tRotat][0] == T5_r90) {tabShuffleTuile[tRotat][0] = T5_180; tabShuffleTuile[tRotat][1] = T5_90; tabShuffleTuile[tRotat][2] = T5; tabShuffleTuile[tRotat][3] = T5_r90;} 
		}
		else if (listTuile.contains(T6) ==true) {
			if (tabShuffleTuile[tRotat][0] == T6) {tabShuffleTuile[tRotat][0] = T6_r90; tabShuffleTuile[tRotat][1] = T6_180; tabShuffleTuile[tRotat][2] = T6_r90; tabShuffleTuile[tRotat][3] = T6;} 
			else if (tabShuffleTuile[tRotat][0] == T6_90) {tabShuffleTuile[tRotat][0] = T6; tabShuffleTuile[tRotat][1] = T6_r90; tabShuffleTuile[tRotat][2] = T6_180; tabShuffleTuile[tRotat][3] = T6_90;} 
			else if (tabShuffleTuile[tRotat][0] == T6_180) {tabShuffleTuile[tRotat][0] = T6_90; tabShuffleTuile[tRotat][1] = T6; tabShuffleTuile[tRotat][2] = T6_r90; tabShuffleTuile[tRotat][3] = T6_180;} 
			else if (tabShuffleTuile[tRotat][0] == T6_r90) {tabShuffleTuile[tRotat][0] = T6_180; tabShuffleTuile[tRotat][1] = T6_90; tabShuffleTuile[tRotat][2] = T6; tabShuffleTuile[tRotat][3] = T6_r90;} 
		}
		else if (listTuile.contains(T7) ==true) {
			if (tabShuffleTuile[tRotat][0] == T7) {tabShuffleTuile[tRotat][0] = T7_r90; tabShuffleTuile[tRotat][1] = T7_180; tabShuffleTuile[tRotat][2] = T7_r90; tabShuffleTuile[tRotat][3] = T7;} 
			else if (tabShuffleTuile[tRotat][0] == T7_90) {tabShuffleTuile[tRotat][0] = T7; tabShuffleTuile[tRotat][1] = T7_r90; tabShuffleTuile[tRotat][2] = T7_180; tabShuffleTuile[tRotat][3] = T7_90;} 
			else if (tabShuffleTuile[tRotat][0] == T7_180) {tabShuffleTuile[tRotat][0] = T7_90; tabShuffleTuile[tRotat][1] = T7; tabShuffleTuile[tRotat][2] = T7_r90; tabShuffleTuile[tRotat][3] = T7_180;} 
			else if (tabShuffleTuile[tRotat][0] == T7_r90) {tabShuffleTuile[tRotat][0] = T7_180; tabShuffleTuile[tRotat][1] = T7_90; tabShuffleTuile[tRotat][2] = T7; tabShuffleTuile[tRotat][3] = T7_r90;} 
		}
		else if (listTuile.contains(T8) ==true) {
			if (tabShuffleTuile[tRotat][0] == T8) {tabShuffleTuile[tRotat][0] = T8_r90; tabShuffleTuile[tRotat][1] = T8_180; tabShuffleTuile[tRotat][2] = T8_r90; tabShuffleTuile[tRotat][3] = T8;} 
			else if (tabShuffleTuile[tRotat][0] == T8_90) {tabShuffleTuile[tRotat][0] = T8; tabShuffleTuile[tRotat][1] = T8_r90; tabShuffleTuile[tRotat][2] = T8_180; tabShuffleTuile[tRotat][3] = T8_90;} 
			else if (tabShuffleTuile[tRotat][0] == T8_180) {tabShuffleTuile[tRotat][0] = T8_90; tabShuffleTuile[tRotat][1] = T8; tabShuffleTuile[tRotat][2] = T8_r90; tabShuffleTuile[tRotat][3] = T8_180;} 
			else if (tabShuffleTuile[tRotat][0] == T8_r90) {tabShuffleTuile[tRotat][0] = T8_180; tabShuffleTuile[tRotat][1] = T8_90; tabShuffleTuile[tRotat][2] = T8; tabShuffleTuile[tRotat][3] = T8_r90;} 
		}	
		else if (listTuile.contains(T9) ==true) {
			if (tabShuffleTuile[tRotat][0] == T9) {tabShuffleTuile[tRotat][0] = T9_r90; tabShuffleTuile[tRotat][1] = T9_180; tabShuffleTuile[tRotat][2] = T9_r90; tabShuffleTuile[tRotat][3] = T9;} 
			else if (tabShuffleTuile[tRotat][0] == T9_90) {tabShuffleTuile[tRotat][0] = T9; tabShuffleTuile[tRotat][1] = T9_r90; tabShuffleTuile[tRotat][2] = T9_180; tabShuffleTuile[tRotat][3] = T9_90;} 
			else if (tabShuffleTuile[tRotat][0] == T9_180) {tabShuffleTuile[tRotat][0] = T9_90; tabShuffleTuile[tRotat][1] = T9; tabShuffleTuile[tRotat][2] = T9_r90; tabShuffleTuile[tRotat][3] = T9_180;} 
			else if (tabShuffleTuile[tRotat][0] == T9_r90) {tabShuffleTuile[tRotat][0] = T9_180; tabShuffleTuile[tRotat][1] = T9_90; tabShuffleTuile[tRotat][2] = T9; tabShuffleTuile[tRotat][3] = T9_r90;} 
		}

	}
	

	public void paintComponent(Graphics g) {

		super.paintComponent(g);
		Graphics g2 = (Graphics2D) g; // Ameliore les graphismes en 2D
		
		
		if (ecranAccueil == true && ecranAlibi == false) { //Ecran d'accueil 
			
			g2.drawImage( this.imgFondLondres, 0, 0, null);

			Font police = new Font("Simsun", Font.BOLD, 50);
			Font police2 = new Font("Simsun", Font.BOLD, 30);
			Font police3 = new Font("Simsun", Font.BOLD, 20);
			g2.setColor(Color.white);
			g2.setFont(police);
			g2.drawString("Bienvenue sur le Jeu Mr Jack Pocket : ", 350, 150);
			g2.setFont(police2);
			g2.drawString("Pour commencer à vous faufiler dans les ruelles de Londres : ", 300, 650);	
			g2.drawString("Appuyez sur ENTRER", 600, 680);

			g2.setFont(police3);
			g2.drawString("Elias Dève    Aymeric Lefebvre    Léonie Petit", 100, 800);
			
		} else if (ecranAlibi == true && ecranAccueil == false ){  //Ecran du Menu pour Mr Jack
			
			if(idJack == false) {
				//g2.drawImage(this.imgFond, 0, 0, null);
				g2.drawImage( this.imgFondLondres, 0, 0, null);
				Font police = new Font("Simsun", Font.BOLD, 20);
				g2.setColor(Color.white);
				g2.setFont(police);
				g2.drawString("Pour découvrir l'identité de MrJack appuyez sur ENTRER" , 300, 250);
				g2.drawString("(Ps Mr Jack: Faites attention que l'inspecteur ne puisse pas voir votre identité) " , 300, 270);
			}
			else if(idJack == true) {  //Affichage de l'identité de Mr.Jack
				g2.drawImage( this.imgFondLondres, 0, 0, null);
				Font police2 = new Font("Simsun", Font.BOLD, 50);
				g2.setColor(Color.white);
				g2.setFont(police2);
				g2.drawString("Bonsoir..., Mr Jack : ", 450, 250);
				g2.drawImage(tabShuffleAlibi[0].getImgAlibi(), 700, 300, null); // ID de Mr Jack
				g2.drawString("(Appuyez sur ESPACE pour commencer à jouer)", 250, 700);}

			
			
		} else if (ecranAlibi == false && ecranAccueil == false ) { //ecran du plateau de jeu
			
			//g2.drawImage(this.imgFond, 0, 0, null); // Affichage du fond noir
			g2.drawImage( this.imgFondLondres, 0, 0, null); // Affichage du fond


			g2.drawImage(tabShuffleTuile[0][0].getImgTuile(), 300, 100, null); // Affichage de la tuile en Position 7
			g2.drawImage(tabShuffleTuile[1][0].getImgTuile(), 490, 100, null); // Affichage de la tuile en Position 8
			g2.drawImage(tabShuffleTuile[2][0].getImgTuile(), 680, 100, null); // Affichage de la tuile en Position 9
			g2.drawImage(tabShuffleTuile[3][0].getImgTuile(), 300, 290, null); // Affichage de la tuile en Position 4
			g2.drawImage(tabShuffleTuile[4][0].getImgTuile(), 490, 290, null); // Affichage de la tuile en Position 5
			g2.drawImage(tabShuffleTuile[5][0].getImgTuile(), 680, 290, null); // Affichage de la tuile en Position 6
			g2.drawImage(tabShuffleTuile[6][0].getImgTuile(), 300, 480, null); // Affichage de la tuile en Position 1
			g2.drawImage(tabShuffleTuile[7][0].getImgTuile(), 490, 480, null); // Affichage de la tuile en Position 2
			g2.drawImage(tabShuffleTuile[8][0].getImgTuile(), 680, 480, null); // Affichage de la tuile en Position 3

			g2.drawImage(this.Sherlock.getImgDetec(), this.xSherlock, this.ySherlock, null);
			g2.drawImage(this.Tobi.getImgDetec(), this.xTobi, this.yTobi, null);
			g2.drawImage(this.Watson.getImgDetec(), this.xWatson , this.yWatson, null);

			// Jeton temps

			g2.drawImage(this.imgJT1, 100, 300, null);
			g2.drawImage(this.imgJT2, 100, 360, null);
			g2.drawImage(this.imgJT3, 100, 420, null);
			g2.drawImage(this.imgJT4, 100, 480, null);
			g2.drawImage(this.imgJT5, 100, 540, null);
			g2.drawImage(this.imgJT6, 100, 600, null);
			g2.drawImage(this.imgJT7, 100, 660, null);
			g2.drawImage(this.imgJT8, 100, 720, null);

		
			// Alibi
			
			for (int i = 0; i < nAlibiFC; i++) {
				g2.drawImage(this.alibiCarte.getImgAlibi(), 1000 + 20 * i, 20 * i, null);
				if (nAlibiFC < 8) {
					g2.drawImage(tabShuffleAlibi[nAlibi].getImgAlibi(), 1140, 200, null);
				}
			}

		}
	}

}
