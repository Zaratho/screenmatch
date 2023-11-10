package br.com.alura.screenmatch.service;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.alura.screenmatch.repository.IConverteDados;

public class ConverteDados implements IConverteDados{
    private ObjectMapper mapper = new ObjectMapper();

    @Override
    public <T> T obterDados(String json, Class<T> classe) {

        try {
            return mapper.readValue(json, classe);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}
