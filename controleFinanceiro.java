package model;

public class ControleFinaceiro {
    public static void main(String args[]) {

    
    private String numero;
    private String cliente;
    private double saldoAtual;
    private double totalReceita;
    private double totalDespesas;
    
    //CONSTRUTOR
    public Conta (String numero, String cliente) {
        
        this.numero = numero;
        this.cliente = cliente;
    }


     public Conta () {
        
    }
    
    //Getters e Setters
    
    public String getNumero() {
        return this.numero;
    }
   
    public String getCliente() {
        return this.cliente;
    }
    
    public double getSaldo() {
        return this.saldo;
    }
    
    public double getLimite() {
        return this.limite;
    }
    
    public void setNumero(String Numero) {
        this.numero = numero;
    }

    public void setCliente(String Cliente) {
        this.cliente = cliente;
    }
    
    public void setSaldo(String Saldo) {
        this.saldo = saldo;
    }

    public void setLimite(String Limite) {
        this.limite = limite;
    }
}
