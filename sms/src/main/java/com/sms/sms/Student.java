package com.sms.sms;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
//import lombok.Data;
import lombok.NoArgsConstructor;


//@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "Student_details")
public class Student {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String  firstName;
    private String lastName;
    private String email;
    private String phonenumber;
    private String city;
    private String department;

    public String getdepartment(){
        return department;
    }
    public void setdepartment(String department){
        this.department = department;
    }
    public String getfirstName(){
        return firstName;
    }
    public void setfirstName(String firstName){
        this.firstName = firstName;
    }
    public String getlastName(){
        return lastName;
    }
    public void setlastName(String lastName){
        this.lastName = lastName;
    }

    public String getemail(){
        return email;
    }
    public void setemail(String email){
        this.email = email;
    }
    public String getphonenumber(){
        return phonenumber;
    }
    public void setphonenumber(String phonenumber){
        this.phonenumber = phonenumber;
    }

    public String getcity(){
        return city;
    }
    public void setcity(String city){
        this.city = city;
    }
    

}
