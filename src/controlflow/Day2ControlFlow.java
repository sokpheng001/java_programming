package controlflow;

public class Day2ControlFlow {
    public static void main(String[] args) throws Exception{
        myLabel:
        for(int k=0;k<10;k++){
            for(int i=1;i<10;i++){
                if(i%2==0){
                    break myLabel;
                }
                System.out.println(k + "=> " + i);
            }
        }

    }
}
