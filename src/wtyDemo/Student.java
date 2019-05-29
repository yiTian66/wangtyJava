package wtyDemo;

import java.io.Serializable;
import java.util.Objects;

public class Student implements Serializable {

    private String name;
    private String point;

    public Student(String name, String point) {
        this.name = name;
        this.point = point;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) &&
                Objects.equals(point, student.point);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, point);
    }
}
