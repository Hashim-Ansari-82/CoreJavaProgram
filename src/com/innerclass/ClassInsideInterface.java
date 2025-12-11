package com.innerclass;

 class ClassInsideInterface {

    interface Vehicle {
        public int getNoOfWheel();
    }
}
    class Auto implements ClassInsideInterface.Vehicle{
        public int getNoOfWheel(){
            return 3;
        }
}
    class Bus implements ClassInsideInterface.Vehicle {

        public int getNoOfWheel() {
            return 6;
        }

        public static void main(String[] args) {

            Auto a=new Auto();
            Bus b1=new Bus();
            System.out.println(a.getNoOfWheel());
            System.out.println( b1.getNoOfWheel());
        }
}

