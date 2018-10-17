package web.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import common.demo.domain.service.StudentService;
import common.demo.domain.service.vo.Student;

@RestController
public class StudentController {
 
    @Autowired
    private StudentService studentService;
 
    @GetMapping("/hello")
    public Student hello(){
        return studentService.query();
    }
}
