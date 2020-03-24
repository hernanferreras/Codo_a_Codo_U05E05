
package u05e05;

import java.util.Scanner;
public class U05E05 {
    public static void main(String args[]) {
        Scanner entrada=new Scanner(System.in);
        int num1, divisores;
        String primo;
        System.out.print("Ingrese el numero a calcular la cantidad de divisores: ");
        num1=entrada.nextInt();
        divisores=cantidadDeDivisores(num1);
        if (divisores==2){
            primo=(" es primo");
        }else
            {
                primo=(" no es primo");
            }
        System.out.print("La cantidad de divisores del numero "+num1+" es "+divisores+", por lo tanto,"+primo);
    }
    static int cantidadDeDivisores(int a){
        int i, contador=0;
        for(i=1; i<=a; i++){
            if ((a%i)==0){
                contador++;
            }
        }
        return(contador);
    }
}