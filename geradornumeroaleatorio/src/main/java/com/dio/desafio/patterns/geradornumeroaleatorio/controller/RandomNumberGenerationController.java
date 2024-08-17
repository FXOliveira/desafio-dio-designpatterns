package com.dio.desafio.patterns.geradornumeroaleatorio.controller;

import com.dio.desafio.patterns.geradornumeroaleatorio.service.RandomNumberGenerationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/generation")
public class RandomNumberGenerationController {
    @Autowired
    private RandomNumberGenerationService randomNumberGenerationService;

    @GetMapping("/random")
    public ResponseEntity<Integer> generateRandomNumber() {
        Integer random = randomNumberGenerationService.gatherRandomNumber();
        return ResponseEntity.ok(random);
    }
}
