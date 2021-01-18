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
import fr.il1102.objet.JetonAction;
import fr.il1102.objet.Tuile;


@SuppressWarnings("serial")
public class Scene extends JPanel {

	// Variables 
	
    private ImageIcon icoFondLondres; // ecran d'accueil
	private Image imgFondLondres;

	private ImageIcon icoFond; // ecran noir en fond
	@SuppressWarnings("unused")
	private Image imgFond;

															// Tuile \\ 
	// Initialisation des tuiles
	public Tuile T1 = new Tuile("/images/tuile_de_rue_face_suspect1.png");
	public Tuile T1_90 = new Tuile("/images/tuile_de_rue_face_suspect1_90.png");
	public Tuile T1_180 = new Tuile("/images/tuile_de_rue_face_suspect1_180.png");
	public Tuile T1_r90 = new Tuile("/images/tuile_de_rue_face_suspect1_-90.png");

	public Tuile T2 = new Tuile("/images/tuile_de_rue_face_suspect2.png");
	public Tuile T2_90 = new Tuile("/images/tuile_de_rue_face_suspect2_90.png");
	public Tuile T2_180 = new Tuile("/images/tuile_de_rue_face_suspect2_180.png");
	public Tuile T2_r90 = new Tuile("/images/tuile_de_rue_face_suspect2_-90.png");
	
	public Tuile T3 = new Tuile("/images/tuile_de_rue_face_suspect3.png");
	public Tuile T3_90  = new Tuile("/images/tuile_de_rue_face_suspect3_90.png");
	public Tuile T3_180 = new Tuile("/images/tuile_de_rue_face_suspect3_180.png");
	public Tuile T3_r90 = new Tuile("/images/tuile_de_rue_face_suspect3_-90.png");
	
	public Tuile T4 = new Tuile("/images/tuile_de_rue_face_suspect4.png");
	public Tuile T4_90 = new Tuile("/images/tuile_de_rue_face_suspect4_90.png");
	public Tuile T4_180 = new Tuile("/images/tuile_de_rue_face_suspect4_180.png");
	public Tuile T4_r90 = new Tuile("/images/tuile_de_rue_face_suspect4_-90.png");
	
	public Tuile T5 = new Tuile("/images/tuile_de_rue_face_suspect5.png");
	public Tuile T5_90 = new Tuile("/images/tuile_de_rue_face_suspect5_90.png");
	public Tuile T5_180 = new Tuile("/images/tuile_de_rue_face_suspect5_180.png");
	public Tuile T5_r90 = new Tuile("/images/tuile_de_rue_face_suspect5_-90.png");

	public Tuile T6 = new Tuile("/images/tuile_de_rue_face_suspect6.png");
	public Tuile T6_90  = new Tuile("/images/tuile_de_rue_face_suspect6_90.png");
	public Tuile T6_180  = new Tuile("/images/tuile_de_rue_face_suspect6_180.png");
	public Tuile T6_r90  = new Tuile("/images/tuile_de_rue_face_suspect6_m90.png");

	public Tuile T7  = new Tuile("/images/tuile_de_rue_face_suspect7.png");
	public Tuile T7_90 = new Tuile("/images/tuile_de_rue_face_suspect7_90.png");
	public Tuile T7_180 = new Tuile("/images/tuile_de_rue_face_suspect7_180.png");
	public Tuile T7_r90 = new Tuile("/images/tuile_de_rue_face_suspect7_-90.png");

	public Tuile T8 = new Tuile("/images/tuile_de_rue_face_suspect8.png");
	public Tuile T8_90 = new Tuile("/images/tuile_de_rue_face_suspect8_90.png");
	public Tuile T8_180 = new Tuile("/images/tuile_de_rue_face_suspect8_180.png");
	public Tuile T8_r90 = new Tuile("/images/tuile_de_rue_face_suspect8_-90.png");

	public Tuile T9 = new Tuile("/images/tuile_de_rue_face_suspect9.png");
	public Tuile T9_90 = new Tuile("/images/tuile_de_rue_face_suspect9_90.png");
	public Tuile T9_180 = new Tuile("/images/tuile_de_rue_face_suspect9_180.png");
	public Tuile T9_r90 = new Tuile("/images/tuile_de_rue_face_suspect9_m90.png");
	
