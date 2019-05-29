package wtyDemo;

import java.util.Objects;

public class teacher {

    private int age;

    @Override
    public String toString() {
        return "teacher{" +
                "age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        teacher teacher = (teacher) o;
        return age == teacher.age;
    }

    @Override
    public int hashCode() {

        return Objects.hash(age);
    }
}
