

public class exercise {
    
    public static void main(String[] args) {
        
        int i = 1;
        int suma= 0;

        while (i<=50) 
        {
            if (i %2==0) {
                suma  = suma +i;
            }
            i++;

        }
        System.out.println("The sum of even numbers from 1 to 50 is: " + suma);
    }
}
