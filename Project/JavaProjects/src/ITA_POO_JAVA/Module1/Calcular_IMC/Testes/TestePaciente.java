package ITA_POO_JAVA.Module1.Calcular_IMC.Testes;

import ITA_POO_JAVA.Module1.Calcular_IMC.Paciente;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class TestePaciente {

    @org.junit.jupiter.api.Test
    public void testeIMC(){
        Paciente p = new Paciente(9,3);
        assertEquals(1,p.calcularIMC(),1);

    }

    @Test
    public void testeBaixoPesoMuitoGrave(){
        Paciente p = new Paciente(48,1.75);
        System.out.println(p.diagnostico());

        assertEquals("Baixo peso muito grave",p.diagnostico());
    }

    @Test
    public void testeBaixoPesoGrave(){
        Paciente p = new Paciente(50,1.75);
        System.out.println(p.diagnostico());

        assertEquals("Baixo peso grave",p.diagnostico());
    }

    @Test
    public void testeBaixoPeso(){
        Paciente p = new Paciente(55,1.75);
        System.out.println(p.diagnostico());

        assertEquals("Baixo peso",p.diagnostico());
    }

    @Test
    public void testePesoNormal(){
        Paciente p = new Paciente(60,1.75);
        System.out.println(p.diagnostico());

        assertEquals("Peso normal",p.diagnostico());
    }



    @Test
    public void testeSobrepeso(){
        Paciente p = new Paciente(78,1.75);
        System.out.println(p.diagnostico());

        assertEquals("Sobrepeso",p.diagnostico());
    }

    @Test
    public void testeObesidadeGrauI(){
        Paciente p = new Paciente(92,1.75);
        System.out.println(p.diagnostico());

        assertEquals("Obesidade grau I",p.diagnostico());
    }

    @Test
    public void testeObesidadeGrauII(){
        Paciente p = new Paciente(110,1.75);
        System.out.println(p.diagnostico());

        assertEquals("Obesidade grau II",p.diagnostico());
    }

    @Test
    public void testeObesidadeGrauIII(){
        Paciente p = new Paciente(130,1.75);
        System.out.println(p.diagnostico());

        assertEquals("Obesidade grau III (obesidade mórbida)",p.diagnostico());
    }

}