	public Tuile Td = new Tuile("/images/common-verso.png");
	public Tuile Td_90  = new Tuile("/images/common-verso_90.png");
	public Tuile Td_180 = new Tuile("/images/common-verso_180.png");
	public Tuile Td_r90 = new Tuile("/images/common-verso_-90.png");
	public Tuile Td_x = new Tuile("/images/JosephLane-verso.png");

	
	public int tChange1; //Indice de la première tuile que l'on veut changer
	public int tChange2;
	public int tChange;
	public boolean JTchange; //Temporaire
	public boolean changeSelect;
	public int tRotat;
	public boolean JTrot;
	
	public int tTurn;
	
	
	public Tuile[][] tabShuffleTuile;
	
														// Detective \\
	//initialisation positions possibles detectives
	//Il existe en 12 positions possible pour les détectives ce qui fait 12 combinaisons en tout avec 5 différentes en x et 5 en y
	private int xDetec1 = 300 - 80 - 10; 	// position [1,y]
	private int xDetec2= 300 + 55;			// position [2,y]
	private int xDetec3 = 300 + 190 + 55;	// position [3,y]
	private int xDetec4 = 300 + 2* 190 + 55;// position [4,y]
	private int xDetec5 = 300 + 3* 190 + 10;// position [5,y]
	private int yDetec1 = 100 - 80 - 10;	// position [x,1]
	private int yDetec2 = 100 + 55;			// position [x,2]
	private int yDetec3 = 100 + 190 + 55;	// position [x,3]
	private int yDetec4 = 100 + 2* 190 + 55;// position [x,4]
	private int yDetec5 = 100 + 3* 190 + 10;// position [x,5]
	
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

	public boolean ecranAlibi;  // deuxième écran de découverte de l'alibi de Jack
	
	public boolean ecranAccueil;

	

	// Constructeurs
	
	public Scene() {

		super();

		icoFond = new ImageIcon(getClass().getResource("/images/background.png"));
		this.imgFond = this.icoFond.getImage();
		
		icoFondLondres = new ImageIcon(getClass().getResource("/images/fondJackWelcome.png"));
		this.imgFondLondres = this.icoFondLondres.getImage();
		
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

															// Alibi \\
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
		
		this.nAlibi = 0;
		this.nAlibiFC = 8;
		
		this.sablierJack = 0;

		//tableau des cartes Alibis que l'on mélange
		this.tabShuffleAlibi = Alibi.shuffleAlibi(InspLestrade, JeremyBert, JohnPizer, JohnSmith, JosephLane, Madame,
				MissStealthy, SgtGoodley, WilliamGull);

														// Detective \\
		//On instancie nos 3 detectives
		this.Sherlock = new Detective("/images/Sherlock.png");
		this.Watson = new Detective ("/images/Watson.png");
		this.Tobi = new Detective ("/images/Tobi.png");
		
		// On affecte des positions de bases à nos detectives
	
		Sherlock.xPosition = xDetec1;
		Sherlock.yPosition = yDetec2; 
		Watson.xPosition = xDetec5;
		Watson.yPosition = yDetec2; 
		Tobi.xPosition = xDetec3;
		Tobi.yPosition = yDetec5; 
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
		
		
		
		
		
		
												// Jeton Temps \\
		
		
//		icoJT1 = new ImageIcon(getClass().getResource("/images/Jeton_Temps1_face_Tour_de_jeu.png"));
//		this.imgJT1 = this.icoJT1.getImage();
//		icoJT2 = new ImageIcon(getClass().getResource("/images/Jeton_Temps2_face_Tour_de_jeu.png"));
//		this.imgJT2 = this.icoJT2.getImage();
//		icoJT3 = new ImageIcon(getClass().getResource("/images/Jeton_Temps3_face_Tour_de_jeu.png"));
//		this.imgJT3 = this.icoJT3.getImage();
//		icoJT4 = new ImageIcon(getClass().getResource("/images/Jeton_Temps4_face_Tour_de_jeu.png"));
//		this.imgJT4 = this.icoJT4.getImage();
//		icoJT5 = new ImageIcon(getClass().getResource("/images/Jeton_Temps5_face_Tour_de_jeu.png"));
//		this.imgJT5 = this.icoJT5.getImage();
//		icoJT6 = new ImageIcon(getClass().getResource("/images/Jeton_Temps6_face_Tour_de_jeu.png"));
//		this.imgJT6 = this.icoJT6.getImage();
//		icoJT7 = new ImageIcon(getClass().getResource("/images/Jeton_Temps7_face_Tour_de_jeu.png"));
//		this.imgJT7 = this.icoJT7.getImage();
//		icoJT8 = new ImageIcon(getClass().getResource("/images/Jeton_Temps8_face_Tour_de_jeu.png"));

		this.setFocusable(true);  // Permet d'utiliser la classe clavier
		this.requestFocusInWindow();
		this.addKeyListener(new Clavier());
		
		this.ecranAccueil = true ;
		this.ecranAlibi = false ;

		
	}

