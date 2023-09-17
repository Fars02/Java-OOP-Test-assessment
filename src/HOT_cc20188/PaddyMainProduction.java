/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package HOT_cc20188;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class PaddyMainProduction {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("***Paddy Production System In Pekan, Pahang***");
        System.out.println("Creating User....");
       
          Labor L1 = new Labor(5);
          Labor L2 = new Labor(8);
        
        System.out.println("------SYSTEM INPUT------");
        System.out.print("\n");
        System.out.println("Labors are checking the colour of paddy leaf");
        for(int i = 0;i < 2; i++){
             System.out.print("Enter color chart of paddy leaf by Labor" + (i+1) + ": ");
             if(i<1){
                 L1.getPaddyleaf().setLeafColourChart(input.nextInt());
             }else{
                 L2.getPaddyleaf().setLeafColourChart(input.nextInt());
             }
        }
        
        System.out.print("\n");
        System.out.println("Labors are choosing Harvesting Technique");
        for(int i = 0;i < 2; i++){
             System.out.print("Enter harvesting technique by Labor" + (i+1) + ": ");
             if(i<1){
                 L1.setTechnique(input.next());
             }else{
                 L2.setTechnique(input.next());
             }
        }
        
        System.out.print("\n");
        System.out.println("------SYSTEM PROCESS------");
        System.out.println("Process of applying Nitrogen based on Color Strength for Labors");      
//        L1.getPaddyleaf().nitrogenRequirement();
//        L2.getPaddyleaf().nitrogenRequirement();
        
        System.out.println("Process of calculating harvesting cost based on area for Labors");        
//        L1.computeHarvestingCost();
//        L2.computeHarvestingCost();
        

        System.out.print("\n");
        System.out.println("------SYSTEM OUTPUT------");
        for(int i = 0;i < 2; i++){
             if(i < 1){
                 System.out.print("Nitrogen requirement applying by Labor" + (i+1) + ": ");
                 L1.getPaddyleaf().nitrogenRequirement();
                
                 System.out.println("Total area to harvest by Labor" + (i+1) + ": " + L1.getArea());
                 
                 System.out.println("Harvesting technique for Labor" + (i+1) + ": " + L1.getTechnique());
                 
                 System.out.println("Harvesting cost by Labor" + (i+1) + ": RM" +  L1.computeHarvestingCost());
                 
             }else {
                 System.out.print("Nitrogen requirement applying by Labor" + (i+1) + ": ");
                 L2.getPaddyleaf().nitrogenRequirement();
                
                 System.out.println("Total area to harvest by Labor" + (i+1) + ": " + L2.getArea());
                 
                 System.out.println("Harvesting technique for Labor" + (i+1) + ": " + L2.getTechnique());
                 
                 System.out.println("Harvesting cost by Labor" + (i+1) + ": RM" +  L2.computeHarvestingCost());
                 
             }
        }
                
                
    }
}
    

