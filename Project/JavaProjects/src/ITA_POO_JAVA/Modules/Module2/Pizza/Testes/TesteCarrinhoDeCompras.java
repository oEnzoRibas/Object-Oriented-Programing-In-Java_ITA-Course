package ITA_POO_JAVA.Modules.Module2.Pizza.Testes;

import ITA_POO_JAVA.Modules.Module2.Pizza.CarrinhoDeCompras;
import ITA_POO_JAVA.Modules.Module2.Pizza.Pizza;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TesteCarrinhoDeCompras {

    @Test
    public void testeValorTotal(){
        Pizza calabresa = new Pizza();
        calabresa.adicionaIngrediente("Calabresa");
        calabresa.adicionaIngrediente("Peperoni");

        Pizza mussarela = new Pizza();
        mussarela.adicionaIngrediente("Mussarela");
        mussarela.adicionaIngrediente("Azeite");
        mussarela.adicionaIngrediente("Azeitona Verde");

        Pizza portuguesa = new Pizza();
        portuguesa.adicionaIngrediente("Azeite");
        portuguesa.adicionaIngrediente("Azeitona Verde");
        portuguesa.adicionaIngrediente("Peperoni");
        portuguesa.adicionaIngrediente("Tomate");
        portuguesa.adicionaIngrediente("Peperoni");
        portuguesa.adicionaIngrediente("Tomate");

        CarrinhoDeCompras cart =  new CarrinhoDeCompras();

        cart.adicionaAoCarrinho(calabresa);
        cart.adicionaAoCarrinho(mussarela);
        cart.adicionaAoCarrinho(portuguesa);

        Assertions.assertEquals(15+20+23, cart.valorTotal());
    }

    @Test
    public void testeAdicionaPizzaSemIngredientes(){
        Pizza PizzaVazia = new Pizza();
        CarrinhoDeCompras cart = new CarrinhoDeCompras();

        cart.adicionaAoCarrinho(PizzaVazia);

        Assertions.assertTrue(cart.listaDePizzas.isEmpty());
    }
}
