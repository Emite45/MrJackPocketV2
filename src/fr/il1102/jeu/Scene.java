package fr.il1102.jeu;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import fr.il1102.objet.Alibi;
import fr.il1102.objet.Tuile;

@SuppressWarnings("serial")
public class Scene extends JPanel {

	private ImageIcon icoFond; // ecran noir en fond
	private Image imgFond;

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
	public Tuile[][] tabShuffleTuile;

	private ImageIcon icoWatson;
	private Image imgWatson;

	private ImageIcon icoTobi;
	private Image imgTobi;

	private ImageIcon icoSherlock;
	private Image imgSherlock;

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

	public Alibi InspLestrade;
	public Alibi JeremyBert;
	public Alibi JohnPizer;
	public Alibi JohnSmith;
	public Alibi JosephLane;
	public Alibi Madame;
	public Alibi MissStealthy;
	public Alibi SgtGoodley;
	public Alibi WilliamGull;
	public Alibi[] tabShuffleAlibi;
	public Alibi alibiCarte;

	public Alibi[] tabAlibi = { InspLestrade, JeremyBert, JohnPizer, JohnSmith, JosephLane, Madame, MissStealthy,
			SgtGoodley, WilliamGull };

	public boolean ecranAlibi;

	public int nAlibi;
	public int nAlibiFC;

	// Constructeurs
	public Scene() {

		super();

		icoFond = new ImageIcon(getClass().getResource("/images/background.png"));
		this.imgFond = this.icoFond.getImage();

		icoWatson = new ImageIcon(getClass().getResource("/images/Watson.png"));
		this.imgWatson = this.icoWatson.getImage();
		icoSherlock = new ImageIcon(getClass().getResource("/images/Sherlock.png"));
		this.imgSherlock = this.icoSherlock.getImage();
		icoTobi = new ImageIcon(getClass().getResource("/images/Tobi.png"));
		this.imgTobi = this.icoTobi.getImage();

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

		this.InspLestrade = new Alibi("/images/InspLestrade-alibi.png");
		this.JeremyBert = new Alibi("/images/JeremyBert-alibi.png");
		this.JohnPizer = new Alibi("/images/JohnPizer-alibi.png");
		this.JohnSmith = new Alibi("/images/JohnSmith-alibi.png");
		this.JosephLane = new Alibi("/images/JosephLane-alibi.png");
		this.Madame = new Alibi("/images/Madame-alibi.png");
		this.MissStealthy = new Alibi("/images/MissStealthy-alibi.png");
		this.SgtGoodley = new Alibi("/images/SgtGoodley-alibi.png");
		this.WilliamGull = new Alibi("/images/WilliamGull-alibi.png");

		this.alibiCarte = new Alibi("/images/alibi-card.png");

		this.tabShuffleAlibi = Alibi.shuffleAlibi(InspLestrade, JeremyBert, JohnPizer, JohnSmith, JosephLane, Madame,
				MissStealthy, SgtGoodley, WilliamGull);

		this.tabShuffleTuile = Tuile.tuileMelange(T1, T1_90, T1_180, T1_r90, T2, T2_90, T2_180, T2_r90, T3, T3_90, T3_180,
				T3_r90, T4, T4_90, T4_180, T4_r90, T5, T5_90, T5_180, T5_r90, T6, T6_90, T6_180, T6_r90, T7, T7_90,
				T7_180, T7_r90, T8, T8_90, T8_180, T8_r90, T9, T9_90, T9_180, T9_r90);

		this.setFocusable(true);
		this.requestFocusInWindow();
		this.addKeyListener(new Clavier());

		this.ecranAlibi = true;

		this.nAlibi = 1;
		this.nAlibiFC = 9;
	}

	// Getters

	public Alibi[] getTabAlibi() {
		return tabAlibi;
	}

	public boolean isEcranAlibi() {
		return ecranAlibi;
	}
	// Setters

	public void setEcranAlibi(boolean ecranAlibi) {
		this.ecranAlibi = ecranAlibi;
	}

	// Methodes

	public void paintComponent(Graphics g) {

		super.paintComponent(g);
		Graphics g2 = (Graphics2D) g; // Ameliore les graphismes en 2D

		if (ecranAlibi == true) {

			g2.drawImage(this.imgFond, 0, 0, null);

			Font policeFin = new Font("Simsun", Font.BOLD, 50);
			g2.setFont(policeFin);
			g2.drawString("Voici l'identité de Mr Jack : ", 300, 250);
			g2.drawString("(Appuyez sur espace pour commencer à jouer)", 300, 700);

			g2.drawImage(tabShuffleAlibi[0].getImgAlibi(), 550, 300, null); // ID de Mr Jack
		} else if (ecranAlibi == false) {
			g2.drawImage(this.imgFond, 0, 0, null);

			g2.drawImage(tabShuffleTuile[0][0].getImgTuile(), 300, 300, null);
			g2.drawImage(tabShuffleTuile[1][0].getImgTuile(), 490, 300, null);
			g2.drawImage(tabShuffleTuile[2][0].getImgTuile(), 680, 300, null);
			g2.drawImage(tabShuffleTuile[3][0].getImgTuile(), 300, 490, null);
			g2.drawImage(tabShuffleTuile[4][0].getImgTuile(), 490, 490, null);
			g2.drawImage(tabShuffleTuile[5][0].getImgTuile(), 680, 490, null);
			g2.drawImage(tabShuffleTuile[6][0].getImgTuile(), 300, 680, null);
			g2.drawImage(tabShuffleTuile[7][0].getImgTuile(), 490, 680, null);
			g2.drawImage(tabShuffleTuile[8][0].getImgTuile(), 680, 680, null);

//			g2.drawImage(this.imgT1, 300, 300, null);
//			g2.drawImage(this.imgT2, 490, 300, null);
//			g2.drawImage(this.imgT3, 680, 300, null);
//			g2.drawImage(this.imgT4, 300, 490, null);
//			g2.drawImage(this.imgT5, 490, 490, null);
//			g2.drawImage(this.imgT6, 680, 490, null);
//			g2.drawImage(this.imgT7, 300, 680, null);
//			g2.drawImage(this.imgT8, 490, 680, null);
//			g2.drawImage(this.imgT9, 680, 680, null);

			g2.drawImage(this.imgSherlock, 220, 355, null);
			g2.drawImage(this.imgTobi, 545, 870, null);
			g2.drawImage(this.imgWatson, 870, 355, null);

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

			// g2.drawImage(this.imgSherlock, 0, 0, null);
		}
	}

}
