package intermediario.polimorfismo;

public enum Bijus {
    SHUKAKU("Shukaku", "Gaara", 1),

    KURAMA("Kurama", "Naruto", 3),;
    String nomeBiju ;
    String jinchuriki;
    int numeroDeCaldas;
    // no args
    Bijus(){}
    //all args
    Bijus(String nomeBiju, String jinchuriki, int numeroDeCaldas){}

}
