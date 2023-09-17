/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HOT_cc20188;

/**
 *
 * @author user
 */
public class PaddyProduction {
    private PaddyLeaf paddyleaf;
    protected int area;
    protected double harvestingCost;
    
    protected PaddyProduction(int area){
        this.area = area;
       // this.harvestingCost = harvestingCost;
        paddyleaf = new PaddyLeaf();
    }

   
    protected PaddyLeaf getPaddyleaf() {
        return paddyleaf;
    }

    
    protected void setPaddyleaf(PaddyLeaf paddyleaf) {
        this.paddyleaf = paddyleaf;
    }

    
    protected int getArea() {
        return area;
    }

    
    protected void setArea(int area) {
        this.area = area;
    }

    
    protected double getHarvestingCost() {
        return harvestingCost;
    }

    
    protected void setHarvestingCost(double harvestingCost) {
        this.harvestingCost = harvestingCost;
    }
    
    public double computeHarvestingCost(){
        return harvestingCost * area;
    }

  
}
