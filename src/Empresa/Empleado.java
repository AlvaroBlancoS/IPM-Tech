package Empresa;

public class Empleado {
	protected String nombre;
	protected String dni;
	protected int edad;
	protected double salario;
	protected boolean casado;

	 Empleado() {

	}

	 Empleado(String nombre, String dni, int edad, double salario, boolean casado) {
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
		this.salario = salario;
		this.casado = casado;
	}

	 protected String getNombre() {
		return nombre;
	}

	 protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	 protected String getDni() {
		return dni;
	}

	 protected void setDni(String dni) {
		this.dni = dni;
	}

	 protected int getEdad() {
		return edad;
	}

	 protected void setEdad(int edad) {
		this.edad = edad;
	}

	 protected double getSalario() {
		return salario;
	}

	 protected void setSalario(double salario) {
		this.salario = salario;
	}

	 protected boolean isCasado() {
		return casado;
	}

	 protected void setCasado(boolean casado) {
		this.casado = casado;
	}

	 protected String Clasificacion(int edad) {
		String respuesta = null;
		if (edad <= 18 || edad <= 21) {
			respuesta = "principiante";
		} else if (edad >= 22 || edad <= 35) {
			respuesta = "Intermedio";
		} else if (edad > 35) {
			respuesta = "senior";
		}
		System.out.println("----------Experiencia Laboral----------\n"+"Es "+respuesta);
		return respuesta;
	}
	
	 //Se aumentaria el salario si el empleado lleva más tiempo en la empresa o tiene buena actitud
	protected void aumento(int porc) {
		double aumento= (this.salario*porc)/100;
		this.salario+=aumento;
		
	}
	
	public void imprimirEmpleado() {
		String resp= null;
		if (casado) {
			resp= "Casado/a";
		}else {
			resp="Soltero/a";
		}
		System.out.println("------------------Datos de un simple empleado----------------");
		System.out.println("Nombre de empleado "+this.nombre+" DNI: "+this.dni+" Edad: "+this.edad+" Estado civil: "+ resp+" salario: "+this.salario+"\n");

		
	}



}
