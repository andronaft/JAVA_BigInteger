import java.math.BigInteger;
import java.util.Random;

public class Rabina {
    public boolean millerRabinTest(BigInteger nn, int k) {
        // если n == 2 или n == 3 - эти числа простые, возвращаем true
        BigInteger n = nn;
        if (n.equals(2) || n.equals(3))
            return true;

        // если n < 2 или n четное - возвращаем false
        if ((n.compareTo(BigInteger.valueOf(2))==(-1))  || (Integer.valueOf( n.mod(BigInteger.valueOf(2)).toString()) == 0))
            return false;

        // представим n − 1 в виде (2^s)·t, где t нечётно, это можно сделать последовательным делением n - 1 на 2
        BigInteger t = n.subtract(BigInteger.valueOf(1));

        int s = 0;

        while (Integer.valueOf(t.mod(BigInteger.valueOf(2)).toString())  == 0) {
            t = t.divide(BigInteger.valueOf(2));
            s += 1;
            System.out.println("in");
        }

        // повторить k раз
        for (int i = 0; i < k; i++) {
            // выберем случайное целое число a в отрезке [2, n − 2]
            Random rand = new Random();
            BigInteger a = new BigInteger(n.bitLength(), rand);
            while (a.compareTo(n.subtract(BigInteger.valueOf(2)))>0||a.compareTo(BigInteger.valueOf(2))<0){
                a =  new BigInteger(n.bitLength(),rand);
            }


            // x ← a^t mod n, вычислим с помощью возведения в степень по модулю
            BigInteger aa = a;
            BigInteger x = aa.pow(t.intValue()).mod(n);
            BigInteger b =BigInteger.valueOf(2);
            b.pow(b);
            // если x == 1 или x == n − 1, то перейти на следующую итерацию цикла
            if ((x.compareTo(BigInteger.valueOf(1))==0) || (x.compareTo(n.subtract(BigInteger.valueOf(1)))==0))
                continue;

            // повторить s − 1 раз
            for (int r = 1; r < s; r++) {
                // x ← x^2 mod n
                x = x.pow(2).mod(n);

                // если x == 1, то вернуть "составное"
                if (x.compareTo(BigInteger.valueOf(1)) == 0)
                    return false;

                // если x == n − 1, то перейти на следующую итерацию внешнего цикла
                if (x.compareTo(n.subtract(BigInteger.valueOf(1)))==0)
                    break;
            }

            if (x.compareTo(n.subtract(BigInteger.valueOf(1))) != 0)
                return false;
        }

        // вернуть "вероятно простое"
        return true;
    }
}
