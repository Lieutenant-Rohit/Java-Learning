class Main
{
    public static void main(String[] args) {
        //Accessing count using class name via static keyword.
        System.out.println(Student.count);

        Student s1= new Student();
        s1.setName("Ram");
        s1.setAge(20);
        s1.setId(1);

        Student s2= new Student();
        s1.setName("Shyam");
        s1.setAge(19);
        s1.setId(2);


        //Accessing Method using class name via static keyword.
        System.out.println(Student.getCount());
    }
}

