package ITA_POO_JAVA.Module2.Pizza.Testes;

import ITA_POO_JAVA.Module2.Pizza.Pizza;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static ITA_POO_JAVA.Module2.Pizza.Pizza.*;

public class TestePizza {
    @Test
    public void testeValorTotal() {

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



        Assertions.assertEquals(15, calabresa.getPreco());
        Assertions.assertEquals(20, mussarela.getPreco());
        Assertions.assertEquals(23, portuguesa.getPreco());
    }

    @Test
    public void testeContabilizaIngrediente() {
        Pizza calabresa = new Pizza();
        calabresa.adicionaIngrediente("Calabresa");
        calabresa.adicionaIngrediente("Peperoni");
        calabresa.adicionaIngrediente("Tomate");
        calabresa.adicionaIngrediente("Azeite");

        Pizza mussarela = new Pizza();
        mussarela.adicionaIngrediente("Mussarela");
        mussarela.adicionaIngrediente("Azeite");
        mussarela.adicionaIngrediente("Azeitona Verde");

        Pizza portuguesa = new Pizza();
        portuguesa.adicionaIngrediente("Azeite");
        portuguesa.adicionaIngrediente("Azeitona Verde");
        portuguesa.adicionaIngrediente("Peperoni");
        portuguesa.adicionaIngrediente("Tomate");

        for (Map.Entry<String, Integer> ingrediente : ingredientesContabilizados.entrySet()) {
            String ingredienteName = ingrediente.getKey();
            int quantidade = ingrediente.getValue();

            switch (ingredienteName) {
                case "Calabresa", "Mussarela" -> Assertions.assertEquals(1, quantidade);
                case "Peperoni", "Azeitona Verde", "Tomate" -> Assertions.assertEquals(2, quantidade);
                case "Azeite" -> Assertions.assertEquals(3, quantidade);
            }

        }
    }

    @AfterEach
    public void afterTesteContabilizaIngrediente(){
        zeraIngrediente();
    }

    @Test
    public void testeContabilizaIngredienteAfter() {


        Pizza lambia = new Pizza();
        lambia.adicionaIngrediente("Azeite");
        lambia.adicionaIngrediente("Azeitona Verde");
        lambia.adicionaIngrediente("Peperoni");
        lambia.adicionaIngrediente("Calabresa");
        lambia.adicionaIngrediente("Mussarela");
        lambia.adicionaIngrediente("Tomate");

        for (Map.Entry<String, Integer> ingrediente : ingredientesContabilizados.entrySet()) {
            String ingredienteName = ingrediente.getKey();
            int quantidade = ingrediente.getValue();

            switch (ingredienteName) {
                case "Calabresa", "Peperoni", "Tomate", "Mussarela", "Azeite", "Azeitona Verde" -> Assertions.assertEquals(1, quantidade);
            }

        }
    }
}
