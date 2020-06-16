/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoexercicio;
import java.util.Scanner;
/**
 *
 * @author vitor
 */
public class Segundoexercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double valor;
       Scanner entrada = new Scanner (System.in);
       System.out.println("Digite um número:");
       double num1 = entrada.nextDouble();
       
       valor = num1;
      if(valor<3){
          System.out.println("O valor é: "+valor);
      }else{
          System.out.println("O valor apresentado é invalido");
      }
      }
      
    }
    

