package newpackage;
/**
 * @author PAWAN
 */
import java.lang.*;
import java.io.*;
public class Pattern {
    
    public void patt1(int n) {
        System.out.println("Pattern1 is as followed...");
        int b[]=new int[2*n-1];
        
        int i,j;
        for(j=0;j<n;j++){
              b[n-1]=j+1;
              for(i=n-2;i>=0;i--){
                  if((b[i+1]-1)>0) b[i]=b[i+1]-1;
                     else b[i]=0;
              }  
              for(i=n;i<(2*n-1);i++) {
                   if((b[i-1]-1)>0) b[i]=b[i-1]-1;
                       else b[i]=0;
              }
              for(i=0;i<(2*n-1);i++){
                 if(b[i]==0) System.out.print(" ");
                  else System.out.print(b[i]);
              }
              System.out.println();
        }
    }
    
    public void patt2(int n){
        System.out.println("\n \nPattern2 is as followed...");
        int a[]=new int[2*n-1];
        int i,j;
        for(i=0;i<n;i++){
            for(j=0;j<n-i;j++) System.out.print("  ");
            for(j=0;j<=i;j++){
                a[j]=i+1;
                if(a[j]<=9)System.out.print(a[j]+"   ");
                else System.out.print(a[j]+"  ");
            }
            System.out.println();
        }
    }
    
    public static void main(String args[]) throws IOException{
        
        Pattern d=new Pattern();    //Creating an Object

        System.out.println("Enter the value of n :");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String str= br.readLine();
        int n=Integer.parseInt(str);
        d.patt1(n);
        d.patt2(n);       
        
    }
}
