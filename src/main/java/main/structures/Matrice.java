package main.structures;

import java.util.Arrays;

public class Matrice {
	private double[][] matrice;
	private int lignes;
	private int colonnes;

	public Matrice() {
		this.matrice = new double[1][1];
		this.matrice[0][0] = 0;
		this.lignes = 1;
		this.colonnes = 1;
	}

	public Matrice(double[][] matrice) {
		this.matrice = matrice;
		this.lignes = matrice.length;
		this.colonnes = matrice[0].length;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + colonnes;
		result = prime * result + lignes;
		result = prime * result + Arrays.deepHashCode(matrice);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Matrice other = (Matrice) obj;
		if (colonnes != other.colonnes)
			return false;
		if (lignes != other.lignes)
			return false;
		if (!Arrays.deepEquals(matrice, other.matrice))
			return false;
		return true;
	}

	public double[][] getMatrice() {
		return matrice;
	}

	public void setMatrice(double[][] matrice) {
		this.matrice = matrice;
	}

	public int getLignes() {
		return lignes;
	}

	public void setLignes(int lignes) {
		this.lignes = lignes;
	}

	public int getColonnes() {
		return colonnes;
	}

	public void setColonnes(int colonnes) {
		this.colonnes = colonnes;
	}

}
