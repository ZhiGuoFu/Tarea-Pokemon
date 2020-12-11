import java.math.*;
import java.io.*;
import java.util.Random.*;




public class Combate{
	private Pokemon player1;
	private Pokemon player2;
	private int indexRival;
	BufferedReader buffer;


	Combate(Pokemon player1, Pokedex pokedexGral){
		buffer = new BufferedReader(new InputStreamReader(System.in));
		this.player1 = player1;
		indexRival = (int)Math.round(Math.random()*8);
		this.player2 = pokedexGral.getPokemon(indexRival);
	}

	public void ataque(Pokemon player1,Pokemon player2){
		int op;
		try{
			System.out.println(player1.getNombre()+", El ataque será: ");
			System.out.println("1.-"+player1.getAtaques()[0].getNombre());
			System.out.println("2.-"+player1.getAtaques()[1].getNombre());
			System.out.println("3.-"+player1.getAtaques()[2].getNombre());
			op = Integer.parseInt(buffer.readLine());

			player2.recibirAtaque(player1.getAtaques()[op-1]);
			System.out.println("\n\n********************************************************\n");
			System.out.println(player1.getNombre()+"  Ataco con : "+player1.getAtaques()[op-1].getNombre());
			System.out.println(player2.getNombre()+"  Enemigo tu nivel de Puntos de Salud es "+player2.getPs() + " y su defensa es : " + player1.getDefensa());
			System.out.println("\n********************************************************\n\n");
		}catch(IOException e){
			System.out.println("Error de lectura desde el teclado...");
		}
	}

	public void cura(Pokemon player1){
		int op;
		try{
			System.out.println(player1.getNombre()+", La curacion será: ");
			System.out.println("1.-"+player1.getAtaques()[0].getNombre());
			System.out.println("2.-"+player1.getAtaques()[1].getNombre());
			System.out.println("3.-"+player1.getAtaques()[2].getNombre());
			op = Integer.parseInt(buffer.readLine());

			if (player1.getPs()==10){
				System.out.println(" Su vida esta al maximo ");
			}
			else{
			player1.recibirCura(player1.getAtaques()[op-1]);
			System.out.println("\n\n********************************************************\n");
			System.out.println(player1.getNombre()+"  Se curo con : "+player1.getAtaques()[op-1].getNombre());
			System.out.println(player1.getNombre()+"  Te curaste y Tu nivel de Puntos de Salud es "+player1.getPs());
			System.out.println("\n********************************************************\n\n");
		}
		}catch(IOException e){
			System.out.println("Error de lectura desde el teclado...");
		}
	}

	public void defensa(Pokemon player1){
		int op;
		try{
			System.out.println(player1.getNombre()+", La defensa será: ");
			System.out.println("1.-"+player1.getAtaques()[0].getNombre());
			System.out.println("2.-"+player1.getAtaques()[1].getNombre());
			System.out.println("3.-"+player1.getAtaques()[2].getNombre());
			op = Integer.parseInt(buffer.readLine());

			if (player1.getPs()==SetupPokemon.defensa){
				System.out.println(" Su defensa esta al maximo ");
			}
			else{
			player1.recibirDefensa(player1.getAtaques()[op-1]);
			System.out.println("\n\n********************************************************\n");
			System.out.println(player1.getNombre()+"  Te defendiste con : "+player1.getAtaques()[op-1].getNombre());
			System.out.println(player1.getNombre()+"  Te protegiste y Tu nivel de Puntos de Salud es "+player1.getPs() + " y su defensa es : " + player1.getDefensa());
			System.out.println("\n********************************************************\n\n");
		}
		}catch(IOException e){
			System.out.println("Error de lectura desde el teclado...");
		}
	}


	public int accionrandomenemiga(){
		int accionrandom = (int) (Math.random()*2);
		return accionrandom;
	}

	public void cura2(Pokemon player2){
		int randomcura = (int) (Math.random()*3);
		if (player2.getPs()==10){
			System.out.println(" Su vida esta al maximo ");
		}
		player2.recibirCura(player2.getAtaques()[randomcura]);

		System.out.println(player1.getNombre()+ " Enemigo se Curo con : " +player1.getAtaques()[randomcura].getNombre());
		System.out.println(player1.getNombre()+" Enemigo se curo y Su nivel de Puntos de Salud es "+player2.getPs());
		System.out.println("\n********************************************************\n\n");

	}
	public void ataque2(Pokemon player1,Pokemon player2){
		
		int randomataque = (int) (Math.random()*3);
		player2.recibirAtaque(player1.getAtaques()[randomataque]);
		System.out.println(player1.getNombre()+ " Enemigo Ataco con : " +player1.getAtaques()[randomataque].getNombre());
		System.out.println(player2.getNombre()+" tu nivel de Puntos de Salud es "+player2.getPs()+ " y su defensa es : " + player2.getDefensa());
		System.out.println("\n********************************************************\n\n");
		
	}

