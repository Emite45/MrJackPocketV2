package fr.il1102.objet;

import java.awt.Image;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


import javax.swing.ImageIcon;

public class Tuile {

	// Variables

	public ImageIcon icoTuile;
	public Image imgTuile;
	private String str;
	public String name;
	public boolean visible = false;
	public int ligneGrille;
	public int colonneGrille;
	
	// Constructeurs

	
	public Tuile(String str, String name) {

		this.name = name;
		this.str = str;
		this.icoTuile = new ImageIcon(getClass().getResource(this.str));
		this.imgTuile = this.icoTuile.getImage();
	}
		
	// Getters and Setters
		
	
		public Image getImgTuile() {
			return imgTuile;
		}
		
		public String getName() {
			return name;
		}
		
		public boolean getVisible() {
			return visible;
		}
		
		public int getColonneGrille() {
			return colonneGrille;
		}
		
		public int getLigneGrille() {
			return ligneGrille;
		}
		
		public void setLigneGrille(int ligneGrille) {
			this.ligneGrille = ligneGrille;
		}

		public void setColonneGrille(int colonneGrille) {
			this.colonneGrille = colonneGrille;
		}
		public void setVisible(boolean visibilite) {
			this.visible = visibilite;
		}
	
		
		
	// M�thodes

		public static Tuile[][] tuileMelange(Tuile T1, Tuile T1_90, Tuile T1_180, Tuile T1_r90, Tuile T2, Tuile T2_90, Tuile T2_180, Tuile T2_r90, Tuile T3, Tuile T3_90, Tuile T3_180, Tuile T3_r90, Tuile T4, Tuile T4_90, Tuile T4_180, Tuile T4_r90, Tuile T5, Tuile T5_90, Tuile T5_180, Tuile T5_r90, Tuile T6, Tuile T6_90, Tuile T6_180, Tuile T6_r90, Tuile T7, Tuile T7_90, Tuile T7_180, Tuile T7_r90, Tuile T8, Tuile T8_90, Tuile T8_180, Tuile T8_r90,Tuile T9, Tuile T9_90, Tuile T9_180, Tuile T9_r90) {
			Tuile[][] tabTuile = {{T1, T1_90, T1_180,T1_r90},{T2, T2_90, T2_180,T2_r90},{T3, T3_90, T3_180,T3_r90},{T4, T4_90, T4_180,T4_r90},{T5, T5_90, T5_180,T5_r90},{T6, T6_90, T6_180,T6_r90},{T7, T7_90, T7_180,T7_r90},{T8, T8_90, T8_180,T8_r90},{T9, T9_90, T9_180,T9_r90}} ; //Tableau qui comprend toute nos tuiles
			List<Tuile []> listTuile = Arrays.asList(tabTuile); // transforme le tableau en arrayList
			Collections.shuffle(listTuile); // melange les grandes cases de la liste
			
			Tuile[][] tabShuffleTuile = new Tuile[9][4]; // creation d'un nouveau tableau
			
			for(int i = 0; i<9; i++) { //Il faut mélanger à l'intérieur de chaque sous liste

				if(i == 1 || i == 3 || i == 4 || i == 5 || i == 6 || i == 8) { //Toute les listes qui ne necessitent pas de tuiles sp�ciales au demarrage
					Collections.shuffle(Arrays.asList(tabTuile[i]));
					tabShuffleTuile[i]= tabTuile[i]; // on associe un deuxi�me tableau identique qui va permettre de modifier les 3 tuiles sp�ciales
				}
				else if (i == 0) { // pour la tuile en haut � gauche il faut une tuile � -90�
					tabShuffleTuile[i][0] = tabTuile[i][3]; tabShuffleTuile[i][1] = tabTuile[i][0] ; tabShuffleTuile[i][2] = tabTuile[i][1]; tabShuffleTuile[i][3] = tabTuile[i][2];
				}
				else if (i == 2) { // pour la tuile en haut � droite il faut une tuile � 90�
					tabShuffleTuile[i][0] = tabTuile[i][1]; tabShuffleTuile[i][1] = tabTuile[i][2] ; tabShuffleTuile[i][2] = tabTuile[i][3]; tabShuffleTuile[i][3] = tabTuile[i][0];
				}
				if (i == 7) { // pour la tuile en haut � gauche il faut une tuile � 0�
					tabShuffleTuile[i] = tabTuile[i]; 
				}
			}
			return tabShuffleTuile; //retourne le tableau m�lang�
		}

