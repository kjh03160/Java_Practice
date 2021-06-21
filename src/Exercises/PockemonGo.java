package Exercises;

import org.omg.CORBA.PolicyError;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class PockemonGo {
    public static void main(String[] args) {
        PokeBag pokeBag = new PokeBag();

        pokeBag.add(new Pokemon("마그마", 1024));
        pokeBag.add(new Pokemon("마그마그", 215));
        pokeBag.add(new Pokemon("마릴", 816));
        pokeBag.add(new Pokemon("마그마그", 136));
        pokeBag.add(new Pokemon("라프라스", 1822));
        pokeBag.add(new Pokemon("마릴", 215));
        pokeBag.add(new Pokemon("마릴", 185));
        pokeBag.add(new Pokemon("마릴", 110));
        pokeBag.add(new Pokemon("니드킹", 1709));
        pokeBag.add(new Pokemon("마릴", 39));
        pokeBag.add(new Pokemon("마자용", 12));

        System.out.println(pokeBag.getStrongest("마릴"));
        System.out.println(pokeBag.getStrongest());
        System.out.println(pokeBag.getStrongest("피카츄"));
    }
}

class PokeBag {
    private final HashMap<String, ArrayList<Pokemon>> pokemons = new HashMap<>();;

    public ArrayList<Pokemon> getPokemons(String name) {
        return pokemons.get(name);
    }
    public void add (Pokemon pokemon){
        String name = pokemon.getName();

        // 해당하는 ArrayList가 없으면 생성
        if (getPokemons(name) == null) {
            pokemons.put(name, new ArrayList<Pokemon>());
        }

        getPokemons(name).add(pokemon);
    }

    public Pokemon getStrongest(String name){
        ArrayList <Pokemon> resultList = this.getPokemons(name);
        if (resultList != null){
            // return할 포켓몬(가장 센 포켓몬)을 담을 변수.
            Pokemon strongest = null;

            for (Pokemon pokemon : getPokemons(name)) {
                if (strongest == null || pokemon.getCp() > strongest.getCp()) {
                    strongest = pokemon;
                }
            }
            return strongest;
        }
        return null;
    }
    public Pokemon getStrongest(){
        Pokemon strongest = null;

        // HashMap 전체를 탐색 (keySet을 통해 얻은 key로 탐색)
        for (String key : pokemons.keySet()) {
            // key에 해당하는 가장 센 포켓몬을 가져오기
            Pokemon p = getStrongest(key);
            // strongest를 가장 센 포켓몬으로 교체
            if (strongest == null || p.getCp() > strongest.getCp()) {
                strongest = p;
            }
        }

        return strongest;
    }
}
class Pokemon{
    private final String name;
    private final int cp;

    public Pokemon(String name, int cp) {
        this.name = name;
        this.cp = cp;
    }

    public String getName() {
        return name;
    }

    public int getCp() {
        return cp;
    }

    @Override
    public String toString() {
        return name + "(" + cp + ")";
    }
}