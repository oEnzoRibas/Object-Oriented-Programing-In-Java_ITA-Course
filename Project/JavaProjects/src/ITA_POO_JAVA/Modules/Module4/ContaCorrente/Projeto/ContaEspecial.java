package ITA_POO_JAVA.Modules.Module4.ContaCorrente.Projeto;

public class ContaEspecial extends ContaCorrente{

    int limite;

    public ContaEspecial(int limite){
        this.limite = limite;
    }

    @Override
    public int sacar(int valor){
        if(valor > saldo+limite){
            return 0;
        }else {
            saldo -= valor;
            return valor;
        }
    }
}
