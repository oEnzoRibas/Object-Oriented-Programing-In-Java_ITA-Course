package ITA_POO_JAVA.Modules.Module4.ContaCorrente.Teste;

import ITA_POO_JAVA.Modules.Module4.ContaCorrente.Projeto.ContaCorrente;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TesteContaCorrente {

    ContaCorrente cc;

    @BeforeEach
    public void iniciaConta(){
        cc = new ContaCorrente();
        cc.depositar(200);
    }

    @Test
    public void testeSacar(){
        cc.sacar(20);
        assertEquals(180,cc.saldo);
    }


    @Test
    public void testeDeposito(){
        cc.depositar(30);
        assertEquals(230,cc.saldo);
    }

    @Test
    public void testeSaqueMaiorQueSaldo(){
        int valorSacado = cc.sacar(250);
        assertEquals(0, valorSacado);
    }
}
