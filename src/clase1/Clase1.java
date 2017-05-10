/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1;

/**
 *
 * @author ezequiel
 */

import java.util.Scanner;
import java.util.Random;
public class Clase1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String menu="";
        Scanner leer = new Scanner(System.in);
        Random noRan = new Random();
        
        while(true){
        System.out.println("Bienvenido a la matrix elije entre los cuatro ejercicios: ");
        System.out.println("El Cheke se come la del Mark");
        menu=leer.next();
        
        switch(menu){
            
            case "1":
                
        int dado1,dado2,dado3, contarDados=0;
        
        
        dado1 = noRan.nextInt(6)+1;
        dado2 = noRan.nextInt(6)+1;
        dado3 = noRan.nextInt(6)+1;
        
                if (dado1==6) {
                    
                    contarDados++;
                }
                
                if (dado2==6) {
                    contarDados++;
                }
                if (dado3 ==6) {
                    contarDados++;
                }
                
                
                switch(contarDados){
                    case 1:
                        System.out.println("Regular");
                        System.out.println(" Dado 1: "+dado1 +" dado 2: "+dado2+" dado 3: "+ dado3);
                        break;
                    case 2:
                        System.out.println("Muy bien");
                        System.out.println(" Dado 1: "+dado1 +" dado 2: "+dado2+" dado 3: "+ dado3);
                        break;
                    case 3:
                        System.out.println("Pesimo");
                        System.out.println("Dado 1: "+dado1 +" dado 2: "+dado2+" dado 3: "+ dado3);    
                        break;
                }
                    break;
        
            case "2":
        int pares=0;
        double numero=0,suma=0;
        boolean x=true;
        
        System.out.println("Ingresa numeros mayores a 20, inserta 5 numeros pares para terminar");
        
        
        while(x){
        
            System.out.println("Ingresa el sig numero la suma va en: " +suma+" y los pares: "+pares);
           numero=leer.nextDouble();
           
           suma=numero+suma;
           
            if (numero%2==0) {
                pares++;
                
            }
            if (pares == 5) {
                x= false;
                
               System.out.println("La suma se detuvo en: "+suma);
            }
            
            System.out.println();
        }
           
            break;
            
            case "3":
                int mult1, mult2,cont=0;
              mult1= noRan.nextInt(100)+1;
              mult2= noRan.nextInt(100)+1;
              boolean a=true;
               
                while(a){
                   
                int ans= mult1*mult2;
                   
                System.out.print("Te quedan "+(5-cont)+" intentos, resuelve "+mult1+"x"+mult2+"= ");
                int res= leer.nextInt();    
                
                    
                
                
                    if (res==(mult1*mult2)) {
                        
                        System.out.println("Felicidades le atinaste ");
                        a=false;
                    }
                    
                    cont++;
                    if (cont>=5 && a ) {
                       System.out.println("Game over loca sigue intentando");
                        a=false;
                    }
                
                    
               }
                break;
                
            case "4":
                
                int adivinar,adivinando,i=1;
                
                adivinar= noRan.nextInt(100)+1;
              
                
                boolean y=true;
                
                while(y){
                System.out.println("Adivina el numero del 1 al 100, intento:"+i);
                //System.out.println(adivinar);
                adivinando=leer.nextInt();
                
                
                    if (adivinar==adivinando) {
                        y=false;
                       System.out.println("Felicidades adivinaste"); 
                    }
                     if (adivinar>adivinando) {
                        System.out.println("El numero que buscas es mayor que "+adivinando);
                    }
                     if (adivinar<adivinando) {
                        System.out.println("El numero que buscas es menor que "+ adivinando);
                    }
                        i++;
                 }
                
                break;
            case "salir":
                System.exit(0);
                break;
            default:
                System.out.println("Error en la matrix");
                break;
        
        }
        
        
    }
        
    }
    
}
