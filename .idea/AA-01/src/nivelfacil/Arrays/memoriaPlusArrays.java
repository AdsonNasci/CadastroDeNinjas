package nivelfacil.Arrays;

public class memoriaPlusArrays {
    public static void main(String[] args) {
        String[] ninjas = new String[5];
        ninjas[0] = "Naruto Uzumaki";
         ninjas[1] = "Sasuke Uchiha";
        ninjas[2] = "Sakura Haruno";
        ninjas[4] = "Hinata Hyuga";
        //when i redeclare the Array the javas garbage collecter swiped the data that was not being used.
        //redeclarar nivelfacil.nivelfacil.Arrays.Arrays cuidado para redeclarar pois o Garbage collection recolhe a data e joga no lixo.
        ninjas = new String[7];

        ninjas[0] = "Hashirama Senju";
        ninjas[1] = "Tobirama Senju";
        ninjas[2] = "Hiruzen Sarutobi";
        ninjas[3] = "Minato Namikazee";
        ninjas[4] = "Tsunade";
        ninjas[5] = "Kakashi Hatake";
        ninjas[6] = "Naruto Uzumaki";

        for (int i = 0; i <7 ; i++) {
            System.out.println(ninjas[i]);
        }
    }
}
