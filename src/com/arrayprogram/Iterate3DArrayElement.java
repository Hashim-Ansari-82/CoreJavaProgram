package ArrayDemo;

public class Iterate3DArrayElement {
    public static void main(String[] args) {

        int[][][] a={{{10,20,},{30,40,50},{60,70,80,90}},
                     {{11,22,},{33,44,55},{66,77,88,}},
                     {{99,88,77,},{44,33,212,44,},{67,54,23}}};


        System.out.println(a[2][2].length);

        System.out.println("<------ For Loop ----------->");

        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                for(int k=0; k<a[i][j].length; k++){
                    System.out.print(a[i][j][k]+" ");
                }
                System.out.println();
            }
        }
        System.out.println("<------ For each Loop ----------->");

        for(int i[][] :a){
            for(int j[]:i){
                for(int k:j){
                    System.out.print(k+" ");
                }
                System.out.println();
            }
        }

    }
}
