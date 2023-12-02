package lab8p1_diegorosales;
import java.util.ArrayList;
public class GAME {
    int [][] matriz_0;
    int [][] matriz_actual; 
    ArrayList<String> lista;
    int rondas;
    

    public int getRondas() {
        return rondas;
    }

    public void setRondas(int rondas) {
        this.rondas = rondas;
    }

    public int[][] getMatriz_0() {
        return matriz_0;
    }

    public void setMatriz_0(int[][] matriz_0) {
        this.matriz_0 = matriz_0;
    }

    public int[][] getMatriz_actual() {
        return matriz_actual;
    }

    public void setMatriz_actual(int[][] matriz_actual) {
        this.matriz_actual = matriz_actual;
    }

    public ArrayList<String> getLista() {
        return lista;
    }

    public void setLista(ArrayList<String> lista) {
        this.lista = lista;
    }
    
    public void  Jugar(int r){
    for(int i=0;i<r;i++){
        System.out.println("");
        System.out.println("Ronda: "+(i+1));
     Print(nextGen());
        }
    
    }
    
    
    
public ArrayList<String> nextGen(){
    int temp [][];
    ArrayList<String> l=new ArrayList<>();
    temp = matriz_actual;
int contador=0;
    for(int i=1;i<8;i++){
        contador=0;
        for(int j=1; j<8;j++){
            
            if(temp[i][j]==1){
                if(temp [i-1][j-1]==1){
                    contador++;
                }
                if(temp [i-1][j]==1){
                    contador++;
                }
                if(temp [i-1][j+1]==1){
                    contador++;
                }if(temp [i][j-1]==1){
                    contador++;
                }
                if(temp [i][j+1]==1){
                    contador++;
                }
                if(temp [i+1][j-1]==1){
                    contador++;
                }
                if(temp [i+1][j]==1){
                    contador++;
                }
                if(temp [i+1][j+1]==1){
                    contador++;
                    
                    if(contador==2){
                        temp[i][j]=1;
                        }
                    else if(contador>2 || contador<2){
                     temp[i][j]=0;
                        }
                }
            
            }
            else if(temp[i][j]==0){
                if(temp [i-1][j-1]==1){
                    contador++;
                }
                if(temp [i-1][j]==1){
                    contador++;
                }
                if(temp [i-1][j+1]==1){
                    contador++;
                }if(temp [i][j-1]==1){
                    contador++;
                }
                if(temp [i][j+1]==1){
                    contador++;
                }
                if(temp [i+1][j-1]==1){
                    contador++;
                }
                if(temp [i+1][j]==1){
                    contador++;
                }
                if(temp [i+1][j+1]==1){
                    contador++;
                }
                
                if(contador==3){
                    temp[i][j]=1;
                }
                else if(contador>3||contador<3){
                    temp[i][j]=0;
                }
                
            }
            
            
            
        }
    }
     for(int i=0;i<10;i++){
        for(int j=0;j<10;j++){
                     if(temp[i][j]==1){
                         l.add(Integer.toString(i)+":"+Integer.toString(j));
                  }
             }
         }
     System.out.println(l);
    matriz_actual= temp;
    return l;
}
  public void Print(ArrayList<String>x){
       

      String index ;
      int cx;
      int cy;
     int [][] tempp  = new int[10][10];
      for (int i = 0; i < x.size(); i++) {
          index = x.get(i);
          cx = (int)index.charAt(0)-(int)'0';
          cy=(int)index.charAt(2)-(int)'0';
          tempp[cx][cy] = 1;
          
      }
      for (int i = 0; i< tempp.length; i++) {
          for (int j = 0; j < tempp[i].length; j++) {
              System.out.print(" [ "+tempp[i][j]+" ] ");
              
          }
          System.out.println("");
          
      }
      
     
}
  
}