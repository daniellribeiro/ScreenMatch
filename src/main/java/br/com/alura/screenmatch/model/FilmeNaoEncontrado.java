package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.SerializedName;

@JsonIgnoreProperties(ignoreUnknown = true)
public record FilmeNaoEncontrado(@SerializedName("Reponse") @JsonAlias("Response") String reponse,
                                 @SerializedName("Error")   @JsonAlias("Error") String error) {
}
