import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Solution {


	private static final FamilyTreeNode<Couple> familyTree = new FamilyTreeNode<>(null);

	private static final String INPUT_REGEX_QUERY = "(?i)^Person=[\\w ]+ Relation=(FATHER|MOTHER|BROTHER|SISTER|SON|DAUGHTER|COUSIN|GRANDMOTHER|GRANDFATHER|GRANDSON|GRANDAUGHTER|AUNT|UNCLE)$";
	private static final String INPUT_REGEX_ADD_EDIT = "(?i)^(HUSBAND|WIFE|FATHER|MOTHER|BROTHER|SISTER|SON|DAUGHTER|COUSIN|GRANDMOTHER|GRANDFATHER|GRANDSON|GRANDAUGHTER|AUNT|UNCLE)=([\\w]+) (HUSBAND|WIFE|FATHER|MOTHER|BROTHER|SISTER|SON|DAUGHTER|COUSIN|GRANDMOTHER|GRANDFATHER|GRANDSON|GRANDAUGHTER|AUNT|UNCLE)=([\\w]+)$";

	public static void main(String[] args) {
			
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
			processCreateEdit(str);
			return true;
		}
		return false;
	}


	public static void processCreateEdit(String str){
		//Husband=Bern Wife=Julia
		//Mother=Zoe Sun=Boris

		String fullMatch;
		String relation1;
		String relation2;
		String name1;
		String name2;

		Pattern pattern = Pattern.compile(INPUT_REGEX_ADD_EDIT);
		Matcher matcher = pattern.matcher(str);
		while (matcher.find()) {

			fullMatch = matcher.group(0);
			relation1 = matcher.group(1);
    		name1 = matcher.group(2);
    		relation2 = matcher.group(3);
    		name2 = matcher.group(4);

    		System.out.println("fullMatch" + fullMatch);
			System.out.println("relation1: " + relation1);
    		System.out.println("name1: " + name1);
    		System.out.println("relation2: " + relation2);
    		System.out.println("name2: " + name2);

    	if( relation1.equalsIgnoreCase(Relationships.HUSBAND.name()) && relation2.equalsIgnoreCase(Relationships.WIFE.name())){

    			Person person1 = new Person(name1, Gender.MALE);
    			Person person2 = new Person(name2, Gender.FEMALE);
    			Couple couple = new Couple(person1, person2);

				familyTree.setData(couple);

				System.out.println(familyTree.getData());
    	}
}


	}
}