package Caneta;

public class MainConta{
	public static void main(String args []){
            Conta conta1 = new Conta();
            conta1.setSaldo(500);
            conta1.imprimirEstado();
            
            conta1.retirar (250);
            conta1.imprimirEstado();
        }
}
