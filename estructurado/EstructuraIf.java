package clases.estructurado;

public class EstructuraIf {

	public static void main(String[] args) {
		
		int topScore = 80;
		
		//condicional simple
		if(topScore < 100) {
			System.out.println("esta condición se cumple.");
		}
		
		//se puede complicar un poco
		if(topScore < 100 && topScore < 90) {
			System.out.println("ciertamente, topScore está fuera de rango.");
		}

	}

}
