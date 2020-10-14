package com.cg.datastructure;

public class Node<K> implements INode<K>
{
	private K key; // for private objects to access we need getters and setters.
	private INode<K> next;

	public Node(K data) {
		this.key = data;
		this.next = null;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public INode<K> getNext() {
		return next;
	}

	public void setNext(INode<K> node) {
		this.next=node;	
	}
}
