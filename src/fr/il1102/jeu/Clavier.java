package fr.il1102.jeu;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Clavier implements KeyListener{
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		if(e.getKeyCode() == KeyEvent.VK_ENTER && Main.scene.isEcranAccueil() == true && Main.scene.isEcranAlibi() == false) { //Permet de passer l'écran d'accueil
			Main.scene.setEcranAccueil(false);
			Main.scene.setEcranAlibi(true);
			Main.scene.repaint();
		}
		else if(Main.scene.idJack == false && Main.scene.ecranAlibi == true && e.getKeyCode() == KeyEvent.VK_ENTER) { //Permet de changer d'ecran en modifiant la variable ecranAlibi
			Main.scene.idJack = true;
			Main.scene.alibiJack(Main.scene.nAlibi);
			Main.scene.repaint();
		}
		else if(Main.scene.idJack == true && Main.scene.ecranAlibi == true && Main.scene.isEcranAccueil() == false  && e.getKeyCode() == KeyEvent.VK_SPACE) { //Permet de changer d'ecran en modifiant la variable ecranAlibi
			Main.scene.setEcranAlibi(false);
			Main.scene.idJack = false;
			Main.scene.repaint();
		}
//		else if(e.getKeyCode() == KeyEvent.VK_LEFT) { //Permet d'afficher mon deck de  carte alibi
//			Main.scene.nAlibi ++;
//			Main.scene.nAlibiFC --;
//			//Main.scene.alibiJack(Main.scene.nAlibi);
//			Main.scene.alibiInspecteur();
//			Main.scene.repaint();
//		}
		
		//Deplacement des detectives


		
		else if (e.getKeyCode() == KeyEvent.VK_N) {
			Main.scene.appelATemoin();
			Main.scene.repaint();
		}
		

		//retourner
		
//		else if((e.getKeyCode() == KeyEvent.VK_1 || e.getKeyCode() == KeyEvent.VK_2 || e.getKeyCode() == KeyEvent.VK_3 || e.getKeyCode() == KeyEvent.VK_4 || e.getKeyCode() == KeyEvent.VK_5|| e.getKeyCode() == KeyEvent.VK_6  || e.getKeyCode() == KeyEvent.VK_7 || e.getKeyCode() == KeyEvent.VK_8 || e.getKeyCode() == KeyEvent.VK_9)) {
//			Main.scene.tTurn = e.getKeyCode() - 49;
//			//Main.scene.retournerTuile(Main.scene.tTurn);
//			Main.scene.tabShuffleTuile[Main.scene.tTurn][0].retourner();
//			Main.scene.repaint();
//		}

		

		//JETON 1
		if ( Main.scene.JA1 == false && Main.scene.nJA1 == true && e.getKeyCode()== KeyEvent.VK_A) {
			Main.scene.JA1 = true;
			Main.scene.strCommande = "Appuyez sur Q pour quitter la sélection";
			Main.scene.repaint();

		}
		if(Main.scene.JA1 == true && Main.scene.nJA1 == true  &&  Main.scene.ecranAccueil == false && Main.scene.ecranAlibi == false && e.getKeyCode() == KeyEvent.VK_Q ) {
			Main.scene.JA1 = false;  //Permet de cancel le choix du jeton
			Main.scene.strCommande = " Choissisez un Jeton ";
			Main.scene.repaint();
}
		
			// JETON 1_1
		
					//Selec 1
				else if( Main.scene.JA1 == true  && Main.scene.nJA1 == true && Main.scene.tabShuffleJA[0][0] == Main.scene.jA1_1  && Main.scene.isChangeSelect() == false &&  Main.scene.ecranAccueil == false && Main.scene.ecranAlibi == false && (e.getKeyCode() == KeyEvent.VK_1 || e.getKeyCode() == KeyEvent.VK_2 || e.getKeyCode() == KeyEvent.VK_3 || e.getKeyCode() == KeyEvent.VK_4 || e.getKeyCode() == KeyEvent.VK_5|| e.getKeyCode() == KeyEvent.VK_6  || e.getKeyCode() == KeyEvent.VK_7 || e.getKeyCode() == KeyEvent.VK_8 || e.getKeyCode() == KeyEvent.VK_9)){
					Main.scene.settChange1(e.getKeyCode() - 49); //car c'est le numéro ascii
					Main.scene.settChange( Main.scene.tChange1);
					Main.scene.setSelect(true);
				}
					//Selec 2
				else if(Main.scene.JA1 == true && Main.scene.nJA1 == true && Main.scene.isChangeSelect() == true && (e.getKeyCode() == KeyEvent.VK_1 || e.getKeyCode() == KeyEvent.VK_2 || e.getKeyCode() == KeyEvent.VK_3 || e.getKeyCode() == KeyEvent.VK_4 || e.getKeyCode() == KeyEvent.VK_5|| e.getKeyCode() == KeyEvent.VK_6  || e.getKeyCode() == KeyEvent.VK_7 || e.getKeyCode() == KeyEvent.VK_8 || e.getKeyCode() == KeyEvent.VK_9)){
					Main.scene.settChange2(e.getKeyCode() - 49);
					Main.scene.echangerTuile(Main.scene.tChange1, Main.scene.tChange2);
					Main.scene.repaint();
					Main.scene.setSelect(false);
					Main.scene.JA1 = false;
					Main.scene.nJA1 = false;
					Main.scene.actionTour();
					Main.scene.strCommande = " Choissisez un Jeton ";
					Main.scene.repaint();
				}
		
		
		
			//JETON 1_2
				else if( Main.scene.tabShuffleJA[0][0] == Main.scene.jA1_2 && Main.scene.JA1 == true && Main.scene.nJA1 == true && Main.scene.ecranAccueil == false && Main.scene.ecranAlibi == false && (e.getKeyCode() == KeyEvent.VK_1 || e.getKeyCode() == KeyEvent.VK_2 || e.getKeyCode() == KeyEvent.VK_3 || e.getKeyCode() == KeyEvent.VK_4 || e.getKeyCode() == KeyEvent.VK_5|| e.getKeyCode() == KeyEvent.VK_6  || e.getKeyCode() == KeyEvent.VK_7 || e.getKeyCode() == KeyEvent.VK_8 || e.getKeyCode() == KeyEvent.VK_9)){
					Main.scene.settRotat(e.getKeyCode() - 49);
					Main.scene.rotateTuile(Main.scene.gettRotat());
					Main.scene.repaint();
					Main.scene.JA1 = true;
					Main.scene.nJA1 = false;
					Main.scene.actionTour();
					Main.scene.strCommande = " Choissisez un Jeton ";

					Main.scene.repaint();
			}
		
		//JETON 2
		if (Main.scene.nJA2 == true && e.getKeyCode()== KeyEvent.VK_Z) {
			Main.scene.JA2 = true;
		}
			
			//JETON 2_1
		
				else if( Main.scene.tabShuffleJA[1][0] == Main.scene.jA2_1 && Main.scene.JA2 == true && Main.scene.nJA2 == true && Main.scene.ecranAccueil == false && Main.scene.ecranAlibi == false && (e.getKeyCode() == KeyEvent.VK_1 || e.getKeyCode() == KeyEvent.VK_2)) {
					Main.scene.nbr_depla = (e.getKeyCode() - 48);
					if (Main.scene.nbr_depla == 1) {
						Main.scene.Tobi.Mouvement(Main.scene.Sherlock, Main.scene.Watson);
						Main.scene.repaint();
					}
					if (Main.scene.nbr_depla == 2) {
						Main.scene.Tobi.Mouvement(Main.scene.Sherlock, Main.scene.Watson);
						Main.scene.Tobi.Mouvement(Main.scene.Sherlock, Main.scene.Watson);
						Main.scene.repaint();
					}
					Main.scene.JA2 = false;
					Main.scene.nJA2 = false;
					Main.scene.actionTour();
					Main.scene.repaint();
				}
			//JETON 2_2
				else if( Main.scene.tabShuffleJA[1][0] == Main.scene.jA2_2 && Main.scene.JA2 == true && Main.scene.nJA2 == true && Main.scene.ecranAccueil == false && Main.scene.ecranAlibi == false && (e.getKeyCode() == KeyEvent.VK_1 || e.getKeyCode() == KeyEvent.VK_2)) {
					Main.scene.nbr_depla = (e.getKeyCode() - 48);
					if (Main.scene.nbr_depla == 1) {
						Main.scene.Watson.Mouvement(Main.scene.Sherlock, Main.scene.Tobi);
						Main.scene.repaint();
					}
					if (Main.scene.nbr_depla == 2) {
						Main.scene.Watson.Mouvement(Main.scene.Sherlock, Main.scene.Tobi);
						Main.scene.Watson.Mouvement(Main.scene.Sherlock, Main.scene.Tobi);
						Main.scene.repaint();
					}
					Main.scene.JA2 = false;
					Main.scene.nJA2 = false;
					Main.scene.actionTour();
					Main.scene.repaint();
				}
		
		//JETON 3
		if ( Main.scene.JA3 == false && Main.scene.nJA3 == true && e.getKeyCode()== KeyEvent.VK_E) {
			Main.scene.JA3 = true;
			Main.scene.strCommande = "Appuyez sur ENTRER si c'est une jeton Alibi ou si c'est Sherlock appuyez sur 1 ou 2 selon le nombre de deplacement voulu ";
			Main.scene.repaint();
		}
		
			// JETON 3_1
		
				else if( Main.scene.tabShuffleJA[2][0] == Main.scene.jA3_1 && Main.scene.JA3 == true && Main.scene.nJA3 == true && Main.scene.ecranAccueil == false && Main.scene.ecranAlibi == false && (e.getKeyCode() == KeyEvent.VK_1 || e.getKeyCode() == KeyEvent.VK_2)) {
					Main.scene.nbr_depla = (e.getKeyCode() - 48);
					if (Main.scene.nbr_depla == 1) {
						Main.scene.Sherlock.Mouvement(Main.scene.Watson, Main.scene.Tobi);
						Main.scene.repaint();
					}
					if (Main.scene.nbr_depla == 2) {
						Main.scene.Sherlock.Mouvement(Main.scene.Watson, Main.scene.Tobi);
						Main.scene.Sherlock.Mouvement(Main.scene.Watson, Main.scene.Tobi);
						Main.scene.repaint();
					}
					Main.scene.JA3 = false;
					Main.scene.nJA3 = false;
					Main.scene.actionTour();
					Main.scene.repaint();
					}
	
			// JETON 3_2
				else if( Main.scene.tabShuffleJA[2][0] == Main.scene.jA3_2 && Main.scene.JA3 == true && Main.scene.nJA3 == true && Main.scene.ecranAccueil == false && Main.scene.ecranAlibi == false && e.getKeyCode() == KeyEvent.VK_ENTER ) {
					Main.scene.idJack = true;

					if (Main.scene.joueur == 'D') {
						Main.scene.nAlibi ++;
						Main.scene.nAlibiFC --;
						Main.scene.alibiInspecteur();
						Main.scene.repaint();
						
					}
					else if (Main.scene.joueur == 'J') {
						Main.scene.nAlibi ++;
						Main.scene.nAlibiFC --;
						
						Main.scene.alibiJack(Main.scene.nAlibi);
						Main.scene.repaint();
						
					}
					Main.scene.JA3 = false;
					Main.scene.nJA3 = false;
					Main.scene.actionTour();
					Main.scene.strCommande = "Appuyez sur entrée une seconde fois pour faire disparaitre la carte";
					Main.scene.repaint();
				}
				else if( Main.scene.JA3 == false && Main.scene.nJA3 == false && Main.scene.ecranAccueil == false && Main.scene.ecranAlibi == false && e.getKeyCode() == KeyEvent.VK_ENTER ) {
					Main.scene.idJack = false;
					Main.scene.strCommande = "";
					
					Main.scene.repaint();
				}
		
		//JETON 4
		if ( Main.scene.JA4 == false && Main.scene.nJA4 == true && e.getKeyCode()== KeyEvent.VK_R) {
			Main.scene.JA4 = true;
		}	
		
				//JETON 4_1
			else if(Main.scene.tabShuffleJA[3][0] == Main.scene.jA4_1 && Main.scene.JA4 == true && Main.scene.nJA4 == true && Main.scene.ecranAccueil == false && Main.scene.ecranAlibi == false && (e.getKeyCode() == KeyEvent.VK_1 || e.getKeyCode() == KeyEvent.VK_2 || e.getKeyCode() == KeyEvent.VK_3)) {
				Main.scene.nbr_depla = (e.getKeyCode() - 48);
				if(Main.scene.nbr_depla == 1) {
					Main.scene.Sherlock.Mouvement(Main.scene.Watson, Main.scene.Tobi);
					Main.scene.repaint();
				}
				if(Main.scene.nbr_depla == 2) {
					Main.scene.Watson.Mouvement(Main.scene.Sherlock, Main.scene.Tobi);
					Main.scene.repaint();
				}
				if(Main.scene.nbr_depla == 3) {
					Main.scene.Tobi.Mouvement(Main.scene.Watson, Main.scene.Sherlock);
					Main.scene.repaint();
				}
				Main.scene.JA4 = true;
				Main.scene.nJA4 = false;
				Main.scene.actionTour();
				Main.scene.repaint();
			}
		
				//JETON 4_2
			else if(Main.scene.tabShuffleJA[3][0] == Main.scene.jA4_2 && Main.scene.JA4 == true && Main.scene.nJA4 == true && Main.scene.ecranAccueil == false && Main.scene.ecranAlibi == false && (e.getKeyCode() == KeyEvent.VK_1 || e.getKeyCode() == KeyEvent.VK_2 || e.getKeyCode() == KeyEvent.VK_3 || e.getKeyCode() == KeyEvent.VK_4 || e.getKeyCode() == KeyEvent.VK_5|| e.getKeyCode() == KeyEvent.VK_6  || e.getKeyCode() == KeyEvent.VK_7 || e.getKeyCode() == KeyEvent.VK_8 || e.getKeyCode() == KeyEvent.VK_9)) {
				Main.scene.settRotat(e.getKeyCode() - 49);
				Main.scene.rotateTuile(Main.scene.gettRotat());
				Main.scene.repaint();
				Main.scene.JA4 = true;
				Main.scene.nJA4 = false;
				Main.scene.actionTour();
				Main.scene.repaint();
			}

		
		}
	

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
