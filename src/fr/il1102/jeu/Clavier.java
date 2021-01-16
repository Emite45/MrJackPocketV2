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
			Main.scene.repaint();
		}
		else if(e.getKeyCode() == KeyEvent.VK_SPACE) { //Permet de changer d'ecran en modifiant la variable ecranAlibi
			Main.scene.setEcranAlibi(false);
			Main.scene.repaint();
		}
		else if(e.getKeyCode() == KeyEvent.VK_LEFT) { //Permet d'afficher mon deck de  carte alibi
			Main.scene.nAlibi ++;
			Main.scene.nAlibiFC --;
			Main.scene.repaint();
		}
		
		//Deplacement des detectives

		else if(e.getKeyCode() == KeyEvent.VK_S) { 		//Sherlock
			Main.scene.posSherlock();
			Main.scene.repaint();
		}
		else if(e.getKeyCode() == KeyEvent.VK_W) { 		//Watson
			Main.scene.posWatson();
			Main.scene.repaint();
		}
		else if(e.getKeyCode() == KeyEvent.VK_T) { 		//Tobi
			Main.scene.posTobi();
			Main.scene.repaint();
		}
		
		
		//Echanger
		
		else if(e.getKeyCode() == KeyEvent.VK_E) { //temporaire
			Main.scene.JTchange = true;
		}
		else if(e.getKeyCode() == KeyEvent.VK_R) { //temporaire
			Main.scene.JTrot = true;
		}
		
			//Selection 1
		else if(Main.scene.JTchange == true && Main.scene.isChangeSelect() == false && (e.getKeyCode() == KeyEvent.VK_1 || e.getKeyCode() == KeyEvent.VK_2 || e.getKeyCode() == KeyEvent.VK_3 || e.getKeyCode() == KeyEvent.VK_4 || e.getKeyCode() == KeyEvent.VK_5|| e.getKeyCode() == KeyEvent.VK_6  || e.getKeyCode() == KeyEvent.VK_7 || e.getKeyCode() == KeyEvent.VK_8 || e.getKeyCode() == KeyEvent.VK_9)) { 
			Main.scene.settChange1(e.getKeyCode() - 49); //car c'est le numéro ascii
			Main.scene.settChange( Main.scene.tChange1);
			Main.scene.setSelect(true);
		}
			//Selection2
		else if ( Main.scene.isChangeSelect() == true && (e.getKeyCode() == KeyEvent.VK_1 || e.getKeyCode() == KeyEvent.VK_2 || e.getKeyCode() == KeyEvent.VK_3 || e.getKeyCode() == KeyEvent.VK_4 || e.getKeyCode() == KeyEvent.VK_5 || e.getKeyCode() == KeyEvent.VK_6 || e.getKeyCode() == KeyEvent.VK_7 || e.getKeyCode() == KeyEvent.VK_8 || e.getKeyCode() == KeyEvent.VK_9)) {
				Main.scene.settChange2(e.getKeyCode() - 49);
				Main.scene.echangerTuile(Main.scene.tChange1, Main.scene.tChange2);
				Main.scene.repaint();
				Main.scene.setSelect(false);
				Main.scene.JTchange = false;
			}
		
		else if(Main.scene.JTrot == true && Main.scene.ecranAccueil == false && Main.scene.ecranAlibi == false && (e.getKeyCode() == KeyEvent.VK_1 || e.getKeyCode() == KeyEvent.VK_2 || e.getKeyCode() == KeyEvent.VK_3 || e.getKeyCode() == KeyEvent.VK_4 || e.getKeyCode() == KeyEvent.VK_5|| e.getKeyCode() == KeyEvent.VK_6  || e.getKeyCode() == KeyEvent.VK_7 || e.getKeyCode() == KeyEvent.VK_8 || e.getKeyCode() == KeyEvent.VK_9)){
				Main.scene.settRotat(e.getKeyCode() - 49);
				Main.scene.rotateTuile(Main.scene.gettRotat());
				Main.scene.repaint();
				Main.scene.JTrot = false;
		}
		
		}
	

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
