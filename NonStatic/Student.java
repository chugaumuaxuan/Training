package NonStatic;

public class Student {
		String name;
		String tentruong;
		
		public Student() {}
		
		public Student(String name, String tentruong) {
			this.name = name;
			this.tentruong = tentruong;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getTentruong() {
			return tentruong;
		}
		public void setTentruong(String tentruong) {
			this.tentruong = tentruong;
		}
		
		public static void main(String[] args) {
			Student st1 = new Student();
			st1.setName("Thang");
			st1.setTentruong("Haui");
			
			Student st2 = new Student();
			st2.setName("Huy");
			st2.setTentruong("Haui");

			System.out.println(st1.getName() + " dang hoc tai " + st1.getTentruong());
			System.out.println(st2.getName() + " dang hoc tai " + st2.getTentruong());
			
		}
	}


