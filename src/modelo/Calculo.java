package modelo;

import java.util.concurrent.TimeUnit;

public class Calculo {

    private String token = "";
    private int numUser = 0;
    private int numRand = 0;

    public Calculo(String tokenRecebido) {

        this.numUser = Integer.parseInt(tokenRecebido);
        this.numRand = (int) (Math.random() * 21);
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public int getNumUser() {
        return numUser;
    }

    public void setNumUser(int numUser) {
        this.numUser = numUser;
    }

    public int getNumRand() {
        return numRand;
    }

    public void setNumRand(int numRand) {
        this.numRand = numRand;
    }

    
    public int somarNumeros() throws InterruptedException {
        int numerosMultiplicados = this.numUser * this.numRand;
        TimeUnit.SECONDS.sleep(numerosMultiplicados);
        return numerosMultiplicados;
    }
}
