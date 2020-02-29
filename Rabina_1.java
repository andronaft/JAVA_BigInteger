import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        BigInteger bigPrime;
        Random rand = new Random();
        Scanner in= new Scanner(System.in);
        Integer amountByte;
        System.out.println("input amount of byte");
        amountByte = in.nextInt();
        bigPrime = BigInteger.probablePrime(amountByte,rand);
        System.out.println(bigPrime.toString() );
        BigInteger resPow= BigInteger.valueOf(2);
        BigInteger i;
      //Sorry for this terrible decision. but the man who made Bigintager in java left me no choice. And I dont have time to invert some else
        for ( i = BigInteger.valueOf(0);
              i.compareTo(bigPrime.subtract(BigInteger.valueOf(2)))==-1 ;) {
//resPow= resPow.multiply(BigInteger.valueOf(2));
            if
            ((bigPrime.subtract(BigInteger.valueOf(1)).compareTo(BigInteger.val
                    ueOf(1000000)) ==
                    1)&&(bigPrime.subtract(i).compareTo(BigInteger.valueOf(1000000)))==
                    1) {
                resPow = resPow.shiftLeft(999999);
                i = i.add(BigInteger.valueOf(999999));

            } else {
                if
                ((bigPrime.subtract(BigInteger.valueOf(1)).compareTo(BigInteger.val
                        ueOf(500000)) ==
                        1)&&(bigPrime.subtract(i).compareTo(BigInteger.valueOf(500000)))==1
                ) {
                    resPow = resPow.shiftLeft(99999);
                    i = i.add(BigInteger.valueOf(99999));
                } else {
                    if
                    ((bigPrime.subtract(BigInteger.valueOf(1)).compareTo(BigInteger.val
                            ueOf(10000)) ==
                            1)&&(bigPrime.subtract(i).compareTo(BigInteger.valueOf(10000)))==1)
                    {
                        resPow = resPow.shiftLeft(9999);
                        i = i.add(BigInteger.valueOf(9999));
                    } else {
                        if
                        ((bigPrime.subtract(BigInteger.valueOf(1)).compareTo(BigInteger.val
                                ueOf(1000)) ==
                                1)&&(bigPrime.subtract(i).compareTo(BigInteger.valueOf(1000)))==1)
                        {
                            resPow = resPow.shiftLeft(999);
                            i = i.add(BigInteger.valueOf(999));
                        } else {
                            if
                            ((bigPrime.subtract(BigInteger.valueOf(1)).compareTo(BigInteger.val
                                    ueOf(500)) ==
                                    1)&&(bigPrime.subtract(i).compareTo(BigInteger.valueOf(500)))==1) {
                                resPow = resPow.shiftLeft(499);
                                i = i.add(BigInteger.valueOf(499));
                            } else {
                                if
                                ((bigPrime.subtract(BigInteger.valueOf(1)).compareTo(BigInteger.val
                                        ueOf(250)) ==
                                        1)&&(bigPrime.subtract(i).compareTo(BigInteger.valueOf(250)))==1) {
                                    resPow = resPow.shiftLeft(249);
                                    i = i.add(BigInteger.valueOf(249));
                                } else {
                                    if
                                    ((bigPrime.subtract(BigInteger.valueOf(1)).compareTo(BigInteger.val

                                            ueOf(100)) ==
                                            1)&&(bigPrime.subtract(i).compareTo(BigInteger.valueOf(100)))==1) {
                                        resPow = resPow.shiftLeft(99);
                                        i = i.add(BigInteger.valueOf(99));
                                    } else {
                                        if
                                        ((bigPrime.subtract(BigInteger.valueOf(1)).compareTo(BigInteger.val
                                                ueOf(50)) ==
                                                1)&&(bigPrime.subtract(i).compareTo(BigInteger.valueOf(50)))==1) {
                                            resPow = resPow.shiftLeft(49);
                                            i =
                                                    i.add(BigInteger.valueOf(49));
                                            System.out.println("piisat");
                                        } else {
                                            if
                                            ((bigPrime.subtract(BigInteger.valueOf(1)).compareTo(BigInteger.val
                                                    ueOf(10)) ==
                                                    1)&&(bigPrime.subtract(i).compareTo(BigInteger.valueOf(10)))==1) {
                                                resPow =
                                                        resPow.shiftLeft(9);
                                                i =
                                                        i.add(BigInteger.valueOf(9));
//System.out.println(resPow);
                                                System.out.println("desuat");

                                            } else {
                                                resPow =
                                                        resPow.shiftLeft(1);
                                                i =
                                                        i.add(BigInteger.valueOf(1));
//
                                                System.out.println(resPow);
                                                System.out.println("odin");

                                            }

                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }}
//System.out.println(resPow);
        System.out.println("vse");
        if((resPow).mod(bigPrime).compareTo(BigInteger.valueOf(1))==0){
            System.out.println("prime");
        }
        else {
            System.out.println("not prime");
        }

    }
