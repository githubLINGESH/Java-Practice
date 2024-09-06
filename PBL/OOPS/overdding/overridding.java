abstract class Fruits{
    String name;
    String taste;
    int quantity;

    abstract void eat();
}

class Apple extends Fruits{

    Apple() {
        this.name = "Apple";
        this.taste = "Sweet";
        this.quantity = 1; // Example quantity
    }

    @Override
    public void eat(){
        System.out.println(name + " is eaten. Taste: " + taste + ". Quantity: " + quantity);
    }
}

class Mango extends Fruits{

    Mango() {
        this.name = "Mango";
        this.taste = "Sweet and Tangy";
        this.quantity = 1; // Example quantity
    }

    @Override
    public void eat(){
        System.out.println(name + " is eaten. Taste: " + taste + ". Quantity: " + quantity);
    }
}

class overridding{
    public static void main(String[] args){
        //create an object of the subclass
        
        Apple apple = new Apple();
        apple.eat();
        Mango m = new Mango();
        m.eat();

    }
}