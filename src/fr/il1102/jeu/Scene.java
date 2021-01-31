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



import fr.il1102.audio.Audio;

import fr.il1102.objet.Alibi;
import fr.il1102.objet.Detective;
import fr.il1102.objet.JetonAction;
import fr.il1102.objet.JetonTemps;
import fr.il1102.objet.Tuile;


@SuppressWarnings("serial")
public class Scene extends JPanel {

	// Variables 
	
    private ImageIcon icoFondLondres; // ecran d'accueil
	private Image imgFondLondres;

	private ImageIcon icoFond; // ecran noir en fond
	@SuppressWarnings("unused")
	private Image imgFond;
	
	private ImageIcon icoFondDetec;
	private Image imgFondDetec;
	
	private ImageIcon icoFondJack;
	private Image imgFondJack;

	
															// Tuile \\ 
	// Initialisation des tuiles
	public Tuile T1 = new Tuile("/images/tuile_de_rue_face_suspect1.png", "madame_0");
	public Tuile T1_90 = new Tuile("/images/tuile_de_rue_face_suspect1_90.png", "madame_90");
	public Tuile T1_180 = new Tuile("/images/tuile_de_rue_face_suspect1_180.png","madame_180");
	public Tuile T1_r90 = new Tuile("/images/tuile_de_rue_face_suspect1_-90.png","madame_-90");

	public Tuile T2 = new Tuile("/images/tuile_de_rue_face_suspect2.png", "sgtgoodley_0");
	public Tuile T2_90 = new Tuile("/images/tuile_de_rue_face_suspect2_90.png", "sgtgoodley_90");
	public Tuile T2_180 = new Tuile("/images/tuile_de_rue_face_suspect2_180.png", "sgtgoodley_180");
	public Tuile T2_r90 = new Tuile("/images/tuile_de_rue_face_suspect2_-90.png", "sgtgoodley_-90");
	
	public Tuile T3 = new Tuile("/images/tuile_de_rue_face_suspect3.png", "jeremybert_0");
	public Tuile T3_90  = new Tuile("/images/tuile_de_rue_face_suspect3_90.png", "jeremybert_90");
	public Tuile T3_180 = new Tuile("/images/tuile_de_rue_face_suspect3_180.png", "jeremybert_180");
	public Tuile T3_r90 = new Tuile("/images/tuile_de_rue_face_suspect3_-90.png", "jeremybert_-90");
	
	public Tuile T4 = new Tuile("/images/tuile_de_rue_face_suspect4.png", "williamgull_0");
	public Tuile T4_90 = new Tuile("/images/tuile_de_rue_face_suspect4_90.png", "williamgull_90");
	public Tuile T4_180 = new Tuile("/images/tuile_de_rue_face_suspect4_180.png", "williamgull_180");
	public Tuile T4_r90 = new Tuile("/images/tuile_de_rue_face_suspect4_-90.png", "williamgull_-90");
	
	public Tuile T5 = new Tuile("/images/tuile_de_rue_face_suspect5.png", "missstealthy_0");
	public Tuile T5_90 = new Tuile("/images/tuile_de_rue_face_suspect5_90.png", "missstealthy_90");
	public Tuile T5_180 = new Tuile("/images/tuile_de_rue_face_suspect5_180.png", "missstealthy_180");
	public Tuile T5_r90 = new Tuile("/images/tuile_de_rue_face_suspect5_-90.png", "missstealthy_-90");

	public Tuile T6 = new Tuile("/images/tuile_de_rue_face_suspect6.png", "johnsmith_0");
	public Tuile T6_90  = new Tuile("/images/tuile_de_rue_face_suspect6_90.png", "johnsmith_90");
	public Tuile T6_180  = new Tuile("/images/tuile_de_rue_face_suspect6_180.png", "johnsmith_180");
	public Tuile T6_r90  = new Tuile("/images/tuile_de_rue_face_suspect6_m90.png", "johnsmith_-90");

	public Tuile T7  = new Tuile("/images/tuile_de_rue_face_suspect7.png", "lestrade_0");
	public Tuile T7_90 = new Tuile("/images/tuile_de_rue_face_suspect7_90.png", "lestrade_90");
	public Tuile T7_180 = new Tuile("/images/tuile_de_rue_face_suspect7_180.png", "lestrade_180");
	public Tuile T7_r90 = new Tuile("/images/tuile_de_rue_face_suspect7_-90.png", "lestrade_-90");

	public Tuile T8 = new Tuile("/images/tuile_de_rue_face_suspect8.png", "johnpizer_0");
	public Tuile T8_90 = new Tuile("/images/tuile_de_rue_face_suspect8_90.png","johnpizer_90");
	public Tuile T8_180 = new Tuile("/images/tuile_de_rue_face_suspect8_180.png", "johnpizer_180");
	public Tuile T8_r90 = new Tuile("/images/tuile_de_rue_face_suspect8_-90.png", "johnpizer");

	public Tuile T9 = new Tuile("/images/tuile_de_rue_face_suspect9.png", "josephlane_0");
	public Tuile T9_90 = new Tuile("/images/tuile_de_rue_face_suspect9_90.png", "josephlane_90");
	public Tuile T9_180 = new Tuile("/images/tuile_de_rue_face_suspect9_180.png", "josephlane_180");
	public Tuile T9_r90 = new Tuile("/images/tuile_de_rue_face_suspect9_m90.png", "josephlane_-90");
	
