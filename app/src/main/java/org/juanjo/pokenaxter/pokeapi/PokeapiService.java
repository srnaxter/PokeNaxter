package org.juanjo.pokenaxter.pokeapi;


import org.juanjo.pokenaxter.models.PokemonRespuesta;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Juanjo on 15/12/2017.
 */

public interface PokeapiService {

    @GET("pokemon")
    Call<PokemonRespuesta> obternetListaPokemon(@Query("limit") int limit,@Query("offset") int offset);
}
