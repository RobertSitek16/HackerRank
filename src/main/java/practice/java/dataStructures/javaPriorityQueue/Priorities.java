package practice.java.dataStructures.javaPriorityQueue;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Priorities {


    public List<Student> getStudents(List<String> events) {

        PriorityQueue<Student> priorityQueue = new PriorityQueue(Comparator.
                comparing(Student::getCGPA).
                reversed().
                thenComparing(Student::getName).
                thenComparing(Student::getId));

        List<Student> studentList = new ArrayList<Student>();

        for (String show: events) {

            String[] elements = show.split(" ");
            if (show.startsWith("ENTER")){
                String name = elements[1];
                double cgpa = Double.parseDouble(elements[2]);
                int id = Integer.parseInt(elements[3]);

                Student student = new Student(id, name, cgpa);
                priorityQueue.add(student);
            } else if (show.startsWith("SERVED")){
                Student firstStudent = priorityQueue.poll();
            }
        }
        Student firstStudent = priorityQueue.poll();

        if (firstStudent == null){
            return studentList;
        } else {
            while (firstStudent != null){
                studentList.add(firstStudent);
                firstStudent = priorityQueue.poll();
            }
        }
        return studentList;
    }
}
