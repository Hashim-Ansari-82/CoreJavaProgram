class Shift1stZeroLastByOneLoop{
    public static void main(String[] args){
          int[] a={2,3,0,4,0,4,3,2,0,4,05,3,0,2};
          int position=-1; 
          for (int i = 0; i < a.length-1; i++) {
              if(position==-1 && a[i]==0){
                position=1;
              }
              if(position>-1){
                a[i]=a[i+1];
              }
          }
          if(position>-1){
            a[a.length-1]=0;
          }
          for (int i : a) {
            System.out.print(i+" ");
          }
    }
}