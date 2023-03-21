import java.util.Scanner;
public class Reto2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de competidores: ");
        int cantCompetidores = in.nextInt();
        String[] nombres = new String[cantCompetidores];
        int[] tiempos = new int[cantCompetidores];
        for (int i = 0; i < cantCompetidores; i++) {
            System.out.print("Ingrese el nombre del competidor " + (i+1) + ": ");
            nombres[i] = in.next();
            System.out.print("Ingrese el tiempo del competidor " + (i+1) + " en segundos: ");
            tiempos[i] = in.nextInt();
        }
        System.out.println("Lista de competidores:");
        for (int i = 0; i < cantCompetidores; i++) {
            System.out.println(nombres[i] + " - " + tiempos[i] + " segundos");
        }
        String ganador = "";
        int menorTiempo =0;
        for (int i = 0; i < cantCompetidores; i++) {
            int tiempo = tiempos[i];
            if (tiempo < menorTiempo) {
                ganador = nombres[i];
                menorTiempo = tiempo;
            }
        } 
        System.out.println("El ganador es " + ganador + " con un tiempo de " + menorTiempo + " segundos.");
        in.close();
    }
}