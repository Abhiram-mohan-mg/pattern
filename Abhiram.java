class house {
    public static void main(String[] aStrings) {
        for(int i=1; i<=5; ++i){
            for(int j=1; j<=6-i; ++j){
                System.out.print("*");
            }
            for(int k=1; k=2*i-2; ++k){
                System.out.print(" ");
            }
            for(int j=1; j<=6-i; ++j){
                System.out.print("*");
            }
        }System.out.println();
        for(int i=1; i<=5; ++i){
            for(int j=1; j<=i; ++j){
                System.out.print("*");
            }
            for(int k=1; k=2*(4-i+1); ++k){
                System.out.print(" ");
            }
            for(int j=1; j<=i; ++j){
                System.out.print("*");
            }
        }System.out.println();
    }
}