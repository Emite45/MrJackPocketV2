package fr.il1102.objet;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Detective {

	// Variables

	public ImageIcon icoDetec;
	public Image imgDetec;
	private String str;
	@SuppressWarnings("unused")
	private int largeur;
	@SuppressWarnings("unused")
	private int hauteur;
	


	// Constructeur
	

	public Detective( String str) {
		this.largeur = 80;
		this.hauteur = 80;
		
		this.str = str;
		
		this.icoDetec = new ImageIcon(getClass().getResource(this.str));
		this.imgDetec = this.icoDetec.getImage();



	}

	// Getters

	public Image getImgDetec() {
		return imgDetec;
	}
	
	
	//Setters
	

	public String getStr() {
		return str;
	}
	
	
	// Methodes
	


}
