import Logica.Alumno;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Alumno alumno = new Alumno();

        System.out.println("Ingrese el nombre de su alumno: ");
        alumno.setNombre(sc.nextLine());

        System.out.println("Ingrese su calificacion 1: ");
        alumno.setNota1(sc.nextInt());
        System.out.println("INgrese su calificacion 2: ");
        alumno.setNota2(sc.nextInt());
        System.out.println("Ingrese su calificacion 3: ");
        alumno.setNota3(sc.nextInt());

        alumno.calcularPromedio();
        alumno.mostrarInformacion();
    }
}
