public class Car_client extends Generic_Display {
    public static void main(String[] args) {
        Car[] cars=new  Car[5];
        cars[0]= new Car(150,35000,"Blue");
        cars[1]= new Car(250,32000,"Grey");
        cars[2]= new Car(250,31000,"Orange");
        cars[3]= new Car(200,20000,"White");
        cars[4]= new Car(180,100000,"Pink");

        Car.Bubble_sort(cars);
        display(cars);


    }


}
