import java.math.BigInteger;
import java.util.Random;

public class Rabina {
    public boolean millerRabinTest(BigInteger nn, int k) {
        // if n == 2 or n == 3 - these numbers are prime, return true
        BigInteger n = nn;
        if (n.equals(2) || n.equals(3))
            return true;

        // if n < 2 n is even - return false
        if ((n.compareTo(BigInteger.valueOf(2))==(-1))  || (Integer.valueOf( n.mod(BigInteger.valueOf(2)).toString()) == 0))
            return false;

        // view n − 1 like (2^s)·t, where t odd, this we can do by sequential division n - 1 to 2
        BigInteger t = n.subtract(BigInteger.valueOf(1));

        int s = 0;

        while (Integer.valueOf(t.mod(BigInteger.valueOf(2)).toString())  == 0) {
            t = t.divide(BigInteger.valueOf(2));
            s += 1;
            System.out.println("in");
        }

        // повторить k раз
        for (int i = 0; i < k; i++) {
            // choose a random integer a in the segment [2, n - 2]
            Random rand = new Random();
            BigInteger a = new BigInteger(n.bitLength(), rand);
            while (a.compareTo(n.subtract(BigInteger.valueOf(2)))>0||a.compareTo(BigInteger.valueOf(2))<0){
                a =  new BigInteger(n.bitLength(),rand);
            }


            // x ← a ^ t mod n, we calculate using exponentiation modulo
            BigInteger aa = a;
            BigInteger x = aa.pow(t.intValue()).mod(n);
            BigInteger b =BigInteger.valueOf(2);
            b.pow(b);
            // if x == 1 or x == n - 1, then go to the next iteration of the loop
            if ((x.compareTo(BigInteger.valueOf(1))==0) || (x.compareTo(n.subtract(BigInteger.valueOf(1)))==0))
                continue;

            // do s − 1 times
            for (int r = 1; r < s; r++) {
                // x ← x^2 mod n
                x = x.pow(2).mod(n);

                // if x == 1, return compound - "составное"
                if (x.compareTo(BigInteger.valueOf(1)) == 0)
                    return false;

                // if x == n − 1,new iter outer loop
                if (x.compareTo(n.subtract(BigInteger.valueOf(1)))==0)
                    break;
            }

            if (x.compareTo(n.subtract(BigInteger.valueOf(1))) != 0)
                return false;
        }

        // return probably simple "вероятно простое"
        return true;
    }
}
