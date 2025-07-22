public class Test {

    int c=0;
    int d=0;


    Test(int c, int d)
    {
      this.c=c;
      this.d=d;
    }

    public int multiply()
    {
        return this.c*this.d;
    }

    public static int sum(int a, int b)
    {
        return a+b;
    }

    public static void main(String[] args) {
        //Non-static member can't be accessed through static reference.
        //sum(5,2);

        //Test t1= new Test(5,2);
        //t1.sum();

        //Accessing sum method without making object of test class coz its is declared static now.
        System.out.println(Test.sum(4,2));

        Test t1=new Test(2,3);
        System.out.println(t1.multiply());

    }
}
