package fr.il1102.objet;

import java.awt.Image;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.swing.ImageIcon;

public class Alibi {

	// Variables

	public ImageIcon icoAlibi;
	public Image imgAlibi;
	private String str;
	private int largeur;
	private int hauteur;
	


	// Constructeur
	


	public Alibi( String str) {
		this.largeur = 120;
		this.hauteur = 200;
		
		this.str = str;
		this.icoAlibi = new ImageIcon(getClass().getResource(this.str));
		this.imgAlibi = this.icoAlibi.getImage();



	}

	// Getters

	public Image getImgAlibi() {
		return imgAlibi;
	}
	
	
	//Setters
	

	public String getStr() {
		return str;
	}
	
	
	// Methodes
	


	public static Alibi [] shuffleAlibi( Alibi InspLestrade, Alibi JeremyBert, Alibi JohnPizer ,Alibi JohnSmith, Alibi JosephLane, Alibi Madame, Alibi MissStealthy, Alibi SgtGoodley,Alibi WilliamGull) {
		Alibi[] tabShuffleAlibi = { InspLestrade,JeremyBert,JohnPizer ,JohnSmith,JosephLane, Madame, MissStealthy, SgtGoodley, WilliamGull};
		List<Alibi> listAlibi = Arrays.asList(tabShuffleAlibi);
		Collections.shuffle(listAlibi);
		return tabShuffleAlibi;
	}



}
