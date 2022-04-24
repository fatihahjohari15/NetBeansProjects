public class LListOperation
{
	public static void main(String [] args)
	{
		Student [] studs;
		
		LList list = new LList();
		Student stu = new Student(111, "Ali");
		list.add(stu);
		
		stu = new Student(222, "Abu");
		list.add(stu);
		
		stu = new Student(333, "Ani");
		list.add(stu);
		studs = list.toArray();
		for (int i=0; i < studs.length; i++)
			System.out.println(studs[i].getMat()+"\t"+studs[i].getName());
			
		System.out.println("\nAdd Ami at position 1");
		stu = new Student(444, "Ami");
		list.add(1, stu);	
		studs = list.toArray();
		for (int i=0; i < studs.length; i++)
			System.out.println(studs[i].getMat()+"\t"+studs[i].getName());
		
		System.out.println("\nAdd Jali at position 3");
		stu = new Student(555, "Jali");
		list.add(3, stu);
		
		studs = list.toArray();
		for (int i=0; i < studs.length; i++)
			System.out.println(studs[i].getMat()+"\t"+studs[i].getName());
		
		System.out.println("\nRemove Ami at position 1");		
		
		Student pelajar;
		pelajar = list.remove(1);
		studs = list.toArray();
		for (int i=0; i < studs.length; i++)
				System.out.println(studs[i].getMat()+"\t"+studs[i].getName());
		System.out.println("---> "+pelajar.getMat()+" "+pelajar.getName()+" has been removed");

		System.out.println("\nRemove Abu at position 3");		
		pelajar = list.remove(3);
		studs = list.toArray();
		for (int i=0; i < studs.length; i++)
				System.out.println(studs[i].getMat()+"\t"+studs[i].getName());
		System.out.println("---> "+pelajar.getMat()+" "+pelajar.getName()+" has been removed");
		
		System.out.println("\nSearch Jali at position 2");
		pelajar = list.getEntry(2);
		System.out.println("--->----> "+pelajar.getMat()+" "+pelajar.getName()+" has been found");
		
		System.out.println("\nReplace Jali to Jamal");	
		stu = new Student(555, "Jamal");	
		list.replace(2, stu);
		studs = list.toArray();
		for (int i=0; i < studs.length; i++)
				System.out.println(studs[i].getMat()+"\t"+studs[i].getName());
		
		System.out.println("\nCheck existence of Ani");
		stu = new Student(333,"Ani");
		boolean flag = list.contains(stu);
		if (flag) // true
			System.out.println("The record is found");
		else
			System.out.println("The record is not found");
	} 

}