import java.util.Scanner;

public class Reto2 {

    public static boolean palindromo(String palabra) {
        int a = 0;
        int b = palabra.length() - 1;

        for(int i=0; i<palabra.length(); i++) {
            if(palabra.charAt(a) == palabra.charAt(b) ) {
                a++;
                b--;
            }
            else
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
         Scanner lectura = new Scanner(System.in);

         String palabra;

         System.out.println("Por favor ingrese una palabra: ");
         palabra = lectura.nextLine();

         if(palindromo(palabra))
         System.out.println("Esta palabre es palindromo");
         else
            System.out.println("Esta palabra no es palindromo");

            lectura.close();
    }
}