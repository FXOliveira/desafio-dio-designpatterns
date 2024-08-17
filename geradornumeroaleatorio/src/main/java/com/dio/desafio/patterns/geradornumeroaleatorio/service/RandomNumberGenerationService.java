package com.dio.desafio.patterns.geradornumeroaleatorio.service;

import com.dio.desafio.patterns.geradornumeroaleatorio.singleton.RandomNumberGeneratorSingleton;
import org.springframework.stereotype.Service;

@Service
public class RandomNumberGenerationService {
    public int gatherRandomNumber(){
        return RandomNumberGeneratorSingleton.getInstance().gerarNumeroAleatorio(100);
    }
}
