package com.example.rusili.homework11.detailscreen.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.example.rusili.homework11.detailscreen.model.objects.Sprites;
import com.example.rusili.homework11.detailscreen.model.objects.Stats;
import com.example.rusili.homework11.detailscreen.model.objects.Types;

import java.util.ArrayList;

public class Pokemon{
	private Stats[] stats;
	private Sprites sprites;
	private Types[] types;

	ArrayList<Pokemon>listOfPokemon = new ArrayList<>();

	//TODO: Create getters

	public Pokemon(Stats[] stats, Sprites sprites, Types[] types){
		this.stats = stats;
		this.sprites = sprites;
		this.types = types;

	}

	public Stats[] getStats(){
		return stats;
	}

	public Sprites getSprites(){
		return sprites;
	}

	public Types[] getTypes(){
		return types;
	}


	public ArrayList<Pokemon> getListOfPokemon() {
		return listOfPokemon;
	}
}
