import java.util.Random;

public class Mapa {
    private String mapagenerico;
    // private String [] puntosestablecidos = {"Nunoa","Curacavi","Independencia","Providencia","Chicureo","Puente Alto","Vitacura","Las Condes","La Florida"};

    Mapa() {
        this.mapagenerico = "Region Metropolitana";
    }

    public String getMapagenerico() {
        return this.mapagenerico;
    }

    public void setMapagenerico(String mapagenerico) {
        this.mapagenerico = mapagenerico;
    }

    static String getRandomString(){
        int r = (int) (Math.random()*5);
        String name = new String [] {"Nunoa","Curacavi","Independencia","Providencia","Chicureo","Puente Alto","Vitacura","Las Condes","La Florida"}[r];
        return name;
        }
    }

