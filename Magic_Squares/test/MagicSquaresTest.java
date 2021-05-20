import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MagicSquaresTest {

    @Test
    public void testIsLegalMagicSquares() {
        int n1 = new Integer(MagicSquares.index("src//P1//1.txt"));
        double[][] m1 = new double[n1][n1];
        boolean a1 = MagicSquares.alter("src//P1//1.txt",m1);
        assertEquals(true,MagicSquares.isLegalMagicSquares("src//P1//1.txt",m1,n1));
        int n2 = new Integer(MagicSquares.index("src//P1//2.txt"));
        double[][] m2 = new double[n2][n2];
        boolean a2 = MagicSquares.alter("src//P1//2.txt",m2);
        assertEquals(true,MagicSquares.isLegalMagicSquares("src//P1//1.txt",m2,n2));
        int n4 = new Integer(MagicSquares.index("src//P1//4.txt"));
        double[][] m4 = new double[n4][n4];
        boolean a4= MagicSquares.alter("src//P1//4.txt",m4);
        assertEquals(false,MagicSquares.isLegalMagicSquares("src//P1//4.txt",m4,n4));
    }

    @Test
    public void testIndex() {
        assertEquals(9,MagicSquares.index("src//P1//1.txt"));
        assertEquals(8,MagicSquares.index("src//P1//2.txt"));
        assertEquals(21,MagicSquares.index("src//P1//3.txt"));
        assertEquals(7,MagicSquares.index("src//P1//4.txt"));
        assertEquals(121,MagicSquares.index("src//P1//5.txt"));
    }

    @Test
    public void testAlter() {
        int n1 = new Integer(MagicSquares.index("src//P1//1.txt"));
        double[][] m1 = new double[n1][n1];
        assertEquals(true,MagicSquares.alter("src//P1//1.txt",m1));
        int n2 = new Integer(MagicSquares.index("src//P1//2.txt"));
        double[][] m2 = new double[n2][n2];
        assertEquals(true,MagicSquares.alter("src//P1//2.txt",m1));
        int n3 = new Integer(MagicSquares.index("src//P1//3.txt"));
        double[][] m3 = new double[n3][n3];
        assertEquals(false,MagicSquares.alter("src//P1//3.txt",m1));
        int n4 = new Integer(MagicSquares.index("src//P1//4.txt"));
        double[][] m4 = new double[n4][n4];
        assertEquals(true,MagicSquares.alter("src//P1//4.txt",m1));
        int n5 = new Integer(MagicSquares.index("src//P1//5.txt"));
        double[][] m5 = new double[n5][n5];
        assertEquals(false,MagicSquares.alter("src//P1//5.txt",m1));
    }

    @Test
    public void testGenerateMagicSquare() {
        assertEquals(false,MagicSquares.generateMagicSquare(-1));
        assertEquals(false,MagicSquares.generateMagicSquare(0));
        assertEquals(true,MagicSquares.generateMagicSquare(3));
        assertEquals(false,MagicSquares.generateMagicSquare(6));
    }
}