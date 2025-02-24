package br.com.alura.screenmatch.service;

import com.fasterxml.jackson.databind.*;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;

import java.io.File;

public class ConverteDados implements IConverteDados{
    private ObjectMapper mapper = new ObjectMapper();

    @Override
    public <T> T obterDados(String json, Class<T> classe) {
        try {
            return mapper.readValue(json,classe);
        } catch (Exception e) {
            throw new RuntimeException(e);

        }
    }

    public <T> T obterDadosArquivo(String caminhoArquivo, Class<T> classe) {
        try {
            return mapper.readValue(new File(caminhoArquivo),classe);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public <T> String serializarDados(T classe) {
        try {
            return mapper.writeValueAsString(classe);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public <T> T obterDadosGson(String json, Class<T> classe){
        Gson gson = new Gson();
        return gson.fromJson(json,classe);
    }
}
