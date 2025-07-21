public class HollowButterfly {
    public static void main (String args[]) {
        int i, j, n = 5;

        //upper part 
        for(i=1; i<=n; i++) {
            //left part
            for(j=1; j<=n; j++) {

                if(j==1 || j==i){
                    System.out.print("*  ");
                }
                else {
                    System.out.print("   ");
                }
            }

            //right part
            for(j=1; j<=n; j++) {
                
                if(i+j == n+1 || j==n){
                    System.out.print("*  ");
                }
                else {
                    System.out.print("   ");
                }
            }

            System.out.println();
        }

        //down part
        for(i=n; i>=1; i--) {
            //left part
            for(j=1; j<=n; j++) {

                if(j==1 || j==i){
                    System.out.print("*  ");
                }
                else {
                    System.out.print("   ");
                }
            }

            //right part
            for(j=n; j>=1; j--) {

                if(j==1 || j==i){
                    System.out.print("*  ");
                }
                else {
                    System.out.print("   ");
                }
            }

            System.out.println();
        }
    }
}
