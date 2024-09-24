package dominio;

public abstract class Conteudo {
    
    
    protected static final Double XP_PADRAO = 10d;
    
    private String titulo;
    private String decricao;
    
    
    public abstract double calcularXp();


    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getDecricao() {
        return decricao;
    }


    public void setDecricao(String decricao) {
        this.decricao = decricao;
    }
    
    
    

}
