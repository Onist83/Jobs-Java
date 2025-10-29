public class job05 {
    public static void main(String[] args) {

        /*Correction*/
        for (int n = 2; n < 1000; n++) {
            boolean estPremier = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    estPremier = false;
                    break;
                }
            }
            if (estPremier) System.out.println(n);
        }
    }
}


