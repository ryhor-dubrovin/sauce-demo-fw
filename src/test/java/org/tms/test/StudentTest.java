package org.tms.test;

import org.tms.model.Student;

public class StudentTest {
    public void createStudent() {
        Student student = new Student.StudentBuilder("Ryhor","Dubrovin")
                .age(27)
                .country("Belarus")
                .phone("+995595904461")
                .corrStudent(true)
                .build();
    }


}
