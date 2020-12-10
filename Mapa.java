import java.util.Random;

public class Mapa {
    private String mapagenerico;
    private String [] puntosestablecidos;
    private String mapaespecifico;
    

    public Mapa() {
        this.mapagenerico = "Chile";
        this.puntosestablecidos = SetupPokemon.puntosestablecidos;
        this.mapaespecifico = "Region Metropolitana";
    }
    

    public String getMapagenerico() {
        return this.mapagenerico;
    }   

    public String getMapaespecifico() {
        return this.mapaespecifico;
    }

    public void setMapagenerico(String mapagenerico) {
        this.mapagenerico = mapagenerico;
    }

    // public void randomPuntoEstableclido(){
    //     Random r=new Random(); 
    //     int randomNumber=r.nextInt(SetupPokemon.puntosestablecidos.length); 
    //     System.out.println(SetupPokemon.puntosestablecidos[randomNumber]); 
    // } 

    static String getRandomString(){
         int r = (int) (Math.random()*5);
         String name = SetupPokemon.puntosestablecidos[r];
         return name;
     }

    // static void RandomString(String [] Lista){
    //     int r = (int) (Math.random()*9);
    //     String name = Lista[r];
    //     System.out.println(name);
    // }
}

