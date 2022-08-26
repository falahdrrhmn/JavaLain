public class DiamondAlpha {
    public static void main(String[] args) {
        int size = 5;
        int alpha = 65;

        // bagian atas pyramid 
        for (int i = 1; i <= size; i++){

            // print space 
            for (int j = size; j > i; j--){
                System.out.print(" ");
            }

            // print alphabet
            for (int k = 0; k < i * 2 - 1; k++){
                System.out.print((char)(alpha + k));
            }

            System.out.println();

        }

        // bagian bawah pyramid 
        for (int i = 1; i <= size - 1; i++){

            // print space
            for (int j = 0; j < i; j++){
                System.out.print(" ");
            }

            // print alphabet
            for(int k = 0; k < (size - i) * 2 - 1; k++ ){
                System.out.print((char)(alpha+k));
            }
            System.out.println();
        }

    }
}
