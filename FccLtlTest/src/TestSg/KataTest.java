// amourik040416, 24/07/2016
// Technical test for ITEC/FCC/LTL - SGCIB

package TestSg;

import java.util.LinkedList;

public class KataTest {

       public static void main(String[] args) {
    	   
              for (int i = 1; i <= 100; i++) {            	  	
                     String res = "";// res: variable o� le resultat sera stock� 
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
                     LinkedList<Integer> list = new LinkedList<Integer>(); // Cr�ation d'une Linked list sous forme de pile
                     //conversion chaque nombre en list de digits. ex 37 --> 3;7 pour v�rifier si le nombre contient (3, 5 ou 7) 
                     while (number > 0) {
                        list.push( number % 10  ); //insertion de l'�l�ment dans la liste 
                        number = number / 10;
                     }
                     while (!list.isEmpty()) { // la m�thode qui v�rifie si la liste contient un �l�ment
                        int digit = list.pop(); //supprime l'�l�ment de la liste et renvoie le premier de cette liste pour le tester

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