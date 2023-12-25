package question_2;
import java.util.*;

public class PokemonSortingSystem {

    Pokemon[] PokemonList;

    public PokemonSortingSystem(Pokemon[] PokemonList){
        this.PokemonList = PokemonList;
        sortPokemonStrength();
    }

    /*************** Yi Tong ******************/
    //method to sort PokemonList based on strength, from low to high
    //based on sample output, should be called in constructor
    private void sortPokemonStrength(){
        int n = PokemonList.length;
        boolean swap;

        do {
            swap = false;

            for (int i = 0; i < n - 1; i++) {
                if (PokemonList[i].getStrength() > PokemonList[i + 1].getStrength()) {
                    Pokemon temp = PokemonList[i];
                    PokemonList[i] = PokemonList[i + 1];
                    PokemonList[i + 1] = temp;

                    swap = true;
                }
            }
            n--;
        }while(swap);
    }


    /*************** Zhen Hao ******************/
    //determineWinner method that returns a string array, parameter is based on sample output
    public String[] determineWinner(String opponentName, Pokemon[] pokemonList){
        //need to calculate strength multiplier against different types
        //initial Squirtle strengh: 63
        //initial Pansage strength: 55

        //based on strength multiplier given, Pansage(grass) has 1.25 multiplier againts Squirtle(water)

        //Fire: 1.5, Grass: 1.25, Water: 1.4
        //final strength Pansage: 55 * 1.25 = 68.7
        //final strength Squirtle: 63 (no multiplier)
        //Pansage > Squirtle
        ArrayList<String> list_pokemon = new ArrayList<>();

        Pokemon opponent = null;
        int list_length = PokemonList.length;

        for(int i = 0; i < list_length; i++) {
            Pokemon curr_pokemon = PokemonList[i];

            if (curr_pokemon.getName().equals(opponentName)) {
                opponent = curr_pokemon;
                break;
            }
        }

        String opponent_type = opponent.getType();
        double opponent_strength = opponent.getStrength();

        switch (opponent_type) {
            case "Flame":
                for(int j = 0; j < list_length; j++) {
                    Pokemon curr_pokemon = PokemonList[j];
                    String curr_pokemon_name = curr_pokemon.getName();
                    String curr_pokemon_type = curr_pokemon.getType();
                    double curr_pokemon_strength = curr_pokemon.getStrength();

                    switch (curr_pokemon_type) {
                        case "Water":
                            if (1.4 * curr_pokemon_strength > opponent_strength) {
                                list_pokemon.add(curr_pokemon_name);
                            }
                            break;
                        case "Flame":
                            if (curr_pokemon_strength > opponent_strength) {
                                list_pokemon.add(curr_pokemon_name);
                            }
                            break;
                        case "Grass":
                            if (curr_pokemon_strength / 1.5 > opponent_strength) {
                                list_pokemon.add(curr_pokemon_name);
                            }
                            break;
                    }
                }

                break;

            case "Grass":
                for(int j = 0; j < list_length; j++) {
                    Pokemon curr_pokemon = PokemonList[j];
                    String curr_pokemon_name = curr_pokemon.getName();
                    String curr_pokemon_type = curr_pokemon.getType();
                    double curr_pokemon_strength = curr_pokemon.getStrength();

                    switch (curr_pokemon_type) {
                        case "Water":
                            if (curr_pokemon_strength / 1.25 > opponent_strength) {
                                list_pokemon.add(curr_pokemon_name);
                            }
                            break;
                        case "Flame":
                            if (1.5 * curr_pokemon_strength > opponent_strength) {
                                list_pokemon.add(curr_pokemon_name);
                            }
                            break;
                        case "Grass":
                            if (curr_pokemon_strength > opponent_strength) {
                                list_pokemon.add(curr_pokemon_name);
                            }
                            break;
                    }
                }
                break;

            case "Water":
                for(int j = 0; j < list_length; j++) {
                    Pokemon curr_pokemon = PokemonList[j];
                    String curr_pokemon_name = curr_pokemon.getName();
                    String curr_pokemon_type = curr_pokemon.getType();
                    double curr_pokemon_strength = curr_pokemon.getStrength();

                    switch (curr_pokemon_type) {
                        case "Water":
                            if (curr_pokemon_strength > opponent_strength) {
                                list_pokemon.add(curr_pokemon_name);
                            }
                            break;
                        case "Flame":
                            if (curr_pokemon_strength / 1.4 > opponent_strength) {
                                list_pokemon.add(curr_pokemon_name);
                            }
                            break;
                        case "Grass":
                            if (1.25 * curr_pokemon_strength > opponent_strength) {
                                list_pokemon.add(curr_pokemon_name);
                            }
                            break;
                    }
                }
                break;
        }

        String[] list_result = list_pokemon.toArray(new String[list_pokemon.size()]);
        return list_result;
    }
}
