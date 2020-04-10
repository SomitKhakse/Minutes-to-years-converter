/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minstoyears;

import java.util.Scanner;




/**
 *
 * @author M N Khakse
 */
public class MinsToYears {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter the number of minutes to convert:");
        int mins;
        Scanner s= new Scanner(System.in);
        mins= s.nextInt();
        int TotalDays= (366*mins)/527040;
        System.out.println(mins+" minutes is approx. "+TotalDays/365+" years and "+TotalDays%365+" days");
         
        
        
    }
    
}
