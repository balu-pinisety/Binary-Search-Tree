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
	
	/**
	 * Ability to say whether given element is present or not
	 * @param data
	 */
	public void search(int data) {
		int flag = search(root,data);
		if (flag==0) {
			System.out.println(data+" is not present in Binary Tree\n");
		} else {
			System.out.println(data+" is present in Binary Tree\n");
		}
	}
	
    /**
     * Ability to search the whole tree for given element
     * Return the flag data after searching 
     * @param node, data
     * @return flag
     */
    public int search(Node node, int data) {
        int flag = 0;
        // check whether root is null.
        if (node == null) {
            return flag;
        }
        while (node!=null) {
            if (data < node.getData()) {
                node = node.getLeft();
            } else if (data > node.getData()) {
                node = node.getRight();
            } else {
                flag=1;
                break;
            }
        }
        return flag;
    }
}
