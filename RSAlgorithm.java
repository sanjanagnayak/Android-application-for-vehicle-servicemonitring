package com.example.hp.firepro;
import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

class RSAlgorithm {

    private char msg[]=new char[100];
    private char pt1[]=new char[100];
    private BigInteger msgback;
    private  int pt[]=new int[100];
    private int ct[]=new int[100];
    private int p = 11,q=17,n,e,d,z;
    private String s,s1;
    private double p1,c1;

    public RSAlgorithm()
    {
        n=p*q;
        z=(p-1)*(q-1);

        for(e=2;e<n;e++)
        {
            if(gcd(e,z)==1)                             // e calculation
                break;
        }

        for(d=2;d<n;d++)
        {
            if((e*d)%z==1)
                break;                                  // d calculation
        }
    }


    public int gcd(int x,int y)
    {
        return (x == 0) ? y : gcd(y%x, x);
    }

    public boolean prime(int n)
    {
        for(int i=2;i<=(n/2);i++)
        {
            if(n%i==0)
                return true;
        }
        return false;
    }


    public int multi(int txt,int ed,int n)
    {
        int rem=1;
        for(int i=1;i<=ed;i++)
            rem=(rem*txt)%n;
        return rem;
    }

    public int[] encrypt(String s1)
    {

        msg=s1.toCharArray();
        int len=s1.length();

        for(int i=0;i<len;i++)
            pt[i]=msg[i];

        for(int i=0;i<len;i++)
        {
            ct[i]=multi(pt[i],e,n);

        }
        return ct;
    }


    public String decrypt(int ct[])
    {

        for(int i=0;i<ct.length;i++)
        {
            pt[i]=multi(ct[i],d,n);
            pt1[i]=(char)(pt[i]);
        }
        String string = new String(pt1);
        return string;
    }

    public  double encryptNum(int num)
    {
        c1 = (Math.pow(num,e)) % n;
        return c1;
    }

    public int decryptNum(double c)
    {
        BigInteger N = BigInteger.valueOf(n);
        BigInteger C = BigDecimal.valueOf(c).toBigInteger();
        msgback = (C.pow(d)).mod(N);
        return (msgback.intValue());

    }
}
