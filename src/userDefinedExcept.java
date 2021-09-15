

public class userDefinedExcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person1 p1;
		try {
		p1 = new Person1(25,"n",10);
		System.out.println("p1 created"+p1);

	}catch(Exception w){
		System.out.println("caught age"+w);
	}
		
	}

}
class Person1{
	int age;
	String name;
	int wt;
	public Person1(int age, String name, int wt) throws ageException, Person1.wtException {
		super();
		if(age>1 && age<100) {
		this.age = age;
		System.out.println("age is"+age);
		}
		else {
			throw  new ageException("invalid age");
		}
		
		this.name = name;
		if(wt<200) {
		this.wt = wt;
	}else {
		throw new wtException("wt reduce");
		
	}
	
}
class ageException extends Exception{

	
	
	

	public ageException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
}
class wtException extends Exception{

	public wtException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}

	
}