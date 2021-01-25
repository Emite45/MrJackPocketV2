package fr.il1102.objet;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Detective {

	// Variables

	public String name;
	public ImageIcon icoDetec;
	public Image imgDetec;
	private String str;
	@SuppressWarnings("unused")
	private int largeur;
	@SuppressWarnings("unused")
	private int hauteur;
	public int xPosition;
	public int yPosition;
	
	public int ligneGrille;
	public int colonneGrille;
	
	//initialisation positions possibles detectives
	//Il existe en 12 positions possible pour les détectives ce qui fait 12 combinaisons en tout avec 5 différentes en x et 5 en y
	private int xDetec1 = 300 - 80 - 10; 	// position [1,y]
	private int xDetec2= 300 + 55;			// position [2,y]
	private int xDetec3 = 300 + 190 + 55;	// position [3,y]
	private int xDetec4 = 300 + 2* 190 + 55;// position [4,y]
	private int xDetec5 = 300 + 3* 190 + 10;// position [5,y]
	private int yDetec1 = 100 - 80 - 10;	// position [x,1]
	private int yDetec2 = 100 + 55;			// position [x,2]
	private int yDetec3 = 100 + 190 + 55;	// position [x,3]
	private int yDetec4 = 100 + 2* 190 + 55;// position [x,4]
	private int yDetec5 = 100 + 3* 190 + 10;// position [x,5]
	

	// Constructeur
	

	public Detective( String str, int xPositionDepart, int yPositionDepart, String name) {
		
		this.largeur = 80;
		this.hauteur = 80;
		this.name = name;
		this.str = str;
		
		this.icoDetec = new ImageIcon(getClass().getResource(this.str));
		this.imgDetec = this.icoDetec.getImage();
		this.xPosition = xPositionDepart;
		this.yPosition = yPositionDepart;

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
	public int getxDetec1() {
		return xDetec1;
	}
	
	public int getxDetec2() {
		return xDetec2;
	}

	public int getxDetec3() {
		return xDetec3;
	}
	
	public int getxDetec4() {
		return xDetec4;
	}

	public int getxDetec5() {
		return xDetec5;
	}
	
	public int getyDetec1() {
		return yDetec1;
	}

	public int getyDetec2() {
		return yDetec2;
	}
	public int getyDetec3() {
		return yDetec3;
	}
	
	public int getyDetec4() {
		return yDetec4;
	}

	public int getyDetec5() {
		return yDetec5;
	}
	
	public int getColonneGrille() {
		return colonneGrille;
	}
	
	public int getLigneGrille() {
		return ligneGrille;
	}
	
	public String getName() {
		return name;
	}
	
	//Setters
	
	public void setxPosition(int xPosition) {
		this.xPosition = xPosition;
	}

	public void setyPosition(int yPosition) {
		this.yPosition = yPosition;
	}
	
	public void setLigneGrille(int ligneGrille) {
		this.ligneGrille = ligneGrille;
	}

	public void setColonneGrille(int colonneGrille) {
		this.colonneGrille = colonneGrille;
	}

	
	// Methodes
	
	public void Mouvement() {
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
	
	public void updatePositionGrille () { //mets a jour les variables lignegrille et colonnegrille
		
		if (this.getyPosition() == yDetec1) {
			this.setLigneGrille(1);
		}
		
		else if (this.getyPosition() == yDetec1) {
			this.setLigneGrille(1);
		}
		
		else if (this.getyPosition() == yDetec2) {
			this.setLigneGrille(2);
		}
		else if (this.getyPosition() == yDetec3) {
			this.setLigneGrille(3);
		}
		else if (this.getyPosition() == yDetec4) {
			this.setLigneGrille(4);
		}
		else if (this.getyPosition() == yDetec5) {
			this.setLigneGrille(5);
		}
		
		if (this.getxPosition() == xDetec1) {
			this.setColonneGrille(1);
		}
		
		else if (this.getxPosition() == xDetec2) {
			this.setColonneGrille(2);
		}
		
		else if (this.getxPosition() == xDetec3) {
			this.setColonneGrille(3);
		}
		
		else if (this.getxPosition() == xDetec4) {
			this.setColonneGrille(4);
		}
		
		else if (this.getxPosition() == xDetec5) {
			this.setColonneGrille(5);
		}
	}


}
