/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chriscompany.assign1_b;

import com.mycompany.softeng_assign1.*;
import java.util.ArrayList;
import org.joda.time.DateTime;

/**
 *
 * @author cristoir95
 */
public class Driver {
    
    public static void main (String [] args){
    DateTime dob1 = new DateTime(2017, 03, 06, 0, 0, 0, 0);
    String [] mod1 = {"Maths", "Science", "Programming"};
    
    Student student1 = new Student ("John", 18, dob1, 1231101, mod1);
    ArrayList <Student> math_st = new ArrayList<Student>();
    math_st.add(student1);
    
    Module math = new Module ("Math", "MA204", math_st);
            
    }
}
