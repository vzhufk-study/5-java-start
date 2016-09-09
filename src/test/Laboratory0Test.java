package test;

import lab0.Laboratory0;
import lab0.Season;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by zhufy on 07.09.2016.
 */
public class Laboratory0Test {
    double EPS = 0.00000001;

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Test(expectedExceptions = AssertionError.class)
    public void negativeInputTest() {
        new Laboratory0().inputOutputTask(-2, -5);
    }

    @Test(dataProvider = "inputProvider")
    public void testInputOutputTask(int q1, int q2, int[] a) throws Exception {
        assertEquals(new Laboratory0().inputOutputTask(q1, q2), a);
    }

    @DataProvider
    public Object[][] inputProvider() {
        return new Object[][]{{4, 4, new int[]{16, 16}}, {4, 10, new int[]{40, 28}}, {2, 5, new int[]{10, 14}}, {10, 10, new int[]{100, 40}}, {10, 1, new int[]{10, 22}}};
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Test(expectedExceptions = AssertionError.class)
    public void negativeIntegerTest() {
        new Laboratory0().integerNumbersTask(-5);
    }

    @Test(dataProvider = "integerProvider")
    public void testIntegerNumbersTask(int q, int a) throws Exception {
        assertEquals(new Laboratory0().integerNumbersTask(q), a);
    }

    @DataProvider
    public Object[][] integerProvider() {
        return new Object[][]{{1024, 1}, {1023, 0}, {2048, 2}, {4096, 4}, {1033, 1}, {1223, 1}};
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Test(dataProvider = "boolProvider")
    public void testBooleanTask(int q, boolean a) throws Exception {
        assertEquals(new Laboratory0().booleanTask(q), a);
    }

    @DataProvider
    public Object[][] boolProvider() {
        return new Object[][]{{2, true}, {13, false}, {322, true}, {22, true}, {3, false}};
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Test(dataProvider = "ifProvider")
    public void testIfTask(int q, int a) throws Exception {
        assertEquals(new Laboratory0().ifTask(q), a);
    }

    @DataProvider
    public Object[][] ifProvider() {
        return new Object[][]{{1, 2}, {0, 10}, {-8, -10}, {8, 9} , {-2, -4}};
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Test(expectedExceptions = AssertionError.class)
    public void negativeSwitchTest() {
        new Laboratory0().switchTask(24);
    }

    @Test(dataProvider = "switchProvider")
    public void testSwitchTask(int q, Season a) throws Exception {
        assertEquals(new Laboratory0().switchTask(q), a);
    }

    @DataProvider
    public Object[][] switchProvider() {
        return new Object[][]{{1, Season.WINTER}, {4, Season.SPRING}, {9, Season.AUTUMN}, {8, Season.SUMMER}, {7, Season.SUMMER}};
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Test(expectedExceptions = AssertionError.class)
    public void negativeForTest() {
        new Laboratory0().forTask(1, -5);
    }

    @Test(dataProvider = "forProvider")
    public void testForTask(double x, int n, double a) throws Exception {
        assertEquals(new Laboratory0().forTask(x, n), a, EPS);
    }

    @DataProvider
    public Object[][] forProvider() {
        return new Object[][]{{3, 10, Math.sin(3)}, {-2, 11, Math.sin(-2)}, {1, 13, Math.sin(1)}, {1.5, 13, Math.sin(1.5)}, {2, 13, Math.sin(2)}};
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Test(expectedExceptions = AssertionError.class)
    public void negativeWhileTest() {
        new Laboratory0().whileTask(-1, -5);
    }

    @Test(dataProvider = "whileProvider")
    public void testWhileTask(int q1, int q2, int[] a) throws Exception {
        assertEquals(new Laboratory0().whileTask(q1, q2), a);
    }

    @DataProvider
    public Object[][] whileProvider() {
        return new Object[][]{{5, 2, new int[]{2, 1}}, {10, 3, new int[]{3, 1}}, {18, 2, new int[]{9, 0}}, {15, 5, new int[]{3, 0}}, {18, 3, new int[]{6, 0}}};
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Test(expectedExceptions = AssertionError.class)
    public void negativeArrayTest() {
        new Laboratory0().arrayTask(new double[]{1, 2, 3}, 5, 2);
    }

    @Test(dataProvider = "arrayProvider")
    public void testArrayTask(double[] array, int k, int l, double a) throws Exception {
        assertEquals(new Laboratory0().arrayTask(array, k, l), a);
    }

    @DataProvider
    public Object[][] arrayProvider() {
        double[] array1 = {1, 2, 3, 4, 5, 6, 7};
        double[] array2 = {11, -22, 33, 46, 5, 6, 7};

        return new Object[][]{{array1, 0, 3, 10}, {array2, 1, 5, 68}, {array1, 5, 6, 13}, {array1, 1, 6, 27}, {array1, 2, 3, 7}, {array2, 2, 3, 79}};
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Test(dataProvider = "twoDimensionArrayProvider")
    public void testTwoDimensionArrayTask(int[][] array, int[][] a) throws Exception {
        assertEquals(new Laboratory0().twoDimensionArrayTask(array), a);
    }

    @DataProvider
    public Object[][] twoDimensionArrayProvider() {
        int[][] array = {{2, 3, 6, 9, -9},
                {34, 98, -9, 2, 1},
                {-4, 2, 1, 6, 1},
                {-98, 8, 1, 5, 3}};

        int[][] arrayAnswer = {{2, 3, 6, -9, 9},
                {34, -9, 98, 2, 1},
                {6, 2, 1, -4, 1},
                {8, -98, 1, 5, 3}};

        return new Object[][]{{array, arrayAnswer}};
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Test
    public void testMain() throws Exception {

    }

}