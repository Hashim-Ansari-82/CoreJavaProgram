package Oops.Inharitance;

class Car{
    public void carSpeed(){
        System.out.println("Car speed is 120/hour");
    }
}
class raceCar extends Car{
    public void raceCarSpeed(){
    System.out.println("Race Car speed is 150/hour");
    }
}
class SingleLevelInharitance{
    public static void main(String[] args){
      raceCar c=new raceCar();
      c.carSpeed();
      c.raceCarSpeed();

    }
    
}