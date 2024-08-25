package main;
// Feito por Rodrigo Peixoto e Emanuele Penteado
import comentarios.Comentarios;
import postagens.Postagens;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws ParseException{
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date momento = sdf.parse("29/03/2023 07:15:37");
		Postagens postagem = new Postagens (momento, "Bom dia!","Boa prova para todos");
		
		Comentarios comentario = new Comentarios("Vamos nos dar bem");
		postagem.addComentario(comentario);
		comentario = new Comentarios("Boa sorte para todos");
		postagem.addComentario(comentario);
		System.out.println(postagem);
		
		momento = sdf.parse("29/03/2023 08:10:21");
		postagem = new Postagens(momento,"Viagem para Paris","Eu estou adorando este país");
		comentario = new Comentarios("Tenha uma boa viagem");
		postagem.addComentario(comentario);
		comentario = new Comentarios("Uau, isso é incrivel!");
		postagem.addComentario(comentario);
		System.out.println(postagem);
		
		
}
	}