package com.sodiq.datastructures;
import java.util.NoSuchElementException;


// class to represent one node in a list
class ListNode<E> {
   // package access members; List can access these directly
   E data; // data for this node
   ListNode<E> nextNode; // reference to the next node in the list

   // constructor creates a ListNode that refers to object
   ListNode(E object){
      this(object, null);
   }


   // constructor creates ListNode that refers to the specified
   // object and to the next ListNode
   ListNode(E object, ListNode<E> node){
      data = object;
      nextNode = node;
   }

   // return reference to data in node
   E getData(){
      return  data;
   }

   // return reference to next node in list
   ListNode<E> getNextNode(){
      return nextNode;
   }
}

// class List definition
public class List<E> {
   private ListNode<E> firstNode;
   private ListNode<E> lastNode;
   private String name;

   public List(){
      this("List");
   }

   public List(String listName){
      name = listName;
      firstNode = lastNode = null;
   }

   // insert item at front of List
   public void insertAtFront(E insertItem){
      if(isEmpty()){ // firstNode and lastNode refer to same object
         firstNode = lastNode = new ListNode<E>(insertItem);
      } else { // firstNode refers to new node
         firstNode = new ListNode<E>(insertItem, firstNode);
      }
   }

   // insert item at end of List
   public void insertAtBack(E insertItem){
      if(isEmpty()){
         firstNode = lastNode = new ListNode<E>(insertItem);
      } else {
         lastNode = lastNode.nextNode = new ListNode<E>(insertItem);
      }
   }

   // remove first node from List
   public E removeFromFront() throws NoSuchElementException {
      if(isEmpty()){
         throw new NoSuchElementException(name + " is empty");
      }

      E removeItem = firstNode.data; // retrieve data being removed

      // update references firstNode and lastNode
      if(firstNode == lastNode){
         firstNode = lastNode = null;
      } else {
         firstNode = firstNode.nextNode;
      }

      return removeItem; // return removed node data
   }

   // remove last node from List
   public E removeFromBack() throws NoSuchElementException {
      if(isEmpty()){
         throw new NoSuchElementException(name + " is empty");
      }

      E removeItem = lastNode.data;

      if(firstNode == lastNode){
         firstNode = lastNode = null;
      } else { //locate the lastNode
         ListNode<E> current = firstNode;

         while(current.nextNode != lastNode){
            current = current.nextNode;
         }
         lastNode = current;
         lastNode.nextNode = null;
      }
      return removeItem;
   }

   // determine whether list is empty; returns true if so
   public boolean isEmpty(){
      return firstNode == null;
   }

   public void print() {
        if (isEmpty()) {
           System.out.printf("Empty %s%n", name);
           return;
        }

        System.out.printf("The %s is: ", name);
        ListNode<E> current = firstNode;

       // while not at end of list, output current node's data
       while (current != null) {
          System.out.printf("%s ", current.data);
          current = current.nextNode;
       }
       System.out.println();
    }
}