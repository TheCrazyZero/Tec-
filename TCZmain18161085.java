
package TCZmain18161085;

import java.util.Scanner;


public class TCZmain18161085 {


      public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numero,a,b,i;
        do{
            System.out.print("Dame una cantidad de terminos: ");
            numero = sc.nextInt();
        }
        while(numero<=1);
        System.out.println("Este es el ultimo numero de la sucesion que es de 1 hasta "  + numero +" "); 

        a=1;
        b=1; 

      
        for(i=2;i<=numero;i++)
        {
             System.out.print(b +" ");
             b = a + b;
             a = b- a;
        }
        System.out.println( " ");
    }
}
  