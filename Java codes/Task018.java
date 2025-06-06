// Getter and Setter

public class Task018 {
	public static void main(String[] args) {
		 Person prs = new Person();
		 prs.setName("John");
		 System.out.println(prs.getName());
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


// output : John