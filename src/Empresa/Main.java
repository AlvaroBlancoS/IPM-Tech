package Empresa;
import java.util.Scanner;

/*
 * Esta es la parte mas basica sin arrayList ni iterator ni nada parecido
 * Solo registramos los clientes. 
 */
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Programador p = new Programador();
		System.out.println("Nombre");
		String nombre = in.nextLine();
		p.setNombre(nombre);
		System.out.println("Edad");
		int edad = in.nextInt();
		p.setEdad(edad);
		System.out.println("salario");
		double salario = in.nextDouble();
		in.nextLine();
		p.setSalario(salario);
		System.out.println("DNI");
		String dni = in.nextLine();
		p.setDni(dni);
		System.out.println("Estado civil");
		String es = in.nextLine();
		if (es.equalsIgnoreCase("casado")) {
			p.setCasado(true);
		} else {
			p.setCasado(false);
		}
		System.out.println("Lenguaje de programacion");
		p.setLenguaje(in.nextLine());
		System.out.println("Duracion de programacion");
		p.setHoraPorHora(in.nextInt());

		p.imprimirEmpleado();
		p.Clasificacion(edad);

		// -----------------Si aumentamos el salario o no------------------
		Scanner sc = new Scanner(System.in);
		System.out.println("Aumentamos el salario si el empleado lleva más tiempo con nosotros o es majo? si/no");
		String respuesta = sc.nextLine();
		if (respuesta.equalsIgnoreCase("si")) {
			System.out.println("Que porcentaje quieres subir?");
			p.aumento(sc.nextInt());
			System.out.println("El nuevo salario es: " + p.getSalario());

		} else {
			System.out.println("Hasta luego campeón");
		}

	}

}
