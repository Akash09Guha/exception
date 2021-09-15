import java.util.Scanner;

/*
public class UserDefinedExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("begin main");
		Person p;
		try {
			p = new Person('m',655,"ram");
			System.out.println("p"+p);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();//helps to display the full trace of the exception
		}

		System.out.println("end of main");

	}

}
class Person{
	char gender;
	int age;
	String name;

	public Person(char gender, int age, String name) throws Exception {
		super();
		System.out.println("constructor starts");
		if(gender=='M'||gender=='m'||gender=='F'||gender=='f') {
		this.gender = gender;}
		else// {System.out.println("enter correctly");}
		{
			//RuntimeException r =new RuntimeException("invalid gender");
			Exception r =new Exception("invalid gender");
			throw r;
		}
		if(age>=1 && age<=120)
		this.age = age;
		else {
			RuntimeException r =new RuntimeException("invalid age");
			throw r;
		}
		this.name = name;
		System.out.println("end of cons");
	}
	@Override
	public String toString() {
		return "Person [gender=" + gender + ", age=" + age + ", name=" + name + "]";
	}
	
}*/
/*
 * Person p1 = new Person('R',22,"Jack");
 *  |     |     |	|
 *  class ref   |	follows the allocator
 *  			|
 *  		allocator is used
 *  		to allocate
 *  		the Data structure
 *  		*ALLOCATOR CAN ROLLBACK THE ALLOCATION IF THE CONSTRUCTOR 
 *  		IS TERMINATED MIDWAY VI RETURN OR THROWING AN EXCEPTION
 *  		by leaving the reference to null value
 *  
 *  					gender	age		name
 *  					-------------------------
 *  					|		|		|		|
 *  					-------------------------
 *      +-------------->100
 * 		|
 *    100
 * 	   p1
 * 			
 * 
 */
/*public class UserDefinedExceptionTest {
	public static void main(String[] args) 
	{
		System.out.println("begin main");
		Person p1;
		
			try {
				p1 = new Person('M',220,"Jack");
				System.out.println("p1 "+p1);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e); //classname + message
				//System.out.println(e.getMessage()); //only message
				//e.printStackTrace();
			}
			
		
	
		System.out.println("End  of main");
	}
}
class Person
{
	char gender;
	int age;
	String name;
	
	//throw means literally thowing it
	//throws - declaration of a method to throw a "checked exception"

	//if you are throwing unchecked exceptions, then throws clause is
	//not mandatory, and even handling try..catch is also optional
//
	public Person(char gender, int age, String name)  throws Exception
	{
		super();
		System.out.println("=>Person(...) constructor started....");
		if(gender =='M' || gender =='m' || gender =='f' || gender=='F')
			this.gender = gender;
		else {
			//System.out.println("Invalid gender");
			//RuntimeException r = new RuntimeException ("Invalid Gender");
			Exception r = new Exception ("Invalid Gender");
			throw r; //control would exit from here
		}
		
		if(age>=1 && age<=120)
			this.age = age;
		else {
			//RuntimeException r = new RuntimeException ("Invalid Age");
			Exception r = new Exception ("Invalid Age");
			throw r;
		}
		String regEx="^[a-zA-Z\\\\s]+";
		if(name.matches(regEx)) {
			this.name = name;	
		}
		else {
			//RuntimeException r = new RuntimeException ("Invalid Name");
			Exception r = new Exception ("Invalid Name");
			throw r;
		}
		
		System.out.println("=>Person(...) constructor finished....");
	}

	@Override
	public String toString() {
		return "Person [gender=" + gender + ", age=" + age + ", name=" + name + "]";
	}
	
}
class PersonException extends Exception
{
	PersonException(string )
}
class Gender extends Exception{
	GenderException(String msg){
		super(msg);
	}
	
}
public class UserDefinedExceptionTest {
	public static void main(String[] args) 
	{
		System.out.println("begin main");
		Person p1;
		
			try {
				p1 = new Person('y',22,"Ja34ck");
				System.out.println("p1 "+p1);
			}
			
			catch(GenderException e) {
				System.out.println("Problem1 : "+e);
			}
			catch(AgeException e) {
				System.out.println("Problem2 : "+e);
			}
			catch(NameException e) {
				System.out.println("Problem3 : "+e);
			}
			catch(PersonException e) {
				System.out.println("Problem : "+e);
			}
			catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Problem : "+e); //classname + message
				//System.out.println(e.getMessage()); //only message
				//e.printStackTrace();
			}
			
		
	
		System.out.println("End  of main");
	}
}
class Person
{
	char gender;
	int age;
	String name;
	
	//throw means literally thowing it
	//throws - declaration of a method to throw a "checked exception"

	//if you are throwing unchecked exceptions, then throws clause is
	//not mandatory, and even handling try..catch is also optional
//
	public Person(char gender, int age, String name)  throws PersonException //, GenderException, AgeException,NameException
	{
		super();
		
		if(gender =='T') {
			throw new PersonException("Invalid gender");
		}
		System.out.println("=>Person(...) constructor started....");
		if(gender =='M' || gender =='m' || gender =='f' || gender=='F')
			this.gender = gender;
		else {
			//System.out.println("Invalid gender");
			//RuntimeException r = new RuntimeException ("Invalid Gender");
			GenderException r = new GenderException ("Invalid Gender");
			throw r; //control would exit from here
		}
		
		if(age>=1 && age<=120)
			this.age = age;
		else {
			//RuntimeException r = new RuntimeException ("Invalid Age");
			AgeException r = new AgeException ("Invalid Age");
			throw r;
		}
		String regEx="^[a-zA-Z\\\\s]+";
		if(name.matches(regEx)) {
			this.name = name;	
		}
		else {
			//RuntimeException r = new RuntimeException ("Invalid Name");
			NameException r = new NameException ("Invalid Name");
			throw r;
		}
		
		System.out.println("=>Person(...) constructor finished....");
	}

	@Override
	public String toString() {
		return "Person [gender=" + gender + ", age=" + age + ", name=" + name + "]";
	}
	
}

class PersonException extends Exception
{
	PersonException(String str) {
		super(str);
	}
}
class GenderException extends PersonException
{
	GenderException(String msg) {
		super(msg);
	}
}
class AgeException extends PersonException
{
	AgeException(String msg) {
		super(msg);
	}
}
class NameException extends PersonException
{
	NameException(String msg) {
		super(msg);
	}
}*/
public class UserDefinedExceptionTest {
	public static void main(String[] args) 
	{
		System.out.println("begin main");
		Person p1;
		
		Scanner scanInt = new Scanner(System.in);
		Scanner scanStr1 = new Scanner(System.in);
		Scanner scanStr2 = new Scanner(System.in);
		
		int choice=0;
		while(choice==0)
		{
			System.out.println("Enter gender : ");
			char gender = scanStr1.next().charAt(0); //M<--|
			
			System.out.println("Enter age    : ");
			int age = scanInt.nextInt(); //22<-|
		
			System.out.println("Enter gender : ");
			String name = scanStr2.nextLine(); //NEW YORK
			
			try {
				p1 = new Person(gender,age,name);
				System.out.println("p1 "+p1);
			}
			/*catch(GenderException|AgeException|NameException e) {
				System.out.println("Problem1 : "+e);
			}*/
			catch(GenderException e) {
				System.out.println("Problem1 : "+e);
			}
			catch(AgeException e) {
				System.out.println("Problem2 : "+e);
			}
			catch(NameException e) {
				System.out.println("Problem3 : "+e);
			}
			catch(PersonException e) {
				System.out.println("Problem : "+e);
			}
			catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Problem : "+e); //classname + message
				//System.out.println(e.getMessage()); //only message
				//e.printStackTrace();
			}
			Scanner scan = new Scanner(System.in);
			System.out.println("Press 0 to continue...");
			choice = scan.nextInt();
		}
	
