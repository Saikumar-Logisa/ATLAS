// What is the output of the below code snippet


public class Task016 {
	public static void main(String[] args) {
		color c1 = color.yellow;
		System.out.println(c1);	
	}
	
	enum color{
	    red, blue, green, yellow
	}
}

/*
output:

yellow

*/


public class Task016_01 {

	public static void main(String[] args) {
		Weekdays c1 = Weekdays.Tuesday;
		System.out.println(c1);	
	}
	
	enum Weekdays{
	    Sunday , Monday , Tuesday
	}
}

/*
output:

Tuesday
*/