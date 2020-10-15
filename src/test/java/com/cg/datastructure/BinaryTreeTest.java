package com.cg.datastructure;

import org.junit.Test;

import org.junit.Assert;

public class BinaryTreeTest {
	
	@Test
	public void addBinaryNodeTest() {
		BinaryTree<Integer> binaryTree = new BinaryTree<>();
		binaryTree.add(56);
		binaryTree.add(30);
		binaryTree.add(70);
		int size = binaryTree.getSize();
		Assert.assertEquals(3, size);
	}
	
	@Test
	public void addBinaryNodeReturnSizeTest() {
		BinaryTree<Integer> binaryTree = new BinaryTree<>();
		binaryTree.add(56);
		binaryTree.add(30);
		binaryTree.add(70);
		binaryTree.add(22);
		binaryTree.add(3);
		binaryTree.add(16);
		binaryTree.add(65);
		binaryTree.add(63);
		binaryTree.add(67);
		binaryTree.add(40);
		Assert.assertEquals(10, binaryTree.getSize());
	}
	
	@Test
	public void searchNodeTest() {
		BinaryTree<Integer> binaryTree = new BinaryTree<>();
		binaryTree.add(56);
		binaryTree.add(30);
		binaryTree.add(70);
		binaryTree.add(22);
		binaryTree.add(3);
		binaryTree.add(16);
		binaryTree.add(65);
		binaryTree.add(63);
		binaryTree.add(67);
		binaryTree.add(40);
		Assert.assertTrue(binaryTree.search(56));
	}	
}
