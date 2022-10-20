/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrices4a2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
                                                                                                                                              
/**
 *
 * @author guada
 */
public class Matrices4a2 {
    
    public static BufferedReader bufer=new BufferedReader(new InputStreamReader(System.in));
    public static String entrada;
    
    public static int[][]rellenarMatriz(int r, int c) throws IOException{
        int[][]array=new int[r][c];
        
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[0].length;j++){
                System.out.println("Escribe el valor ["+i+"]["+j+"]:");
                entrada=bufer.readLine();
                array[i][j]=Integer.parseInt(entrada);
            }
        }
         return array;   
    }
    public static int[][] sumarMatrices(int[][]a, int[][]b){
        int[][]c = new int [a.length][a.length];
        
          for(int i = 0; i < a.length; i++)
        for(int j = 0; j < a.length; j++)
            c[i][j]=a[i][i] + b [i][i];
        return c;
    }

    public static void ImprimirMatriz(int[][] array){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[0].length;j++){
                System.out.printf("%3d",array[i][j]);
                
            }
            System.out.println();
        }
    }
            
        // TODO code application logic here
        public static void main(String[]args) throws IOException{
    int renglones, columnas;
    int[][]matriz1, matriz2 ,matriz3;
    
    System.out.println("Programa que suma los valores de dos matrices de datos enteros");
     System.out.println("escriba el numero de renglones de la matriz");
     entrada=bufer.readLine();
     renglones = Integer.parseInt(entrada);
      System.out.println("Escriba el numero de columnas de la matriz");
      entrada=bufer.readLine();
      columnas = Integer.parseInt(entrada);
      if (renglones!= columnas){
          System.out.println("No se pueden sumar matrices que no sean cuadradas");
          System.exit(1);
          
      }
            System.out.println("...................................................");
            System.out.println("Introduccion de los valores de la matriz1");
      entrada=bufer.readLine();
      matriz1 = rellenarMatriz(renglones, columnas);
       System.out.println("...................................................");
            System.out.println("Introduccion de los valores de la matriz2");
            matriz2= rellenarMatriz(renglones,columnas);
            matriz3= sumarMatrices(matriz1,matriz2);
            System.out.println("..................................................");
            System.out.println("Impresion de resultados");
       System.out.println("****Matriz1*****");
       ImprimirMatriz(matriz1);
            System.out.println("****Matriz2*****");
            ImprimirMatriz(matriz2);
            System.out.println("****Matriz3= matriz1 = Matriz2*****");
            ImprimirMatriz(matriz3);
         
}
    }
