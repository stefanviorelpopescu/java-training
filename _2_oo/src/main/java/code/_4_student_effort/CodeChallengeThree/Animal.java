package code._4_student_effort.CodeChallengeThree;

public abstract class Animal {
protected Integer legs;
protected Animal(Integer legs)
{
    this.legs=legs;
}
public abstract void eat();
public void Walk(){
    System.out.println("this animal has evolved and is walking on "+this.legs+"legs on the concrete road");
}
}
