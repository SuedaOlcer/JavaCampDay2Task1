
public class Main {

	public static void main(String[] args) {
	
		Category category = new Category(1, "Programlama", 3);
		Category category2 = new Category(2, "Danýţmanlýk", 2);
		Category category3 =new Category ();
		category3.id=5;
		category3.name="Grafik Tasarým";
		category3.courseCount= 4;
		
		 Category[] categories = {category,category2,category3};
		 for (Category cat : categories) {
			 System.out.println(cat.name);
		 }	 
		 
		 Course course = new Course(1,"C#", "Deniz");
		 Course course2 = new Course(2, "Java", "Selen");
		 Course course3 = new Course();
		 course3.id=8 ;
		 course3.name= "PHP";
		 course3.instructor= "Eda";
	
	     Course [] courses = {course,course2,course3};
	    for (Course cc: courses) {
	    	System.out.println(cc.instructor);
	    }
	     
	    CourseManager courseManager = new CourseManager();
	 
	    courseManager.add();
	    courseManager.delete();
	    courseManager.update();
	 
	 
	  
	}	 

}
