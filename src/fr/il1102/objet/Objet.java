package fr.il1102.objet;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Objet {
	// Variables

	private int largeur, hauteur; // taille de l'image
	private int x, y; // position de la carte

	// Constructeur

	public Objet(int largeur, int hauteur) {


		this.largeur = largeur;
		this.hauteur = hauteur;

	}

	//Getters
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public int getLargeur() {
		return largeur;
	}

	public int getHauteur() {
		return hauteur;
	}
	
	//Setters
	
	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	//Methodes
	
	public Image alibi(String nom) {
		
		String str;
		ImageIcon ico;
		Image img;
		
		str="/images/" + nom + "-alibi.png";
		ico = new ImageIcon(getClass().getResource(str));
		img = ico.getImage();
		return img;
	}
}

