package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.SerializedName;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSerie(@SerializedName("Title")        @JsonAlias("Title")        String titulo,
                         @SerializedName("totalSeasons") @JsonAlias("totalSeasons") Integer totalTemporadas,
                         @SerializedName("imdbRating")   @JsonAlias("imdbRating")   String avaliacao
                         ) {
}
