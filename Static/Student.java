package Static;

public class Student {
	String name;
	int age;
	float height;
	
	public static String TenTruong = "Haui"; //Biến STATIC
	public static String TenLop ;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(String name, int age, float height) { //Constructor
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	public static void GetTenTruong() {		//STATIC VOID
		System.out.println("Truong Dai Hoc Cong Nghiep Ha Noi");	//Không thể in được biến
	}
	
	static {
		System.out.println("CNTT");		// KHỐI STATIC chạy trước hàm main
		TenLop = "Lop KTPM";
	}

	
	static class Teacher {
		public static String TeacherName = "Huong"; // STATIC CLASS nằm trong Class khác, có thể truy cập mà không cần object bên ngoài
	}
	public void print() {
		System.out.println("Hieu Truong: " + Teacher.TeacherName);
	}
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			Student s1 = new Student();
			s1.setName("Thang");
			
			
			Student s2 = new Student();
			s2.setName("Huy");
			
			
			System.out.println(s1.getName() + " hoc tai " + TenTruong );
			System.out.println(s2.getName() + " hoc tai " + TenTruong );
			
			Student.GetTenTruong();
			
			
			System.out.println(Student.TenLop);
			
			s1.print();
		
	}


}
