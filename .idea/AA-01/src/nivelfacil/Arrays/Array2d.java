package nivelfacil.Arrays;

public class Array2d {
    public static void main(String[] args) {
        String[][] aldeiaENinja = new String[3][3];
// array de refencia ra indenticar outros arrays .
        aldeiaENinja[0][0] = "Konora";
        aldeiaENinja[0][1] = "Naruto Uzumaki";
        aldeiaENinja[0][2] = "Sasuke Uchiha";

        aldeiaENinja[1][0] = "Aldeia da nevoa";
        aldeiaENinja[1][1] = "Zabuza";
        aldeiaENinja[1][2] = "Haku";

        aldeiaENinja[2][0] = "Deserto";
        aldeiaENinja[2][1] = "Gaara";
        aldeiaENinja[2][2] = "temari";

        for (int i = 0; i < aldeiaENinja.length; i++) {
            for (int j = 0; j < aldeiaENinja.length; j++) {
                System.out.println(aldeiaENinja[i][j]);
            }
        }
    }
}


