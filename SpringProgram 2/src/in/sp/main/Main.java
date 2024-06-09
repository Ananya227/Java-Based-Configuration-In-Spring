package in.sp.main;

 import org.springframework.context.ApplicationContext;
 import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.sp.resources.SpringConfigFile;

import in.spbeans.Student;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
		 Student  std =(Student) context.getBean("stdId1");
		 std.display();

	}

}
