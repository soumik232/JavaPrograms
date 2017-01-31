package com.bridgeLabz.util;

import java.util.LinkedList;
import java.util.Queue;
/**
 * @author bridgeit Satyendra Singh
 * This Class gives the implementation for BinaryTree
 * Insert, Traversal- PreOrder , PostOrder, InOrder records.
 * Breadth Depth search, delete key, catalan number Checking isFull and minimum value for root
 * This class contain one inner class with name Node.
 * Node class used initialize Left, right root with one integer key value.    
 */
public class TreeUtility 
{
	private Node root;
	/**
	 * @param key- Integer value for Node 
	 * This Method is used for invoke Insert Record Method.
	 */
	public void insertTree(int key)
	{
		root=insertRec(root,key);
	}
	/**
	 * @param root 
	 * @param key Integer value to be Store in root
	 * @return Current Node type where key store
	 * This method is used to insert Record into Node type tree 
	 */
	private Node insertRec(Node root, int key)
	{
		if(root == null)
		{
			root = new Node(key);
			return root;
		}
		if(key<root.key)
			root.left = insertRec(root.left,key);
		else if(key>root.key)
			root.right = insertRec(root.right, key);
		return root;
	}
	/**
	 * This Method is used for invoke inOrder Method.
	 */
	public void inOrder() 
	{
		inOrderRec(root);
	}
	/**
	 * @param root- Node type 
	 * This method gives Traversal InOrder type 
	 * traverse order- left root: main root : right root
	 */
	private void inOrderRec(Node root) 
	{
		if(root!=null)
		{
			inOrderRec(root.left);
			System.out.print(root.key+" ");
			inOrderRec(root.right);
		}
	}
	/**
	 * This Method is used for invoke postOrder() Method.
	 */
	public void postOrder() 
	{
		postOrderRec(root);
	}
	/**
	 * @param rootNode type 
	 * This method gives Traversal PostOrder type 
	 * traverse order- left root: right root : main root.
	 */
	private void postOrderRec(Node root) 
	{
		if(root!=null)
		{
			postOrderRec(root.left);
			postOrderRec(root.right);
			System.out.print(root.key+" ");
		}
	}
	/**
	 * This Method is used for invoke preOrder() Method.
	 */
	public void preOrder() 
	{
		preOrderRec(root);
	}
	
	/**
	 * @param root Node type 
	 * This method gives Traversal preOrder type 
	 * traverse order- main root : left root: right root .
	 */
	private void preOrderRec(Node root) 
	{
		if(root!=null)
		{
			System.out.print(root.key+" ");
			preOrderRec(root.left);
			preOrderRec(root.right);
		}
	}
	//this method calls bSTRecOrder()
	
	/**
	 * This Method is used for invoke bSTRec() Method.
	 */
	public void breadthFirstSearch() 
	{
		bSTRec(root);
	}
	//A utility function TODO  traversal of Breadth-first search
	/**
	 * @param root Node type.
	 * This method is basically Breadth first Search Implementation Traversal
	 * Traversal order - Main root : right root: left root up to last root in zigzag .
	 */
	private void bSTRec(Node root) 
	{
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		while(!q.isEmpty())
		{
			Node temp = q.poll();
			System.out.print(temp.key+" ");
			if(temp.left!=null)
				q.add(temp.left);
			if(temp.right!=null)
				q.add(temp.right);
		}
	}
	/**
	 * @param n Number of roots of node type. 
	 * @return nth Catalan number.
	 * A recursive function to find nth catalan number for Binary Tree.
	 */
	public int catalan(int n) {
	    int res = 0;
	    // Base case
	    if (n <= 1) {
	        return 1;
	    }
	    for (int i = 0; i < n; i++) {
	        res += catalan(i) * catalan(n - i - 1);
	    }
	    return res;
	}
	/**
	 * This method is used for invoke bSTRec() Method.
	 */
	public void isFullTree()
	{
		System.out.println(isFullTree(root));
	}
	
    /**
     * @param root Main Node root of Tree.
     * @return boolean value(true or false) 
     * this method check current tree full or not.
     */
    private boolean isFullTree(Node root)
	{
	    // if empty tree
    	if(root == null)
		    return true;
		 // if leaf node
		if(root.left == null && root.right == null )
		    return true;
		// if both left and right subtrees are not null
		// the are full
		if((root.left!=null) && (root.right!=null))
		    return (isFullTree(root.left) && isFullTree(root.right));
		// if none work
		return false;
	}
	/**
	 * @param key Integer value to be delete form Node
	 * This method mainly calls deleteRec()
	 */
	public void deleteKey(int key)
	{
	     root = deleteRec(root, key);
	     System.out.println("key deleted");
	}
	// A recursive function to insert a new key in BST 
	
	/**
	 * @param root Node type 
	 * @param key value to be delete from Node of treeType
	 * @return After delete root then return Modified root of node type.
	 * This method basically delete record form Node of tree Type.
	 */
	private Node deleteRec(Node root, int key)
	{
		// Base Case: If the tree is empty 
        if (root == null)  return root;
 
        // Otherwise, recur down the tree 
        if (key < root.key)
            root.left = deleteRec(root.left, key);
        else if (key > root.key)
            root.right = deleteRec(root.right, key);
 
        // if key is same as root's key, then This is the node
        // to be deleted
        else
        {
            // node with only one child or no child
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
            // node with two children: Get the inorder successor (smallest
            // in the right subtree)
            root.key = minValue(root.right);
            // Delete the inorder successor
            root.right = deleteRec(root.right, root.key);
        }
        return root;
    }
    /**
     * This method return minimum value for tree root
     * @param root-TreeNoot 
     * @return Minimum value
     */
    private int minValue(Node root)
    {
        int minv = root.key;
        while (root.left != null)
        {
            minv = root.left.key;
            root = root.left;
        }
        return minv;
    }
    /**
     * @author bridgeit Satyendra singh
     * This class inner class for TreeUtility
     *In this class we Initialize key , left and right Node as null. 
     */
    private class Node
	{
		int key;
		Node left,right;
		Node(int key)
		{
			this.key=key;
			left=right=null;
		}
	}
}
