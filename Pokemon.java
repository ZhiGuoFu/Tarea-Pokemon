public class Pokemon{
	private int id;
	private String nombre;
	private boolean capturado;
	private boolean visto;
	private final int ps_max;
	private int ps;
	private int ataque;
	private Ataque [] ataques = new Ataque[SetupPokemon.cantidadAtaques];
	private int experiencia;
	private int suma=0;
	private int nivel;
	private int auxnivel=1;

	Pokemon(int id, String nombre, String [] listaAtaques){
		int valor=6;
		this.id = id;
		this.nombre = nombre;
		this.ps_max = SetupPokemon.ps_max;
		this.ps = this.ps_max;
		this.ataque = SetupPokemon.ataque;
		this.capturado = false;
		this.visto = false;
		for(int i=0;i<SetupPokemon.cantidadAtaques;i++){
			this.ataques[i] = new Ataque(listaAtaques[i],i+1,valor-(i+1),valor/2-i);
		}
		this.experiencia=0;
		this.nivel=1;
	}

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
		auxnivel=0;

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
		this.ps -= ataque.getDano();
	}
	public Ataque [] getAtaques(){
		return ataques;
	}
	public int getPs(){
		return ps;
	}
	public void restaurar(){
		this.ps = this.ps_max;
	}
}