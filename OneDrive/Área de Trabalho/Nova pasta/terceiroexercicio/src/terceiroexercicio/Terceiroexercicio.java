/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terceiroexercicio;
import java.util.Scanner;
/**
 *
 * @author vitor
 */
public class Terceiroexercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Scanner Num = new Scanner (System.in);
   
   System.out.println ("Digite o primeiro número:");
   double a = Num.nextDouble();
   System.out.println ("Digite o segundo número número:");
   double b = Num.nextDouble();
   System.out.println ("Digite o terceiro número");
   double c = Num.nextDouble();
   
   if ((a+b>c) || ((a+c>b)) || (b+c>a))
       if ((a==b) && (a==c) && (b==c))
           System.out.println("Triangulo equilátero");
   else
           if( ((a!=b)) && (a!=c)&& (b!=c))
               System.out.println("Triangulo escaleno");
   else
               if(((a==b) || (a!=c) || ((a==c) && (a!=b)) || ((b==c) && (b!=a))))
                       System.out.println("Triangulo isósceles");
   else
                   System.out.println("Os valores não formam um triangulo");
                   
    }
    
}
