package fr.il1102.jeu;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import fr.il1102.objet.Alibi;

@SuppressWarnings("serial")
public class Scene extends JPanel {

	private ImageIcon icoFond; // ecran noir en fond
	private Image imgFond;

	private ImageIcon icoT1;
	private Image imgT1;

	private ImageIcon icoT2;
	private Image imgT2;

	private ImageIcon icoT3;
	private Image imgT3;

	private ImageIcon icoT4;
	private Image imgT4;

	private ImageIcon icoT5;
	private Image imgT5;

	private ImageIcon icoT6;
	private Image imgT6;

	private ImageIcon icoT7;
	private Image imgT7;

	private ImageIcon icoT8;
	private Image imgT8;

	private ImageIcon icoT9;
	private Image imgT9;

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

	public Alibi[] tabAlibi = { InspLestrade, JeremyBert, JohnPizer, JohnSmith, JosephLane, Madame, MissStealthy,
			SgtGoodley, WilliamGull };

	public boolean ecranAlibi;

	// Constructeurs
	public Scene() {

		super();

		icoFond = new ImageIcon(getClass().getResource("/images/background.png"));
		this.imgFond = this.icoFond.getImage();

		icoT1 = new ImageIcon(getClass().getResource("/images/tuile_de_rue_face_suspect1.png"));
		this.imgT1 = this.icoT1.getImage();
		icoT2 = new ImageIcon(getClass().getResource("/images/tuile_de_rue_face_suspect2.png"));
		this.imgT2 = this.icoT2.getImage();
		icoT3 = new ImageIcon(getClass().getResource("/images/tuile_de_rue_face_suspect3.png"));
		this.imgT3 = this.icoT3.getImage();
		icoT4 = new ImageIcon(getClass().getResource("/images/tuile_de_rue_face_suspect4.png"));
		this.imgT4 = this.icoT4.getImage();
		icoT5 = new ImageIcon(getClass().getResource("/images/tuile_de_rue_face_suspect5.png"));
		this.imgT5 = this.icoT5.getImage();
		icoT6 = new ImageIcon(getClass().getResource("/images/tuile_de_rue_face_suspect6.png"));
		this.imgT6 = this.icoT6.getImage();
		icoT7 = new ImageIcon(getClass().getResource("/images/tuile_de_rue_face_suspect7.png"));
		this.imgT7 = this.icoT7.getImage();
		icoT8 = new ImageIcon(getClass().getResource("/images/tuile_de_rue_face_suspect8.png"));
		this.imgT8 = this.icoT8.getImage();
		icoT9 = new ImageIcon(getClass().getResource("/images/tuile_de_rue_face_suspect9.png"));
		this.imgT9 = this.icoT9.getImage();

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

		this.InspLestrade = new Alibi("/images/InspLestrade-alibi.png");
		this.JeremyBert = new Alibi("/images/JeremyBert-alibi.png");
		this.JohnPizer = new Alibi("/images/JohnPizer-alibi.png");
		this.JohnSmith = new Alibi("/images/JohnSmith-alibi.png");
		this.JosephLane = new Alibi("/images/JosephLane-alibi.png");
		this.Madame = new Alibi("/images/Madame-alibi.png");
		this.MissStealthy = new Alibi("/images/MissStealthy-alibi.png");
		this.SgtGoodley = new Alibi("/images/SgtGoodley-alibi.png");
		this.WilliamGull = new Alibi("/images/WilliamGull-alibi.png");

		this.tabShuffleAlibi = Alibi.shuffleAlibi(InspLestrade, JeremyBert, JohnPizer, JohnSmith, JosephLane, Madame,
				MissStealthy, SgtGoodley, WilliamGull);

		this.setFocusable(true);
		this.requestFocusInWindow();
		this.addKeyListener(new Clavier());

		this.ecranAlibi = true;
	}

	// Getters

	public Alibi[] getTabAlibi() {
		return tabAlibi;
	}
	
	public boolean isEcranAlibi() {
		return ecranAlibi;
	}
	//Setters
	


	public void setEcranAlibi(boolean ecranAlibi) {
		this.ecranAlibi = ecranAlibi;
	}

	// Methodes

	public void paintComponent(Graphics g) {

		super.paintComponent(g);
		Graphics g2 = (Graphics2D) g; // Ameliore les graphismes en 2D

		if (ecranAlibi == true) {
			g2.drawImage(tabShuffleAlibi[0].getImgAlibi(), 0, 0, null);
		}
		else if (ecranAlibi == false) {
			g2.drawImage(this.imgFond, 0, 0, null);

			g2.drawImage(this.imgT1, 300, 300, null);
			g2.drawImage(this.imgT2, 490, 300, null);
			g2.drawImage(this.imgT3, 680, 300, null);
			g2.drawImage(this.imgT4, 300, 490, null);
			g2.drawImage(this.imgT5, 490, 490, null);
			g2.drawImage(this.imgT6, 680, 490, null);
			g2.drawImage(this.imgT7, 300, 680, null);
			g2.drawImage(this.imgT8, 490, 680, null);
			g2.drawImage(this.imgT9, 680, 680, null);

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

			g2.drawImage(tabShuffleAlibi[0].getImgAlibi(), 0, 0, null);

			// g2.drawImage(this.imgSherlock, 0, 0, null);
		}
	}


}
