/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programs;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Arithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t,i,d;
        t=sc.nextInt();
        i=sc.nextInt();
        d=sc.nextInt();
        int j;
        System.out.print(i);
        for(j=1;j<t;j++)
            System.out.print(i+(j*d));
    }
    
}
