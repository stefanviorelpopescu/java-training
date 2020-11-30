package code._1_study._6_accessing_private_fields;

import java.lang.reflect.Field;

public class AccessingPrivateFields {
  public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
    Student student = new Student("John", 21);

    readPrivateField(student);

  }

  private static void readPrivateField(Student student) throws NoSuchFieldException, IllegalAccessException {
    Field field = student.getClass().getDeclaredField("name");
    field.setAccessible(true);/* se poate seta in clasa student o proprietate ca dintr-o clasa exterioara
    sa nu poti face un camp privat accesibil? */
    System.out.println(field.get(student));
  }
}