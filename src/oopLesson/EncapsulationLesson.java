package oopLesson;

class Product{
    private String name;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}
public class EncapsulationLesson {
    public static void main(String[] args) {
        Product product = new Product();
        product.setName("Coca");
        product.getName();
    }
}
