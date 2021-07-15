package clean.code.design_patterns.requirements.project_01.adapter;

import java.util.ArrayList;

public class TestAdapter {

    public static void main(String[] args) {

        ArrayList<InterfataCaractereACME> eroi =
                new ArrayList<>();
        eroi.add(new CaracterACME("Superman", 1000));
        eroi.add(new CaracterACME("Batman", 800));

        for(InterfataCaractereACME erou : eroi) {
            erou.getDescriere();
            erou.esteAtacat(50);
        }

        CaracterDisney tweety = new LooneyTune("Teewty", 500);
        ArrayList<CaracterDisney> caractereDisney =
                new ArrayList<>();
        caractereDisney.add(tweety);

        //Adapter
        //eroi.add(tweety);
        AdaptorDisney2ACME adaptorTweety =
                new AdaptorDisney2ACME(tweety);
        eroi.add(adaptorTweety);

        System.out.println("------------------------");
        for(InterfataCaractereACME erou : eroi) {
            erou.getDescriere();
            erou.esteAtacat(50);
        }


        System.out.println("------------------------");

    }
}
