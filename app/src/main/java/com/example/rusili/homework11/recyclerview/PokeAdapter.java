package com.example.rusili.homework11.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.example.rusili.homework11.detailscreen.api.PokemonApi;
import com.example.rusili.homework11.detailscreen.model.Pokemon;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;

/**
 * Created by BabiMaji on 12/1/17.
 */

public class PokeAdapter extends RecyclerView.Adapter<PokeViewHolder> {

    public static List<Pokemon> getPokemons() {

        List<Pokemon> pokemons = new ArrayList<>();
        PokemonApi pokeApi = new PokemonApi() {
            @Override
            public Call<Pokemon> getPokemon(String pokemonName) {
                return null;
            }
        };

        for (int i = 1; i <= 25; i++)
            pokemons.add((Pokemon) pokeApi.getPokemon("i"));

        return pokemons;
    }


    @Override
    public PokeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(PokeViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
