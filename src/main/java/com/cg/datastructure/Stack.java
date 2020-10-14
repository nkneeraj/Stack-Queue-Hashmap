package com.cg.datastructure;

public class Stack<K> {
	private final LinkedList<K> LinkedList;

	public Stack() {
		this.LinkedList = new LinkedList<>();
	}

	public void push(INode<K> Node) {
		LinkedList.add(Node);
	}
	
	public void print() {
		LinkedList.addPrint();
	}
}
