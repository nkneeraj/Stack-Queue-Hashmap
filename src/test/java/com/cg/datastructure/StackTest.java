package com.cg.datastructure;

import org.junit.Assert;
import org.junit.Test;
public class StackTest {
	@Test
	public void addTest() {
		Node<Integer> firstNode = new Node<Integer>(70);
		Node<Integer> secondNode = new Node<Integer>(30);
		Node<Integer> thirdNode = new Node<Integer>(56);
		Stack<Integer> stack = new Stack<>();
		stack.push(firstNode);
		stack.push(secondNode);
		stack.push(thirdNode);
		stack.print();		
	}
	
	@Test
	public void peakAndPopTest() {
		Node<Integer> firstNode = new Node<Integer>(70);
		Node<Integer> secondNode = new Node<Integer>(30);
		Node<Integer> thirdNode = new Node<Integer>(56);
		Stack<Integer> stack = new Stack<>();
		stack.push(firstNode);
		stack.push(secondNode);
		stack.push(thirdNode);
		boolean result = stack.peak().equals(thirdNode);
		Assert.assertTrue(result);
		stack.pop();
		result = stack.peak().equals(secondNode);
		Assert.assertTrue(result);
		
	}
}
