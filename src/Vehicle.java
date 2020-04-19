public class Vehicle {

    int maxSpeed = 120;

    public static class Car extends Vehicle{
        int maxSpeed = 180;
        void display(){
            System.out.println("The Max Speed is: " + super.maxSpeed);
        }
    }

    public static void main(String [] args){
        Car small = new Car();
        small.display();
    }

}
