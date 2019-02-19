/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej;

/**
 *
 * @author Estudiante
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //tipos basicos de datos
        int a;
        short b;
        long c;
        byte d;
        float e;
        double f;
        boolean g;
        //asignar valores
        a = 2+4;
        /**
         * Aritmeticos
         * + - * / %
         * Relacionales
         * == != < > <= >=
         * Logicos
         * && || !
         */
        
        // imprimir
        System.out.println("texto a visualizar "+a);
        
        int[] x;
        int y[];
        
        y = new int[10];
        x = new int[5];
        
        int[] z = {2,6,4,1,9};
        
        //estructuras de control 
        //condicionales
        if(a >= 2){
            b = 8;
        }else{
            b = 2;
        }
        //segun sea
        switch(b){
            case 8:
                c= 20;
                break;
            case 2:
                c = 10;
                break;
            default:
                c = 5;
        }
        //repetitivas
        for(int i = 0; i < z.length; i++){
            System.out.println("["+z[i]+"]");
        }
        
        for(int i:z){
            System.out.println(i);
        }
        
        
        int n = 110;
        if(n >= 0 && n <= 100){
            System.out.println("true");
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
