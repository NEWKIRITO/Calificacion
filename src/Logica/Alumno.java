package Logica;

import java.util.ArrayList;
import java.util.Scanner;

public class Alumno {

    ArrayList <Alumno> alumno = new ArrayList<>();

    private int nota;
    private String nombre;


    public Alumno() {
    }

    public Alumno(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public double calcularPromedio() {
        double suma = 0;
        for (Alumno a: alumno){
            suma += a.getNota();
        }
        return suma / alumno.size();
    }

    public void mostrarInformacion() {
        System.out.println("La informacion que usted proporcionó es: ");
        System.out.println("Nombre: " + nombre);

        for(Alumno a: alumno){
            System.out.println("Nota: " + a.getNota());
        }

        if (calcularPromedio() <= 6) {
            System.out.println("El alumno " + nombre + "Ha reprobado la materia");
            System.out.println("El promedio de su alumno es: " + calcularPromedio());
        } else {
            System.out.println("El alumno " + nombre + "Ha aprobado la materia");
            System.out.println("El promedio de el alumno es: " + calcularPromedio());
        }
    }

    public void ingresarInformacion() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre de su alumno: ");
        setNombre(sc.nextLine());

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingresa la nota: ");
            setNota(sc.nextInt());
            alumno.add(new Alumno(getNombre(),getNota()));
        }
        sc.close();

        mostrarInformacion();
    }
}
