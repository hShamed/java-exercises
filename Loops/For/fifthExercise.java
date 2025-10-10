public class fifthExercise {
    
    public static void main(String[] args) {
       
      
        for (int row = 1; row <= 5; row++) {
            if (row == 1 || row == 3 || row == 5) {
                //si la fila es 1, 3 o 5 entra
                for (int col = 1; col <= 4; col++) {
                    System.out.print("* ");
                }
            } else if (row == 2) {
                System.out.print("*");
            } else if (row == 4) {
                System.out.print("      *");
            }
            System.out.println(); 
        }
    }
}
