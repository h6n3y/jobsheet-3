package jobsheet3;

public class contohoperator04 {
    public static void main(String[] args) {
        
        int X = 10;
        System.out.println("X++ = " + X++);
        System.out.println("Setelah evaluasi, X = " + X);

        X = 10;
        System.out.println("\n++X = " + ++X);
        System.out.println("Setelah evaluasi, X = " + X);

        int Y = 12;
        System.out.println(X > Y || Y == X && Y <= X);

        int Z = X ^ Y;
        System.out.println("\nHasil X ^ Y adalah " + Z);

        Z %= 2;
        System.out.println("\nHasil akhir " + Z);
        
    }
}
