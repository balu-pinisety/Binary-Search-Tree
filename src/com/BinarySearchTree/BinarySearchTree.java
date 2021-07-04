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
			root.setLeft(leftRight(root.left.getLeft(),data));
		} else {
			root.setRight(leftRight(root.getRight(),data));
		}
		return root;
	}
	
}
