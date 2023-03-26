import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
class Student{
    String name;
    long id;
    String[] courses;
    String newcourse;

    Student(String name,long id){
        this.name=name;
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setId(long id){
        this.id=id;
    }
    public void setCourses(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total number of courses this student is registered with");
        int n=sc.nextInt();
        System.out.println("enter the courses into array");
        String newarr[]=new String[n];
        for(int i=0;i<n;i++){
            newarr[i]=sc.next();
        }
        this.courses=newarr;
        sc.close();
    }
    public void getname(){
        System.out.println(this.name);
    }
    public void getId(){
        System.out.println(this.id);
    }
    public void getCourses(){
        System.out.println(Arrays.toString(courses));
    }
    public void printinfo(){
        System.out.println("Student name is"+this.name+"\n"+"Student ID:"+this.id+"\nCourses Enrolled are:\n"+Arrays.toString(this.courses));
        }
    public String[] addNewCourse(String newcourse){
        ArrayList<String> temp = new ArrayList<String>(Arrays.asList(this.courses));
        temp.add(newcourse);
        this.courses = temp.toArray(new String[temp.size()]);
        return this.courses;
    }

    }

class GraduateStudent extends Student{
    String researchArea;
    GraduateStudent(String name, long id,String researchArea) {
        super(name, id);
        this.researchArea=researchArea;
    }
    public String getResearchArea(){
        return this.researchArea;
    }
    public void setResearchArea(String researchArea){
        this.researchArea = researchArea;
    }
    
    public String printInfo(){
        super.printinfo();
        return this.researchArea;
    }
}


/* Checking the code by passing some samples.
public class main{
    public static void main(String args[]){
        Student s1= new Student("JYOTHIRMAI",22049);
        s1.getname();
        s1.setCourses();
        s1.getCourses();
        GraduateStudent gs1=new GraduateStudent("SHANMUKHA",22051,"Electonics and computers");
        s1.addNewCourse("CSE");
        s1.printinfo();
        gs1.printInfo();
}
}*/
