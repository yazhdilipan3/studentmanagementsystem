package com.sms.sms;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
public class StudentController {


    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public Student addstudent(@RequestBody Student student){
        return studentService.addstudent(student);
    }
    @GetMapping("/get")
    public List<Student> getStudent(){
        return studentService.getStudent();
    }
    @GetMapping("/get/{id}")
    public Student getbyid(@PathVariable("id") Long studentid){
        return studentService.getbyid(studentid);
    }
    @DeleteMapping("/delete/{id}")
    public String deletebyid(@PathVariable("id") Long studentid){
        studentService.deletebyid(studentid);
        return "successfull";
    }

    @GetMapping("/getcity/{city}")
    public Student getbycity(@PathVariable("city") String student){
        return studentService.getbycity(student);
    }
    
    
    @GetMapping("/getfirstname/{firstName}")
    public Student getbyfirstname(@PathVariable("firstName") String student){
        return studentService.getbyfirstname(student);
    }
    

    @GetMapping("/getlastname/{lastName}")
    public Student getbylastname(@PathVariable("lastName") String student){
        return studentService.getbylastname(student);
    }

    @PutMapping("/update/{id}")
    public Student updatebyid(@PathVariable("id") Long studentid,@RequestBody Student student){
        return studentService.updatebyid(studentid,student);
    }
    
}
