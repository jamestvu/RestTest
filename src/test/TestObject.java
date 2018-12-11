package test;

import lombok.Data;

@Data
public class TestObject {
	
	private int id;
	private String name;
	
	public TestObject(int i, String string) {
		id = i;
		name = string;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
