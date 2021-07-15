package clean.code.design_patterns.requirements.project_01.builder;

public class TestBuilder {

    public static void main(String[] args) {
        //Varianta gresita pt ca ocupa spatiu si efectueaza 2 procese

        //1. Creare cu constructor default
        //SuperErou superErou = new SuperErou();
        //2.Initializare
        // ...
        //folosesc private la atributele din SuperErou pt a nu putea fi initializate/accesate


        //Varianta gresita pt ca este greu de citit si modificat cu constructor cu param, nu e clean
        //SuperErou superErou2 = new SuperErou("Superman", 100, false, false, new Arma(), null, new Laser(), null);

        //ma folosesc de builder
        //am conditionat initializarea obiectului (supereroul) de crearea lui
        SuperErou superman = new SuperErou.SuperErouBuilder("Superman", 100).build();
        SuperErou joker = new SuperErou.SuperErouBuilder("Joker", 200)
                .esteNegativ()
                .esteRanit()
                .setArmaDreapta(new Arma())
                .build();


    }
}
