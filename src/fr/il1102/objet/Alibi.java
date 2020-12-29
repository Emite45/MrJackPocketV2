package fr.il1102.objet;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.ImageIcon;

public class Alibi extends Objet {

	// Variables

	private ImageIcon icoAlibi;
	private Image imgAlibi;
	
	private final int PAUSE = 15;

	// Constructeur

	public Alibi(int hauteur, int largeur, String src) {
		super(hauteur, largeur);

		this.icoAlibi = new ImageIcon(getClass().getResource(src));
		this.imgAlibi = this.icoAlibi.getImage();

	}

	// Getters

	public Image getImgAlibi() {
		return imgAlibi;
	}
	
	// Methodes
	


	public Image alibi(String nom) {

		String str;
		ImageIcon ico;
		Image img;

		str = "/images/" + nom + "-alibi.png";
		ico = new ImageIcon(getClass().getResource(str));
		img = ico.getImage();
		return img;
	}


}
