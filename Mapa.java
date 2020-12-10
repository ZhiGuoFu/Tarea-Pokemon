public class Mapa {
    private String mapagenerico;
    private String [] puntosestablecidos = {"Nunoa","Curacavi","Independencia","Providencia","Chicureo"};



    Mapa() {
        this.mapagenerico = "Santiago";
        this.puntosestablecidos = puntosestablecidos;
    }


    public String getMapagenerico() {
        return this.mapagenerico;
    }

    public void setMapagenerico(String mapagenerico) {
        this.mapagenerico = mapagenerico;
    }

    public String[] getPuntosestablecidos() {
        return this.puntosestablecidos;
    }

    public void setPuntosestablecidos(String[] puntosestablecidos) {
        this.puntosestablecidos = puntosestablecidos;
    }

    

}