public class Student {

    String name;
    int id;
    int age;

    public static int count=0;

    //Static Block
    static {
        System.out.println("This is static block");
        System.out.println("I execute without creating object");
    }

    public Student()
    {
        count++;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int getCount()
    {
        return count;
    }
}
