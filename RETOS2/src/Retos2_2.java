import java.util.Scanner;

public class Retos2_2 {
    public static void main(String[] args) {
     int promedio= 0; ;
     String nom ;
     int tamaño, suma=0;
     Scanner captura = new Scanner(System.in);
     System.out.println("Escriba el tamaño ");
          tamaño = captura.nextInt();
          int [] vector = new int [tamaño];

    for (int i=0 ; i<vector.length;i++){
        System.out.println("ingrese el nombre del competidor :" + i);
        nom = captura.next();
        System.out.println("ingrese el tiempo del competidor");
        vector [i] = captura.nextInt();
    }
    
    System.out.println("los nombres de los competidores son  : \n");
    for(int j=0;j<vector.length;j++ ){
        System.out.println(" tiempos ["+j+"]:" + vector[j]);
    }

    if (promedio >= 330 ){
        System.out.println("usted no pasa a siguiente ronda ");
    } else if (promedio < 330){
        System.out.println("usted paso a la siguiente ronda pero debe esforzarse mas !  ");
    } else if (promedio <= 220){
        System.out.println("usted tubo una buena carrera felicidades " + promedio );
    }
}
}
