package jtm.activity12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
    Use this class to test your implemented methods in TeacherManager class
 */
public class Main {

    public static void main(String[] args){
        TeacherManager teacherManager = new TeacherManager();
        //Check Teacher table in MySQL workbench if insert works
        //Use same approach for other methods
        Teacher test = teacherManager.findTeacher(9);
        System.out.println(test.toString());
        
//        List<Teacher> teachList = new ArrayList<Teacher>();
//        teachList = teacherManager.findTeacher("Harry", "Potter");
//        System.out.println(Arrays.toString(teachList.toArray()));
        
//        boolean update = teacherManager.insertTeacher("Jane", "Potter");
//        System.out.println(update);
        
        Teacher teacher = new Teacher(10,"Roman","First");
   //     teacherManager.insertTeacher(teacher);
        teacherManager.updateTeacher(teacher);
        teacherManager.deleteTeacher(10);
        teacherManager.closeConnection();
    }
}
