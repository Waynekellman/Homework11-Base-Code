package com.example.rusili.homework11.detailscreen.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import com.example.rusili.homework11.R;
import com.example.rusili.homework11.detailscreen.model.Pokemon;
import com.example.rusili.homework11.network.RetrofitFactory;

public class PokemonDetailActivity extends AppCompatActivity{
	private RetrofitFactory.PokemonNetworkListener pokemonNetworkListener;
	private ImageView imageView;

	public PokemonDetailActivity(RetrofitFactory.PokemonNetworkListener pokemonNetworkListener) {
		this.pokemonNetworkListener = pokemonNetworkListener;
	}

	@Override
	public void onCreate (@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.cardshitview);
	}


	private void getPokemonDetails() {
		pokemonNetworkListener = new RetrofitFactory.PokemonNetworkListener() {
			@Override
			public void pokemonCallback(Pokemon pokemon) {
				//TODO: Display pokemon data
				//Hint: Learn how to use Glide to display an image.
			}
		};
		RetrofitFactory.getInstance().setPokemonNetworkListener(pokemonNetworkListener);
	}
}

