/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A7;

import java.awt.List;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Klaudio Vito © 2016
 */
public class MagicCube {
    public static void main(String[] args) throws IOException{
        ArrayList<String> rows = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String file = scan.next();
        
        for (String line : Files.readAllLines(Paths.get("src/A7/"+file+".txt")))
            for (String part : line.split("\\n+")) rows.add(part);
        
        int iteration = 1;
        for(String s : rows){
            int sum = 0;
            String[] row = s.split("\\s+");
            ArrayList<Integer> numbers = new ArrayList<>();
            for (String row1 : row) {
                if   (row1.equals("")) ;
                else numbers.add(Integer.valueOf(row1));
            }
            
            for(Integer n : numbers) sum += n;
            if(sum != 0) System.out.println("Row " + iteration++ + " sum is " + sum);
        } 
        
    }
}
