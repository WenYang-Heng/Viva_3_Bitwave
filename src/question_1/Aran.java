package question_1;

public class Aran {

    private int level; //[-1 < level < 301]
    private int jobAdvancement; //[-1 ≤ jobAdvancement < 6]
    private static int[] jobAdvMap; //size 6 max

    /*************** Shi Han ******************/
    //An empty constructor initializing Aran’s
    //o level as 300 [-1 < level < 301]
    //o jobAdvancement as -1 [-1 ≤ jobAdvancement < 6]
    //o private static integer [6] jobAdvMap specifying which level
    //should Aran be initialized according to his jobAdvancement
    public Aran(){
        this.level=300;
        this.jobAdvancement=-1;
        jobAdvMap=new int[] {0,50,100,150,200,250};
    }



    /*************** Yi Tong ******************/
    //A constructor accepting an integer parameter for jobAdvancement and
    //allocate an appropriate level according to jobAdvMap.



    /*************** Hui San ******************/
    //The level accessor(get) and mutator(set) method where jobAdvancement
    //should be adjusted accordingly too, if necessary, and restricts their
    //magnitude according to the assigned ranges.



    /*************** Wen Yang ******************/
    //Aran has gotten her head frozen for a century so she forgot how to
    //properly perform her awesome combos. Program a static boolean
    //isValid(String input) method to return true for such conditions:
    //o Input is a string only consisting of characters ‘B’, ‘P’, ‘T’ and ‘M’
    //o ‘P’ can only be followed by ‘T’ and ‘T’ can only be followed by
    //‘M’
    //o ‘B’ may or may not exists only before ‘P’



    /*************** Zhen Hao ******************/
    //A toString method that returns all information as demonstrated in the
    //sample output.


}
