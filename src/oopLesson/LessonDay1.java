package oopLesson;

class Parent{
    protected String name;
    protected Integer age;
    //
    public Parent(){}
    public Parent(String name){
        this.name = name;
    }
    public void run(){
        System.out.println(name + " is running");
    }
}
class Son extends Parent{
    public Son(String name){
        super(name);
        super.age = 100;
    }
}
public class LessonDay1 {
    public static void main(String[] args) {
        Parent son = new Son("Jame");
        son.run();
    }
}
