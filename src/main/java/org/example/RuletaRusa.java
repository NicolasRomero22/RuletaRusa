package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RuletaRusa {
    private List<Integer>tambor = new ArrayList<>();
    private int bala;
    private int posicionActual;
    private Random random;
    public RuletaRusa() {
        tambor = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            tambor.add(i);
        }

        random = new Random();
        bala = random.nextInt(tambor.size());
        posicionActual = 0;
    }
    public List<Integer> getTambor() {
        return tambor;
    }

    public void setTambor(List<Integer> tambor) {
        this.tambor = tambor;
    }

    public int getBala() {
        return bala;
    }

    public void setBala(int bala) {
        this.bala = bala;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    @Override
    public String toString() {
        return "RuletaRusa{" +
                "tambor=" + tambor +
                ", bala=" + bala +
                ", posicionActual=" + posicionActual +
                ", random=" + random +
                '}';
    }
    public boolean disparar(){
        if (posicionActual == bala){
            return true;
        }else {
            posicionActual = (posicionActual + 1) % tambor.size();
            return false;
        }
    }
    public void reiniciarJuego(){
        for (int i = 0; i < 6; i++) {
            tambor.set(i, i);
        }
        bala = random.nextInt(tambor.size());
        posicionActual = 0;
    }
}
