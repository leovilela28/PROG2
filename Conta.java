
package Caneta;

public class Conta {
  private double saldo;
  public Conta(){
    saldo = 0;
  }
  public double getSaldo(){ 
  	return saldo;
  }
  
  public void setSaldo (double saldo) {
      this.saldo = saldo;
  }
  
  public void retirar(double valor){
  	if(valor < getSaldo() && valor > 0){ 
  		saldo-=valor;
  	}else{
  		if(valor < 0){
  			System.out.println("\nValor invalido\n\n"); 
  		}else{
  			System.out.println("Saldo Insuficiente\n\n"); 
  		}
  	}
  }
  public void imprimirEstado(){

  	System.out.println("\nSaldo..: " + saldo);
  }
}