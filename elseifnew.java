public class ifelsetrain {
    public static void main(String[] args) {

        int randomly = (int) (Math.random() * 4); // 0 to 3

        if (randomly <= 2) {
            System.out.print("smaller than two");
        } 
        
        else if (randomly >= 1) {
            System.out.print("Bigger than");
        }

        else if (randomly == 2) {
            System.out.print("Twoo");
        }

        else {
            System.out.print("Three");
        }

        {

        }
    }

}
