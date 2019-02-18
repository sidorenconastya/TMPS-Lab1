import java.util.Set;

public class Person {
	private String name;
	private String surname;
	private int age;
	private Set<Person> parents;
	
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	public int getAge() {
		return age;
	}
	public Set<Person> getParents() {
		return parents;
	}
	
	public static class Builder{
		private Person newPerson;
		
		public Builder() {
			newPerson = new Person();
		}
		
		public Builder withName(String name) {
			newPerson.name = name;
			return this;
		}
		public Builder withSurname(String surname) {
			newPerson.surname = surname;
			return this;
		}
		
		public Builder withAge(int age) {
			newPerson.age = age;
			return this;
		}
		
		public Builder withParents(Set<Person> parents) {
			newPerson.parents = parents;
			return this;
		}
		
		public Person build(){
			return newPerson;
		}
	}
	
	public static void main(String[] args) {
		Person person = new Person.Builder().withName("John").withSurname("Snow").withAge(32).build();
	}
}
