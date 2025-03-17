package ITA_POO_JAVA.Modules.Module5.NameFormat.Tests;

import static org.junit.jupiter.api.Assertions.*;

import ITA_POO_JAVA.Modules.Module5.NameFormat.Project.Classes.Authority;

import ITA_POO_JAVA.Modules.Module5.NameFormat.Project.Classes.Informal;
import ITA_POO_JAVA.Modules.Module5.NameFormat.Project.Classes.Respectful;
import ITA_POO_JAVA.Modules.Module5.NameFormat.Project.Classes.Titled;
import org.junit.jupiter.api.Test;

class AuthorityTest {

    @Test
    void testInformal() {
        Authority Authority = new Authority("Pedro", "Cabral", new Informal());
        assertEquals("Pedro", Authority.getFormatted());
    }

    @Test
    void testRespeitosoMasculino() {
        Authority Authority = new Authority("Pedro", "Cabral", new Respectful(true));
        assertEquals("Mr. Cabral", Authority.getFormatted());
    }

    @Test
    void testRespeitosoFeminino() {
        Authority Authority = new Authority("Maria", "Silva", new Respectful(false));
        assertEquals("Ms. Silva", Authority.getFormatted());
    }

    @Test
    void testComTitulo() {
        Authority Authority = new Authority("Pedro", "Cabral", new Titled("Magnífico"));
        assertEquals("Magnífico Pedro Cabral", Authority.getFormatted());
    }
}
