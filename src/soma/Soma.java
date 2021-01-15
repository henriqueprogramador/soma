
package soma;


public class Soma {

    
    public static void main(String[] args) {
         int inicio=1;
	double fim=1000;
	double operacao = (inicio + fim) * (fim/2);
	int resultado = (int)operacao;

	System.out.println("O resultado da soma dos numeros de 1 a 1000 é: " +resultado);
    }
    
}
