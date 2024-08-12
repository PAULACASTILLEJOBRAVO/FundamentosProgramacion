package Sesion4;

public class Primos_25 {

    public static void main(String[] args) {
        
        final int MAX = 25;
        
        System.out.print("25 primeros números primos: ");

        int i = 2;
        int count = 1;
        int j = 1;

        do{

            int cont = 0;

            for(int k = 2; k < j; k++){
            
                if( j % k == 0)
                    cont++;
            
            }
            
            if(j != 1)
                if(cont == 0){
                
                    System.out.printf("%d ", j);
                
                    count++;
                    i = i+2;
                
                }
            else
                i = i+2;
            
            j++;

        }while(MAX != count);

    }

}
