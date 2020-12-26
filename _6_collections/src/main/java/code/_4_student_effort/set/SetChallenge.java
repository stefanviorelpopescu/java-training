package code._4_student_effort.set;

public class SetChallenge {
    public static void main(String[] args) {
        MySet<Integer> mySet = new MySetImp<>();

        mySet.add(6);
        mySet.add(3);
        mySet.add(4);
        mySet.add(7);
        mySet.add(6); // does not add 6, already exists

        for ( int i = 0; i < mySet.size(); i++ )
            System.out.println(mySet.get(i) + " ");

    }
}
