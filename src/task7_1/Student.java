package task7_1;

public class Student {
    private int age;
    private String name;
    private String group;

    public Student(int age, String name, String group) {
        this.age = age;
        this.name = name;
        this.group = group;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() == obj.getClass()) {
            Student temp = (Student) obj;
            return age == temp.age && name.equals(temp.name) &&
            group.equals(temp.group);
        }
        return false;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime*result + age;
        result = prime*result + (name == null ? 0 : name.hashCode());
        result = prime*result + (group == null ? 0 : group.hashCode());
        return result;
    }
}

class Test {
    public static void main(String[] args) {
        Student pavel = new Student(20, "Pavel", "IT");
        Student nikita = new Student(19, "Nikita", "Marketing");
        Student pavel2 = new Student(20, "Pavel", "IT");
        Student n = null;

        System.out.println(pavel.equals(pavel2));
        System.out.println(pavel.hashCode());
        System.out.println(pavel2.hashCode());
        System.out.println(nikita.hashCode());
    }
}