//Helmuth Nistal  16104
//Ricardo Miranda 14027

import java.io.IOException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Grafo grafo= new Grafo();
		System.out.println("Bienvenido a la interfaz de viajes entre ciudades");
		boolean bandera =true;
		Scanner input= new Scanner(System.in);
		while (bandera){
			System.out.println("Ingrese la opcion que desea realizar");
			System.out.println("1. Trazar ruta");
			System.out.println("2. Centro del grafo");
			System.out.println("3. Interrupcion de trafico entre ciudades");
			System.out.println("4. Crear coneccion");
			System.out.println("5. Salir");
			int opcion=Integer.parseInt(input.nextLine());
			switch (opcion){
			case 1:{
				System.out.println("Donde se localiza?");
				String locacion= input.nextLine();
				System.out.println("A donde quiere ir?");
				String destino= input.nextLine();
				grafo.buscarRuta(locacion,destino);
				
			break;
			}
			case 2:{
				System.out.println("El centor es:");
				System.out.println(grafo.buscarCentro());
			break;
			}
			case 3:{
				System.out.println("Ciudad1:");
				String locacion= input.nextLine();
				System.out.println("Ciudad2:");
				String destino= input.nextLine();
				grafo.Interrupcion(locacion,destino);
			break;
			}
			case 4:{
				System.out.println("Ciudad1:");
				String locacion= input.nextLine();
				System.out.println("Ciudad2:");
				String destino= input.nextLine();
				System.out.println("Distancia:");
				int distancia= Integer.parseInt(input.nextLine());
				grafo.Crear(locacion,destino,distancia);
			break;
			}
			case 5:{
				System.out.println("Hasta Luego");
				bandera=false;
			break;
			}
		}
		}
	}
}
