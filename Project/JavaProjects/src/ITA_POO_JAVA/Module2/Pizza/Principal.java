package ITA_POO_JAVA.Module2.Pizza;

public class Principal {
    public static void main(String[] args) {
        Pizza calabresa = new Pizza();
        calabresa.adicionaIngrediente("Calabresa");
        calabresa.adicionaIngrediente("Peperoni");
        calabresa.adicionaIngrediente("Tomate");


        Pizza quatroqueijos = new Pizza();
        quatroqueijos.adicionaIngrediente("Mussarela");
        quatroqueijos.adicionaIngrediente("Queijo Minas");
        quatroqueijos.adicionaIngrediente("Gorgonzola");
        quatroqueijos.adicionaIngrediente("Queijo Canastra");
        quatroqueijos.adicionaIngrediente("Azeitona Preta");
        quatroqueijos.adicionaIngrediente("Milho");


        Pizza portuguesa = new Pizza();
        portuguesa.adicionaIngrediente("Azeite");
        portuguesa.adicionaIngrediente("Azeitona Verde");

        System.out.println(portuguesa.getPreco());
        System.out.println(quatroqueijos.getPreco());
        System.out.println(calabresa.getPreco());

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionaAoCarrinho(calabresa);
        carrinho.adicionaAoCarrinho(portuguesa);
        carrinho.adicionaAoCarrinho(quatroqueijos);

        System.out.println("Valor total da compra: "+ carrinho.valorTotal());

        Pizza.imprimeTotalDeIngredientesGastos();

    }
}
