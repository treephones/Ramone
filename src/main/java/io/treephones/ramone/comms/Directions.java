package io.treephones.ramone.comms;

public enum Directions {

	FORWARD(1),
	BACKWARD(2),
	RIGHT(3),
	LEFT(4);
	
	public int id;
	
	private Directions(int id) {
		this.id = id;
	}
}
