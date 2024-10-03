public class Dog extends Animal implements Pet {
    private String name;

    public Dog() {
        super(4);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("mengongong dengan kawannya");
    }

    @Override
    public void eat() {
        System.out.println("makan daging");
    }

    @Override
    public void walk() {
        System.out.println("jalan bersama kelompok anjing yang lainnya");
    }
}
