
package array.manipulation;

import java.math.BigInteger;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeMath.max;
import static jdk.nashorn.internal.objects.NativeMath.min;


public class ArrayManipulation {

  
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
        int n,m,a,b,i,j;
        long k;
        n=in.nextInt();
        m=in.nextInt();
        BigInteger[] data=new BigInteger[n];
        BigInteger max=new BigInteger("0");
        
        for(i=0;i<n;i++)
        {
            data[i]=new BigInteger("0");
        }
        
        for(i=0;i<m;i++)
        {
            a=in.nextInt();
            b=in.nextInt();
            k=in.nextLong();
            for(j=(a-1);j<b;j++)
            {
                data[i].add(BigInteger.valueOf(k));
            }
        }
        
        max.add(data[0]);
//        for(i=1;i<n;i++)
//        {
//            if(max.compareTo(data[i])== -1)
//            {
//                max=data[i];
//            }
//        }
        System.out.println(max);
    }
}
