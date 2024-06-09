package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import in.spbeans.Student;
@Configuration

public class SpringConfigFile {
	
	@Bean
 public Student stdId1()
 {
	 Student std = new Student();
	 std.setName("Ananya");
	 std.setRollno(102);
	 std.setEmail("ananyayadav227@gmail.com");
	 
	 
	 
	 
	 return std;
 }
	

}
