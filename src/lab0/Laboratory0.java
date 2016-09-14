package lab0;

public class Laboratory0 {

    //Begin3*. You have two sides of rectangle a and  b. Find it's Square (S = a * b) and Perimeter (P = 2 * ( a + b).
    public int[] inputOutputTask(int a, int b) {
        assert a > 0;
        assert b > 0;

            int[] result = new int[2];

            result[0] = a * b;
            result[1] = 2 * (a + b);
            return result;
        }



    int bytesInKilobyte = 1024;
    //Integer3*. You have size of file in bytes. Using mod operation, find out size of this file in kilobytes.
    //(1 kilobyte = 1024 bytes).
    public int integerNumbersTask(int k) {
        assert k > 0;
        return k / bytesInKilobyte;
    }

    //Boolean3. You have integer number A. Find out if assertion:" A is odd." is true.
    public boolean booleanTask(int k) {
        return (k % 2 == 0);
    }

    //If3. You have integer number.If it's positive - add 1 to it, if else it's negative - sub 2;
    // if it's equal to zero - change it by 10.
    // Display it.
    public int ifTask(int number) {
        if (number > 0) {
            number += 1;
        } else if (number < 0) {
            number -= 2;
        } else {
            number = 10;
        }
        return number;
    }

    //Case3. You have number of a month.
    // Display season ny month.
    public Season switchTask(int month) {
        assert month > 0;
        assert month < 12;

        month %= 12;
        month /= 3;

        Season result;
        switch (month) {
            case 0:
                result = Season.WINTER;
                break;

            case 1:
                result = Season.SPRING;
                break;

            case 2:
                result = Season.SUMMER;
                break;

            case 3:
                result = Season.AUTUMN;
                break;

            default:
                result = Season.WINTER;
                break;
        }
        return result;
    }

    //For23. You have float number X, and integer N ( > 0).
    // Get value of expression:
    // X – X3/(3!) + X5/(5!) – … + (–1)N·X2·N+1/((2·N+1)!)
    //(N! = 1·2·…·N).
    // This value is closed to value of Sin function in X.

    public double forTask(double x, int n) {
        assert n > 0;
        byte sign = 1, j = 1;
        double s = 0, powered_x = x;
        long fact = 1;
        for (int i = 0; i < n; ++i) {
            s += sign * powered_x / fact;

            powered_x *= x * x;
            fact *= ++j * ++j;
            sign *= -1;
        }
        return s;
    }

    //While3. You have two integer numbers N and K. Using only operations of adding and subtraction
    //find mod and div N and K.
    public int[] whileTask(int n, int k) {
        if (n < 0 || k <= 0) {
            throw new AssertionError();
        }
        int i = 0;
        while (n >= k) {
            i++;
            n -= k;
        }
        return new int[]{i, n};
    }

    //Array20. You have array size N< and integer numbers K and L ( 1 < K < L < N).
    //Get sum of elements in array from K to L.
    public double arrayTask(double[] array, int k, int l) {
        assert k >= 0;
        assert l >= 0;
        assert l < array.length;
        assert k < l;

        double S = 0;
        for (int i = k; i <= l; ++i) {
            S += array[i];
        }
        return S;
    }

    //Matrix49. You have matrix size of M * N.
    //Change it by swap min and max element in each row.
    public int[][] twoDimensionArrayTask(int[][] array) {
        for (int i = 0; i < array.length; ++i) {
            int max = 0;
            int min = 0;
            for (int j = 1; j < array[i].length; ++j) {
                if (array[i][j] > array[i][max]) {
                    max = j;
                }
                if (array[i][j] < array[i][min]) {
                    min = j;
                }
            }
            int tmp = array[i][max];
            array[i][max] = array[i][min];
            array[i][min] = tmp;
        }
        return array;
    }

    public static void main(String[] args) {

    }
}
