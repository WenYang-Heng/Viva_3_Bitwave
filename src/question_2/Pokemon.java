package question_2;

public class Pokemon {
    private String name;
    private String type;
    private double strength;


    /*************** Shi Han ******************/
    //constructor, accessor(get), mutator(set), toString for each of the variables

    Pokemon(String name,String type, double strength){
        this.name=name;
        this.type=type;
        this.strength=strength;
    }

    public String getName(){
        return this.name;
    }

    public String getType(){
        return this.type;
    }

    public double getStrength(){
        return this.strength;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setType(String type){
        this.type=type;
    }

    public void setStrength(double strength){
        this.strength=strength;
    }

    @Override
    public String toString(){
        return this.name;
    }

}
