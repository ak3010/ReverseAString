
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ayush Kanoria
 */
public class ReverseAString {
     public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = reader.nextInt();
        //int n =101200;
        String s="";        
        while(n>0)
        {
         int j= n%10;
         n=n/10;
          s = s + j;
        }
        while(s.length()>0 && s.charAt(0)=='0')
            {
                 s = s.substring(1); 
            }
        
        System.out.println("Reverse of the number:" +s);
    }
    
}
    

