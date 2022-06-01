/*
 ** created by: jorge.lessa
 */
public class Pizza extends Lanche{

    String descricao = "Presunto, mussarela";

    public Pizza() {
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    @Override
    public double valor() {
        return 5.00;
    }
}
