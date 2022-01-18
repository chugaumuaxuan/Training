package ClassVaObject;

public class Student { //class
	String name;
	int age;
	String major;
	
	public String GetInfo() {
		return("Ten: " + name + " Tuoi: " + age + " Chuyen nganh:" + major );
	}

	public static void main(String[] args) {
		
		Student st1 = new Student();	//object
		Student st2 = new Student();
		
		st1.name = "Thang";
		st1.age = 22;
		st1.major = "CNTT";
		
		st2.name = "Huy";
		st2.age = 23;
		st2.major = "QTKD";
		
		System.out.println(st1.GetInfo());
		System.out.println(st2.GetInfo());
	}

}
