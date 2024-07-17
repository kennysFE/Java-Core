package Lab07;

public abstract class SinhVien {
	
	// Atribute 
		protected String id;
		protected String name;
		protected double price;
		protected double tax;
		
	// Method Abstract 
		
		abstract void getDiem();
		// Khi mot function lop cha co thuoc tinhh abstract, bat buoc phai bao fucion do ben trong lop con 
		
	// Method 
		public double getPriceTax(double price, double tax) {
			return this.price * this.tax;
		}
		
		public void infor() {
			System.out.println("get infor from parents");
		}
		
	// Constructor

		public SinhVien(String id, String name, double price, double tax) {
			this.id = id;
			this.name = name;
			this.price = price;
			this.tax = tax;
		}
		
		public SinhVien() {
			
		}

	// Getter, Setter
		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public double getTax() {
			return tax;
		}

		public void setTax(double tax) {
			this.tax = tax;
		}
		
	
		// Overide Method toString
		@Override
		public String toString() {
			return "SinhVien [id=" + id + ", name=" + name + ", price=" + price + ", tax=" + tax + "]";
		}
	
	
		

}
