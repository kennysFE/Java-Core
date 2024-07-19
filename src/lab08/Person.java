package lab08;

public class Person implements IPerson {
	
	// Atribute 
	protected String id;
	protected String name;
	protected int age;
	
	// Constructor 
	
	public Person() {
		
	}
	
	public Person(String id, String name,int age ) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	// Getter, setter
	
	public String getId() {
		return this.id; 
	}
	
	public String getName() {
		return this.name; 
	}

	public int getAge() {
		return this.age; 
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	
	@Override
	public void input() {
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println();
		
	}

	// Method toString
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
