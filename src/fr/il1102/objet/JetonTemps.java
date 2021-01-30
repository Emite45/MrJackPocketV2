package fr.il1102.objet;

import java.awt.Image;

import javax.swing.ImageIcon;

public class JetonTemps {
	// Variables

	public ImageIcon icoJT;
	public Image imgJT;
	private String str;
	


	// Constructeur
	

	public JetonTemps( String str) {
		
		this.str = str;
		
		this.icoJT = new ImageIcon(getClass().getResource(this.str));
		this.imgJT = this.icoJT.getImage();



	}

	// Getters

	public Image getImgJT() {
		return imgJT;
	}
	
	
	//Setters
	

	public String getStr() {
		return str;
	}
	
	// Methode
	
	public static JetonTemps[] tabTemps ( JetonTemps jT1, JetonTemps jT2, JetonTemps jT3, JetonTemps jT4, JetonTemps jT5, JetonTemps jT6, JetonTemps jT7, JetonTemps jT8) {
		JetonTemps[] tabJT =  {jT1, jT2, jT3, jT4, jT5, jT6, jT7, jT7};
		
		return tabJT;
	}

}
