package fr.il1102.jeu;


import javax.swing.JFrame;




public class Main {
	
	public static Scene scene;  //permet d'acceder à cet objet de partout 
	
	public static void main(String[] args) {
		
		
	// Création de la fenetre de l'app
		
		JFrame fenetre = new JFrame("Mr Jack Pocket");
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setSize(1920, 1080); //taille de la fenetre, standard Full HD
		fenetre.setLocationRelativeTo(null); // Mettre la fenetre au milieu de l'ecran
		fenetre.setResizable(false); // non redimensionnable
		fenetre.setAlwaysOnTop(true);
		
	// Instanciation de l'objet scene
		
		scene = new Scene();
		
		fenetre.setContentPane(scene); // On associe la scene a la fenetre de l'application
		fenetre.setVisible(true);


		
	}
}
