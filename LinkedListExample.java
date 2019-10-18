import java.util.*;
public class LinkedListExample{
   public static void main(String args[]){

     LinkedList<String> list=new LinkedList<String>();

     //Adding elements to the Linked list
     list.add("Mohamed");
     list.add("Ahmed");
     list.add("Ali");

     //Adding an element to the first position
     list.addFirst("Abdelrahman");

     //Adding an element to the last position
     list.addLast("Hassan");

     //Adding an element to the 3rd position
     list.add(2, "Saad");

     //Iterating LinkedList
     Iterator<String> iterator=list.iterator();
     while(iterator.hasNext()){
       System.out.println(iterator.next());
     }
   } 
} 
