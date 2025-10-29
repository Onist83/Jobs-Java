public class job07 {
    public static void main(String[] args) {

        /*int largeur = 5, hauteur = 5;
        for (int a = 0; a < largeur - 4; a++)
            System.out.print("          " + "  *  " + "            ");
        for (int b = 0; b < hauteur - 4; b++) {
            System.out.println(" ");
            for (int l = 0; l < largeur - 3; l++)
                System.out.print("    " + " *  " + "      ");
            for (int k = 0; k < hauteur - 4; k++) {
                System.out.println(" ");
                for (int o = 0; o < largeur - 2; o++)
                    System.out.print("   " + " * " + "  ");
                for (int i = 0; i < hauteur - 4; i++) {
                    System.out.println(" ");
                    for (int j = 0; j < largeur - 1; j++)
                        System.out.print("  " + " * " + " ");
                    for (int n = 0; n < hauteur - 4; n++) {
                        System.out.println(" ");
                        for (int x = 0; x < largeur; x++) {
                            System.out.print(" " + " * " + " ");
                        }
                    }
                }
            }
        }
    }
}*/ /*Correction*/

        int hauteur = 6;
        for (int x = 0; x < hauteur; x++) {
            for (int i = x; i < hauteur - 1; i++) {
                System.out.print(" ");
            }
            for (int y = 0; y < x; y++) {
                System.out.print("* ");
            }
            System.out.println();
        }




        /*Exercice losange*/

        int haut = 6;
        for (int a = 0; a < haut; a++) {
            for (int b = a; b < haut - 1; b++) {
                System.out.print(" ");
            }


        }

    }
}



