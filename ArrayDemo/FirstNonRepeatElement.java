class FirstNonRepeatElement{
    public static void main(String[] args) {
        int[] a={4,5,3,2,1,5,6,7,8,9,9,8,7,6,5,4,3,21,};
        for (int i = 0; i < a.length; i++) {
            boolean unique=false;
            for (int j = 0; j < a.length; j++) {
                if(i!=j && a[i]==a[j]){
                    unique=true;
                    break;
                }
            }
            if(!unique){
                System.out.println("First Non-Repeat element : "+a[i]);
                break;
            }
        }
    }
}