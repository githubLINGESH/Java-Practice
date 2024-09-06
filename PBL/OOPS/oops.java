//class exmaple
class Box{
    int h = 0;int w = 0;int d = 0;

    public Box(int h,int w,int d){
        this.h = h;
        this.w = w;
        this.d = d;
    }
    int volume(){
        return h*w*d;
    }
}

class Calculator{
    static int powerInt(int n,int n1){
        return (int) Math.pow(n,n1);
    }
    static double powerDouble(double n,double n1){
        return (int) Math.pow(n,n1);
    }
}

//encapsulation and abstraction
class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    // Method to display author details
    public void displayAuthorDetails() {
        System.out.println("Author Details:");
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Gender: " + gender);
    }
}

class Book {
    private String name;
    private Author author;
    private double price;
    private int inStock;

    public Book(String name, Author author, double price, int inStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.inStock = inStock;
    }

    // Getters
    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getInStock() {
        return inStock;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Book Details:");
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("In Stock: " + inStock);
        author.displayAuthorDetails(); // Display author details as well
    }
}

class Animal{
    void eat(){
        static a = 10;
        System.out.println("Eating...");
    }
    void sleep(){
        System.out.println("Sleeping...");
    }
}

class Bird extends Animal{

    void fly(){
        System.out.println("Bird is flying");
    }
}

class oops{
    public static void main(String[] args){
        Box b = new Box(5,5,8);
        System.out.println(b.volume());

        Calculator c = new Calculator();
        System.out.println(c.powerInt(4,5));
        System.out.println(c.powerInt(2,3));

        Author a = new Author("James", "jamesbook@gmail.com", 'M');
        Book book = new Book("Task2work",a,1500,1);
        book.displayBookDetails();

        Animal animal = new Animal();
        System.out.println("ANimal:");
        animal.eat();
        animal.sleep();
        System.out.println();

        Bird bird = new Bird();
        bird.eat();
        bird.sleep();
        bird.fly();
    }
}