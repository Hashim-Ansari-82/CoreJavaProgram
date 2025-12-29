package Generics;

class Generics<T>{
  T obj;
  Generics(T obj){
      this.obj=obj;
  }
  public void show(){
    System.out.println("Current Object name : "+obj.getClass().getName());
  }
  public T getObj(){
    return obj;
  }
}
class GenericsDemo{
    public static void main(String[] args) {
        
        Generics<String> g1=new Generics<>("Hashim Ansari");
         g1.show();
        System.out.println(g1.getObj());

        Generics<Integer> g2=new Generics<>(12);
        g2.show();
        System.out.println(g2.getObj());

        Generics<Double> g3=new Generics<>(12.3);
        g3.show();
        System.out.println(g3.getObj());

        Generics<Boolean> g4=new Generics<>(true);
        g4.show();
        System.out.println(g4.getObj());

        Generics<Byte> g5=new Generics<>((byte)72);
        g5.show();
        System.out.println(g5.getObj());

        Generics<Short> g6=new Generics<>((short)82);
        g6.show();
        System.out.println(g6.getObj());

        Generics<Long> g7=new Generics<>(72l);
        g7.show();
        System.out.println(g7.getObj());

        Generics<Float> g8=new Generics<>(32f);
        g8.show();
        System.out.println(g8 .getObj());

        Generics<Character> g9=new Generics<>('R');
        g9.show();
        System.out.println(g9.getObj());
    }
}