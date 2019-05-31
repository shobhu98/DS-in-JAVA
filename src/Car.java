public class Car implements Comparable<Car>  {


    private int speed;
    private int price;
    private String color;

    public Car(int speed,int price,String  color){
        this.speed=speed;
        this.price=price;
        this.color=color;

    }

    @Override
    public String toString() {
        return "speed: "+this.speed+"price: "+this.price+"color: " +this.color;

    }
    
    public static <T extends Comparable<T>> void Bubble_sort(T[] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 0; j <arr.length-1-i ; j++) {
                if(arr[j].compareTo(arr[j+1])>0){
                    T temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
                
            }
            
        }
    }
    @Override
    public int compareTo(Car other){
        return this.speed-other.speed;
    }
}
