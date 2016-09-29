package main.fonctions;

import main.structures.Matrice;

public class Operations {

	public static Matrice addition(Matrice a, Matrice b) {
		int lignes = a.getLignes();
		int colonnes = a.getColonnes();
		double[][] resultat = new double[lignes][colonnes];

		if (lignes == b.getLignes() && colonnes == b.getColonnes()) {
			for (int i = 0; i < lignes; i++) {
				for (int j = 0; j < colonnes; j++) {
					resultat[i][j] = a.getMatrice()[i][j] + b.getMatrice()[i][j];
				}
			}

			return new Matrice(resultat);
		} else {
			return null;
		}
	}

	public static Matrice multiplication(double d, Matrice a) {
		int lignes = a.getLignes();
		int colonnes = a.getColonnes();
		double[][] resultat = new double[lignes][colonnes];

		for (int i = 0; i < lignes; i++) {
			for (int j = 0; j < colonnes; j++) {
				resultat[i][j] = d * a.getMatrice()[i][j];
			}
		}

		return new Matrice(resultat);
	}

}
