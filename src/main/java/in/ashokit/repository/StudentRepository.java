package in.ashokit.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import in.ashokit.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>
{
	@Query(value="FROM Student WHERE studentAge>=:age")
	public List<Student> getStudentByAge(Integer age);
	
	@Query(value="SELECT * FROM STUDENT_DTLS", nativeQuery=true)
	public List<Student> getStudentDtls();
	
	@Transactional
	@Modifying
	@Query(value="DELETE FROM Student where studentAge=:age")
	public void deleteStudentByAge(Integer age);
	
		
	

}