	/*
	public Tuile Td = new Tuile("/images/common-verso.png", "retournee_0");
	public Tuile Td_90  = new Tuile("/images/common-verso_90.png", "retournee_90");
	public Tuile Td_180 = new Tuile("/images/common-verso_180.png", "retournee_180");
	public Tuile Td_r90 = new Tuile("/images/common-verso_-90.png", "retournee_-90");
	public Tuile Td_x = new Tuile("/images/JosephLane-verso.png", "retournee");
	*/
	
	public int tChange1; //Indice de la première tuile que l'on veut changer
	public int tChange2;
	public int tChange;
	public boolean JTchange; //Temporaire
	public boolean changeSelect;
	public int tRotat;
	public boolean JTrot;
	
	public int nbrRetourne;
	
	public int tTurn;
	
	
	public Tuile[][] tabShuffleTuile;
	
														// Detective \\

	// On declare nos détectives
	public Detective Sherlock;
	public Detective Watson;
	public Detective Tobi;

													// Jeton Actions \\
	
	
	public JetonAction jA1_1;
	public JetonAction jA1_2;
	public JetonAction jA2_1;
	public JetonAction jA2_2;
	public JetonAction jA3_1;
	public JetonAction jA3_2;
	public JetonAction jA4_1;
	public JetonAction jA4_2;
	
	public JetonAction[][] tabShuffleJA ;
	
	public boolean JA1;
	public boolean JA2;
	public boolean JA3;
	public boolean JA4;
	public boolean nJA1;
	public boolean nJA2;
	public boolean nJA3;
	public boolean nJA4;
	
	public int nbr_depla;
	
														// Jeton Temps \\
	public JetonTemps jT1;
	public JetonTemps jT2;
	public JetonTemps jT3;
	public JetonTemps jT4;
	public JetonTemps jT5;
	public JetonTemps jT6;
	public JetonTemps jT7;
	public JetonTemps jT8;
	

	public JetonTemps[] tabJT ;

															// Alibi \\
	
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
	
	public int nAlibi; // Compteur de carte Alibi en enlevant la carte de Jack
	public int nAlibiFC; // Compteur de carte Alibi face caché
	
	public int sablierJack;
	
	public boolean idJack; //Indique si Jack est prêt à découvrir son alibi
	
	public boolean jackVisible;
	
	

	public boolean ecranAlibi;  // deuxième écran de découverte de l'alibi de Jack
	
	public boolean ecranAccueil;
	
	public int tour;
	public char joueur;
	public int action;
	
	public boolean isAppel;  // Determine si l'appel à temoins à été effectué
	
	public String strCommande;
	public String strCommande2;
	public String strJack;
	public boolean strSablier;
	
	public boolean finJack;
	public boolean finDetec;
	
	//Audio
	
	public Audio musiqueFond = new Audio ("/audios/sonFond.wav");
	public Audio musiqueMenu = new Audio ("/audios/menuSound.wav");
	
	boolean son1;
	

	

	// Constructeurs
	
	public Scene() {

		super();

		icoFond = new ImageIcon(getClass().getResource("/images/background.png"));
		this.imgFond = this.icoFond.getImage();
		
		icoFondLondres = new ImageIcon(getClass().getResource("/images/fondJackWelcome.png"));
		this.imgFondLondres = this.icoFondLondres.getImage();
		
		icoFondDetec = new ImageIcon(getClass().getResource("/images/fond_detec.png"));
		this.imgFondDetec = this.icoFondDetec.getImage();
		
		icoFondJack = new ImageIcon(getClass().getResource("/images/fondJack.png"));
		this.imgFondJack = this.icoFondJack.getImage();
		
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
		this.tTurn= 0;
		
		this.nbrRetourne = 0; //indique le nombre de tuile retournée

															// Alibi \\
		// On instancie tout nos Alibis
		this.InspLestrade = new Alibi("/images/InspLestrade-alibi.png", "lestrade");
		this.JeremyBert = new Alibi("/images/JeremyBert-alibi.png", "jeremybert");
		this.JohnPizer = new Alibi("/images/JohnPizer-alibi.png", "johnpizer");
		this.JohnSmith = new Alibi("/images/JohnSmith-alibi.png", "johnsmith");
		this.JosephLane = new Alibi("/images/JosephLane-alibi.png", "josephlane");
		this.Madame = new Alibi("/images/Madame-alibi.png", "madame");
		this.MissStealthy = new Alibi("/images/MissStealthy-alibi.png", "missstealthy");
		this.SgtGoodley = new Alibi("/images/SgtGoodley-alibi.png", "sgtgoodley");
		this.WilliamGull = new Alibi("/images/WilliamGull-alibi.png", "williamgull");

		this.alibiCarte = new Alibi("/images/alibi-card.png", "retourne"); //Carte Alibi Face caché
		
		this.idJack = false;
		
		this.jackVisible = false;
		
		this.nAlibi = 0;
		this.nAlibiFC = 8;
		
		this.sablierJack = 0;

		//tableau des cartes Alibis que l'on mélange
		this.tabShuffleAlibi = Alibi.shuffleAlibi(InspLestrade, JeremyBert, JohnPizer, JohnSmith, JosephLane, Madame,
				MissStealthy, SgtGoodley, WilliamGull);

														// Detective \\
		//On instancie nos 3 detectives
		this.Sherlock = new Detective("/images/Sherlock.png", 210, 255, "Sherlock");
		this.Watson = new Detective ("/images/Watson.png", 880, 255, "Watson");
		this.Tobi = new Detective ("/images/Tobi.png", 545, 780, "Tobi");
		

												//Jeton Action \\

		this.jA1_1 = new JetonAction ("/images/Jeton1-Face1.png");
		this.jA1_2 = new JetonAction ("/images/Jeton1-Face2.png");
		this.jA2_1 = new JetonAction ("/images/Jeton2-Face1.png");
		this.jA2_2 = new JetonAction ("/images/Jeton2-Face2.png");
		this.jA3_1 = new JetonAction ("/images/Jeton3-Face1.png");
		this.jA3_2 = new JetonAction ("/images/Jeton3-Face2.png");
		this.jA4_1 = new JetonAction ("/images/Jeton4-Face1.png");
		this.jA4_2 = new JetonAction ("/images/Jeton4-Face2.png");
		
		this.tabShuffleJA = JetonAction.jetonShuffle(jA1_1, jA1_2,jA2_1, jA2_2, jA3_1, jA3_2, jA4_1, jA4_2 );
		
		this.JA1 = false;
		this.JA2 = false;
		this.JA3 = false;
		this.JA4 = false;
		this.nJA1 = true;
		this.nJA2 = true;
		this.nJA3 = true;
		this.nJA4 = true;
		
		this.nbr_depla = 0;
		
		this.tour = 1;
		this.joueur = 'D';
		this.action = 1;
		
		this.isAppel = false;
		
		
		
												// Jeton Temps \\
		
		
		this.jT1 = new JetonTemps ("/images/Jeton_Temps1_face_Tour_de_jeu.png");
		this.jT2 = new JetonTemps ("/images/Jeton_Temps2_face_Tour_de_jeu.png");
		this.jT3 = new JetonTemps ("/images/Jeton_Temps3_face_Tour_de_jeu.png");
		this.jT4 = new JetonTemps ("/images/Jeton_Temps4_face_Tour_de_jeu.png");
		this.jT5 = new JetonTemps ("/images/Jeton_Temps5_face_Tour_de_jeu.png");
		this.jT6 = new JetonTemps ("/images/Jeton_Temps6_face_Tour_de_jeu.png");
		this.jT7 = new JetonTemps ("/images/Jeton_Temps7_face_Tour_de_jeu.png");
		this.jT8 = new JetonTemps ("/images/Jeton_Temps8_face_Tour_de_jeu.png");
		
		this.tabJT = JetonTemps.tabTemps(jT1, jT2, jT3, jT4, jT5, jT6, jT7, jT8);
		
	


		this.setFocusable(true);  // Permet d'utiliser la classe clavier
		this.requestFocusInWindow();
		this.addKeyListener(new Clavier());
		
		this.ecranAccueil = true ;
		this.ecranAlibi = false ;
		
		
		

		// ECRITURE
		
		this.strCommande = " ";
		
		this.strSablier = false;
		
		
		//Fin du Jeu
		
		this.finJack = false;
		this.finDetec = false;
		



		
	}

