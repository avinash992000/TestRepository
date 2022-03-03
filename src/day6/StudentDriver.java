package day6;
import java.util.*;

public class StudentDriver{  
public static void main(String args[]){  
ArrayList<Student> list=new ArrayList<Student>();  
list.add(new Student(1,"hello",43));  
list.add(new Student(2,"dsfds",543));  
list.add(new Student(3,"rew",43));  
  
Collections.sort(list);  
for(Student st:list){  
System.out.println(st.rollno+" "+st.name+" "+st.age);  
}  
}  
}  