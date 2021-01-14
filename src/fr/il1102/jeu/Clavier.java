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
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