	// Getters

	public Alibi[] getTabShuffleAlibi() { return tabShuffleAlibi;	}

	public int gettRotat() { return tRotat;	}

	public boolean isEcranAccueil() { return ecranAccueil;	}
	
	public boolean isEcranAlibi() { return ecranAlibi;	}

	public boolean isChangeSelect() { return changeSelect;	}
	
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
	
	public void echangerTuile(int tChange1, int tChange2) {  // Echange deux grandes listes du tableaux
		List<Tuile []> listTuile = Arrays.asList(tabShuffleTuile);
		Collections.swap(listTuile, tChange1, tChange2);
		Audio.playSound("/audios/run.wav");
		
	}
	
	public void rotateTuile(int tRotat) {					// Change l'ordre des petites cases dans le bon sens pour une rotation à 90°
		List<Tuile> listTuile = Arrays.asList(tabShuffleTuile[tRotat]);
		//Si la tuile est retournee
		if (tabShuffleTuile[tRotat][0].getName() == "retournee_0") {
			tabShuffleTuile[tRotat][0].icoTuile = new ImageIcon(getClass().getResource("/images/common-verso_-90.png"));
			tabShuffleTuile[tRotat][0].imgTuile = tabShuffleTuile[tRotat][0].icoTuile.getImage();
			tabShuffleTuile[tRotat][0].name = "retournee_-90";
			}
		else if (tabShuffleTuile[tRotat][0].getName() == "retournee_-90") {
			tabShuffleTuile[tRotat][0].icoTuile = new ImageIcon(getClass().getResource("/images/common-verso_180.png"));
			tabShuffleTuile[tRotat][0].imgTuile = tabShuffleTuile[tRotat][0].icoTuile.getImage();
			tabShuffleTuile[tRotat][0].name = "retournee_180";
		}
		else if (tabShuffleTuile[tRotat][0].getName() == "retournee_180") {
			tabShuffleTuile[tRotat][0].icoTuile = new ImageIcon(getClass().getResource("/images/common-verso_90.png"));
			tabShuffleTuile[tRotat][0].imgTuile = tabShuffleTuile[tRotat][0].icoTuile.getImage();
			tabShuffleTuile[tRotat][0].name = "retournee_90";
		}
		else if (tabShuffleTuile[tRotat][0].getName() == "retournee_90") {
			tabShuffleTuile[tRotat][0].icoTuile = new ImageIcon(getClass().getResource("/images/common-verso.png"));
			tabShuffleTuile[tRotat][0].imgTuile = tabShuffleTuile[tRotat][0].icoTuile.getImage();
			tabShuffleTuile[tRotat][0].name = "retournee_0";
		}
		//Si la tuile n'est pas retournee
		else if (listTuile.contains(T1) ==true) {
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
		Audio.playSound("/audios/rotationSound.wav");
	}
	
	public void alibiJack(int nAlibi) {				// Quand jack choisi le jeton Alibi

		if (tabShuffleAlibi[nAlibi] == InspLestrade) {}
		else if (tabShuffleAlibi[nAlibi] == JeremyBert) {this.sablierJack++;}
		else if (tabShuffleAlibi[nAlibi] == JohnPizer) {this.sablierJack++;}
		else if (tabShuffleAlibi[nAlibi] == JohnSmith) {this.sablierJack++;}
		else if (tabShuffleAlibi[nAlibi] == JosephLane) {this.sablierJack++;}
		else if (tabShuffleAlibi[nAlibi] == Madame) {this.sablierJack = sablierJack +2;}
		else if (tabShuffleAlibi[nAlibi] == MissStealthy) {this.sablierJack++;}
		else if (tabShuffleAlibi[nAlibi] == SgtGoodley) {}
		else if (tabShuffleAlibi[nAlibi] == WilliamGull) {this.sablierJack++;}
		Audio.playSound("/audios/cardSound.wav");
	}
	
	public void alibiInspecteur() {					// Quand detective choisi le jeton Alibi


		if (tabShuffleAlibi[nAlibi] == Madame) {
			for(int i= 0; i<9; i++) {
				if(tabShuffleTuile[i][0] == T1 || tabShuffleTuile[i][0] == T1_90 || tabShuffleTuile[i][0] == T1_180 || tabShuffleTuile[i][0] == T1_r90) {this.tabShuffleTuile[i][0].retourner();}}
			}
		else if (tabShuffleAlibi[nAlibi] == SgtGoodley) {
			for(int i= 0; i<9; i++) {
				if(tabShuffleTuile[i][0] == T2 || tabShuffleTuile[i][0] == T2_90 || tabShuffleTuile[i][0] == T2_180 || tabShuffleTuile[i][0] == T2_r90) {this.tabShuffleTuile[i][0].retourner();}}
			}
		else if (tabShuffleAlibi[nAlibi] == JeremyBert) {
			for(int i= 0; i<9; i++) {
				if(tabShuffleTuile[i][0] == T3 || tabShuffleTuile[i][0] == T3_90 || tabShuffleTuile[i][0] == T3_180 || tabShuffleTuile[i][0] == T3_r90) {this.tabShuffleTuile[i][0].retourner();}}
			}
		else if (tabShuffleAlibi[nAlibi] == WilliamGull) {
			for(int i= 0; i<9; i++) {
				if(tabShuffleTuile[i][0] == T4 || tabShuffleTuile[i][0] == T4_90 || tabShuffleTuile[i][0] == T4_180 || tabShuffleTuile[i][0] == T4_r90) {this.tabShuffleTuile[i][0].retourner();}}
			}
		else if (tabShuffleAlibi[nAlibi] == MissStealthy) {
			for(int i= 0; i<9; i++) {
				if(tabShuffleTuile[i][0] == T5 || tabShuffleTuile[i][0] == T5_90 || tabShuffleTuile[i][0] == T5_180 || tabShuffleTuile[i][0] == T5_r90) {this.tabShuffleTuile[i][0].retourner();}}
			}
		else if (tabShuffleAlibi[nAlibi] == JohnSmith) {
			for(int i= 0; i<9; i++) {
				if(tabShuffleTuile[i][0] == T6 || tabShuffleTuile[i][0] == T6_90 || tabShuffleTuile[i][0] == T6_180 || tabShuffleTuile[i][0] == T6_r90) {this.tabShuffleTuile[i][0].retourner();}}
			}
		else if (tabShuffleAlibi[nAlibi] == InspLestrade) {
			for(int i= 0; i<9; i++) {
				if(tabShuffleTuile[i][0] == T7 || tabShuffleTuile[i][0] == T7_90 || tabShuffleTuile[i][0] == T7_180 || tabShuffleTuile[i][0] == T7_r90) {this.tabShuffleTuile[i][0].retourner();}}
			}
		else if (tabShuffleAlibi[nAlibi] == JohnPizer) {
			for(int i= 0; i<9; i++) {
				if(tabShuffleTuile[i][0] == T8 || tabShuffleTuile[i][0] == T8_90 || tabShuffleTuile[i][0] == T8_180 || tabShuffleTuile[i][0] == T8_r90) {this.tabShuffleTuile[i][0].retourner();}}
			}
		else if (tabShuffleAlibi[nAlibi] == JosephLane) {
			for(int i= 0; i<9; i++) {
				if(tabShuffleTuile[i][0] == T9 || tabShuffleTuile[i][0] == T9_90 || tabShuffleTuile[i][0] == T9_180 || tabShuffleTuile[i][0] == T9_r90) {this.tabShuffleTuile[i][0].retourner();}}
			}
		Audio.playSound("/audios/cardSound.wav");
	} 
	
	public void appelATemoin() {
		
		// On reprend les cartes de tabShuffleTuile en leur donnant un nouveau nom, pour simplifier la comprehension par la suite
		Tuile tuile1 = tabShuffleTuile[0][0]; // tuile en position 2,2
		tuile1.setLigneGrille(2); 
		tuile1.setColonneGrille(2);
		tuile1.setVisible(false);
		Tuile tuile2 = tabShuffleTuile[1][0]; // tuile en position 2,3
		tuile2.setLigneGrille(2);
		tuile2.setColonneGrille(3);
		tuile2.setVisible(false);
		Tuile tuile3 = tabShuffleTuile[2][0]; // tuile en position 2,4
		tuile3.setLigneGrille(2);
		tuile3.setColonneGrille(4);
		tuile3.setVisible(false);
		Tuile tuile4 = tabShuffleTuile[3][0]; // tuile en position 3,2
		tuile4.setLigneGrille(3);
		tuile4.setColonneGrille(2);
		tuile4.setVisible(false);
		Tuile tuile5 = tabShuffleTuile[4][0]; // tuile en position 3,3
		tuile5.setLigneGrille(3);
		tuile5.setColonneGrille(3);
		tuile5.setVisible(false);
		Tuile tuile6 = tabShuffleTuile[5][0]; // tuile en position 3,4
		tuile6.setLigneGrille(3);
		tuile6.setColonneGrille(4);
		tuile6.setVisible(false);
		Tuile tuile7 = tabShuffleTuile[6][0]; // tuile en position 4,2
		tuile7.setLigneGrille(4);
		tuile7.setColonneGrille(2);
		tuile7.setVisible(false);
		Tuile tuile8 = tabShuffleTuile[7][0]; // tuile en position 4,3
		tuile8.setLigneGrille(4);
		tuile8.setColonneGrille(3);
		tuile8.setVisible(false);
		Tuile tuile9 = tabShuffleTuile[8][0]; // tuile en position 4,4
		tuile9.setLigneGrille(4);
		tuile9.setColonneGrille(4);
		tuile9.setVisible(false);
		
		Tuile[] grilleTuiles = {tuile1, tuile2, tuile3, tuile4, tuile5, tuile6, tuile7, tuile8, tuile9};
		
		// Tuile occupée par Jack, pour l'instant inconnue
		Tuile tuileJack = null;
		
		// On met a jour les variables de positions dans la grille des detectives
		Sherlock.updatePositionGrille();
		Watson.updatePositionGrille();
		Tobi.updatePositionGrille();
		Detective[] listeDetectives = {Sherlock, Tobi, Watson};
		Audio.playSound("/audios/appelSound.wav");
		
		// Boucle principale de l'appel a temoin, s'execute pour chaque detective
		for(int i = 0; i<listeDetectives.length; i++) {
			
			if (listeDetectives[i].getLigneGrille() == 1 && listeDetectives[i].getColonneGrille() == 2) { //Si détective en position 1,2
				// on parcourt la liste de tuile sur la 2e colonne, donc de 3 en 3 entre la tuile1 et la tuile 7
				for (int j = 0; j < 7; j+=3) {
					// si la tuile a une rotation à 90 ou -90 degres, ou s'il s'agit de celle de joseph lane retournee
					if(grilleTuiles[j].getName().contains("_90") || grilleTuiles[j].getName().contains("_-90") || grilleTuiles[j].getName().contains("_x")) { 
						grilleTuiles[j].setVisible(true);
					}
					//si sa rotation est nulle, alors elle sera visible mais les suivante ne le seront pas à cause du mur
					else if (grilleTuiles[j].getName().contains("_0")) { 
						grilleTuiles[j].setVisible(true);
						break;
					}
					else {
						break;
					}
				}
			}
			
			else if (listeDetectives[i].getLigneGrille() == 1 && listeDetectives[i].getColonneGrille() == 3) { //Si détective en position 1,3
				for (int j = 1; j < 8; j+=3) {
					if(grilleTuiles[j].getName().contains("_90") || grilleTuiles[j].getName().contains("_-90") || grilleTuiles[j].getName().contains("_x")) {
						grilleTuiles[j].setVisible(true);
					}
					else if (grilleTuiles[j].getName().contains("_0")) {
						grilleTuiles[j].setVisible(true);
						break;
					}
					else {
						break;
					}
				}
			}

			else if (listeDetectives[i].getLigneGrille() == 1 && listeDetectives[i].getColonneGrille() == 4) { //Si détective en position 1,4
				for (int j = 2; j < 9; j+=3) {
					if(grilleTuiles[j].getName().contains("_90") || grilleTuiles[j].getName().contains("_-90") || grilleTuiles[j].getName().contains("_x")) {
						grilleTuiles[j].setVisible(true);
					}
					else if (grilleTuiles[j].getName().contains("_0")) {
						grilleTuiles[j].setVisible(true);
						break;
					}
					else {
						break;
					}
				}
			}
			
			else if (listeDetectives[i].getLigneGrille() == 2 && listeDetectives[i].getColonneGrille() == 5) { //Si détective en position 2,5
				for (int j = 2; j >= 0; j--) {
					if(grilleTuiles[j].getName().contains("_0") || grilleTuiles[j].getName().contains("_180") || grilleTuiles[j].getName().contains("_x")) {
						grilleTuiles[j].setVisible(true);
					}
					else if (grilleTuiles[j].getName().contains("_-90")) {
						grilleTuiles[j].setVisible(true);
						break;
					}
					else {
						break;
					}
				}
			}

			else if (listeDetectives[i].getLigneGrille() == 3 && listeDetectives[i].getColonneGrille() == 5) { //Si détective en position 3,5
				for (int j = 5; j > 2; j--) {
					if(grilleTuiles[j].getName().contains("_0") || grilleTuiles[j].getName().contains("_180") || grilleTuiles[j].getName().contains("_x")) {
						grilleTuiles[j].setVisible(true);
					}
					else if (grilleTuiles[j].getName().contains("_-90")) {
						grilleTuiles[j].setVisible(true);
						break;
					}
					else {
						break;
					}
				}
			}
			
			else if (listeDetectives[i].getLigneGrille() == 4 && listeDetectives[i].getColonneGrille() == 5) { //Si détective en position 4,5
				for (int j = 8; j > 5; j--) {
					if(grilleTuiles[j].getName().contains("_0") || grilleTuiles[j].getName().contains("_180") || grilleTuiles[j].getName().contains("_x")) {
						grilleTuiles[j].setVisible(true);
					}
					else if (grilleTuiles[j].getName().contains("_-90")) {
						grilleTuiles[j].setVisible(true);
						break;
					}
					else {
						break;
					}
				}
			}
			
			else if (listeDetectives[i].getLigneGrille() == 5 && listeDetectives[i].getColonneGrille() == 4) { //Si détective en position 5,4
				for (int j = 8; j > 1; j-=3) {
					if(grilleTuiles[j].getName().contains("_90") || grilleTuiles[j].getName().contains("_-90") || grilleTuiles[j].getName().contains("_x")) {
						grilleTuiles[j].setVisible(true);
					}
					else if (grilleTuiles[j].getName().contains("_180")) {
						grilleTuiles[j].setVisible(true);
						break;
					}
					else {
						break;
					}
				}
			}

			else if (listeDetectives[i].getLigneGrille() == 5 && listeDetectives[i].getColonneGrille() == 3) { //Si détective en position 5,3
				for (int j = 7; j > 0; j-=3) {
					if(grilleTuiles[j].getName().contains("_90") || grilleTuiles[j].getName().contains("_-90") || grilleTuiles[j].getName().contains("_x")) {
						grilleTuiles[j].setVisible(true);
					}
					else if (grilleTuiles[j].getName().contains("_180")) {
						grilleTuiles[j].setVisible(true);
						break;
					}
					else {
						break;
					}
				}
			}
			
			else if (listeDetectives[i].getLigneGrille() == 5 && listeDetectives[i].getColonneGrille() == 2) { //Si détective en position 5,2
				for (int j = 6; j >=0 ; j-=3) {
					if(grilleTuiles[j].getName().contains("_90") || grilleTuiles[j].getName().contains("_-90") || grilleTuiles[j].getName().contains("_x")) {
						grilleTuiles[j].setVisible(true);
					}
					else if (grilleTuiles[j].getName().contains("_180")) {
						grilleTuiles[j].setVisible(true);
						break;
					}
					else {
						break;
					}
				}
			}
			
			else if (listeDetectives[i].getLigneGrille() == 4 && listeDetectives[i].getColonneGrille() == 1) { //Si détective en position 4,1
				for (int j = 6; j < 9; j++) {
					if(grilleTuiles[j].getName().contains("_0") || grilleTuiles[j].getName().contains("_180") || grilleTuiles[j].getName().contains("_x")) {
						grilleTuiles[j].setVisible(true);
					}
					else if (grilleTuiles[j].getName().contains("_90")) {
						grilleTuiles[j].setVisible(true);
						break;
					}
					else {
						break;
					}
				}
			}

			else if (listeDetectives[i].getLigneGrille() == 3 && listeDetectives[i].getColonneGrille() == 1) { //Si détective en position 3,1
				for (int j = 3; j < 6; j++) {
					if(grilleTuiles[j].getName().contains("_0") || grilleTuiles[j].getName().contains("_180") || grilleTuiles[j].getName().contains("_x")) {
						grilleTuiles[j].setVisible(true);
					}
					else if (grilleTuiles[j].getName().contains("_90")) {
						grilleTuiles[j].setVisible(true);
						break;
					}
					else {
						break;
					}
				}
			}
			
			else if (listeDetectives[i].getLigneGrille() == 2 && listeDetectives[i].getColonneGrille() == 1) { //Si détective en position 2,1
				for (int j = 0; j < 3; j++) {
					if(grilleTuiles[j].getName().contains("_0") || grilleTuiles[j].getName().contains("_180") || grilleTuiles[j].getName().contains("_x")) {
						grilleTuiles[j].setVisible(true);
					}
					else if (grilleTuiles[j].getName().contains("_90")) {
						grilleTuiles[j].setVisible(true);
						break;
					}
					else {
						break;
					}
				}
			}
			

		}

		// on verifie quelle tuile est celle de jack en parcourant la liste de tuiles et en comparant leurs noms a celui de l'alibi de jack
		for (int i = 0; i < grilleTuiles.length; i++) {
			if (grilleTuiles[i].getName().contains(tabShuffleAlibi[0].getName())) {
				tuileJack = grilleTuiles[i];

				break;
			}
		}
		
		if (tuileJack.getVisible()) { //si la tuile de jack est visible

			// on retourne toutes les tuiles non visibles
			for (int i = 0; i < grilleTuiles.length; i++) {
				if(!grilleTuiles[i].getVisible()) {	
					tabShuffleTuile[i][0].retourner();

				}
				else if (grilleTuiles[i].getVisible()) {

				}
			}
		}
		else { //si la tuile de jack n'est pas visible
			this.sablierJack++;
			// on retourne toutes les tuiles visibles
			for (int i = 0; i < grilleTuiles.length; i++) {
				if(grilleTuiles[i].getVisible()) {	
					tabShuffleTuile[i][0].retourner();

				}
				else if (!grilleTuiles[i].getVisible()) {

				}
			}
		}
		this.isAppel = true;
	}
	
	public void nbrTR() {							// determine ke nombre de carte retournée
		for (int i=0; i<9; i++) {
			if(tabShuffleTuile[i][0].getName() == "retournee_0" || tabShuffleTuile[i][0].getName() == "retournee_90" || tabShuffleTuile[i][0].getName() == "retournee_-90" || tabShuffleTuile[i][0].getName() == "retournee_180" || tabShuffleTuile[i][0].getName() == "retournee_x") {
				this.nbrRetourne++;
			}	
		}
		if (nbrRetourne != 8) {
			this.nbrRetourne = 0;
		}
	
	}
	
	public void tourJoueur() {						// Determine qui doit jouer
		if(tour%2 == 0 && (action == 1 || action ==4) ) {
			this.joueur = 'J';
		}
		else if (tour%2 == 0 && (action == 2 || action ==3)) {
			this.joueur = 'D';
		}
		if(tour%2 == 1 && (action == 1 || action ==4 )) {
			this.joueur = 'D';
		}
		else if (tour%2 == 1 && (action == 2 || action ==3)) {
			this.joueur = 'J';
		}
	}
	
	public void actionTour() {						// Determine combien de jeton on été joué en 1 tour
		if(action < 5) {
			action ++;
			

			}
		
		if (action == 5 && isAppel == true) {

			tour++;
			if(this.jackVisible == false) {
				this.sablierJack++;
			}
			action = 1;
			for (int i = 0; i<4; i++ ) {
				Collections.swap(Arrays.asList(tabShuffleJA[i]), 0, 1);
			}
			this.JA1 = false;
			this.JA2 = false;
			this.JA3 = false;
			this.JA4 = false;
			this.nJA1 = true;
			this.nJA2 = true;
			this.nJA3 = true;
			this.nJA4 = true;
			
			
			if (tour%2==1) {
				this.tabShuffleJA = JetonAction.jetonShuffle(jA1_1, jA1_2,jA2_1, jA2_2, jA3_1, jA3_2, jA4_1, jA4_2);

			}
			
		}
		Main.scene.isAppel = false;
	}
	
	public void finDuJeu() {						// Différentes fin du jeu et conditions
		if(this.sablierJack >= 6 && finDetec == false) {  //si jack possède 6 sabliers
			finJack = true;
			Audio.playSound("/audios/jackSound.wav");
		}
		if(this.nbrRetourne == 8 && finJack == false) { // s'il ne reste qu'un seul suspect après l'appel à temoin
			finDetec = true;
			Audio.playSound("/audios/finInspecteur.wav");
		}
		if(this.jackVisible == true  && this.finJack == true && this.finDetec == true) { // Si les deux gagnent et Jack est visible
			finDetec = true;
			finJack = false;
			Audio.playSound("/audios/finInspecteur.wav");
		}
		if(this.jackVisible == false && this.tour == 8 && this.finJack == true && this.finDetec == true) { // Si les deux gagnent et Jack est invisible
			finDetec = false;
			finJack = true;
			Audio.playSound("/audios/jackSound.wav");
		}
		if(this.tour == 8 && this.finJack == false && this.finDetec == false) {
			this.finJack = true;
			Audio.playSound("/audios/jackSound.wav");
		}
	}
	
	public void restart() {							// reinitialise toute les variables pour recommencer la partie
	
			Main.scene.tabShuffleTuile = Tuile.tuileMelange(T1, T1_90, T1_180, T1_r90, T2, T2_90, T2_180, T2_r90, T3, T3_90, T3_180,
					T3_r90, T4, T4_90, T4_180, T4_r90, T5, T5_90, T5_180, T5_r90, T6, T6_90, T6_180, T6_r90, T7, T7_90,
					T7_180, T7_r90, T8, T8_90, T8_180, T8_r90, T9, T9_90, T9_180, T9_r90);
			this.tChange = 0;
			this.tChange1 = 0;
			this.tChange2 = 0;
			this.changeSelect = false;
			this.JTchange = false;
			
			this.tRotat = 0;
			this.JTrot = false;
			this.tTurn= 0;
			
			this.nbrRetourne = 0;
			
			this.idJack = false;
			
			this.jackVisible = false;
			
			this.nAlibi = 0;
			this.nAlibiFC = 8;
			
			this.sablierJack = 0;

			//tableau des cartes Alibis que l'on mélange
			this.tabShuffleAlibi = Alibi.shuffleAlibi(InspLestrade, JeremyBert, JohnPizer, JohnSmith, JosephLane, Madame,
					MissStealthy, SgtGoodley, WilliamGull);
			
			this.tabShuffleJA = JetonAction.jetonShuffle(jA1_1, jA1_2,jA2_1, jA2_2, jA3_1, jA3_2, jA4_1, jA4_2 );
			
			this.JA1 = false;
			this.JA2 = false;
			this.JA3 = false;
			this.JA4 = false;
			this.nJA1 = true;
			this.nJA2 = true;
			this.nJA3 = true;
			this.nJA4 = true;
			
			this.nbr_depla = 0;
			
			this.tour = 1;
			this.joueur = 'D';
			this.action = 1;
			
			this.isAppel = false;
			
			this.tabJT = JetonTemps.tabTemps(jT1, jT2, jT3, jT4, jT5, jT6, jT7, jT8);
			
			this.ecranAccueil = true ;
			this.ecranAlibi = false ;
			
			
			

			// ECRITURE
			
			this.strCommande = " ";
			
			this.strSablier = false;
			
			
			//Fin du Jeu
			
			this.finJack = false;
			this.finDetec = false;
			
			Audio.playSound("/audios/restartSound.wav");
			
			
	}
	
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		Graphics g2 = (Graphics2D) g; // Ameliore les graphismes en 2D
		
		tourJoueur(); // On fait appel a tour joueur pour savoir qui joue

		
		if (ecranAccueil == true && ecranAlibi == false) { //Ecran d'accueil 
			
			this.musiqueMenu.play();
			g2.drawImage( this.imgFondLondres, 0, 0, null);

			Font police = new Font("Simsun", Font.BOLD, 50);
			Font police2 = new Font("Simsun", Font.BOLD, 30);
			Font police3 = new Font("Simsun", Font.BOLD, 20);
			g2.setColor(Color.white);
			g2.setFont(police);
			g2.drawString("Bienvenue sur le Jeu Mr Jack Pocket : ", 350, 150);
			g2.setFont(police2);
			g2.drawString("Pour commencer à vous faufiler dans les ruelles de Londres : ", 350, 750);	
			g2.drawString("Appuyez sur ENTRER", 700, 780);

			g2.setFont(police3);
			g2.drawString("Elias Dève    Aymeric Lefebvre    Léonie Petit", 630, 850);
			
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

			
		} else if (ecranAlibi == false && ecranAccueil == false && finJack ==false && finDetec == false) { //ecran du plateau de jeu
			
			this.musiqueMenu.stop();
			
			this.musiqueFond.play();


			
			//g2.drawImage(this.imgFond, 0, 0, null); // Affichage du fond noir
			g2.drawImage( this.imgFondLondres, 0, 0, null); // Affichage du fond

			Font police = new Font("Simsun", Font.BOLD, 20);
			g2.setColor(Color.white);
			g2.setFont(police); 
			g2.drawString(" Au tour de " + joueur , 0, 50);
			g2.drawString( strCommande, 0, 100);
			g2.drawString( strCommande2, 0, 120);
			g2.drawString( "Appuyez sur ENTRER à n'importe quel moment du jeu pour afficher les sabliers de Jack", 0, 900);

			g2.drawImage(tabShuffleTuile[6][0].getImgTuile(), 300, 580, null); // Affichage de la tuile en Position (1) 7 ou 4,2
			g2.drawImage(tabShuffleTuile[7][0].getImgTuile(), 490, 580, null); // Affichage de la tuile en Position (2) 8 4,3
			g2.drawImage(tabShuffleTuile[8][0].getImgTuile(), 680, 580, null); // Affichage de la tuile en Position (3) 9 ou 4,4
			g2.drawImage(tabShuffleTuile[3][0].getImgTuile(), 300, 390, null); // Affichage de la tuile en Position 4 ou 3,2
			g2.drawImage(tabShuffleTuile[4][0].getImgTuile(), 490, 390, null); // Affichage de la tuile en Position 5 ou 3,3
			g2.drawImage(tabShuffleTuile[5][0].getImgTuile(), 680, 390, null); // Affichage de la tuile en Position 6 ou 3,4
			g2.drawImage(tabShuffleTuile[0][0].getImgTuile(), 300, 200, null); // Affichage de la tuile en Position (7) 1 ou 2,2
			g2.drawImage(tabShuffleTuile[1][0].getImgTuile(), 490, 200, null); // Affichage de la tuile en Position (8) 2 ou 2,3
			g2.drawImage(tabShuffleTuile[2][0].getImgTuile(), 680, 200, null); // Affichage de la tuile en Position (9) 3 ou 2,4



			g2.drawImage(this.Sherlock.getImgDetec(), this.Sherlock.getxPosition(), this.Sherlock.getyPosition(), null);
			g2.drawImage(this.Tobi.getImgDetec(), this.Tobi.getxPosition(), this.Tobi.getyPosition(), null);
			g2.drawImage(this.Watson.getImgDetec(), this.Watson.getxPosition() , this.Watson.getyPosition(), null);

			
			// Jeton Action 
			
			if (nJA1 == true || nJA2 == true || nJA3 == true || nJA4 == true) {
				if(nJA1 == true) {g2.drawImage(tabShuffleJA[0][0].getImgJA(), 1100, 450, null); g2.drawString(" A ", 1180, 470);}// Affichage du Jeton 1
				if(nJA2 == true) {g2.drawImage(tabShuffleJA[1][0].getImgJA(), 1100, 520, null); g2.drawString(" Z ", 1180, 540);} // Affichage du Jeton 2
				if(nJA3 == true) {g2.drawImage(tabShuffleJA[2][0].getImgJA(), 1100, 590, null); g2.drawString(" E ", 1180, 610);} // Affichage du Jeton 3
				if(nJA4 == true) {g2.drawImage(tabShuffleJA[3][0].getImgJA(), 1100, 660, null); g2.drawString(" R ", 1180, 680);} // Affichage du Jeton 4
			}

			
	
			// Jeton temps


			for(int i = tour -1 ; i<8; i++) {
				g2.drawImage(this.tabJT[i].getImgJT(), 100 , 300 + 60 * i, null);
			}

		
			// Alibi
			

			
			for (int i = 1; i <= nAlibiFC ; i++) {
				if(nAlibiFC != 0) {
						g2.drawImage(this.alibiCarte.getImgAlibi(), 1000 + 20 * i, 20 * i, null);}}
			if (nAlibiFC < 8) {
				if(idJack == true) {
				g2.drawImage(tabShuffleAlibi[nAlibi].getImgAlibi(), 1140, 200, null);
				}
				
			}

		}
		
		else if( ecranAlibi == false && ecranAccueil == false && finJack == true && finDetec == false ) { //JACK GAGNE
			g2.drawImage( this.imgFondJack, 0, 0, null); // Affichage du fond
			
			
			
			

			
			Font police = new Font("Simsun", Font.BOLD, 50);
			g2.setColor(Color.white);
			g2.setFont(police);
			g2.drawString(" Mr.Jack s'est enfuit... ", 350, 150);
			g2.drawString(" Appuyez sur R pour recommencer la partie ", 350, 300);
			
			
		
		}
		
		else if( ecranAlibi == false && ecranAccueil == false && finJack == false && finDetec == true ) { //DETECTIVE GAGNE
			g2.drawImage( this.imgFondDetec, 0, 0, null); // Affichage du fond
			
			
			Font police = new Font("Simsun", Font.BOLD, 50);
			g2.setColor(Color.white);
			g2.setFont(police);
			g2.drawString(" Vous avez attrapé Jack ! ", 350, 150);
			g2.drawString(" Appuyez sur R pour recommencer la partie ", 350, 300);
			
		
		}
	}
	

}
