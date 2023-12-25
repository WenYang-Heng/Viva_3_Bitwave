package question_2;

import java.util.Arrays;

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

        //final strength Pansage: 55 * 1.25 = 68.75
        //final strength Squirtle: 63 (no multiplier)
        //Pansage > Squirtle
        return null;
    }
}
