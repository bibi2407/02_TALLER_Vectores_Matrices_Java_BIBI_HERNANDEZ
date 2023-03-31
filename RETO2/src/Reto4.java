import java.util.Scanner;


public class Reto4 {
    public static void main(String[] args) {
        Scanner lectura=new Scanner(System.in);

        char[][] calculadora = new char[5][4];

        calculadora[0] = new char [] {'E',',','.'};
        calculadora[1] = new char [] {'C','(',')','%','/'};
        calculadora[2] = new char [] {'7','8','9','x'};
        calculadora[3] = new char [] {'4','5','6','-'};
        calculadora[4] = new char [] {'1','2','3','='};

        for(int i=0; i < calculadora.length; i++) {
            for(int j=0; j < calculadora[i].length; j++) {
                System.out.printf("%-2s",calculadora[i][j] +"");
            }
            System.out.println();
        }

        lectura.close();
    }
}