package collectionFramework;

import java.util.*;

public class CollectionFrameworkDay2 {
    private static Map<Integer, String> studentInfo = new HashMap<>();
    private static boolean addNewStudentName(String studentName){
        int key = new Random().nextInt(999999);
        studentInfo.put(key, studentName);
        return true;
    }
    private static boolean removeStudentById(int id){
        String value = studentInfo.remove(id);
        if(value!=null){
            return true;
        }
        return false;
    }
    private static boolean updateStudentById(int id, String newName){
        String value = studentInfo.put(id, newName);
        if(value!=null){
            return true;
        }
        return false;
    }
    private static void home(){
        System.out.println("""
                1. Add student name
                2. Search by ID
                3. Delete student by ID
                4. Update student by ID
                5. Exit
                """);
        System.out.print("[+] Insert option: ");
        switch (new Scanner(System.in).nextInt()){
            case 1->{
                    System.out.println(" Student Record ");
                    System.out.print("[+] Insert student name to add to record: ");
                    String name = new Scanner(System.in).nextLine();
                    boolean isInserted = addNewStudentName(name);
                    System.out.println(studentInfo);
            }
            case 2->{}
            case 3->{}
            case 4->{}
            case 5->{System.exit(0);}
        }
    }
    public static void main(String[] args) {
        System.out.println(studentInfo);
        home();
    }
}
