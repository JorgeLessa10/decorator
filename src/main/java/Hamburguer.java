/*
 ** created by: jorge.lessa
 */
public class Hamburguer extends Lanche {

    String descricao = "Pão, bife, batata palha, ovo, alface, tomate, milho";

    public Hamburguer() {
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    @Override
    public double valor() {
        return 6.50;
    }
}
