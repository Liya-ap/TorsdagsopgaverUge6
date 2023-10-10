package src.Task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();

        //create Teachers
        ArrayList<String> teachCourses1 = new ArrayList<>();
        teachCourses1.add("Psychology");
        teachCourses1.add("Biology");
        Person teach1 = new Teacher("Jane", teachCourses1);

        ArrayList<String> teachCourses2 = new ArrayList<>();
        teachCourses2.add("History");
        teachCourses2.add("Latin");
        Person teach2 = new Teacher("Sam", teachCourses2);

        ArrayList<String> teachCourses3 = new ArrayList<>();
        teachCourses3.add("Java 1.0");
        teachCourses3.add("Math");
        Person teach3 = new Teacher("Wendy", teachCourses3);

        //Create Students
        ArrayList<String> studCourses1 = new ArrayList<>();
        studCourses1.add("Math");
        studCourses1.add("History");
        studCourses1.add("Biology");
        Person stud1 = new Student("Allan", studCourses1);

        ArrayList<String> studCourses2 = new ArrayList<>();
        studCourses2.add("Math");
        studCourses2.add("Latin");
        studCourses2.add("Biology");
        Person stud2 = new Student("Henry", studCourses2);

        ArrayList<String> studCourses3 = new ArrayList<>();
        studCourses3.add("Java 1.0");
        studCourses3.add("History");
        studCourses3.add("Psychology");
        Person stud3 = new Student("Cecil", studCourses3);

        ArrayList<String> studCourses4 = new ArrayList<>();
        studCourses4.add("Math");
        studCourses4.add("Latin");
        studCourses4.add("Psychology");
        Person stud4 = new Student("Laura", studCourses4);

        ArrayList<String> studCourses5 = new ArrayList<>();
        studCourses5.add("Java 1.0");
        studCourses5.add("Latin");
        studCourses5.add("Biology");
        Person stud5 = new Student("Beatrice", studCourses5);

        //Add to arraylist persons
        persons.add(teach1);
        persons.add(teach2);
        persons.add(teach3);
        persons.add(stud1);
        persons.add(stud2);
        persons.add(stud3);
        persons.add(stud4);
        persons.add(stud5);

        //Add the course "Java 1.0"
        for (Person p: persons) {
            if (!p.addCourse("Java 1.0")) {
                if (p instanceof Student) {
                    System.out.println(p.getName() + " har allerede bestået dette kursus.");
                }

                if (p instanceof Teacher) {
                    System.out.println(p.getName() + " kan ikke undervise i dette fag");
                }
            }
        }
    }
}
