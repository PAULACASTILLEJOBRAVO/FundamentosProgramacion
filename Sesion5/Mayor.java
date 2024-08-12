package Sesion5;

public class Mayor {
    
    public static void main(String[] args) {
        
        int[] vectorA = { 1, 3, 5, 7, 9 };
        int[] vectorB = { 9, 7, 5, 3, 1 };
        int[] vectorResultado = new int[5];

        for (int i = 0; i < vectorA.length; i++) {
            if (vectorA[i] > vectorB[i])
                vectorResultado[i] = vectorA[i];
            else 
                vectorResultado[i] = vectorB[i];
            
            vectorResultado[i] = Math.max(vectorA[i], vectorB[i]);
        }
        
        System.out.print("\nResultado = | ");
        
        for (int i = 0; i < vectorResultado.length; i++) 
            System.out.print(vectorResultado[i] + " | ");

    }

}
