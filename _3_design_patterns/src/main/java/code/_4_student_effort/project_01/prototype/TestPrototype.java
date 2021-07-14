package code._4_student_effort.project_01.prototype;

public class TestPrototype {

    public static void main(String[] args) throws CloneNotSupportedException {

        Caracter3D caracter1 = new Caracter3D("model1.3d");
        //Caracter3D caracter2 = new Caracter3D("model1.3d");
        //Caracter3D caracter3 = new Caracter3D("model1.3d");

        Caracter3D caracter2 = (Caracter3D)caracter1.clone();
        Caracter3D caracter3 = (Caracter3D)caracter1.clone();

        System.out.println("Sfarsit");
    }
}
