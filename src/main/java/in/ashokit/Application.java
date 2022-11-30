package in.ashokit;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.Student;
import in.ashokit.repository.StudentRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		StudentRepository repo = context.getBean(StudentRepository.class);
		/*List<Student> students = repo.getStudentByAge(12);
		for(Student student:students)
		{
			System.out.println(student);
		}*/
		
		/*List<Student> students = repo.getStudentDtls();
		for(Student student : students)
		{
			System.out.println();
		}*/
		
		repo.deleteStudentByAge(11);
		System.out.println("Record deleted");
		
	}

}
