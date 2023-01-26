import java.util.*;
public class Test {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		List<Student> list = new ArrayList<>();
		list.add(new Student(101,"santhosh","Java"));
		list.add(new Student(102,"Sai","DotNet"));
		list.add(new Student(103,"Kiran","Python"));
		list.add(new Student(104,"Raju","Java"));
		list.add(new Student(105,"Hari","Devops"));
		
		while(true)
		{
			System.out.println();
		System.out.println("1 . Add Student ");
		System.out.println("2 . Delete Student ");
		System.out.println("3 . Update Student ");
		System.out.println("4 . Search Student ");
		System.out.println("5 . Display Student ");
		System.out.println("6 . Exit Program ");
		System.out.println();
		System.out.print("Enter Your Choice : ");
		
		int n = s.nextInt();
		try
		{
		
		
	 if(n == 1)
		{
			System.out.print("Enter Student Id : ");
			int x = s.nextInt();
			System.out.print("Enter Student Name : ");
			String y = s.next();
			System.out.print("Enter Student Course : ");
			String z = s.next();
			
			list.add(new Student(x,y,z));
			
			list.stream().forEach(g ->System.out.println(g.sid+" : "+g.sname+" : "+g.course));
			
		}
	 else if(n == 4)
	 {
		 System.out.println(" Enter Student id");
		 int x=s.nextInt();
		 
	 }
	 
	 else if(n == 5)
		{
			list.stream().forEach(x ->System.out.println(x.sid+" : "+x.sname+" : "+x.course));
		}
		
		}
		catch(Exception e)
		{
			System.out.println(" Enter Valid Details");
		}
		}

	}

}