		public void retourner() {								//Retourne la tuile en fonction de son orientation
			
			if (this.str == "/images/tuile_de_rue_face_suspect1.png" || this.str == "/images/tuile_de_rue_face_suspect2.png" || this.str == "/images/tuile_de_rue_face_suspect3.png" || this.str == "/images/tuile_de_rue_face_suspect4.png" || this.str == "/images/tuile_de_rue_face_suspect5.png" || this.str == "/images/tuile_de_rue_face_suspect6.png" || this.str == "/images/tuile_de_rue_face_suspect7.png" || this.str == "/images/tuile_de_rue_face_suspect8.png") {
				
				this.icoTuile = new ImageIcon(getClass().getResource("/images/common-verso.png"));
				this.imgTuile = this.icoTuile.getImage();
				this.name = "retournee_0";
				
			}
				
			else if (this.str == "/images/tuile_de_rue_face_suspect1_90.png" || this.str == "/images/tuile_de_rue_face_suspect2_90.png" || this.str == "/images/tuile_de_rue_face_suspect3_90.png" || this.str == "/images/tuile_de_rue_face_suspect4_90.png" || this.str == "/images/tuile_de_rue_face_suspect5_90.png" || this.str == "/images/tuile_de_rue_face_suspect6_90.png" || this.str == "/images/tuile_de_rue_face_suspect7_90.png" || this.str == "/images/tuile_de_rue_face_suspect8_90.png") {
				
				this.icoTuile = new ImageIcon(getClass().getResource("/images/common-verso_90.png"));
				this.imgTuile = this.icoTuile.getImage();
				this.name = "retournee_90";
				
			}
				
			else if (this.str == "/images/tuile_de_rue_face_suspect1_180.png" || this.str == "/images/tuile_de_rue_face_suspect2_180.png" || this.str == "/images/tuile_de_rue_face_suspect3_180.png" || this.str == "/images/tuile_de_rue_face_suspect4_180.png" || this.str == "/images/tuile_de_rue_face_suspect5_180.png" || this.str == "/images/tuile_de_rue_face_suspect6_180.png" || this.str == "/images/tuile_de_rue_face_suspect7_180.png" || this.str == "/images/tuile_de_rue_face_suspect8_180.png") {
				
				this.icoTuile = new ImageIcon(getClass().getResource("/images/common-verso_180.png"));
				this.imgTuile = this.icoTuile.getImage();
				this.name = "retournee_180";
				
			}
				
			else if (this.str == "/images/tuile_de_rue_face_suspect1_-90-.png" || this.str == "/images/tuile_de_rue_face_suspect2_-90.png" || this.str == "/images/tuile_de_rue_face_suspect3_-90.png" || this.str == "/images/tuile_de_rue_face_suspect4_-90.png" || this.str == "/images/tuile_de_rue_face_suspect5_-90.png" || this.str == "/images/tuile_de_rue_face_suspect6_m90.png" || this.str == "/images/tuile_de_rue_face_suspect7_-90.png" || this.str == "/images/tuile_de_rue_face_suspect8_-90.png") {
				
				this.icoTuile = new ImageIcon(getClass().getResource("/images/common-verso_-90.png"));
				this.imgTuile = this.icoTuile.getImage();
				this.name = "retournee_-90";
				
			}
			
			else if(this.str == "/images/tuile_de_rue_face_suspect9.png" || this.str == "/images/tuile_de_rue_face_suspect9_90.png" || this.str == "/images/tuile_de_rue_face_suspect9_180.png" || this.str == "/images/tuile_de_rue_face_suspect9_m90.png") {
				
				this.icoTuile = new ImageIcon(getClass().getResource("/images/JosephLane-verso.png"));
				this.imgTuile = this.icoTuile.getImage();
				this.name = "retournee_x";
			
			}
			
		}



}
