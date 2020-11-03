package springdemo4;



import org.springframework.beans.factory.annotation.Autowired;

import springdemo4.Address;


public class Employee {
	

	private int id;
	private String name;
	
	@Autowired
	private Address address;
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	
	
	public void work() {
		System.out.println("Emp id is:" + id + "  " + "Name is:" + name +" "+address);
		
			address.display();
	}
	
	
	
	
	
	
	
	
}



