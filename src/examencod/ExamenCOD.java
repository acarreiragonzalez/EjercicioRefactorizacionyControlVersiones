package examencod;

public class ExamenCOD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int renombrada = 11;
        if (metodoMio(renombrada)) {
            System.out.println("Es numero primo");
        } else {
            System.out.println("NO es numero primo");
        }

        for (int x = 2; x < 1000; x++) {
            if (metodoMio(x)) {
                System.out.print(x + " ");
            }
        }
    }

    public static boolean metodoMio(int variable) {
        int j = 2;
        boolean renombrada2 = true;
        while ((renombrada2) && (j != variable)) {
            if (variable % j == 0) {
                renombrada2 = false;
            }
            j++;
        }
        return renombrada2;
    }
//modificacion para commit inicial

}
