package lab8p1_diegorosales;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
public class Lab8P1_DiegoRosales {
    public static Scanner mcgregor = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {
        ArrayList<String> list;
        int a=3;
        while(a==3){
        System.out.println("~~~ BIENVENIDO AL MENU ~~~");
        System.out.println("1.~ El juego de la vida");
        System.out.println("2.~ Terminar");
        int opcion_menu = mcgregor.nextInt();
        switch(opcion_menu){
                case 1: System.out.println("Inserte la cantidad e rondas: ");
                    
                    GAME G = new GAME();
                    int rondas = mcgregor.nextInt();
                    G.setRondas(rondas);
                    ArrayList<String> lista = new ArrayList<>();
                    int matriz_0 [][] = new int [10][10]; 
                    G.setMatriz_0(matriz_0);
                    int matriz_actual [][] = new int [10][10];
                    matriz_actual = llenarmatriz(matriz_actual,matriz_0,lista);
                    G.setMatriz_actual(matriz_actual);
                    System.out.println("ESTA IMPRESION NO CUENTA COMO RONDA, ES EL TABLERO INICIAL");
                
                    imprimir_tablero(matriz_actual);
                    
                    System.out.println(lista);
                    G.setLista(lista);
                   
                    G.Jugar(rondas);
                    
                    
                    
                    
                    
                    
                    
                    
                    break;
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                case 2: System.out.println("Fin del programa");
                a = 1;
                break;
                     
        
        }
        }
    }// FIN DEL MAIN
    
    public static int [][] llenarmatriz(int [][] matA, int [][] mat0, ArrayList<String> lista){
         int [][] temp = new int [10][10];
         for(int i=0;i<10;i++){
            
             for(int j=0;j<10;j++){
                  if(j==9 || j==0 || i==0|| i==9){
                 temp [i][j]= 0;
             }
                  else{
                 temp [i][j] = rand.nextInt(0,2);
                  }
                  if(temp[i][j]==1){
                      
                  }
                  if(temp[i][j]==1){
                  lista.add(Integer.toString(i)+":"+Integer.toString(j));
                  }
             }
         }
         System.out.println("");
         
        
        return temp;
    }
   

    public static void imprimir_tablero(int [][] temp){
         for(int i=0;i<10;i++){
             for(int j=0;j<10;j++){
                 System.out.print(" [ "+temp[i][j]+" ] ");
             }
             System.out.println("");
         }
        
    }
    
  
    
    
    
} // FIN DE LA CLASS 
