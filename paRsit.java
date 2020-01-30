import javax.swing.JOptionPane;

public class paRsit {
    public static void main(String[] args) {

        int nuM = 0;
        int tO = 0;
        boolean prgrm = false;
        String inpuT = "";
        String ouTpuT = "";

        inpuT = JOptionPane.showInputDialog("Maybe working");

        nuM = Integer.parseInt(inpuT);

        if (nuM == tO) {
            prgrm = true;
            ouTpuT = "WORKING!!!";
        }

        else {
            prgrm = false;
            ouTpuT = "YAyy";
        }

        JOptionPane.showInputDialog(null, ouTpuT);

    }

}