	public void defensa2(Pokemon player2){
		int randomdefensa = (int) (Math.random()*3);
		player2.recibirDefensa(player2.getAtaques()[randomdefensa]);
		System.out.println(player2.getNombre()+ " Enemigo se Protegio con : " +player1.getAtaques()[randomdefensa].getNombre());
		System.out.println(player2.getNombre()+" Enemigo se protegio y Su nivel de Puntos de Salud es "+player2.getPs()+ " y su defensa es : " + player2.getDefensa());
		System.out.println("\n********************************************************\n\n");

	}

	
	public int combatir(){
		int out=0;
		boolean sigue=true;
		int op=0;
		while(sigue){
			try{
			System.out.println("Seleccione Accion: ");
			System.out.println("1.-Ataque");
			System.out.println("2.-Curacion");
			System.out.println("3.-Defensa");
			op = Integer.parseInt(buffer.readLine());
		}catch(IOException e){
			System.out.println("Error de lectura desde el teclado...");
		}

			if(op==1){
				ataque(player1,player2);
				if(revisarTriunfo(player2)){
					System.out.println("\n\n********************************************************\n\n");
					System.out.println("Felicitaciones...Haz ganado la partida!!");
					System.out.println("\n\n********************************************************\n\n");
					out = indexRival;
					player1.restaurar();
					player2.restaurar();
					break;
				} 
				
			}if(op==2){
				cura(player1);
				if(revisarTriunfo(player2)){
					player1.restaurar();
					player2.restaurar();
					break;
				}
				
			}if(op==3){
				defensa(player1);
				if(revisarTriunfo(player2)){
					player1.restaurar();
					player2.restaurar();
					break;}
			}
			
			// }else if(op==3){
			// 	defensa(player1);
			// 	if(revisarTriunfo(player2)){
			// 		player1.restaurar();
			// 		player2.restaurar();
			// 		break;
			// }
			
			// if(player2.getPs()==player2.getPsmax()){
			// 	int randomaux= (int) (Math.random()*1);
			// 	if(randomaux==0){
			// 		ataque2(player2,player1);
			// 		if(revisarTriunfo(player1)){
			// 		System.out.println("\n\n********************************************************\n\n");
			// 		System.out.println("Haz perdido la partida!!");
			// 		out = -1;
			// 		player1.restaurar();
			// 		player2.restaurar();
			// 		break;
			// 		}}
				// }else if(randomaux==1){
				// 	defensa2(player2);
				// 	if(revisarTriunfo(player1)){
				// 		System.out.println("\n\n********************************************************\n\n");
				// 		System.out.println("Haz perdido la partida!!");
				// 		out = -1;
				// 		player1.restaurar();
				// 		player2.restaurar();
				// 		break;
				// 	}
				// }
				if(player2.getPs()<=player2.getPsmax()){
				int randomaux2= (int) (Math.random()*3);
				if(randomaux2==0){
				cura2(player2);
				if(revisarTriunfo(player2)){
					player1.restaurar();
					player2.restaurar();
					break;}
				}else if(randomaux2==1){
					ataque2(player2,player1);
					if(revisarTriunfo(player1)){
					System.out.println("\n\n********************************************************\n\n");
					System.out.println("Haz perdido la partida!!");
					out = -1;
					player1.restaurar();
					player2.restaurar();
					break;
				}
				}else if(randomaux2==2){
				 	defensa2(player2);
				 	if(revisarTriunfo(player1)){
				 		System.out.println("\n\n********************************************************\n\n");
				 		System.out.println("Haz perdido la partida!!");
				 		out = -1;
				 		player1.restaurar();
				 		player2.restaurar();
				 		break;
				 	}
				 
			}
		}
		}
		return out;
		
	}
	
	public boolean revisarTriunfo(Pokemon player){
		if(player.getPs()<=0) return true;
		else return false;
	}

}