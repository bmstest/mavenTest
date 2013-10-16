package helpers;

public class Student {

    String name;
    String hobby;
    Integer age;
    
    public Student(String name, String hobby, int age) {
	this.name = name;
	this.hobby = hobby;
	this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    
    

}
