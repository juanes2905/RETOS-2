import java.util.Scanner;

public class Retos2_1 {
    public static void main(String[] args) {
     int promedio=0; ;
     int tamaño, suma=0;
     Scanner captura = new Scanner(System.in);
     System.out.println("Escriba el tamaño ");
          tamaño = captura.nextInt();
          int [] vector = new int [tamaño];
    for (int i=0 ; i<vector.length;i++){
        System.out.println("ingrese la primera nota en la pocicion :" + i);
        vector [i] = captura.nextInt();
    }
    System.out.println("las notas es : \n");
    for(int j=0;j<vector.length;j++ ){
        System.out.println("Notas ["+j+"]:" + vector[j]);
    }
    for(int x=0;x<vector.length;x++){
        suma += vector[x];
    }
    System.out.println("la suma de las notas son: " +suma);
    promedio = suma / tamaño;
    System.out.println("el promedio de las notas son:" +promedio);
    if (promedio <= 30){
        System.out.println("usted reprobo ");
    } else if (promedio == 40){
        System.out.println("usted paso raspando ");
    } else if (promedio > 50){
        System.out.println("usted tubo una muy buena nota felicidades :) :"+ promedio );
    }
    captura.close();
}
}
