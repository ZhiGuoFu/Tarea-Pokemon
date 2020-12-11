public class Pokedex{
	private Pokemon [] pokemones;
	private String [] nombreAtaques = new String[SetupPokemon.cantidadAtaques];
	

	Pokedex(){
		pokemones = new Pokemon[SetupPokemon.cantidadPokemones];
		
		for(int i=0;i<SetupPokemon.cantidadPokemones;i++){
			nombreAtaques = SetupPokemon.ataques[i];
			pokemones[i] = new Pokemon(i,SetupPokemon.nombres[i],nombreAtaques);
		}
	}

	public Pokemon getPokemon(int numeroPokemon){
		return pokemones[numeroPokemon];
	}
	public void capturarPokemon(int pos){
		this.pokemones[pos].setCapturado();
	}
	public int getCantidadPokemones(){
		return SetupPokemon.cantidadPokemones;
	}
	public void listarPokedex(){
		System.out.println("Pokedex Personal");
		System.out.println("======= ========\n");
		
		for(int i=0;i<SetupPokemon.cantidadPokemones;i++){
			
			if(pokemones[i].getCapturado()){

				System.out.println("Id: "+pokemones[i].getId()+"- Nombre: "+pokemones[i].getNombre());
				System.out.println("Experiencia: "+pokemones[i].getExperiencia());
				pokemones[i].subirNivel(pokemones[i].getExperiencia());
				
				
				for(int j=0;j<3;j++){
					if(pokemones[i].getNivel()==2){
						pokemones[i].getAtaques()[j].setDano(pokemones[i].getAtaques()[j].getDano()+1);
						pokemones[i].getAtaques()[j].setDano(pokemones[i].getAtaques()[j].getCura()+1);
						pokemones[i].getAtaques()[j].setDano(pokemones[i].getAtaques()[j].getBloqueo()+1);
					}
					if(pokemones[i].getNivel()==3){
						pokemones[i].getAtaques()[j].setDano(pokemones[i].getAtaques()[j].getDano()+2);
						pokemones[i].getAtaques()[j].setDano(pokemones[i].getAtaques()[j].getCura()+2);
						pokemones[i].getAtaques()[j].setDano(pokemones[i].getAtaques()[j].getBloqueo()+2);
					}
					if(pokemones[i].getNivel()==4){
						pokemones[i].getAtaques()[j].setDano(pokemones[i].getAtaques()[j].getDano()+3);
						pokemones[i].getAtaques()[j].setDano(pokemones[i].getAtaques()[j].getCura()+3);
						pokemones[i].getAtaques()[j].setDano(pokemones[i].getAtaques()[j].getBloqueo()+3);
					}
					if(pokemones[i].getNivel()==5){
						pokemones[i].getAtaques()[j].setDano(pokemones[i].getAtaques()[j].getDano()+4);
						pokemones[i].getAtaques()[j].setDano(pokemones[i].getAtaques()[j].getCura()+4);
						pokemones[i].getAtaques()[j].setDano(pokemones[i].getAtaques()[j].getBloqueo()+4);
					}
					if(pokemones[i].getNivel()==6){
						pokemones[i].getAtaques()[j].setDano(pokemones[i].getAtaques()[j].getDano()+5);
						pokemones[i].getAtaques()[j].setDano(pokemones[i].getAtaques()[j].getCura()+5);
						pokemones[i].getAtaques()[j].setDano(pokemones[i].getAtaques()[j].getBloqueo()+5);
					}
					System.out.println("Ataque "+pokemones[i].getAtaques()[j].getNombre()+" ");
					System.out.println("*** Daño:"+pokemones[i].getAtaques()[j].getDano());
					System.out.println("*** Cura:"+pokemones[i].getAtaques()[j].getCura());
					System.out.println("*** Bloqueo:"+pokemones[i].getAtaques()[j].getBloqueo());
					
				}
				System.out.println("**********************");
			}
				
		}
		System.out.println("\n\nPresione ENTER para continuar");
	}
}
