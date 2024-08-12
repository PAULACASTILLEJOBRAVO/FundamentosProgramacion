package Sesion6;

public class SerieCreciente {
    
    public static void main(String[] args) {

        int [] serie = new int[30];
		int longitud = 1;
		int longitudMaxima = 1;
		int inicioSerie = 0;
		int inicioSerieMaxima = 0;
		
		for(int i = 0; i < 30; i++) {

			serie[i] = (int)(Math.random()*100)+1;
			System.out.print(serie[i] + " ");
		
        }

		int anterior = serie[0];
		
		for(int i = 1; i < 30; i++) {
			if(serie[i] > anterior) 
				longitud++;
			else {
				if(longitud > longitudMaxima) {
				
                    longitudMaxima = longitud;
					inicioSerieMaxima = inicioSerie;
				
                }

				longitud = 1;
				inicioSerie = i;
			
            }
			
            anterior = serie[i];
		
        }
		
		if(longitud > longitudMaxima) {
		
            longitudMaxima = longitud;
			inicioSerieMaxima = inicioSerie;
		
        }

		System.out.println();
		
		for(int i = inicioSerieMaxima; i < inicioSerieMaxima + longitudMaxima; i++) 
			System.out.print(serie[i] + " ");	
	
    }

}
