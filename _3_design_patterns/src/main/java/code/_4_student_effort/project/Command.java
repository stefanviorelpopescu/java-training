package code._4_student_effort.project;

import java.util.ArrayList;
import java.util.List;

public class Command {


    private String name;
    private List<String> params;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getParams() {
        return params;
    }

    public void setParams(List<String> params) {
        this.params = params;
    }

    public Command (String str) {
        params = new ArrayList<>();
        String[] words = str.split(" ");
        this.name = words[0];
        for (int i =1;i<words.length;i++){
            params.add(words[i]);
        }
    }

}