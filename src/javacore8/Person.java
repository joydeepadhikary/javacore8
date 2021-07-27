package javacore8;

public class Person {

	private String firstaName;
	private String lastName;
	private Integer age;
	
	public Person(String fName,String lName,int age) {
		this.age=age;
		this.lastName=lName;
		this.firstaName=fName;
	}

	public String getFirstaName() {
		return firstaName;
	}

	public void setFirstaName(String firstaName) {
		this.firstaName = firstaName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [firstaName=" + firstaName + ", lastName=" + lastName + ", age=" + age + "]";
	}	
	

}
