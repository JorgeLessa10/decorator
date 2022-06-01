/*
 ** created by: jorge.lessa
 */

public class Bacon extends Lanche {

    protected Lanche lanche;

    public Bacon(Lanche lanche) {
        this.lanche = lanche;
    }

    @Override
    public String getDescricao() {
        return this.lanche.getDescricao() + ", bacon";
    }

    @Override
    public double valor() {
        return this.lanche.valor() + 2.00;
    }
}
