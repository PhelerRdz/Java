import java.util.Scanner;

public class Alg154_UAT {
    public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		double cont;
		double facultad;
		double al1=0;
		double al10=0;
		double al11=0;
		double al12=0;
		double al13=0;
		double al14=0;
		double al15=0;
		double al16=0;
		double al17=0;
		double al18=0;
		double al2=0;
		double al3=0;
		double al4=0;
		double al5=0;
		double al6=0;
		double al7=0;
		double al8=0;
		double al9=0;
		String nombre="";
		String respuesta;
		cont = 0;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|      Mi Centésimo Quincuagésimo Cuarto Algoritmo    |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Ingreso un automovil? ");
		respuesta = sc.next();
		while (respuesta=="S") {
			cont = cont+1;
			if ((cont==1)) {
				System.out.println("1.- Musica");
				System.out.println("2.- Ingenieria");
				System.out.println("3.- Comercio");
				System.out.println("4.- Derecho");
				System.out.println("5.- Odontologia");
				System.out.println("6.- Enfermeria");
				System.out.println("7.- Medicina");
				System.out.println("8.- Cendi");
				System.out.println("9.- Celap");
				System.out.println("10.- Psicologia");
				System.out.println("11.- Aula Magna");
				System.out.println("12.- Biblioteca Central");
				System.out.println("13.- Gimnasio");
				System.out.println("14.- Banco");
				System.out.println("15.- Centro de Excelencia");
				System.out.println("16.- Arquitectura");
				System.out.println("17.- Nave");
				System.out.println("18.- Estacion de Autobuses");
			}
			System.out.println("A que lugar vas? ");
			facultad = sc.nextDouble();
			if ((facultad==1)) {
				al1=al1+1;
				nombre = "Musica";
			}
			if ((facultad==2)) {
				al2 = al2+1;
				nombre = "Ingenieria";
			}
			if ((facultad==3)) {
				al3 = al3+1;
				nombre = "Comercio";
			}
			if ((facultad==4)) {
				al4 = al4+1;
				nombre = "Derecho";
			}
			if ((facultad==5)) {
				al5 = al5+1;
				nombre = "Odontologia";
			}
			if ((facultad==6)) {
				al6 = al6+1;
				nombre = "Enfermeria";
			}
			if ((facultad==7)) {
				al7 = al7+1;
				nombre = "Medicina";
			}
			if ((facultad==8)) {
				al8 = al8+1;
				nombre = "Cendi";
			}
			if ((facultad==9)) {
				al9 = al9+1;
				nombre = "Celap";
			}
			if ((facultad==10)) {
				al10 = al10+1;
				nombre = "Psicologia";
			}
			if ((facultad==11)) {
				al11 = al11+1;
				nombre = "Aula Magna";
			}
			if ((facultad==12)) {
				al12 = al12+1;
				nombre = "Biblioteca Central";
			}
			if ((facultad==13)) {
				al13 = al13+1;
				nombre = "Gimnasio";
			}
			if ((facultad==14)) {
				al14 = al14+1;
				nombre = "Banco";
			}
			if ((facultad==15)) {
				al15 = al15+1;
				nombre = "Centro de Excelencia";
			}
			if ((facultad==16)) {
				al16 = al16+1;
				nombre = "Arquitectura";
			}
			if ((facultad==17)) {
				al17 = al17+1;
				nombre = "Nave";
			}
			if ((facultad==18)) {
				al18 = al18+1;
				nombre = "Estacion de Autobuses";
			}
			System.out.println("El Vehiculo se dirije a: "+nombre);
			System.out.println("Ingreso otro automovil? ");
			respuesta = sc.next();
                        }
                        if ((cont==0)) {
			System.out.println("No Entro Ningun Automovil");
                        } else {
			System.out.println("El total de Automoviles que visitaron dicha area fue de: "+al1+" El Promedio de la Area Musica es: "+(al1/cont*100));
			System.out.println("El total de Automoviles que visitaron dicha area fue de: "+al2+"El Promedio de la Area Ingenieria es: "+(al2/cont*100));
			System.out.println("El total de Automoviles que visitaron dicha area fue de: "+al3+"El Promedio de la Area Comercio es: "+(al3/cont*100));
			System.out.println("El total de Automoviles que visitaron dicha area fue de: "+al4+"El Promedio de la Area Derecho es: "+(al4/cont*100));
			System.out.println("El total de Automoviles que visitaron dicha area fue de: "+al5+"El Promedio de la Area Odontologia es: "+(al5/cont*100));
			System.out.println("El total de Automoviles que visitaron dicha area fue de: "+al6+"El Promedio de la Area Enfermeria es: "+(al6/cont*100));
			System.out.println("El total de Automoviles que visitaron dicha area fue de: "+al7+"El Promedio de la Area Medicina es: "+(al7/cont*100));
			System.out.println("El total de Automoviles que visitaron dicha area fue de: "+al8+"El Promedio de la Area Cendi es: "+(al8/cont*100));
			System.out.println("El total de Automoviles que visitaron dicha area fue de: "+al9+"El Promedio de la Area Cellap es: "+(al9/cont*100));
			System.out.println("El total de Automoviles que visitaron dicha area fue de: "+al10+"El Promedio de la Area Psicologia es: "+(al10/cont*100));
			System.out.println("El total de Automoviles que visitaron dicha area fue de: "+al11+"El Promedio de la Area Aula Magna es: "+(al11/cont*100));
			System.out.println("El total de Automoviles que visitaron dicha area fue de: "+al12+"El Promedio de la Area Biblioteca Central es: "+(al12/cont*100));
			System.out.println("Total de automoviles que pasaron por la puerta: "+cont);
                        }
                        }
                        }
