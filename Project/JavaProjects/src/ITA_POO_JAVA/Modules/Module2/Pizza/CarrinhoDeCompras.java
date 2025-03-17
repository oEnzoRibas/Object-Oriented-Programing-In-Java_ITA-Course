package ITA_POO_JAVA.Modules.Module2.Pizza;

import java.util.ArrayList;

public class CarrinhoDeCompras {
    public ArrayList<Pizza> listaDePizzas = new ArrayList<>();

    public void adicionaAoCarrinho(Pizza pizza){
        if (pizza.qntIngredientes != 0) {
            listaDePizzas.add(pizza);
        }else {
            System.out.println("Não é possível adicionar uma pizza com 0 ingredientes!");
        }
    }

    public int valorTotal(){
        int total = 0;
        for (Pizza pizza : listaDePizzas){
            total += pizza.getPreco();
        }
        return total;
    }

}
