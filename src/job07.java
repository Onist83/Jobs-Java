public class job07 {
    public static void main(String[] args) {

        int largeur = 5, hauteur = 5;
        for (int j = 0; j<hauteur-3; j++) {
            System.out.print(" ");
            for (int x = 0; x < largeur-1; x++) {
                System.out.print("*" + " ");
            }for (int i = 0; i<hauteur-4; i++) {
            System.out.print(" ");
            for (int x = 0; x < largeur; x++) {
                System.out.print("*" + " ");
            }
        }
    }
    }
}

/*

int largeur=20, hauteur=10;
        for(int x=0; x<hauteur;x++) {
            System.out.println(" ");
            for (int y = 0; y < largeur; y++) {
                System.out.print("*");
            }
 */