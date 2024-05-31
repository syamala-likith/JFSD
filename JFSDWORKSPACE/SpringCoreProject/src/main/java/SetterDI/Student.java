package SetterDI;

import java.util.List;

public class Student 
{
	private int id; //primitive data type
	private String name; //non primitive data type
	private String gender; //non primitive data type
	private float age; //primitive data type
	private double cgpa; //primitive data type
	private String email; //non primitive data type
	private boolean graduated; //primitive data type
	private List<String> skills; //collection non primitive data type
	
	
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
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}
	public double getCgpa() {
		return cgpa;
	}
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isGraduated() {
		return graduated;
	}
	public void setGraduated(boolean graduated) {
		this.graduated = graduated;
	}
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", cgpa=" + cgpa
				+ ", email=" + email + ", graduated=" + graduated + ", skills=" + skills + "]";
	}
	
}