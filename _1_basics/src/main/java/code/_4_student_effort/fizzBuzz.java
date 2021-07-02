package code._4_student_effort;

public class fizzBuzz {
    public static void run(int start, int finish, Integer[] numbersToReplace, String[] replaceWith){
        //numbersToReplace must be sorted
        int sizeOfNumbersToReplace = numbersToReplace.length;
        int sizeOfReplaceWith = replaceWith.length;
        boolean multipleOf = false; // control variable

        if (sizeOfNumbersToReplace != sizeOfReplaceWith){ //checks if both arrays are equal in length
            System.out.println("Error!");
        }
        else{
            for(int j = numbersToReplace.length - 1; j >= 0; j--){
                if (start % numbersToReplace[j] == 0){
                    System.out.print(", "+replaceWith[j]);
                    multipleOf = true;
                    break;
                }
            }
            if (multipleOf == false)
                System.out.print(start);
            multipleOf = false;

            for(int i = start+1; i < finish; i++){
                for(int j = numbersToReplace.length - 1; j >= 0; j--){
                    if (i % numbersToReplace[j] == 0){
                        System.out.print(", "+replaceWith[j]);
                        multipleOf = true;
                        break;
                    }
                }
                if (multipleOf == false)
                    System.out.print(", "+ i);
                multipleOf = false;
            }
        }
    }
}
