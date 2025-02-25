package ITA_POO_JAVA.Module4.ContaCorrente.Teste;

import ITA_POO_JAVA.Module4.ContaCorrente.Projeto.ContaEspecial;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaEspecialTest extends TesteContaCorrente {

    @BeforeEach
    public void iniciaConta(){
        cc = new ContaEspecial(100);
        cc.depositar(200);
    }

    @Test
    public void testeSaqueMaiorQueSaldo(){
        int valorSacado = cc.sacar(350);
        assertEquals(0, valorSacado);
    }

    @Test
    public void testeSaqueMaiorQueSaldoDentroDoLimite(){
        int valorSacado = cc.sacar(300);
        assertEquals(-100, cc.saldo);
        assertEquals(300, valorSacado);
    }


}