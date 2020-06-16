/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quartoexercicio;
import java.util.Scanner;
/**
 *
 * @author vitor
 */
public class Quartoexercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         double delta,x1,x2,a,b,c;
          Scanner entrada = new Scanner (System.in);
        System.out.println("Digite um número:");
         a = entrada.nextDouble();
         System.out.println("Digite o segundo número:");
         b = entrada.nextDouble();
          System.out.println("Digite o terceiro número:");
         c = entrada.nextDouble();
         
          if (a!= 0)
            {
                delta = Math.pow(b, 2) - 4 * a * c;
                if (delta > 0)
                {
                    x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
                    x2 = ((-b) - Math.sqrt(delta)) / (2 * a);
                  System.out.println("x1 e x2: " + x1);
                }
                
                else
                {
                    if (delta == 0)
                    {
                        x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
                        System.out.println("x1 e x2: " + x1);

                    }
                    else
                    {
                         System.out.println("A equação não possui números válido");
                    }
                }
            }
        }    
     }
        
    

