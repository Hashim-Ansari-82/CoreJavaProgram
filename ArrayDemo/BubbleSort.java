class BubbleSort{

    public static void main(String[] args) {
        int []a={3,5,6,8,9,4,2,7};
        for(int i=0; i<a.length; i++){
            int flag=0;
            for(int j=0;j<a.length-1-i; j++){
                if(a[j]>a[j+1]){
                    int tem=a[j];
                    a[j]=a[j+1];
                    a[j+1]=tem;
                    flag=1;
                }
            }
            if(flag==0){
                break;
            }
        }
        for(int i:a){
            System.out.print(" "+i);
        }
    }
}