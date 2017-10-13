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
        
        
    int i,j,k;
    int counter;
        
    //Create date of birth for each student    
    DateTime dob1 = new DateTime(1999, 03, 06, 0, 0, 0, 0);
    DateTime dob2 = new DateTime(1997, 12, 30, 0, 0, 0, 0);
    DateTime dob3 = new DateTime(1994, 06, 07, 0, 0, 0, 0);
    DateTime dob4 = new DateTime(1995, 02, 12, 0, 0, 0, 0);
    DateTime dob5 = new DateTime(1996, 12, 21, 0, 0, 0, 0);
    
    //Create module list for each student
    String [] mod1 = {"Maths", "Science", "Programming"};
    String [] mod2 = {"Science", "Software Engineering", "Chemistry"};
    String [] mod3 = {"Enlish", "Philosophy", "Wizardry"};
    String [] mod4 = {"Criminal law", "Corporate Law", "Environmental Law"};
    String [] mod5 = {"Biology", "Chemistry", "Feet Studies"};
    
    //Create each student
    Student student1 = new Student ("John", 18, dob1, 1231101, mod1);
    Student student2 = new Student ("Mary", 20, dob2, 145101, mod1);
    Student student3 = new Student ("Joe", 23, dob3, 1231451, mod1);
    Student student4 = new Student ("Amy", 22, dob4, 1563201, mod1);
    Student student5 = new Student ("Will", 21, dob5, 1233301, mod1);
    
    //Create arrays of Students to add to modules
    ArrayList <Student> all_st = new ArrayList<Student>();
    ArrayList <Student> math_st = new ArrayList<Student>();
    ArrayList <Student> eng_st = new ArrayList<Student>();
    ArrayList <Student> arts_st = new ArrayList<Student>();
    ArrayList <Student> law_st = new ArrayList<Student>();
    
    //Add students to arrays
    all_st.add(student1);
    all_st.add(student2);
    all_st.add(student3);
    all_st.add(student4);
    all_st.add(student5);
    
    math_st.add(student1);
    math_st.add(student5);
    math_st.add(student3);
    
    eng_st.add(student3);
    eng_st.add(student1);
    eng_st.add(student5);
    eng_st.add(student4);
    
    arts_st.add(student5);
    arts_st.add(student1);
    arts_st.add(student2);
    
    law_st.add(student1);
    law_st.add(student2);
    law_st.add(student3);
    
    //Create modules 
    Module math = new Module("Math", "MA204", math_st);
    Module eng = new Module ("Engineering", "EN145", eng_st);
    Module art = new Module ("Arts", "AG145", arts_st);
    Module law = new Module ("Law", "LA593", law_st);
    
    //Create module array
    ArrayList<Module> all_mod = new ArrayList<Module>();
    ArrayList<Module> math_mod = new ArrayList<Module>();
    ArrayList<Module> law_mod = new ArrayList<Module>();
    ArrayList<Module> arts_mod = new ArrayList<Module>();
    
    //Add modules to module arrays
    
    all_mod.add(math);
    all_mod.add(eng);
    all_mod.add(art);
    all_mod.add(eng);
    math_mod.add(math);
    math_mod.add(eng);
    law_mod.add(law);
    law_mod.add(art);
    arts_mod.add(art);
    arts_mod.add(eng);
    
    //Create start and end dates for programmes
    DateTime start_date = new DateTime (2014, 07, 01, 0, 0, 0, 0);
    DateTime end_date = new DateTime (2018, 07, 01, 0, 0, 0, 0);
    
    //Create programmes 
    Programme math_prog = new Programme("Mathematical Studies", math_mod, start_date, end_date);
    Programme law_prog = new Programme("Commercial Law", law_mod, start_date, end_date);
    Programme arts_prog = new Programme("Arts", arts_mod, start_date, end_date);
    
    //Create array to hold programmes
    ArrayList <Programme> all_progs = new ArrayList<Programme>();
    all_progs.add(math_prog);
    all_progs.add(law_prog);
    all_progs.add(arts_prog);
            
    
    //Output

    for (i=0; i<all_progs.size(); i++){
        System.out.println("----------------");
        System.out.println(all_progs.get(i).getName());
        System.out.println("----------------");
        
        for (j=0; j<all_progs.get(i).getModules().size(); j++){
            System.out.println("--" + all_progs.get(i).getModules().get(j).getName()+"--");
            for (k=0; k<all_progs.get(i).getModules().get(j).getStudents().size(); k++){
                System.out.println(all_progs.get(i).getModules().get(j).getStudents().get(k).getName());
            
            }
        }
         }
    
    }
    
    
}
