import java.util.Scanner;

public class Retos2_4 {
    
  public static void main(String[] args){        
    int f,c;

    Scanner lectura = new Scanner(System.in);
    System.out.println("digite la cantidad de filas de su matriz");
    f=lectura.nextInt();
    System.out.println("digite la cantidad de columnas de su matriz");
    c=lectura.nextInt();

    String[][] matriz = new String[f][c];
    
    for(int i=0; i<f; i++){
      for(int j=0; j<c; j++){
        System.out.println("Digite el emoji de la poisición ["+i+j+"]");
        matriz[i][j]=lectura.next();
      }
    }
    for(int i=0; i<f; i++){
      for(int j=0; j<c; j++){
        System.out.println(matriz[i][j]+"\t");
      }
    }
  }
}
