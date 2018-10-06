import java.util.Scanner;

public class Solution {
	private static final String INPUT_REGEX_QUERY = "/^Person=[\\w ]+ Relation=(FATHER|MOTHER|BROTHER|SISTER|SON|DAUGHTER|COUSIN|GRANDMOTHER|GRANDFATHER|GRANDSON|GRANDAUGHTER|AUNT|UNCLE)$/gi";
	private static final String INPUT_REGEX_ADD_EDIT = "/^(FATHER|MOTHER|BROTHER|SISTER|SON|DAUGHTER|COUSIN|GRANDMOTHER|GRANDFATHER|GRANDSON|GRANDAUGHTER|AUNT|UNCLE)=[\\w ]+ (FATHER|MOTHER|BROTHER|SISTER|SON|DAUGHTER|COUSIN|GRANDMOTHER|GRANDFATHER|GRANDSON|GRANDAUGHTER|AUNT|UNCLE)=[\\w ]+$/gi";

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