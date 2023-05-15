package clases.estructurado;

public class EstructuraElseIf {

	public static void main(String[] args) {
		
		boolean esUnDiaLluvioso = true;
		//los booleanos se laman así, forma de afirmación, es una convención de nombre
		
		final String DAY = "Lunes";
		
		if(esUnDiaLluvioso) {
			System.out.println("Hoy es "+DAY+" y está lloviendo.");
		}else {
			System.out.println("Hoy es "+DAY+" y no está lloviendo.");
		}
		
		System.out.println("esto está después del condicional.");
		
		if(esUnDiaLluvioso && DAY=="Martes") {
			System.out.println("Hoy es "+DAY+" y está lloviendo.");
		}else if(esUnDiaLluvioso == false) {
			System.out.println("Hoy es "+DAY+" y no está lloviendo.");
		}else {
			System.out.println("Hoy es Martes, por lo que no tenemos información.");
		}

	}

}
