
/**
 * Escreva a descrição da classe euromilhoes aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
  import java.util.*;
  public class euromilhoes
  {
    public static void main()
   {
      Random numeroAleatorio = new Random();//Função que gera numeros aleatórios
     
     int [ ] numeros = new int[5]; //Define a dimensão do array
     numeros [0] = numeroAleatorio.nextInt(50)+1;//Guarda numeros em arrays
     numeros [1] = numeroAleatorio.nextInt(50)+1;
     numeros [2] = numeroAleatorio.nextInt(50)+1;
     numeros [3] = numeroAleatorio.nextInt(50)+1;
     numeros [4] = numeroAleatorio.nextInt(50)+1;
     
     int [ ] estrelas = new int[2];//Define a dimensão do array
    
     estrelas [0] = numeroAleatorio.nextInt(12)+1;//Guarda numeros em arrays
     estrelas [1] = numeroAleatorio.nextInt(12)+1;
     
    do{//Faz com que o programa não repita numeros
     numeros [0] = numeroAleatorio.nextInt(50)+1;
     numeros [1] = numeroAleatorio.nextInt(50)+1;
     numeros [2] = numeroAleatorio.nextInt(50)+1;
     numeros [3] = numeroAleatorio.nextInt(50)+1;
     numeros [4] = numeroAleatorio.nextInt(50)+1; 
     
    }while(numeros [0]==numeros [1]||numeros [0]==numeros [2]||numeros [0]==numeros [3]||numeros [0]==numeros [4]
    ||numeros [1]==numeros [2]||numeros [1]==numeros [3]||numeros [1]==numeros [4]
    ||numeros [2]==numeros [3]||numeros[2]==numeros[4]||numeros[3]==numeros[4]);
    
   
    
   
   
   do{//Faz com que o programa não repita numeros
    
     estrelas [0] = numeroAleatorio.nextInt(12)+1;
     estrelas [1] = numeroAleatorio.nextInt(12)+1;
    
   }while(estrelas[0]==estrelas[1]);
   
    
    
    Arrays.sort(numeros);//Ordena os numeros de forma ascendente
    System.out.println("Numeros:");
   for(int i = 0; i<5; i++){//Função de repetição que vai buscar os 5 numeros
       System.out.println(numeros[i]);//Escreve os numeros no ecrã através do for
  }
  
  
    Arrays.sort(estrelas);//Ordena os numeros de forma ascendente
    System.out.println("Estrelas:");
  for(int i = 0;i<2;i++){//Função de repetição que vai buscar os 2 numeros
      System.out.println(estrelas[i]);//Escreve os numeros no ecrã através do for
      
  }
 }
}




    
     
    
