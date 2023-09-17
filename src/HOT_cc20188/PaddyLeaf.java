
package HOT_cc20188;

/**
 *
 * @author user
 */
public class PaddyLeaf {
    private int leafColourChart;
    private int nitrogenAmount;

    /**
     * @return the leafColourChart
     */
    public int getLeafColourChart() {
        return leafColourChart;
    }

    /**
     * @param leafColourChart the leafColourChart to set
     */
    public void setLeafColourChart(int leafColourChart) {
        this.leafColourChart = leafColourChart;
    }

    /**
     * @return the nitrogenAmount
     */
    public int getNitrogenAmount() {
        return nitrogenAmount;
    }

    /**
     * @param nitrogenAmount the nitrogenAmount to set
     */
    public void setNitrogenAmount(int nitrogenAmount) {
        this.nitrogenAmount = nitrogenAmount;
    }
    
    public void nitrogenRequirement(){
       
       if(leafColourChart >= 4){
          System.out.println("19");
       }if(leafColourChart <= 3){
           System.out.println("23");
       }
       
    
    
}

}