		System.out.println("End  of main");
	}
}
class Person
{
	char gender;
	int age;
	String name;
	
	//throw means literally thowing it
	//throws - declaration of a method to throw a "checked exception"

	//if you are throwing unchecked exceptions, then throws clause is
	//not mandatory, and even handling try..catch is also optional
//
	public Person(char gender, int age, String name)  throws PersonException //, GenderException, AgeException,NameException
	{
		super();
		
		if(gender =='T') {
			throw new PersonException("Invalid gender");
		}
		System.out.println("=>Person(...) constructor started....");
		if(gender =='M' || gender =='m' || gender =='f' || gender=='F')
			this.gender = gender;
		else {
			//System.out.println("Invalid gender");
			//RuntimeException r = new RuntimeException ("Invalid Gender");
			GenderException r = new GenderException ("Invalid Gender");
			throw r; //control would exit from here
		}
		
		if(age>=1 && age<=120)
			this.age = age;
		else {
			//RuntimeException r = new RuntimeException ("Invalid Age");
			AgeException r = new AgeException ("Invalid Age");
			throw r;
		}
		String regEx="^[a-zA-Z\\\\s]+";
		if(name.matches(regEx)) {
			this.name = name;	
		}
		else {
			//RuntimeException r = new RuntimeException ("Invalid Name");
			NameException r = new NameException ("Invalid Name");
			throw r;
		}
		
		System.out.println("=>Person(...) constructor finished....");
	}

	@Override
	public String toString() {
		return "Person [gender=" + gender + ", age=" + age + ", name=" + name + "]";
	}
	
}

class PersonException extends Exception
{
	PersonException(String str) {
		super(str);
	}
}
class GenderException extends PersonException
{
	GenderException(String msg) {
		super(msg);
	}
}
class AgeException extends PersonException
{
	AgeException(String msg) {
		super(msg);
	}
}
class NameException extends PersonException
{
	NameException(String msg) {
		super(msg);
	}
}