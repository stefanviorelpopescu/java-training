package clean.code.design_patterns.requirements;

public class Main
{
    public static void main(String[] args)
    {
        BuilderPattern.Tea tea = new BuilderPattern.Tea.Builder("Mint tea").sugar(true).size("Small").build();
        System.out.println(tea);
    }
}

