import java.util.ArrayList;

public class Generic_Display   {

    public static  void main(String[] args) {
        Integer[] arr={1,2,3,4};
        ArrayList<String> l=new ArrayList<>();
       String[] str={"hello","hi","bye"};
        display(arr);
        display(str);


    }



    public static <T> void display(T[] arr){
        for(T val:arr){
            System.out.print(val+", ");
        }
        System.out.println();
    }
}


