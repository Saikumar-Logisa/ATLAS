// Write about error of below snippet

public class Task017 {
	public static void main(String[] args) {
		 Person prs = new Person();
		 prs.name = "John";
		 System.out.println(prs.name);
	}
}

public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }
}

/*

output:

ERROR!
/tmp/Oeqr3ZodDu/Main.java:4: error: name has private access in Person
		 prs.name = "John";
		    ^
ERROR!
/tmp/Oeqr3ZodDu/Main.java:5: error: name has private access in Person
		 System.out.println(prs.name);
		                       ^
2 errors
ERROR!
error: compilation failed


*/

/* Reason:

Here the program is failing is we are trying to access a private variable outside of the class. Hence, we are getting compilation error.
To avoid this, we can use getter and setter methods.


*/

