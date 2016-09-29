package main.test;

import org.junit.Assert;
import org.junit.Test;

import main.fonctions.Operations;
import main.structures.Matrice;

public class Tests {

	@Test
	public void testerAddition() {
		double[][] a = { { 1, 4, 3 }, { 7, 2, 0 } };
		double[][] b = { { 8, 0, 5 }, { 1, 6, 3 } };
		double[][] c = { { 9, 4, 8 }, { 8, 8, 3 } };

		Matrice A = new Matrice(a);
		Matrice B = new Matrice(b);
		Matrice C = new Matrice(c);

		Matrice X = Operations.addition(A, B);

		Assert.assertEquals(X, C);
	}

	@Test
	public void testerMultiplication() {
		double[][] a = { { 0, 1, 2 }, { 3, 4, 5 } };
		double[][] b = { { 0, 2, 4 }, { 6, 8, 10 } };

		Matrice A = new Matrice(a);
		Matrice B = new Matrice(b);

		Matrice X = Operations.multiplication(2, A);

		Assert.assertEquals(X, B);
	}
}
