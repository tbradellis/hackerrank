package warmup.sockmerchant.backtracking;

public class BackTrack {
//not go so far.  Not really backtracking...either way it's wrong.
    public static void main(String[] args) {

        int[] array = {1,1,2,1};

        System.out.println(countPairs(array,0));



    }
    public static int countPairs(int[] array, int start){
        int count = 0;
        if(array.length == start){
            return 0;
        }
        for(int i = 0; i < array.length-2; i++){
            for(int j = 1; j < array.length-1; j++){
                if(array[i] == array[j]){
                    ++count;
                    i=j;

                }
            }
        }
        ++start;
        count += countPairs(array, start);

        return count;

    }
}
