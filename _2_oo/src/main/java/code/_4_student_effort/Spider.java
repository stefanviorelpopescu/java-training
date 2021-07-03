package code._4_student_effort;

public class Spider extends Animal {
    protected Spider(){
        super(8);
    }
    @Override
    public void eat(){
        System.out.println("Spider's diet consists of mosquitoes,flies,moths and other spiders");
    }
}
