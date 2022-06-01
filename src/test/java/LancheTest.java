import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/*
 ** created by: jorge.lessa
 */
class LancheTest {

    public static final String DESCRICAO_HAMBURGUER = "Pão, bife, batata palha, ovo, alface, tomate, milho";
    public static final String DESCRICAO_PIZZA = "Presunto, mussarela";
    public static final String QUEIJO = ", queijo";
    public static final String BACON = ", bacon";
    public static final String FRANGO = ", frango";

    @Test
    void deveRetornarUmHamburguer()
    {
        Lanche hamburguer = new Hamburguer();
        assertEquals(6.50, hamburguer.valor());
        assertEquals(DESCRICAO_HAMBURGUER, hamburguer.getDescricao());
    }

    @Test
    void deveRetornarUmHamburguerComQueijo()
    {
        Lanche hamburguer = new Queijo(new Hamburguer());
        assertEquals(7.00, hamburguer.valor());
        assertEquals(DESCRICAO_HAMBURGUER + QUEIJO , hamburguer.getDescricao());
    }

    @Test
    void deveRetornarUmHamburguerComBacon()
    {
        Lanche hamburguer = new Bacon(new Hamburguer());
        assertEquals(8.50, hamburguer.valor());
        assertEquals(DESCRICAO_HAMBURGUER + BACON , hamburguer.getDescricao());
    }

    @Test
    void deveRetornarUmHamburguerComFrango()
    {
        Lanche hamburguer = new Frango(new Hamburguer());
        assertEquals(7.50, hamburguer.valor());
        assertEquals(DESCRICAO_HAMBURGUER + FRANGO , hamburguer.getDescricao());
    }

    @Test
    void deveRetornarUmHamburguerComQueijoMaisBacon()
    {
        Lanche hamburguer = new Queijo(new Bacon(new Hamburguer()));
        assertEquals(9.00, hamburguer.valor());
        assertEquals(DESCRICAO_HAMBURGUER + BACON + QUEIJO , hamburguer.getDescricao());
    }

    @Test
    void deveRetornarUmHamburguerComQueijoMaisFrango()
    {
        Lanche hamburguer = new Queijo(new Frango(new Hamburguer()));
        assertEquals(8.00, hamburguer.valor());
        assertEquals(DESCRICAO_HAMBURGUER + FRANGO + QUEIJO, hamburguer.getDescricao());
    }

    @Test
    void deveRetornarUmHamburguerComBaconMaisFrango()
    {
        Lanche hamburguer = new Bacon(new Frango(new Hamburguer()));
        assertEquals(9.50, hamburguer.valor());
        assertEquals(DESCRICAO_HAMBURGUER + FRANGO + BACON , hamburguer.getDescricao());
    }

    @Test
    void deveRetornarUmHamburguerComQueijoMaisFrangoMaisBacon()
    {
        Lanche hamburguer = new Queijo(new Frango(new Bacon(new Hamburguer())));
        assertEquals(10.00, hamburguer.valor());
        assertEquals(DESCRICAO_HAMBURGUER + BACON + FRANGO + QUEIJO , hamburguer.getDescricao());
    }

    @Test
    void deveRetornarUmaPizza()
    {
        Lanche pizza = new Pizza();
        assertEquals(5.00, pizza.valor());
        assertEquals(DESCRICAO_PIZZA, pizza.getDescricao());
    }

    @Test
    void deveRetornarUmaPizzaComQueijo()
    {
        Lanche pizza = new Queijo(new Pizza());
        assertEquals(5.50, pizza.valor());
        assertEquals(DESCRICAO_PIZZA + QUEIJO, pizza.getDescricao());
    }

    @Test
    void deveRetornarUmaPizzaComBacon()
    {
        Lanche pizza = new Bacon(new Pizza());
        assertEquals(7.00, pizza.valor());
        assertEquals(DESCRICAO_PIZZA + BACON, pizza.getDescricao());
    }

    @Test
    void deveRetornarUmaPizzaComFrango()
    {
        Lanche pizza = new Frango(new Pizza());
        assertEquals(6.00, pizza.valor());
        assertEquals(DESCRICAO_PIZZA + FRANGO, pizza.getDescricao());
    }

    @Test
    void deveRetornarUmaPizzaComQueijoMaisBacon()
    {
        Lanche pizza = new Queijo(new Bacon(new Pizza()));
        assertEquals(7.50, pizza.valor());
        assertEquals(DESCRICAO_PIZZA + BACON + QUEIJO, pizza.getDescricao());
    }

    @Test
    void deveRetornarUmaPizzaComQueijoMaisFrango()
    {
        Lanche pizza = new Queijo(new Frango(new Pizza()));
        assertEquals(6.50, pizza.valor());
        assertEquals(DESCRICAO_PIZZA + FRANGO + QUEIJO, pizza.getDescricao());
    }

    @Test
    void deveRetornarUmaPizzaComBaconMaisFrango()
    {
        Lanche pizza = new Bacon(new Frango(new Pizza()));
        assertEquals(8.00, pizza.valor());
        assertEquals(DESCRICAO_PIZZA + FRANGO + BACON, pizza.getDescricao());
    }

    @Test
    void deveRetornarUmaPizzaComQueijoMaisFrangoMaisBacon()
    {
        Lanche pizza = new Queijo(new Frango(new Bacon(new Pizza())));
        assertEquals(8.50, pizza.valor());
        assertEquals(DESCRICAO_PIZZA + BACON + FRANGO + QUEIJO, pizza.getDescricao());
    }

}