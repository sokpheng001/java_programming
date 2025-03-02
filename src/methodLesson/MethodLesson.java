package methodLesson;
import java.util.Arrays;

public class MethodLesson{
    private static int sum(int a, int b){
        return a+b;
    }
    private static double sum(double a, double b){
        return a+b;
    }
    private static float sum(float a, float b){
        return a+b;
    }
    public static void main(String[] args) {
        sum(1,2);
        sum(1.2,4.5);
        float a = 23.0f, b =45.4f;
        sum(a,b);
    }
}