	// Getters

	

	public Alibi[] getTabShuffleAlibi() { return tabShuffleAlibi;	}

	public int gettRotat() { return tRotat;	}

	public boolean isEcranAccueil() { return ecranAccueil;	}
	
	public boolean isEcranAlibi() { return ecranAlibi;	}

	public boolean isChangeSelect() { return changeSelect;	}
	
	public int getxDetec1() { return xDetec1;	}

	public int getxDetec2() { return xDetec2;	}

	public int getxDetec3() { return xDetec3;	}

	public int getxDetec4() { return xDetec4;	}

	public int getxDetec5() { return xDetec5;	}

	public int getyDetec1() { return yDetec1;	}

	public int getyDetec2() { return yDetec2;	}

	public int getyDetec3() { return yDetec3;	}

	public int getyDetec4() { return yDetec4;	}

	public int getyDetec5() { return yDetec5;	}
	
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
	
	public void retournerTuile(int tTurn) {								//Retourne la tuile en fonction de son orientation
		List<Tuile> listTuile = Arrays.asList(tabShuffleTuile[tTurn]);
		if(listTuile.contains(T1) == true) {
			if (tabShuffleTuile[tTurn][0] == T1) {tabShuffleTuile[tTurn][0]= Td;}
			else if (tabShuffleTuile[tTurn][0] == T1_90) {tabShuffleTuile[tTurn][0]= Td_90;}
			else if (tabShuffleTuile[tTurn][0] == T1_180) {tabShuffleTuile[tTurn][0]= Td_180;}
			else if (tabShuffleTuile[tTurn][0] == T1_r90) {tabShuffleTuile[tTurn][0]= Td_r90;}
		}
		else if(listTuile.contains(T2) == true) {
			if (tabShuffleTuile[tTurn][0] == T2) {tabShuffleTuile[tTurn][0]= Td;}
			else if (tabShuffleTuile[tTurn][0] == T2_90) {tabShuffleTuile[tTurn][0]= Td_90;}
			else if (tabShuffleTuile[tTurn][0] == T2_180) {tabShuffleTuile[tTurn][0]= Td_180;}
			else if (tabShuffleTuile[tTurn][0] == T2_r90) {tabShuffleTuile[tTurn][0]= Td_r90;}
		}
		else if(listTuile.contains(T3) == true) {
			if (tabShuffleTuile[tTurn][0] == T3) {tabShuffleTuile[tTurn][0]= Td;}
			else if (tabShuffleTuile[tTurn][0] == T3_90) {tabShuffleTuile[tTurn][0]= Td_90;}
			else if (tabShuffleTuile[tTurn][0] == T3_180) {tabShuffleTuile[tTurn][0]= Td_180;}
			else if (tabShuffleTuile[tTurn][0] == T3_r90) {tabShuffleTuile[tTurn][0]= Td_r90;}
		}
		else if(listTuile.contains(T4) == true) {
			if (tabShuffleTuile[tTurn][0] == T4) {tabShuffleTuile[tTurn][0]= Td;}
			else if (tabShuffleTuile[tTurn][0] == T4_90) {tabShuffleTuile[tTurn][0]= Td_90;}
			else if (tabShuffleTuile[tTurn][0] == T4_180) {tabShuffleTuile[tTurn][0]= Td_180;}
			else if (tabShuffleTuile[tTurn][0] == T4_r90) {tabShuffleTuile[tTurn][0]= Td_r90;}
		}
		else if(listTuile.contains(T5) == true) {
			if (tabShuffleTuile[tTurn][0] == T5) {tabShuffleTuile[tTurn][0]= Td;}
			else if (tabShuffleTuile[tTurn][0] == T5_90) {tabShuffleTuile[tTurn][0]= Td_90;}
			else if (tabShuffleTuile[tTurn][0] == T5_180) {tabShuffleTuile[tTurn][0]= Td_180;}
			else if (tabShuffleTuile[tTurn][0] == T5_r90) {tabShuffleTuile[tTurn][0]= Td_r90;}
		}
		else if(listTuile.contains(T6) == true) {
			if (tabShuffleTuile[tTurn][0] == T6) {tabShuffleTuile[tTurn][0]= Td;}
			else if (tabShuffleTuile[tTurn][0] == T6_90) {tabShuffleTuile[tTurn][0]= Td_90;}
			else if (tabShuffleTuile[tTurn][0] == T6_180) {tabShuffleTuile[tTurn][0]= Td_180;}
			else if (tabShuffleTuile[tTurn][0] == T6_r90) {tabShuffleTuile[tTurn][0]= Td_r90;}
		}
		else if(listTuile.contains(T7) == true) {
			if (tabShuffleTuile[tTurn][0] == T7) {tabShuffleTuile[tTurn][0]= Td;}
			else if (tabShuffleTuile[tTurn][0] == T7_90) {tabShuffleTuile[tTurn][0]= Td_90;}
			else if (tabShuffleTuile[tTurn][0] == T7_180) {tabShuffleTuile[tTurn][0]= Td_180;}
			else if (tabShuffleTuile[tTurn][0] == T7_r90) {tabShuffleTuile[tTurn][0]= Td_r90;}
		}
		else if(listTuile.contains(T8) == true) {
			if (tabShuffleTuile[tTurn][0] == T8) {tabShuffleTuile[tTurn][0]= Td;}
			else if (tabShuffleTuile[tTurn][0] == T8_90) {tabShuffleTuile[tTurn][0]= Td_90;}
			else if (tabShuffleTuile[tTurn][0] == T8_180) {tabShuffleTuile[tTurn][0]= Td_180;}
			else if (tabShuffleTuile[tTurn][0] == T8_r90) {tabShuffleTuile[tTurn][0]= Td_r90;}
		}
		else if(listTuile.contains(T9) == true) {
			tabShuffleTuile[tTurn][0]= Td_x;
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
	
	public void alibiJack(int nAlibi) {				// Quand jack choisi le jeton Alibi

		if (tabShuffleAlibi[nAlibi] == InspLestrade) {}
		else if (tabShuffleAlibi[nAlibi] == JeremyBert) {sablierJack++;}
		else if (tabShuffleAlibi[nAlibi] == JohnPizer) {sablierJack++;}
		else if (tabShuffleAlibi[nAlibi] == JohnSmith) {sablierJack++;}
		else if (tabShuffleAlibi[nAlibi] == JosephLane) {sablierJack++;}
		else if (tabShuffleAlibi[nAlibi] == Madame) {sablierJack = sablierJack +2;}
		else if (tabShuffleAlibi[nAlibi] == MissStealthy) {sablierJack++;}
		else if (tabShuffleAlibi[nAlibi] == SgtGoodley) {}
		else if (tabShuffleAlibi[nAlibi] == WilliamGull) {sablierJack++;}
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

			Font police = new Font("Simsun", Font.BOLD, 20);
			g2.setColor(Color.white);
			g2.setFont(police); 
			g2.drawString("le nombre de sablier de Jack est " + this.nAlibi, 0, 100);

			g2.drawImage(tabShuffleTuile[0][0].getImgTuile(), 300, 100, null); // Affichage de la tuile en Position 7
			g2.drawImage(tabShuffleTuile[1][0].getImgTuile(), 490, 100, null); // Affichage de la tuile en Position 8
			g2.drawImage(tabShuffleTuile[2][0].getImgTuile(), 680, 100, null); // Affichage de la tuile en Position 9
			g2.drawImage(tabShuffleTuile[3][0].getImgTuile(), 300, 290, null); // Affichage de la tuile en Position 4
			g2.drawImage(tabShuffleTuile[4][0].getImgTuile(), 490, 290, null); // Affichage de la tuile en Position 5
			g2.drawImage(tabShuffleTuile[5][0].getImgTuile(), 680, 290, null); // Affichage de la tuile en Position 6
			g2.drawImage(tabShuffleTuile[6][0].getImgTuile(), 300, 480, null); // Affichage de la tuile en Position 1
			g2.drawImage(tabShuffleTuile[7][0].getImgTuile(), 490, 480, null); // Affichage de la tuile en Position 2
			g2.drawImage(tabShuffleTuile[8][0].getImgTuile(), 680, 480, null); // Affichage de la tuile en Position 3

			g2.drawImage(this.Sherlock.getImgDetec(), this.Sherlock.getxPosition(), this.Sherlock.getyPosition(), null);
			g2.drawImage(this.Tobi.getImgDetec(), this.Tobi.getxPosition(), this.Tobi.getyPosition(), null);
			g2.drawImage(this.Watson.getImgDetec(), this.Watson.getxPosition() , this.Watson.getyPosition(), null);

			
			// Jeton Action 
			
			if (nJA1 == true || nJA2 == true || nJA3 == true || nJA4 == true) {
				if(nJA1 == true) {g2.drawImage(tabShuffleJA[0][0].getImgJA(), 1100, 450, null); }// Affichage du Jeton 1
				else if(nJA2 == true) {g2.drawImage(tabShuffleJA[1][0].getImgJA(), 1100, 520, null);} // Affichage du Jeton 2
				else if(nJA3 == true) {g2.drawImage(tabShuffleJA[2][0].getImgJA(), 1100, 590, null);} // Affichage du Jeton 3
				else if(nJA4 == true) {g2.drawImage(tabShuffleJA[3][0].getImgJA(), 1100, 660, null);} // Affichage du Jeton 4
			}
			else if (nJA1 == false & nJA2 == false && nJA3 == false && nJA4 == false) {
				g2.drawImage(tabShuffleJA[0][1].getImgJA(), 1100, 450, null); // Affichage du Jeton 1
				g2.drawImage(tabShuffleJA[1][1].getImgJA(), 1100, 520, null); // Affichage du Jeton 2
				g2.drawImage(tabShuffleJA[2][1].getImgJA(), 1100, 590, null); // Affichage du Jeton 3
				g2.drawImage(tabShuffleJA[3][1].getImgJA(), 1100, 660, null); // Affichage du Jeton 4
			}
			
			
			
			// Jeton temps


//			g2.drawImage(this.imgJT1, 100, 300, null);
//			g2.drawImage(this.imgJT2, 100, 360, null);
//			g2.drawImage(this.imgJT3, 100, 420, null);
//			g2.drawImage(this.imgJT4, 100, 480, null);
//			g2.drawImage(this.imgJT5, 100, 540, null);
//			g2.drawImage(this.imgJT6, 100, 600, null);
//			g2.drawImage(this.imgJT7, 100, 660, null);
//			g2.drawImage(this.imgJT8, 100, 720, null);

		
			// Alibi
			

			
			
			for (int i = 1; i <= nAlibiFC ; i++) {
				if(nAlibiFC != 0) {g2.drawImage(this.alibiCarte.getImgAlibi(), 1000 + 20 * i, 20 * i, null);}}
			if (nAlibiFC < 8) {
				g2.drawImage(tabShuffleAlibi[nAlibi].getImgAlibi(), 1140, 200, null);
				
			}

		}
	}

	}
