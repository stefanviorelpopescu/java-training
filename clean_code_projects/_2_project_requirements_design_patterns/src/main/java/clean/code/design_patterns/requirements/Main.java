package clean.code.design_patterns.requirements;

public class Main {

    public static void main(String[] args) {
        //TODO implement your design patterns in this package


        //am putea folosi builder pentru introducearea anumitor date in baze de date , de exemplu data o baza de date pentru
        //un eveniment dintr-o anumita zi dintr-un planner personal care are campurile obligatorii : numele activatii , data , ora de inceput
        // si ora de final si campuri optionale: descriere , contact



        Planner planner = new Planner.Builder("Munca","20/10/2021","9:00","17:00")
                .withContact("071111111")
                .withDescriere("munca")
                .build();
        Planner planner2 = new Planner.Builder("Cumparaturi","22/9/2021","18:00","20:00")
                .build();

        System.out.println(planner);
        System.out.println(planner2);


        //folosind design pattern-ul memento putem pastra toate schimbarile unui anumit text dintr-un format online

        //editor este obiectul in care vom scrie textul pe rand
        Editor editor = new Editor();
        //history va fi obiectul care va pastra diferitele variatii din editor
        History history = new History();

        //mai intai setam un anumit text lui editor
        editor.setContent("First writing!");
        //apoi cand vom vrea sa ii scriem alt text , mai intai il adaugam in history , dupa care vom schimba textul din editor
        history.addMemento(editor.save());
        editor.setContent("Second writing!");

        history.addMemento(editor.save());
        editor.setContent("Third writing!");

        System.out.println(editor.getContent()); //afisam textul curent din editor

        editor.restore(history.getMemento()); //vom folosi restore pentru a reproduce ce era scris inainte
        System.out.println(editor.getContent()); //afisam textul curent din editor

        editor.restore(history.getMemento());
        System.out.println(editor.getContent());
        }


}
