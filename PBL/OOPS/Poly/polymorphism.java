class Shape{
    void draw(){
        System.out.println("Drawing a shape");
    }
    void erase(){
        System.out.println("Erasing a shape");
    }
}

    class Triangle extends Shape{

        void draw(){
            System.out.println("Drawing a triangle");
        }
        void erase(){
            System.out.println("Erasing a triangle");
            }
    }

    class Rectangle extends Shape{
        void draw(){
            System.out.println("Drawing a rectangle");
        }

        void erase(){
            System.out.println("Erasing a rectangle");
            }
    }

    class Square extends Shape{
        void draw(){
            System.out.println("Drawing a square");
        }
        void erase(){
            System.out.println("Erasing a square");
        }
    }

class polymorphism{
    public static void main(String[] args){
        Shape t = new Triangle();
        Shape r = new Rectangle();
        Shape s = new Square();

        t.draw(); t.erase();
        r.draw(); r.erase();
        s.draw(); s.erase();
    }
}