
package sparse.arrays;

import java.util.Scanner;

/**
 *
 * @author Riadul
 */
public class SparseArrays {

    private Scanner input;
    private int n,m,count;
    
    public void CompairString()
    {
        input=new Scanner(System.in);
        n=input.nextInt();
        String s1[]=new String[n];
        for(int i=0;i<n;i++)
        {
            s1[i]=input.next();
        }
        m=input.nextInt();
        String s2[]=new String[m];
        for(int i=0;i<m;i++)
        {
            count=0;
            s2[i]=input.next();
            
            for(int j=0;j<n;j++)
            {
                if(s2[i].equals(s1[j]))
                {
                    count++;
                }
               
            }
             System.out.println(count);
        }
        
        
    }
    
    public static void main(String[] args) {
    
        SparseArrays oj=new SparseArrays();
        oj.CompairString();
    }
    
}
