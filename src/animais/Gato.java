package animais;

/**
 *
 * @author Ismael de Oliveira
 */
public class Gato extends Animal{

    public Gato() {
    }
    
     public Gato(String nome, String matricula, String raca, String genero, float idade, float tamanho, String doenca, String ND) {
        this.nome = nome;
        this.matricula = matricula;
        this.raca = raca;
        this.genero = genero;
        this.idade = idade;
        this.tamanho = tamanho;
        this.doenca = doenca;
        String NomeDono = ND;
    }
}
