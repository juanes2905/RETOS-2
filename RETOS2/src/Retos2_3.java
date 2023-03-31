import java.util.Scanner;

public class Retos2_3 {
    public static void main(String[] args) {
        String [][]maquina=new String [4][4];
        int [][]valor=new int [4][4];


        Scanner datos=new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 ; j++) {
                System.out.println("ingrese un producto en la posicion:"+i+j);
                maquina[i][j]=datos.next(); 
                
                System.out.println("ingrese el valor del producto : "+i+j);
                valor[i][j]=datos.nextInt(); 
            }
        }
        
        for (int i = 0; i == 0; i++) {
            for (int j = 0; j < 4 ; j++) {
                System.out.print("\t"+i+j+""+maquina[i][j]+" valor "+valor[i][j]);
            }
            System.out.print("\n");
        }
        for (int i = 1; i == 1; i++) {
            for (int j = 0; j < 4 ; j++) {
                System.out.print("\t"+i+j+""+maquina[i][j]+ " valor "+valor[i][j]);
            }
            System.out.print("\n");
        }
        for (int i = 2; i == 2; i++) {
            for (int j = 0; j < 4 ; j++) {
                System.out.print("\t"+i+j+""+maquina[i][j]+ " valor "+valor[i][j]);
            }
            System.out.print("\n");
        }
        for (int i = 3; i == 3; i++) {
            for (int j = 0; j < 4 ; j++) {
                System.out.print("\t"+i+j+""+maquina[i][j]+ " valor "+valor[i][j]);
            }
            System.out.print("\n");
        }
        datos.close();
    }
}
