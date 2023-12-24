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



    /*************** Yi Tong ******************/
    //A constructor accepting an integer parameter for jobAdvancement and
    //allocate an appropriate level according to jobAdvMap.



    /*************** Hui San ******************/
    //The level accessor(get) and mutator(set) method where jobAdvancement
    //should be adjusted accordingly too, if necessary, and restricts their
    //magnitude according to the assigned ranges.
    public int getLevel(){
        return level;
    }

    public void setLevel(int l){
        if(l > -1 && l < 301){
            this.level = l;
            for(int i=0; i<jobAdvMap.length; i++){
                if(this.level == jobAdvMap[i]){
                    this.jobAdvancement = i;
                    break;
                }
            }
        }else{
            System.out.println("Level not in range.");
        }
    }



    /*************** Wen Yang ******************/
    //Aran has gotten her head frozen for a century so she forgot how to
    //properly perform her awesome combos. Program a static boolean
    //isValid(String input) method to return true for such conditions:
    //o Input is a string only consisting of characters ‘B’, ‘P’, ‘T’ and ‘M’
    //o ‘P’ can only be followed by ‘T’ and ‘T’ can only be followed by
    //‘M’
    //o ‘B’ may or may not exists only before ‘P’
    public static boolean isValid(String input){

        //After P, only T
        //After T, only M
        //After M, no instruction (so any char can come after M)
        //allow for single input
        //B may exists only before P, so after B can only be P
        //B may not exists only before P, so if input = BBBBP? it returns true?

        int length = input.length();

        if(length == 0) return false;

        if(!input.matches("[BPTM]+")) return false;

//        char last = input.charAt(length - 1);
//        if(last == 'P' || last == 'T') return false;

        System.out.println("in loop check");

        for(int i = 0; i < length - 1; i++){
            char prev = input.charAt(i);
            char next = input.charAt(i + 1);

            switch(prev){
                case 'P':
                    if(next != 'T')
                        return false;
                    break;
                case 'T':
                    if(next != 'M')
                        return false;
                    break;
                case 'B':
                    if(next != 'P')
                        return false;
            }
        }

        return true;
    }



    /*************** Zhen Hao ******************/
    //A toString method that returns all information as demonstrated in the
    //sample output.


}
