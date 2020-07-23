/******************************************************************************

                            VINAYAKA MUDRADI

*******************************************************************************/
import java.util.Scanner;
class Student{
    public String fname;
    public String mname;
    public String lname;
    public int age;
}
public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int size = 0;
		String password = "";
		System.out.println("Enter the number of Students:");
		size = s.nextInt();
		Student[] object = new Student[size];
		for(int i=0; i<object.length; i++){
		    object[i] = new Student();
		    System.out.println("Enter the first name:");
		    object[i].fname = s.next();
		    System.out.println("Enter the middle name:");
		    object[i].mname = s.next();
		    System.out.println("Enter the last name:");
		    object[i].lname = s.next();
		    System.out.println("Enter the age:");
		    object[i].age = s.nextInt();
		    System.out.println("\n\nGenerating Password.....");
		    for(int k=0; k<object[i].fname.length(); k++){
		        if((int)object[i].fname.charAt(k) > 64 && (int)object[i].fname.charAt(k) < 91){
		            password = password + object[i].fname.charAt(k);
		        }
		    }
		    for(int k=0; k<object[i].mname.length(); k++){
		        if((int)object[i].mname.charAt(k) > 64 && (int)object[i].mname.charAt(k) < 91){
		            password = password + object[i].mname.charAt(k);
		        }
		    }
		    for(int k=0; k<object[i].lname.length(); k++){
		        if((int)object[i].lname.charAt(k) > 64 && (int)object[i].lname.charAt(k) < 91){
		            password = password + object[i].lname.charAt(k);
		        }
		    }
		    password = password + object[i].age + "\n";
		}
		System.out.println("Generated Password:\n"+password);
	}
	
	
}
