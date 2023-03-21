import java.util.Scanner;
public class Reto1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de notas a evaluar en la materia: ");
        int cantNotas = in.nextInt();
        double[] notas = new double[cantNotas];
        for (int i = 0; i < cantNotas; i++) {
            System.out.print("Ingrese el valor de la nota " + (i+1) + ": ");
            notas[i] = in.nextDouble();
        }
        double suma = 0;
        for (int p = 0; p < cantNotas; p++) {
            suma += notas[p];
        }
        double promedio = suma / cantNotas;
        System.out.println("El promedio de las notas es: " + promedio);
        if (promedio < 3) {
            System.out.println("Reprobaste");
        } else if (promedio >= 3 && promedio == 4.0) {
            System.out.println("Pasaste Raspando");
        } else if (promedio > 4.0 ) {
            System.out.println("Aprobaste con buenos resultados");
        }in.close();
    }
}