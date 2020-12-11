public class Ataque{
	private String nombre;
	private int dano;
	private int cura;
	private int bloqueo;
	

	Ataque(String nombre, int dano,int cura, int bloqueo){
		this.nombre = nombre;
		this.dano = dano;
		this.cura = cura;
		this.bloqueo = bloqueo;
	}

	public int getDano(){
		return this.dano;
	}
	public int getCura(){
		return this.cura;
	}
	public int getBloqueo(){
		return this.bloqueo;
	}
	public String getNombre(){
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setDano(int dano) {
		this.dano = dano;
	}
	public void setCura(int cura) {
		this.cura = cura;
	}
	public void setBloqueo(int bloqueo) {
		this.bloqueo = bloqueo;
	}

	






	

	// public void mejoraNivel(){

	// 	if(pokemon.getNivel()==2){
	//  		this.dano=this.dano+1;
	//  		this.cura=this.cura+1;
	//  		this.bloqueo=this.bloqueo+1;
	//  	}

	//  	else if (pokemon.getNivel()==3){
	//  		this.dano=this.dano+2;
	//  		this.cura=this.cura+2;
	//  		this.bloqueo=this.bloqueo+2;
	//  	}}

	// 	else if (pokemon.getNivel()==4){
	// 		this.dano=this.dano+3;
	// 		this.cura=this.cura+3;
	// 		this.bloqueo=this.bloqueo+3;
	// 	}

	// 	else if (pokemon.getNivel()==5){
	// 		this.dano=this.dano+4;
	// 		this.cura=this.cura+4;
	// 		this.bloqueo=this.bloqueo+4;
	// 	}

	// 	else if (pokemon.getNivel()==6){
	// 		this.dano=this.dano+5;
	// 		this.cura=this.cura+5;
	// 		this.bloqueo=this.bloqueo+5;
	// 	}

		
	// }
}