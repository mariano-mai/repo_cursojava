package clases.estructurado;

public class ManejadoPorContador {

	public static void main(String[] args) {
		
		for(int contador=1; contador<=5; contador++) {
			System.out.println(contador);
		}
		
		//se pueden poner varios índices
		for(int i=1, j=10; i<j; i++, j--) {
			System.out.println("i:"+i+"---"+"j:"+j);
		}
		
		//for anidado
		for(int i=1; i<3; i++) {
			for(int j=1; j<10; j++) {
				System.out.println("i: "+i+" ubicación: "+j);
			}
		}

	}

}
