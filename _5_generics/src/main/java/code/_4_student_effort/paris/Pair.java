package code._4_student_effort.paris;

public class Pair<T extends Running>{

    public static void main (String []args) throws SizeDoNotMatchException, ColorsDoNotMatchException {

        Running runningShoe1 = new Running("RED", 41);
        Running runningShoe2 = new Running("RED", 41);
        Pair<Running> pairOk = new Pair<>(runningShoe1,runningShoe2);

        Running runningShoe3 = new Running("Green", 41);
        Running runningShoe4 = new Running("RED", 41);
        Pair<Running> pairOk1 = new Pair<>(runningShoe3,runningShoe4);

        Running runningShoe5 = new Running("RED", 41);
        Running runningShoe6 = new Running("RED", 43);
        Pair<Running> pairOk2 = new Pair<>(runningShoe5,runningShoe6);
    }

    private T first;
    private T second;

    public Pair(T firstElement,  T secondElement) throws SizeDoNotMatchException, ColorsDoNotMatchException {

        if(firstElement.getSize() !=secondElement.getSize()){
            throw new SizeDoNotMatchException();
        }
        if(!firstElement.getColor().equals(secondElement.getColor())){
            throw new ColorsDoNotMatchException();
        }
        first= firstElement;
        second=secondElement;
    }
    public T getFirst(){ return first;}
    public T getSecond(){return second;}

}

class Running implements Shoe{
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    private String color;
    private int size;

    public Running(String color, int size) {
        this.color = color;
        this.size = size;
    }
}
class Heels implements Shoe{

}
class Boot implements  Shoe{

}

