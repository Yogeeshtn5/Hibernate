package com.tns.jpacrud.client;

import com.tns.jpacrud.entities.Student;
import com.tns.jpacrud.service.StudentService;
import com.tns.jpacrud.service.StudentServiceImpl;

public class Client {
	public static void main(String[] args) 
	{
StudentService studentService=new StudentServiceImpl();

Student student1=new Student();

//Insert a student
/*student1.setStdid(103);
student1.setSname("Yogeesh");
studentService.addStudent(student1);*/





//Retrieval operation
student1=studentService.findStudentById(101);
System.out.println(student1);

//update operation
student1.setSname("Helma");
studentService.updateStudent(student1);

//Delete operation
studentService.removeStudent(student1);
}
}
