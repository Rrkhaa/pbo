
public class Main {
    public static void main(String[] args) {
        
        Spider spider = new Spider();
        
        System.out.println("Spider:");
        spider.eat();
        
        Dog dog = new Dog();
        
        dog.setName("Rifki Budianto");
        System.out.println("\nDog:");
        System.out.println("Nama anjing: " + dog.getName());
        
        dog.play();
        
        dog.eat();
        
        dog.walk();
        
        Cat cat = new Cat("Master Shifu");
        System.out.println("\nCat:");
        System.out.println("Nama kucing: " + cat.getName());
        
        cat.play();
        
        cat.eat();
        
        cat.walk();
    }
}