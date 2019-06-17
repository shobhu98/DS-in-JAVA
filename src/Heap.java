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

    public int remove(){
        swap(0,this.data.size()-1);

        int rv=this.data.remove(this.data.size()-1);
        downheapify(0);

        return rv;
    }

    private void downheapify(int pi) {
        int li=2*pi+1;
        int ri=2*pi+2;
        int mini=pi;

        if(li<data.size()&& data.get(li)<data.get(pi)){
            mini=li;
        }
        if(ri<data.size()&& data.get(ri)<data.get(pi)){
            mini=ri;
        }
        if(mini!=pi){
            swap(mini,pi);
            downheapify(mini);
        }


    }


}
