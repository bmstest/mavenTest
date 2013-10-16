package foo;

import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.DecompositionSolver;
import org.apache.commons.math3.linear.LUDecomposition;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.apache.commons.math3.random.RandomData;
import org.apache.commons.math3.random.RandomDataImpl;



public class MathExamples {

    public static void main(String[] args){
	//Losowe dane
	Long value;
	RandomData randomData = new RandomDataImpl(); for (int i = 0; i < 10; i++) {
	    value = randomData.nextLong(1, 1000000);
	    System.out.println(value);
	}
	
	// Uklady rownan
	RealMatrix coefficients = new Array2DRowRealMatrix(new double[][] {
		{ 2, 3, -2 },
		{ -1, 7, 6 },
		{ 4, -3, -5 } }, false);
	
	DecompositionSolver solver= new LUDecomposition(coefficients).getSolver();
	//Rozwi�zanie
	RealVector constants = new ArrayRealVector(new double[] { 1, -2, 1 }, false);
	RealVector solution= solver.solve(constants);
	System.out.println("Solution: + " + solution);
    }
}
