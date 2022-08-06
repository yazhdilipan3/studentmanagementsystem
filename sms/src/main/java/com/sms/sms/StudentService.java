package com.sms.sms;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student addstudent(Student student){
        return studentRepository.save(student);
    }
    
    public List<Student> getStudent(){
       return studentRepository.findAll();
    }

    public Student getbyid(Long studentid){
        return studentRepository.findById(studentid).get();
    }

    public void deletebyid(Long studentid){
        studentRepository.deleteById(studentid);
        
    }
    public Student getbycity(String student){
        return studentRepository.findBycity(student);
    }
    public Student getbyfirstname(String student){
        return studentRepository.findByfirstName(student);
    }
    public Student getbylastname(String student){
        return studentRepository.findBylastName(student);
    }


    public Student updatebyid(Long studentid,Student student){
        Student std = studentRepository.findById(studentid).get();

        if(Objects.nonNull(student.getcity())&& !"".equalsIgnoreCase(student.getcity())){
            std.setcity(student.getcity());
        }
        if(Objects.nonNull(student.getdepartment())&& !"".equalsIgnoreCase(student.getdepartment())){
            std.setdepartment(student.getdepartment());
        }
        if(Objects.nonNull(student.getfirstName())&& !"".equalsIgnoreCase(student.getfirstName())){
            std.setfirstName(student.getfirstName());
        }
        if(Objects.nonNull(student.getlastName())&& !"".equalsIgnoreCase(student.getlastName())){
            std.setlastName(student.getlastName());
        }
        if(Objects.nonNull(student.getemail())&& !"".equalsIgnoreCase(student.getemail())){
            std.setemail(student.getemail());
        }
        if(Objects.nonNull(student.getphonenumber())&& !"".equalsIgnoreCase(student.getphonenumber())){
            std.setphonenumber(student.getphonenumber());
    
        }
        return studentRepository.save(std);       
    }  
}
