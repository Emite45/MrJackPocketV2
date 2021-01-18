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
	public int xPosition;
	public int yPosition;

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
	
	public String getStr() {
		return str;
	}
	
	public int getxPosition() {
		return xPosition;
	}
	
	public int getyPosition() {
		return yPosition;
	}
	
	//Setters
	
	public void setxPosition(int xPosition) {
		this.xPosition = xPosition;
	}

	public void setyPosition(int yPosition) {
		this.yPosition = yPosition;
	}

	
	// Methodes
	
	public void Mouvement(int xDetec1, int yDetec1, int xDetec2, int yDetec2, int xDetec3, int yDetec3, int xDetec4, int yDetec4, int xDetec5, int yDetec5) {
		if(xPosition == xDetec1) {														//Analyse la position des détectives
			if (yPosition == yDetec2) {xPosition =xDetec2; yPosition =yDetec1;}		//Modifie la position du detective à la position suivante
			else if (yPosition == yDetec3) { yPosition =yDetec2;}
			else { yPosition= yDetec3;}
		}
		else if(yPosition == yDetec1) {
			if (xPosition == xDetec2) {xPosition =xDetec3;}
			else if (xPosition == xDetec3) { xPosition =xDetec4;}
			else { xPosition= xDetec5; yPosition= yDetec2;}
		}
		else if(xPosition == xDetec5) {
			if (yPosition == yDetec2) {yPosition= yDetec3;}
			else if (yPosition == yDetec3) { yPosition =yDetec4;}
			else { xPosition =xDetec4; yPosition =yDetec5;}
		}
		else if(yPosition == yDetec5) {
			if (xPosition == xDetec4) {xPosition =xDetec3;}
			else if (xPosition == xDetec3) { xPosition =xDetec2;}
			else { xPosition= xDetec1; yPosition= yDetec4;}
		}
	}
}
