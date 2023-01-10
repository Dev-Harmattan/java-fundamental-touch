package com.sodiq.datastructures;
import java.util.NoSuchElementException;

public class Stack<E> {
   private List<E> stackList;

   // constructor
   public Stack(){
      stackList = new List<E>("Stack");
   }

   // add object to stack
   public void push(E object){
      stackList.insertAtFront(object);
   }

   // remove object from stack
   public E pop() throws NoSuchElementException {
      return stackList.removeFromFront();
   }

   public boolean isEmpty(){
      return stackList.isEmpty();
   }

   public void print(){
      stackList.print();
   }
}
