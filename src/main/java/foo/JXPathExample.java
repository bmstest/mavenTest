package foo;

import helpers.Student;

import org.apache.commons.jxpath.JXPathContext;

public class JXPathExample{

public static void main(String[] args) {
    Student std = new Student("Jan", "football", 2);
    
    //Create JXPathContext with Student object as root node
    JXPathContext context = JXPathContext.newContext(std);
    
    //Evaluate Xpath expression relative to root node
    String name = (String) context.getValue("/name");
    System.out.println(name);
    
    String hobby = (String) context.getValue("/hobby");
    System.out.println(hobby);
    
    Integer age = (Integer) context.getValue("/age");
    System.out.println(age);
  }
}
