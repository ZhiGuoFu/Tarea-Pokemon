import java.util.Random;

public class Mapa {
    private String mapagenerico;
    // private String [] puntosestablecidos = {"Nunoa","Curacavi","Independencia","Providencia","Chicureo"};



    Mapa() {
        this.mapagenerico = "Region Metropolitana";
        // this.puntosestablecidos = puntosestablecidos;
    }


    public String getMapagenerico() {
        return this.mapagenerico;
    }

    public void setMapagenerico(String mapagenerico) {
        this.mapagenerico = mapagenerico;
    }

    // public String[] getPuntosestablecidos() {
    //     return this.puntosestablecidos;
    // }

    // public void setPuntosestablecidos(String[] puntosestablecidos) {
    //     this.puntosestablecidos = puntosestablecidos;
    // }

    static String getRandomString(){
        int r = (int) (Math.random()*9);
        String name = new String [] {"Nunoa","Curacavi","Independencia","Providencia","Chicureo","Puente Alto","Vitacura","Las Condes","La Florida"}[r];
        return name;
    }

}