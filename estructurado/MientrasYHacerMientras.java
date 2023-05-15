package clases.estructurado;

public class MientrasYHacerMientras {

	public static void main(String[] args) {
		
		int contador = 1;
		
		//Mientras
		//Se usa cuando no sabés la cantidad de iteraciones
		while(contador < 10) {
			System.out.println("Hola, soy el número "+contador);
			contador++; //manera principal de salir del bucle, es mucho muy importante.
		}
		
		//Hacer Mientras
		//ejecuta una vez antes de empezar a contar
		do {
			System.out.println("Adiós, soy el número "+contador);
			contador--;
		}while(contador>0);

	}

}
