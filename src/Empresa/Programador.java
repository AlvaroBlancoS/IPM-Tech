package Empresa;

public class Programador extends Empleado {
	protected int horaPorHora;
	protected String lenguaje;

	Programador() {

	}

	Programador(String nombre, String dni, int edad, double salario, boolean casado, int horaPorHora, String lenguaje) {
		super(nombre, dni, edad, salario, casado);
		this.horaPorHora = horaPorHora;
		this.lenguaje = lenguaje;

	}

	protected int getHoraPorHora() {
		return horaPorHora;
	}

	protected void setHoraPorHora(int horaPorHora) {
		this.horaPorHora = horaPorHora;
	}

	protected String getLenguaje() {
		return lenguaje;
	}

	protected void setLenguaje(String lenguaje) {
		this.lenguaje = lenguaje;
	}
	
	public void imprimirEmpleado() {
		String resp= null;
		if (casado) {
			resp="casado/a";
		}else {
			resp="Soltero/a";
		}
		System.out.println("-----------------Empleado---------------------------");
		System.out.println("Nombre del empleado "+this.nombre+" DNI: "+this.dni+" Edad: "+this.edad+" Estado civil "+resp+" salario "+ this.salario);
		
		System.out.println("-----------------PROGRAMADOR------------------------ \n"+ "Tipo de lenguaje que usa: "+this.lenguaje+" y horas de duracion: "+ this.horaPorHora);
		
		
	}

}
