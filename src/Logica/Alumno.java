package Logica;

public class Alumno {

    int nota1;
    int nota2;
    int nota3;
    String nombre;

    public Alumno() {
    }

    public Alumno(String nombre, int nota1, int nota2, int nota3) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota3() {
        return nota3;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public void calcularPromedio() {
        int promedio = (nota1 + nota2 + nota3 ) / 3;
        System.out.println("El promedio de su alumno es: " + promedio);
    }

    public void mostrarInformacion() {
        System.out.println("La informacion que usted proporcionó es: ");
        System.out.println("Nombre: " + nombre);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota 3: " + nota3);

        calcularPromedio();
    }
}
