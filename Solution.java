import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		
		Person person = new Person("Janki Nath Kaw", Gender.MALE);
	
		Couple couple = new Couple(person);

		FamilyTreeNode<Couple> familyTree = new FamilyTreeNode<>(couple);

		System.out.println(familyTree.getData());

		String str;
		Scanner sc = new Scanner(System.in); 

		while(!(str = sc.nextLine()).equalsIgnoreCase("exit")){
			System.out.println(str);
		}

	}
}