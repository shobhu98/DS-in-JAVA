import java.util.ArrayList;

public class Heap {

    ArrayList<Integer> data=new ArrayList<>();

    public  void  add(int item){

        data.add(item);
        upheapify(data.size()-1);


    }

    private void upheapify( int ci) {
        if(ci==0){
            return;
        }
       int  pi =(ci-1)/2 ;
       if(data.get(ci)<data.get(pi)){
           swap(ci,pi);
       }

       upheapify(pi);



    }


    private  void  swap(int i,int j){
        int ith=data.get(i);
        int jth=data.get(j);

        data.set(i,jth);
        data.set(j,ith);

    }
    public void display(){
        System.out.println(data);
    }


}
