package ArrayDemo;

public class CorrespondingArray{
    public static void main(String[] args){
        int[] a=new int[2];
        byte[] b=new byte[2];
        short[] c=new short[2];
        long[] d=new long[2];
        char[] e=new char[2];
        double[] f=new double[2];
        float[] g=new float[2];
        boolean[] h=new boolean[2];

        System.out.print(a.getClass().getName()+"       ");
        System.out.print(b.getClass().getName()+"       ");
        System.out.print(c.getClass().getName()+"       ");
        System.out.print(d.getClass().getName()+"       ");
        System.out.print(e.getClass().getName()+"       ");
        System.out.print(f.getClass().getName()+"       ");
        System.out.print(g.getClass().getName()+"       ");
        System.out.print(h.getClass().getName());
    }

}
