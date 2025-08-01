class Main{
    public static void main(String[] args) {

        /*Box<String> box1 = new Box<>();
        box1.setValue("Java Generics");
        System.out.println(box1.getValue());

        Box<Integer> box2=new Box<>();
        box2.setValue(123);
        System.out.println(box2.getValue());*/

        /*Pair<String, Integer> pair = new Pair<>("Age", 30);
        System.out.println("Key: " + pair.getKey());
        System.out.println("Value: " + pair.getValue());*/

        /*GenericContainer<String> stringContainer = new GenericContainer<>();
        stringContainer.add("Hello Generics");
        System.out.println("String Container:" + stringContainer.get());*/

        /*GenericContainer<Integer> integerContainer = new GenericContainer<>();
        integerContainer.add(42);
        System.out.println("Integer Container: " + integerContainer.get());*/

        /*Box<Integer> box = new Box<>();
        box.setValue(10);
        System.out.println("Box value: " + box.getValue());*/

        Book b1= new Book("It Ends With Us","Collen Hover");
        Book b2= new Book("The Silent Patient","Alex Michaelides");
        Book b3= new Book("The Midnight Library","Matt Haig");

        Movie m1= new Movie("Inception", "Christopher Nolan");
        Movie m2= new Movie("The Matrix", "Lana Wachowski, Lilly Wachowski");
        Movie m3= new Movie("Interstellar", "Christopher Nolan");

        Catalog<Book> bookCatalog = new Catalog<>();
        bookCatalog.addItem(b1);
        bookCatalog.addItem(b2);
        bookCatalog.addItem(b3);
        System.out.println("Books:");
        bookCatalog.printAll();
        bookCatalog.removeItem(2);
        System.out.println("After removal:");
        bookCatalog.printAll();

        Catalog<Movie> movieCatalog = new Catalog<>();
        movieCatalog.addItem(m1);
        movieCatalog.addItem(m2);
        movieCatalog.addItem(m3);
        System.out.println("Movies:");
        movieCatalog.printAll();
        movieCatalog.removeItem(2);
        System.out.println("After removal:");
        movieCatalog.printAll();





    }
}