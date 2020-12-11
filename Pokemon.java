public class Pokemon{
	private int id;
	private String nombre;
	private boolean capturado;
	private boolean visto;
	private final int ps_max;
	private int ps;
	private int ataque;
	private int cura;
	private int defensa;
	private Ataque [] ataques = new Ataque[SetupPokemon.cantidadAtaques];
	private int experiencia;
	private int suma=0;
	private int nivel;
	private int auxnivel=1;
	private int aux=1;
	private int aux1=2;

	Pokemon(int id, String nombre, String [] listaAtaques){
		int valor=6;
		this.id = id;
		this.nombre = nombre;
		this.ps_max = SetupPokemon.ps_max;
		this.ps = this.ps_max;
		this.ataque = SetupPokemon.ataque;
		this.cura = SetupPokemon.cura;
		this.defensa = 0;
		this.capturado = false;
		this.visto = false;
		for(int i=0;i<SetupPokemon.cantidadAtaques;i++){
			if(this.nivel==2){
				this.aux=aux+1;
				this.aux1=aux1+1;
			}
			if(this.nivel==3){
				this.aux=aux+2;
				this.aux1=aux1+2;
			}
			if(this.nivel==4){
				this.aux=aux+3;
				this.aux1=aux1+3;
			}
			if(this.nivel==5){
				this.aux=aux+4;
				this.aux1=aux1+4;
			}
			if(this.nivel==6){
				this.aux=aux+4;
				this.aux1=aux1+4;
			}
			this.ataques[i] = new Ataque(listaAtaques[i],i+aux,valor-(i+aux),valor/aux1-i);
		}
		this.experiencia=0;
		this.nivel=1;
	}

	// public void mejoraNivel(){
	//  	if(this.nivel==2){
	 		
 	// 	}

	//  	else if (pokemon.getNivel()==3){
	//  		this.dano=this.dano+2;
	//  		this.cura=this.cura+2;
	//  		this.bloqueo=this.bloqueo+2;
	//  	}

	//  	else if (pokemon.getNivel()==4){
	//  		this.dano=this.dano+3;
	//  		this.cura=this.cura+3;
	//  		this.bloqueo=this.bloqueo+3;
	//  	}

	//  	else if (pokemon.getNivel()==5){
	//  		this.dano=this.dano+4;
	//  		this.cura=this.cura+4;
	//  		this.bloqueo=this.bloqueo+4;
	//  	}

	//  	else if (pokemon.getNivel()==6){
	//  		this.dano=this.dano+5;
	//  		this.cura=this.cura+5;
	//  		this.bloqueo=this.bloqueo+5;
	//  	}
	//  }

	public void sumarExperiencia(int experiencia){
		suma=suma+experiencia;
		this.experiencia=suma;
		System.out.println("Total de experiencia : " + suma);
	}

	public int getExperiencia(){
		return this.experiencia;
	}

	public int getNivel(){
		return this.nivel;
	}

	public void subirNivel(int experiencia){
		String texto="";
		if(experiencia>200){
			auxnivel=2;
			this.nivel=auxnivel;
		}
		else if(experiencia>500){
			auxnivel=3;
			this.nivel=auxnivel;
		}
		else if(experiencia>900){
			auxnivel=4;
			this.nivel=auxnivel;
		}
		else if(experiencia>1400){
			auxnivel=5;
			this.nivel=auxnivel;
		}
		else if(experiencia>2000){
			auxnivel=6;
			this.nivel=auxnivel;
		}

		if(this.nivel==6){
			texto=" (Maximo nivel)";
		}
		System.out.println("Nivel : " + auxnivel + " " + texto);
		

	}
	public void setCapturado(){
		this.capturado = true;
	}
	public void setVisto(){
		this.visto = true;
	}
	public String getNombre(){
		return this.nombre;
	}
	public boolean getCapturado(){
		return this.capturado;
	}
	public int getId(){
		return this.id;
	}
	
	public void recibirAtaque(Ataque ataque){
		if(this.defensa>0){
			this.defensa -= ataque.getDano();
		}else{
		this.ps -= ataque.getDano();
	}
	}

	public void recibirCura(Ataque cura){
		this.ps += cura.getCura();
		if(this.ps>10){
			this.ps=10;
		}
	}

	public void recibirDefensa(Ataque defensa){
		this.defensa += defensa.getBloqueo();
		if(this.defensa>SetupPokemon.defensa){
			this.defensa=SetupPokemon.defensa;
		}
	}

	public Ataque [] getAtaques(){
		return ataques;
	}
	public int getPs(){
		return ps;
	}

	public int getDefensa(){
		return defensa;
	}


	public int getPsmax(){
		return ps_max;
	}
	public void restaurar(){
		this.ps = this.ps_max;
	}
}