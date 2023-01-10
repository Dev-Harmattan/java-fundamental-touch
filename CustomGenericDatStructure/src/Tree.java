package com.sodiq.datastructures;
class TreeNode<E extends Comparable<E>> {
   // package access members
   TreeNode<E> leftNode; // left node
   E data; // node data
   TreeNode<E> rightNode; // right node

   // constructor initializes data and makes this a leaf node
   public TreeNode(E nodeData){
      data = nodeData;
      leftNode = rightNode = null;
   }

   // locate insertion point and insert new node; ignore duplicate values
   public void insert(E insertValue){
      if(insertValue.compareTo(data) < 0){
         // insert new TreeNode
         if(leftNode == null){
            leftNode = new TreeNode<E>(insertValue);
         }else{ // continue traversing left subtree recursively
            leftNode.insert(insertValue);
         }
      } // insert in right subtree
      else if(insertValue.compareTo(data) > 0) {
         // insert new TreeNode
         if(rightNode == null){
            rightNode = new TreeNode<E>(insertValue);
         } else { // continue traversing right subtree recursively
            rightNode.insert(insertValue);
         }
      }
   }
}


public class Tree<E extends Comparable<E>> {
   private TreeNode<E> root;

   // constructor initializes an empty Tree of integers
   public Tree(){
      root = null;
   }

   public void insertNode(E insertValue){
      if(root == null){
         root = new TreeNode<E>(insertValue); // create root node
      } else {
         root.insert(insertValue); // call the insert method
      }
   }

   // recursive method to perform postorder traversal
   private void preorderHelper(TreeNode<E> node) {
      if (node == null) {
         return;
      }

      preorderHelper(node.leftNode); // traverse left subtree
      preorderHelper(node.rightNode); // traverse right subtree
      System.out.printf("%s ", node.data); // output node data
   }

   // begin preorder traversal
   public void preorderTraversal() {preorderHelper(root);}



   // recursive method to perform preorder traversal
   private void inorderHelper(TreeNode<E> node) {
      if(node == null){
         return;
      }
      System.out.printf("%s ", node.data); // output node data
      postorderHelper(node.leftNode); // traverse left subtree
      postorderHelper(node.rightNode); // traverse right subtree
   }

   // begin inorder traversal
   public void inorderTraversal() {inorderHelper(root);}

   // recursive method to perform inorder traversal
   private void postorderHelper(TreeNode<E> node) {
      if(node == null){
         return;
      }

      inorderHelper(node.leftNode); // traverse left subtree
      System.out.printf("%s ", node.data); // output node data
      inorderHelper(node.rightNode); // traverse right subtree
   }

   // begin postorder traversal
   public void postorderTraversal() {postorderHelper(root);}


}
