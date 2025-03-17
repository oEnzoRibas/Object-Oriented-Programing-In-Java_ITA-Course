package ITA_POO_JAVA.Modules.Module2.Pizza;

import java.util.HashMap;
import java.util.Map;

public class Pizza {

    public int qntIngredientes = 0;

    public static HashMap<String,Integer> ingredientesContabilizados = new HashMap<>();

    public static void contabilizaIngrediente(String ingrediente, int num){
        ingredientesContabilizados.put(ingrediente,num);
    }

    public static void zeraIngrediente(){
        ingredientesContabilizados.clear();
    }

    public void adicionaIngrediente(String ingrediente){
        qntIngredientes += 1;
        int num = ingredientesContabilizados.containsKey(ingrediente) ? ingredientesContabilizados.get(ingrediente)+1 : 1;
        contabilizaIngrediente(ingrediente,num);
    }
    public int getPreco(){

        if (qntIngredientes <= 2){
            return 15;
        } else if(qntIngredientes <= 5){
            return 20;
        }else {
            return 23;
        }

    }

    public static void imprimeTotalDeIngredientesGastos(){
        int total = 0;
        System.out.println("Quantidade utilizada de cada ingrediente:");
        for (Map.Entry<String,Integer> ingrediente : ingredientesContabilizados.entrySet()){
            String ingredienteName = ingrediente.getKey();
            int quantidade = ingrediente.getValue();

            System.out.printf("""
                    - %s: %d
                    """, ingredienteName, quantidade);
            total += quantidade;
        }
    }

}
