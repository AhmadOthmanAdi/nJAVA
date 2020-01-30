public class ranDomaTH {
    public static void main(String[] args) {

        int nuM = 0; // minimum Number
        int trgt = 0; // Desired Number
        int hiNM = 5;// Highest reached number
        boolean stage = "";
        boolean staget = "";
        String outPut = "";
        String inPut = "";

        trgt = (int) Math.random() * hiNM;

        inpuT = JOptionPane.showInputDialog("Maybe working");

        nuM = Integer.parseInt(inpuT);

        if (nuM < trgt) {
            stage = true;
        } else if (nuM > trgt) {
            stage = false;
        } else {
            staget = true;
        }

        if (nuM) {
            nuM = "go!";
        }

        else if (nuM) {
            nuM = "helloworld";
        }

        else {
            staget = "display";
        }

        inpuT = JOptionPane.showInputDialog("Maybe working");

    }
}