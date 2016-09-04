/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A3;

/**
 *
 * @author Klaudio Vito © 2016
 */
public class Marathon {
    public static void main (String[] arguments){
        String[] names ={
            "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
            "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
            "Aaron", "Kate"
        };
        int[] times ={
            341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 
            343, 317, 265};
        System.out.println("Best runner is " + names[bestRunner(times)] + " in " + times[bestRunner(times)] + " seconds");
        System.out.println("Second best is " + names[secondBest(times)] + " in " + times[secondBest(times)] + " seconds");
    }
   
    private static int bestRunner(int[] times){
        int bestTime = times[0];
        int index = 0;
        for(int i = 1; i < times.length; i++){
            if(bestTime > times[i]){
                bestTime = times[i];
                index = i;
            }
        }
        return index;
    }
    
     private static int secondBest(int[] times){
        int bestTime = times[0];
        int secondBest = 0;
        int index = 0;
        for(int i = 0; i < times.length; i++){
            if (bestTime > times[i]){
                secondBest = bestTime;
                bestTime = times[i];
            }
        }
        for(int i = 0; i < times.length; i++){
            if(secondBest == times[i]) index = i;
        }
        return index;
    }
}
