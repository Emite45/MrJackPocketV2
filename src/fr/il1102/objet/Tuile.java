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
	@SuppressWarnings("unused")
	private int largeur;
	@SuppressWarnings("unused")
	private int hauteur;

	
	// Constructeurs

	
	public Tuile(String str) {
		this.largeur = 80;
		this.hauteur = 80;

		this.str = str;
		this.icoTuile = new ImageIcon(getClass().getResource(this.str));
		this.imgTuile = this.icoTuile.getImage();
	}
		
	// Getters and Setters
		
	
		public Image getImgTuile() {
			return imgTuile;
		}
		
		
	// Méthodes
		
		public static Tuile[][] tuileMelange(Tuile T1, Tuile T1_90, Tuile T1_180, Tuile T1_r90, Tuile T2, Tuile T2_90, Tuile T2_180, Tuile T2_r90, Tuile T3, Tuile T3_90, Tuile T3_180, Tuile T3_r90, Tuile T4, Tuile T4_90, Tuile T4_180, Tuile T4_r90, Tuile T5, Tuile T5_90, Tuile T5_180, Tuile T5_r90, Tuile T6, Tuile T6_90, Tuile T6_180, Tuile T6_r90, Tuile T7, Tuile T7_90, Tuile T7_180, Tuile T7_r90, Tuile T8, Tuile T8_90, Tuile T8_180, Tuile T8_r90,Tuile T9, Tuile T9_90, Tuile T9_180, Tuile T9_r90) {
			Tuile[][] tabTuile = {{T1, T1_90, T1_180,T1_r90},{T2, T2_90, T2_180,T2_r90},{T3, T3_90, T3_180,T3_r90},{T4, T4_90, T4_180,T4_r90},{T5, T5_90, T5_180,T5_r90},{T6, T6_90, T6_180,T6_r90},{T7, T7_90, T7_180,T7_r90},{T8, T8_90, T8_180,T8_r90},{T9, T9_90, T9_180,T9_r90}} ;
			List<Tuile []> listTuile = Arrays.asList(tabTuile);
			Collections.shuffle(listTuile);
			Tuile[][] tabShuffleTuile = new Tuile[9][4];
			
			for(int i = 0; i<9; i++) {

				if(i == 1 || i == 3 || i == 4 || i == 5 || i == 6 || i == 8) {
					Collections.shuffle(Arrays.asList(tabTuile[i]));
					tabShuffleTuile[i]= tabTuile[i];
				}
				else if (i == 0) {
					tabShuffleTuile[i][0] = tabTuile[i][3]; tabShuffleTuile[i][1] = tabTuile[i][0] ; tabShuffleTuile[i][2] = tabTuile[i][1]; tabShuffleTuile[i][3] = tabTuile[i][2];
				}
				else if (i == 2) {
					tabShuffleTuile[i][0] = tabTuile[i][1]; tabShuffleTuile[i][1] = tabTuile[i][2] ; tabShuffleTuile[i][2] = tabTuile[i][3]; tabShuffleTuile[i][3] = tabTuile[i][0];
				}
				if (i == 7) {
					tabShuffleTuile[i] = tabTuile[i]; 
				}
			}
			return tabShuffleTuile;
		}

}
