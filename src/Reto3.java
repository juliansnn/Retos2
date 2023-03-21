import java.util.Scanner;
public class Reto3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        int m;
        System.out.println("Digite cuantas filas quiere: ");
        n=in.nextInt();
        System.out.println("Digite cuantas columnas quiere: ");
        m=in.nextInt();
        String [][] maquina = new String [n][m];
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
            System.out.print("Digite que producto y precio desea poner en la posición "+i +"-"+ j);
            maquina[i][j] = in.next();
             }
                }   
                System.out.println(" ");
                for (int i=0;i<n;i++){
                for (int j=0;j<m;j++){
                System.out.print("["+maquina[i][j]+"]");
                System.out.println(" ");
            }in.close();
        }
    }
}