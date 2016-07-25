// amourik040416, 24/07/2016
// Technical test for ITEC/FCC/LTL - SGCIB

package TestSg;

import java.util.LinkedList;

public class KataTest {

       public static void main(String[] args) {
    	   
              for (int i = 1; i <= 100; i++) {            	  	
                     String res = "";// res: variable où le resultat sera stocké 
                     if ((i % 3) == 0) {
                         res = res + "Foo";
                     }                   

                     if ((i % 5) == 0) {
                         res = res + "Bar";
                     }
               
                     if ((i % 7) == 0) {
                         res = res + "Qix";
                     }
                  
                     int number = i;
                     LinkedList<Integer> list = new LinkedList<Integer>(); // Création d'une Linked list sous forme de pile
                     //conversion chaque nombre en list de digits. ex 37 --> 3;7 pour vérifier si le nombre contient (3, 5 ou 7) 
                     while (number > 0) {
                        list.push( number % 10  ); //insertion de l'élément dans la liste 
                        number = number / 10;
                     }
                     while (!list.isEmpty()) { // la méthode qui vérifie si la liste contient un élément
                        int digit = list.pop(); //supprime l'élément de la liste et renvoie le premier de cette liste pour le tester

                        if(digit == 3){
                            res = res +"Foo";
                        }
                        
                        if(digit == 5){
                            res = res +"Bar";
                        }
                        
                        if(digit == 7){
                            res = res +"Qix";
                        }
                     }
                     //Affichage des nombres si "res" ne prend aucune valeur
                     if(res.length() == 0){
                           System.out.println(i);
                     }

                     else{
                    	 System.out.println(res);
                     }
              }
       }
}