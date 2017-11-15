package jeu;

import javax.swing.JFrame;

public class Afficher {
	
	public static TableJeu table;//table sera accessible de partout

	public static void main(String[] args) {
		JFrame f = new JFrame ("Jeu de la Roulette");
		f.setSize (1500, 900);
		f.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null);//la fen�tre s'affiche au centre de la page
		f.setResizable(false);//on peut pas modifier la taille de la fen�tre
		f.setAlwaysOnTop(true);//au dessu des autres fen�tre

		//instancier l'objet table(les espaces m�moire)
		table = new TableJeu();
		
		f.setContentPane(table);//associer la table � la fen�tre
		f.setVisible(true);
		
	}

}
