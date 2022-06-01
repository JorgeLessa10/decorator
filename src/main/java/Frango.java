/*
 ** created by: jorge.lessa
 */

public class Frango extends Lanche {

    protected Lanche lanche;

    public Frango(Lanche lanche) {
        this.lanche = lanche;
    }

    public String getDescricao()
    {
        return this.lanche.getDescricao() + ", frango";
    }

    @Override
    public double valor() {
        return this.lanche.valor() + 1.00;
    }
}
