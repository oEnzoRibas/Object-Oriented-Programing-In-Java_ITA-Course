package ITA_POO_JAVA.Modules.Module4.ContaCorrente.Projeto;

public class ContaCorrente {
    public int saldo;

    public int sacar(int valor){
        if(valor > saldo){
            return 0;
        }else {
            saldo -= valor;
            return valor;
        }
    }

    public void depositar(int valor){
        saldo += valor;
    }

}
