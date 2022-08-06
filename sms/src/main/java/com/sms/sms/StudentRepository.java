package com.sms.sms;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepository  extends JpaRepository<Student,Long>{
    
    
    public  Student findBycity(String student);
    public Student findByfirstName(String student);
    public Student findBylastName(String student);
       
}
