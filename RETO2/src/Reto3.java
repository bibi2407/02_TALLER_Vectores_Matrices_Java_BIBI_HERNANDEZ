import java.util.Scanner;

public class Reto3 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        String[][] P;


     P = new String[3][3];
    
    System.out.println("Como Usarla:");
    System.out.println("ingrese El Nombre Del Producto Y El Precio  Con "+" : ");
    System.out.println();

     for (int i = 0; i < 3; i++) {
                
            for (int N = 0; N < 3; N++) {

                System.out.println("Escriba El Nombre Y El Precio Del Producto");
                P[i][N] = lectura.next();

            }

        }
       
        for (int j = 0; j < 3; j++) {
            System.out.println(" _____________");
            System.out.print("|");
            for (int i = 0; i < 3; i++) {

                System.out.print(j+""+i+" "+P[j][i]);
                
                if (i != P[j].length - 1)
                
                    System.out.print("\t");
            }
            
            System.out.println(" | ");

        }
        System.out.println( " ______________");
        lectura.close();
    }
}