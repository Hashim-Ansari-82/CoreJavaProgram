package com.innerclass;

interface Gear {

    public void getGear();

    interface vehicle {
        public int getNoOfWheel();

    }

class Auto implements vehicle {

        public int getNoOfWheel() {
            return 3;
        }
}

class Bus implements vehicle {

        public int getNoOfWheel() {
            return 6;
        }
}

class InterfaceInsideInterface {

        public static void main(String[] args) {

            Auto a = new Auto();
            Bus b1 = new Bus();
            System.out.println(a.getNoOfWheel());
            System.out.println(b1.getNoOfWheel());
        }
    }
}
