public class Couple {
	Person descendant;
	Person spouse;

	Couple(Person descendant){
		this.descendant = descendant;
	}

	Couple(Person descendant, Person spouse){
		this.descendant = descendant;
		this.spouse = spouse;
	}

	public void setSpouse(Person spouse){
		this.spouse = spouse;
	}

	public String toString(){
		return "Couple["  
		+ "\ndescendant: " + descendant
		+ "\nspouse: " + spouse 
		+ "\n]";
	}
	
}