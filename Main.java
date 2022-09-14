import java.util.Scanner;
public class Main{
  public static void main(String[] args){
   System.out.println("Digite um frase!");  
   Scanner ler = new Scanner(System.in);

   String frase = ler.nextLine(); 

    int contVogal = 0;

     if(frase.contains("a")){
       contVogal++;
     }
     if(frase.contains("e")){
       contVogal++;
     }
     if(frase.contains("i")){
       contVogal++;
     }
     if(frase.contains("o")){
       contVogal++;
     }
     if(frase.contains("u")){
       contVogal++;
     }

    System.out.println("Contando vogais " + contVogal);
    
    
  }
   
 }