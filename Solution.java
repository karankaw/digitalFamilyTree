import java.util.Scanner;

public class Solution {
	private static final String INPUT_REGEX_QUERY = "(?i)^Person=[\\w ]+ Relation=(FATHER|MOTHER|BROTHER|SISTER|SON|DAUGHTER|COUSIN|GRANDMOTHER|GRANDFATHER|GRANDSON|GRANDAUGHTER|AUNT|UNCLE)$";
	private static final String INPUT_REGEX_ADD_EDIT = "(?i)^(FATHER|MOTHER|BROTHER|SISTER|SON|DAUGHTER|COUSIN|GRANDMOTHER|GRANDFATHER|GRANDSON|GRANDAUGHTER|AUNT|UNCLE)=[\\w ]+ (FATHER|MOTHER|BROTHER|SISTER|SON|DAUGHTER|COUSIN|GRANDMOTHER|GRANDFATHER|GRANDSON|GRANDAUGHTER|AUNT|UNCLE)=[\\w ]+$";

	public static void main(String[] args) {
		
		Person person = new Person("Janki Nath Kaw", Gender.MALE);
	
		Couple couple = new Couple(person);

		FamilyTreeNode<Couple> familyTree = new FamilyTreeNode<>(couple);

		System.out.println(familyTree.getData());

		String str;
		System.out.println("Application is started!");
		Scanner sc = new Scanner(System.in); 

		while(!(str = sc.nextLine()).equalsIgnoreCase("exit")){
			System.out.println(str);
			System.out.println(validateInput(str));
		}
	}

	public static boolean validateInput(String str){
		if(str.matches(INPUT_REGEX_QUERY) || str.matches(INPUT_REGEX_ADD_EDIT)){
			return true;
		}
		return false;
	}
}