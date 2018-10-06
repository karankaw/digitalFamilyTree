public class Person{

	private String name;
	private Gender gender;

	Person(String name, Gender gender){
		this.name = name;
		this.gender = gender;
	}

	public String toString(){
		return "Person [" + name + ", " + gender + "]";
	}
}