public class Student {
    String name;
    int rollNo;
    int age;

    public  Student(String name, int rollNo, int age)
    {
        this.name=name;
        this.rollNo=rollNo;
        this.age=age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", age=" + age +
                '}';
    }

}
