package Principal;

import java.util.Scanner;

public class promedio{
    public void Calendar promedio(String s){
        Scanner teclado = new Scanner(System.in);
        // declarar la variable salida
        int r;
        // declarar la variable entrada
        int n1, n2 ,n3;
        System.out.print(s:"promedio parcial1 :");
         n1= teclado. nextInt();
         System.out.print(s:"proporciona parcial 2");
         n2= teclado. nextInt();
         System.out.print(s:"proporciona parcial 3");
         n3 = teclado. nextInt();
         r= n1+n2+n3/3;


    }
}