package code._4_student_effort.secondChallenge;

import code._2_challenge._2_pairs.ColorsDoNotMatchException;

public class Pair<E extends Shoe> {

    private E first;
    private E second;


    public Pair(E first, E second) {
        this.first = first;
        this.second = second;

        try {
            match(first, second);
        } catch (CollorsDoNotMatchException | SizesDoNotMatchException e) {
                e.printStackTrace();
            }
        }

        public void match (E firste, E seconde) throws CollorsDoNotMatchException, SizesDoNotMatchException {
            if (!firste.getColor().toLowerCase().equals(seconde.getColor().toLowerCase())) {
                throw new ColorsDoNotMatchException("colors doesn't match");
            }
            if (firste.getSize() != seconde.getSize()) {
                throw new SizesDoNotMatchException("size doesn't match");
            }

        }

    }


