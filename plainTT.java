import javax.swing.JOptionPane;

public class plainT {

    public static void main(String[] args) {
        int nuM = 20;
        String meSSage = ""; //must be empty for Value to be givven 
        String    popUPt = ""; //pop-up window


        popUPt = JOptionPane.showInputDialog("Math and code are dope");
        
        nuM = Double.parseDouble(meSSage);


        if ( nuM == 30) {
            meSSage = "works";
       
        }

        else {
            meSSage = "meh";
        }


        System.out.print(meSSage);


    
    
    
    }

}