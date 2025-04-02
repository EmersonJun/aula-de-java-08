public class Materia implements Comparable<Materia>{
    private String nome;

    public Materia(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Materia [nome=" + nome + "]";
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int compareTo(Materia o) {
        // TODO Auto-generated method stub
        return nome.compareTo(o.getNome());
    }
    
}
