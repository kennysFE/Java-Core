package lab06;

public class Student {
	// Atribute 
	private String name;
	private String id;
	
	// Contructor 
	public Student() {
		
	}
	
	public Student(String name, String id) {
		this.name = name;
		this.id = id;
	}
	
	
	// Method override 
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}

	// Getter, Setter
	public String getName() {
		return name; 
	}
	
	public String getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setId(String id) {
		this.id = id;
	}
		
	
}
