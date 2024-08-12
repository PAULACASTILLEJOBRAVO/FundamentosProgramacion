package Sesion4;

public class Multiplos_7_11 {
 
    public static void main(String[] args) {
        
    
        System.out.println("Sumatorio calculado con while: ");
        multiplos_7_11_While();

        System.out.println("Sumatorio calculado con do while: ");
        multiplos_7_11_DoWhile();

        System.out.println("Sumatorio calculado con for: ");
        multiplos_7_11_For();

    }

    public static void multiplos_7_11_While(){
        
        int i;
        
        i = 1;
        
        while (i <= 100) {
            
            if(i%7 == 0 || i%11 == 0){

                System.out.printf("%d ", i);
 
            }

            i = i + 1;
            
        }

        System.out.println();

    }

    public static void multiplos_7_11_DoWhile() {
        
        int i;
        
        i = 1;
        
        do {
            
            if(i%7 == 0 || i%11 == 0){

                System.out.printf("%d ", i);
 
            }

            i = i + 1;
        
        } while (i <= 100);

        System.out.println();
    
    }

    public static void multiplos_7_11_For() {
        
        int i;
        
        for (i = 1; i <= 100; i++) {
            
            if(i%7 == 0 || i%11 == 0){

                System.out.printf("%d ", i);
 
            }

        } // fin del for
        
        System.out.println();
    }


}
