/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class swi {
    //public int k;
    public  void  sz(int n,int k) {

        int month = n;
        int year = k;
        int numDays = 0;

        switch (month) {
            case 1: case 3: case 5:
            case 7: case 8: case 10:
            case 12:
                numDays = 31;
                break;
            case 4: case 6:
            case 9: case 11:
                numDays = 30;
                break;
            case 2:
                if (((year % 4 == 0) && !(year % 100 == 0))|| (year % 400 == 0))
                    numDays = 29;
                else
                    numDays = 28;
                break;
            default:
                System.out.println("Invalid month.");
                break;
        }
        System.out.println("Number of Days = "
                           + numDays);
    }

        public static void main(String args[]) throws IOException  {
            swi d =new swi();
             
         System.out.println("Enter the value of n :");
         System.out.println("Enter the value of m :");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int n=Integer.parseInt(br.readLine());
        int k=Integer.parseInt(br.readLine());
        d.sz(n,k);
         
    
}}