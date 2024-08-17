package com.dio.desafio.patterns.geradornumeroaleatorio.singleton;

import java.util.Random;

public class RandomNumberGeneratorSingleton {
    private final static RandomNumberGeneratorSingleton INSTANCE = new RandomNumberGeneratorSingleton();
    private final Random random = new Random();
    private RandomNumberGeneratorSingleton() {
    }
    public static RandomNumberGeneratorSingleton getInstance(){
        return INSTANCE;
    }

    public int gerarNumeroAleatorio(Integer limite) {
        return random.nextInt(limite);
    }

}
