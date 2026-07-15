package br.edu.ifrn.nexora.modelo;

/**
 * Entidade que representa um Motorista no sistema Nexora.
 */
public class Motorista {

    private Long id; 
    private String nome;
    private String cnh;
    private String tipoCnh;
    private boolean ativo;

    // Construtor padrão
    public Motorista() {}

    // Construtor completo para novos cadastros
    public Motorista(String nome, String cnh, String tipoCnh) {
        this.nome = nome;
        this.cnh = cnh;
        this.tipoCnh = tipoCnh;
        this.ativo = true; 
    }

    // --- GETTERS E SETTERS (Essenciais para o repositório funcionar) ---

    public Long getId() { 
        return id; 
    }

    public void setId(Long id) { 
        this.id = id; 
    }

    public String getNome() { 
        return nome; 
    }

    public void setNome(String nome) { 
        this.nome = nome; 
    }

    public String getCnh() { 
        return cnh; 
    }

    public void setCnh(String cnh) { 
        this.cnh = cnh; 
    }

    public String getTipoCnh() { 
        return tipoCnh; 
    }

    public void setTipoCnh(String tipoCnh) { 
        this.tipoCnh = tipoCnh; 
    }

    public boolean isAtivo() { 
        return ativo; 
    }

    public void setAtivo(boolean ativo) { 
        this.ativo = ativo; 
    }

    @Override
    public String toString() {
        return "Motorista{id=" + id + ", nome='" + nome + "', CNH='" + cnh + 
               "', tipo='" + tipoCnh + "', ativo=" + ativo + "}";
    }
}