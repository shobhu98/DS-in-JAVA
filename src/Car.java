public class Car {

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
}
