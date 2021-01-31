package fr.il1102.objet;

import java.awt.Image;
import java.util.Arrays;
import java.util.Collections;
import javax.swing.ImageIcon;

public class JetonAction {
	// Variables

	public ImageIcon icoJA;
	public Image imgJA;
	private String str;


	// Constructeur
	

	public JetonAction( String str) {
		
		this.str = str;
		
		this.icoJA = new ImageIcon(getClass().getResource(this.str));
		this.imgJA = this.icoJA.getImage();



	}

	// Getters

	public Image getImgJA() {
		return imgJA;
	}
	
	
	//Setters
	

	public String getStr() {
		return str;
	}
	
	
	// Methodes
	
	
	public static JetonAction [][] jetonShuffle (JetonAction jA1_1, JetonAction jA1_2, JetonAction jA2_1, JetonAction jA2_2, JetonAction jA3_1, JetonAction jA3_2, JetonAction jA4_1, JetonAction jA4_2){
		JetonAction[][] tabJA = {{jA1_1, jA1_2}, {jA2_1, jA2_2}, {jA3_1, jA3_2}, {jA4_1, jA4_2}} ; //Tableau qui comprend tout nos jetons
		JetonAction [][] tabShuffleJA = new JetonAction[4][2]; // creation d'un nouveau tableau
		
		for (int i = 0; i<4; i++) {
			
			Collections.shuffle(Arrays.asList(tabJA[i]));
			tabShuffleJA[i]= tabJA[i]; 
		}
		return tabShuffleJA;
}
}

