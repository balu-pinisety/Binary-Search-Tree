package com.BinarySearchTree;

/**
 * @author BALU
 * Ability to call methods to create Binary Tree
 * Ability to perform Binary Search Tree Operations
 */
public class Main {

	public static void main(String[] args) {
		// Welcome message
		System.out.println("Program for the Binary Search Tree");
		BinarySearchTree binary= new BinarySearchTree();
		binary.insert(56);
		binary.insert(30);
		binary.insert(70);
		binary.insert(22);
		binary.insert(40);
		binary.insert(11);
		binary.insert(3);
		binary.insert(16);
		binary.insert(60);
		binary.insert(95);
		binary.insert(65);
		binary.insert(63);
		binary.insert(67);
		binary.size();
		binary.search(65);
		binary.search(64);
	}

}
