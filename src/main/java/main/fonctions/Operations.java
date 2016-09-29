package main.fonctions;

import main.structures.Matrice;

public class Operations {

	public Matrice addition(Matrice a, Matrice b) {
		return null;
	}

	public Matrice soustraction(Matrice a, Matrice b) {
		return null;
	}

	public Matrice multiplication(double d, Matrice a) {
		return null;
	}

	public Matrice multiplication(Matrice a, Matrice b) {
		return null;
	}

	private double determinant(double[][] a, int n) {
		double det = 0;
		int sign = 1, p = 0, q = 0;

		if (n == 1) {
			det = a[0][0];
		} else {
			double b[][] = new double[n - 1][n - 1];
			for (int x = 0; x < n; x++) {
				p = 0;
				q = 0;
				for (int i = 1; i < n; i++) {
					for (int j = 0; j < n; j++) {
						if (j != x) {
							b[p][q++] = a[i][j];
							if (q % (n - 1) == 0) {
								p++;
								q = 0;
							}
						}
					}
				}
				det = det + a[0][x] * determinant(b, n - 1) * sign;
				sign = -sign;
			}
		}
		return det;
	}

	public double determinant(Matrice m, int n) {
		if (m.getLignes() != m.getLignes())
			return 0;
		return determinant(m.getMatrice(), m.getLignes());
	}
}
