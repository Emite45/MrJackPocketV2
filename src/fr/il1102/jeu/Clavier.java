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
		if(e.getKeyCode() == KeyEvent.VK_SPACE) { //Permet de changer d'ecran en modifiant la variable ecranAlibi
			Main.scene.setEcranAlibi(false);
			Main.scene.repaint();
		}
		else if(e.getKeyCode() == KeyEvent.VK_LEFT) { //Permet d'afficher mon deck de  carte alibi
			Main.scene.nAlibi ++;
			Main.scene.nAlibiFC --;
			Main.scene.repaint();
		}
		else if(e.getKeyCode() == KeyEvent.VK_S) { 
			Main.scene.posSherlock();
			Main.scene.repaint();
		}
		else if(e.getKeyCode() == KeyEvent.VK_W) { 
			Main.scene.posWatson();
			Main.scene.repaint();
		}
		else if(e.getKeyCode() == KeyEvent.VK_T) { 
			Main.scene.posTobi();
			Main.scene.repaint();
		}
		else if( Main.scene.isSelect() == false && (e.getKeyCode() == KeyEvent.VK_1 || e.getKeyCode() == KeyEvent.VK_2 || e.getKeyCode() == KeyEvent.VK_3 || e.getKeyCode() == KeyEvent.VK_4 || e.getKeyCode() == KeyEvent.VK_5 || e.getKeyCode() == KeyEvent.VK_7 || e.getKeyCode() == KeyEvent.VK_8 || e.getKeyCode() == KeyEvent.VK_9)) { 
			Main.scene.settChange1(e.getKeyCode() - 49); //car c'est le numéro ascii
			Main.scene.settChange( Main.scene.tChange1);
			Main.scene.setSelect(true);
		}
		else if ( Main.scene.isSelect() == true && (e.getKeyCode() == KeyEvent.VK_1 || e.getKeyCode() == KeyEvent.VK_2 || e.getKeyCode() == KeyEvent.VK_3 || e.getKeyCode() == KeyEvent.VK_4 || e.getKeyCode() == KeyEvent.VK_5 || e.getKeyCode() == KeyEvent.VK_6 || e.getKeyCode() == KeyEvent.VK_7 || e.getKeyCode() == KeyEvent.VK_8 || e.getKeyCode() == KeyEvent.VK_9)) {
				Main.scene.settChange2(e.getKeyCode() - 49);
				Main.scene.echangerTuile(Main.scene.tChange1, Main.scene.tChange2);
				Main.scene.repaint();
				Main.scene.setSelect(false);
			}
		}
	

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
