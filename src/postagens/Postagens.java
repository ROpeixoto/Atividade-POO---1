package postagens;
import java.util.Date;
import java.util.ArrayList;
import comentarios.Comentarios;
import java.text.SimpleDateFormat;

public class Postagens {

	private String titulo;
	private String conteudo;
	private Date momento;
	private Integer curtidas;
	private ArrayList<Comentarios> comentarios = new ArrayList <>();
	

	public Postagens(Date momento, String titulo, String conteudo) {
		this.titulo = titulo;
		this.conteudo = conteudo;
		this.momento = momento;

	}
	public void addComentario(Comentarios comentario) {
		comentarios.add(comentario);
		
	}

	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getConteudo() {
		return conteudo;
	}
	
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	
	public Date getMomento() {
		return momento;
	}
	
	public void setMomento(Date momento) {
		this.momento = momento;
	}
	
	public Integer getCurtidas() {
		return curtidas;
	}
	
	public void setCurtidas(Integer curtidas) {
		this.curtidas = curtidas;
	}

	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("Título - "+ titulo);
		sb.append("\nData -" + sdf.format(momento));
		sb.append(" Curtidas - "+curtidas);
		sb.append("\n"+ conteudo+"\n");
		
		sb.append("Comentarios: \n");
		for (Comentarios c: comentarios) {
			sb.append(c+"\n");
		}
		return sb.toString();
		}
	}


