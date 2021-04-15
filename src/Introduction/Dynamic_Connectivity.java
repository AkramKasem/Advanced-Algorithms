/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Introduction;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author akram
 */
public class Dynamic_Connectivity {
    
    public static void main(String[] args) throws FileNotFoundException {
        
//        PrintWriter pw = new PrintWriter("out.txt");
//        pw.println();
        Scanner input = new Scanner(new FileInputStream("src/Introduction/input.txt"));
        Adapter  a =  new Adapter(input.nextInt());
        while (input.hasNext()) {
            a.Union(input.nextInt(), input.nextInt());
        }
        for (int i = 0; i < a.node.length; i++) {
            System.out.print(a.node[i]+"  ");
            
        }
    }
    
}
