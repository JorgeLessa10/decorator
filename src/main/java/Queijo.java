/*
 ** created by: jorge.lessa
 */

public class Queijo extends Lanche{

    protected Lanche lanche;

    public Queijo(Lanche lanche) {
        this.lanche = lanche;
    }

    @Override
    public String getDescricao() {
        return this.lanche.getDescricao() + ", queijo";
    }

    @Override
    public double valor() {
        return this.lanche.valor() + 0.50;
    }
}
