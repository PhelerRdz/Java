import java.util.Scanner;

public class Alg153_ggrupos {
    public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		double alumno;
		double cal1;
		double cal2;
		double cal3;
		double g;
		double grupo;
		double m;
		double materia;
		double n;
		double prom_alumno;
		double prom_grupo;
		double prom_materia;
		double prom_total;
		double suma_alumnos;
		double suma_grupos;
		double suma_materias;
		System.out.println("*******************************************************");
		System.out.println("|          Universidad Autónoma de Tamaulipas         |");
		System.out.println("|     Facultad de Ingeniería: Arturo Narro Siller     |");
		System.out.println("|        Ingeniería en Sistemas Computacionales       |");
		System.out.println("|             Fundamentos de Programación             |");
		System.out.println("|     Mi Centésimo Quincuagésimo Tercero Algoritmo    |");
		System.out.println("|            Desarrollador: Jorge Rodríguez           |");
		System.out.println("*******************************************************");
		System.out.println("Cuantos grupos son");
		g = sc.nextDouble();
		suma_grupos = 0;
		for (grupo=1;grupo<=g;grupo++) {
			System.out.println("Cuantos alumnos tiene el grupo #"+grupo);
			n = sc.nextDouble();
			suma_alumnos = 0;
			for (alumno=1;alumno<=n;alumno++) {
				System.out.println("Cuantas materias lleva el alumno "+alumno);
				m = sc.nextDouble();
				suma_materias = 0;
				for (materia=1;materia<=m;materia++) {
					System.out.println("Calificacion 1 de la materia "+materia);
					cal1 = sc.nextDouble();
					System.out.println("Calificacion 2 de la materia "+materia);
					cal2 = sc.nextDouble();
					System.out.println("Calificacion 3 de la materia "+materia);
					cal3 = sc.nextDouble();
					prom_materia = (cal1+cal2+cal3)/3;
					System.out.println("Promedio de esta materia: "+prom_materia);
					suma_materias = suma_materias+prom_materia;
				}
				prom_alumno = suma_materias/m;
				System.out.println("Promedio del alumno "+alumno+": "+prom_alumno);
				suma_alumnos = suma_alumnos+prom_alumno;
			}
			prom_grupo = suma_alumnos/n;
			System.out.println("El promedio del grupo #"+grupo+"es: "+prom_grupo);
			suma_grupos = suma_grupos+prom_grupo;
		}
		prom_total = suma_grupos/g;
		System.out.println("");
		System.out.println("El promedio de todos los grupos es: "+prom_total);
	}
}
