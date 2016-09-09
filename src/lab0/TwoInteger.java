package lab0;

/**
 * Created by zhufy on 07.09.2016.
 */


public class TwoInteger{
    int S = 0;
    int P = 0;

    TwoInteger(){

    }

    public TwoInteger(int a, int b){
        S = a;
        P = b;
    }

    public boolean equals(TwoInteger Y){
        return (S == Y.S) && (P == Y.P);
    }
}
