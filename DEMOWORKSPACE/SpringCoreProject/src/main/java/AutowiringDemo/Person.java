package AutowiringDemo;

public class Person
{
	private int id ; //primitive data type
    private String name; //non primitive data type
    private String gender; //non primitive data type  
    private String dob; // non primitive data type
    private Address address; //non primitive data type
    
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", gender=" + gender + ", dob=" + dob + ", address=" + address
				+ "]";
	}
}
