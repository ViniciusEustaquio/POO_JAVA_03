package dominio;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Dev {
    
    private String nome;
    private Set<Conteudo> ConteudoInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();
    
    
    
    public void inscreverBootcamp(Bootcamp bootcamp){
        
        this.ConteudoInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }
    
    public void progredir(){
        
      Optional<Conteudo> conteudo =  this.conteudosConcluidos.stream().findFirst();
      if (conteudo.isPresent()) {
        this.conteudosConcluidos.add(conteudo.get());
        this.ConteudoInscritos.remove(conteudo.get());
      } else {
        
        System.err.println("Voçe não está matriculado em nenhum conteudo");
        
      }
        
        
    }
    
    public Double calcularTotalXp(){
        
        return this.conteudosConcluidos.stream().mapToDouble(conteudo -> conteudo.calcularXp()).sum();
        
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudoInscritos() {
        return ConteudoInscritos;
    }

    public void setConteudoInscritos(Set<Conteudo> conteudoInscritos) {
        ConteudoInscritos = conteudoInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }
    
    
    

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((ConteudoInscritos == null) ? 0 : ConteudoInscritos.hashCode());
        result = prime * result + ((conteudosConcluidos == null) ? 0 : conteudosConcluidos.hashCode());
        return result;
    }
    
    
    

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Dev other = (Dev) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (ConteudoInscritos == null) {
            if (other.ConteudoInscritos != null)
                return false;
        } else if (!ConteudoInscritos.equals(other.ConteudoInscritos))
            return false;
        if (conteudosConcluidos == null) {
            if (other.conteudosConcluidos != null)
                return false;
        } else if (!conteudosConcluidos.equals(other.conteudosConcluidos))
            return false;
        return true;
    }
    

}
