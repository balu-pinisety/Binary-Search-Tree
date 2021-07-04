package com.BinarySearchTree;

/**
 * @author BALU
 * Method of creation of Binary Tree 
 * Methods of operations which can perform on Binary tree
 */
public class BinarySearchTree {
	
	//Creation of Node root
	Node root;
	
	/**
	 * Ability to insert Node in Binary Search Tree by calling method leftRight
	 * @param data
	 */
	public void insert(int data) {
		root = leftRight(root, data);
	}
	
	/**
	 * Ability to compare data with previous data
	 * Selects position Left or Right by comparing
	 * @param root, data
	 * @return root
	 */
	public Node leftRight(Node root, int data) {
		if (root == null) {
			root = new Node(data);
		}
		if (data < root.getData()) {
			root.setLeft(leftRight(root.getLeft(),data));
		}
		if (data > root.getData()) {
			root.setRight(leftRight(root.getRight(),data));
		}
		return root;
	}
	
	/**
	 * Ability to find the size of binary tree
	 */
	public void size() {
		if (size(root)==0) {
			System.out.println("Binary Tree is Empty");
		} else {
			System.out.println("Size of Binary Tree is '"+size(root)+"'\n");
		}
	}
	
	/**
	 * Ability to calculate size by traversing of Node
	 * Calculates the size of left nodes and right nodes
	 * @param node
	 * @return count
	 */
	public int size(Node node) {
		int count;
		if (node == null) {
			count=0;
		} else {
			count = 1+size(node.left)+size(node.right);
		}
		return count;
	}
	
}
