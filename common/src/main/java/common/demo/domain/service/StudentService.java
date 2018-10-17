package common.demo.domain.service;

import org.springframework.stereotype.Component;

import common.demo.domain.service.vo.Student;

@Component
public class StudentService {

	public Student query() {
		Student student = new Student();
		student.setId(1);
		student.setName("test name");
		return student;
	}
}