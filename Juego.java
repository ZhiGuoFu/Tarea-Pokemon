import java.io.*;

public class Juego{
	private Pokedex pokedexGral;
	private Partida [] partidas;
	private int contadorPartidas;
	private BufferedReader buffer;
	private Mapa mapa;

	Juego(){
		this.pokedexGral = new Pokedex();
		this.partidas = new Partida[SetupPokemon.cantidadPartidas]; 
		this.contadorPartidas = 0;
		this.mapa = mapa;
	}
	public void jugar(){
		this.partidas[this.contadorPartidas]= new Partida(pokedexGral);
	}

}