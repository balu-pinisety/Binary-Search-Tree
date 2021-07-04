package com.BinarySearchTree;

/**
 * @author BALU
 * Ability to create Node for Binary Search Tree
 */
public class Node {
	
	int data;
	Node left, right;
	
	/**
	 * Constructor for Node class
	 * @param data
	 */
	public Node(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
	
	//Getters and Setters for node Class
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}
	
 }
