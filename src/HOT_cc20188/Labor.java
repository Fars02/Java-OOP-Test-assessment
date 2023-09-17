/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HOT_cc20188;

/**
 *
 * @author user
 */
public class Labor extends PaddyProduction{
    private String technique;
    
    public Labor(int area){
        
        super(area);
        
    }

    /**
     * @return the technique
     */
    public String getTechnique() {
        return technique;
    }

    /**
     * @param technique the technique to set
     */
    public void setTechnique(String technique) {
        this.technique = technique;
    }
    
    @Override
    public double computeHarvestingCost(){
        
        if("manual".equals(technique)){
             harvestingCost = 144;
             return harvestingCost * area;
        }else if("hybrid".equals(technique)){
             harvestingCost = 28;
             return harvestingCost * area;
        }else if("others".equals(technique)){
             harvestingCost = 0;
             return harvestingCost * area;
        }
        
        return harvestingCost * area;
       
    }
    
    
}
