package Lab12;

public class GenericClass<T> {
	// T = Type
	// Atribute
	private T content;

	// Constructor
	public GenericClass(T content) {
		this.content = content;
	}

	// Getter, Setter

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}

}
