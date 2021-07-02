package code._4_student_effort;

import java.util.Arrays;

public class Main
{
  public static void main(String[] args)
  {
    //Challenge 1
    /*
    int[] array = new int[] { 1, 2, 3 };
    Iterator it = new Iterator(array);
    while (it.previous())
    {
      System.out.println(it.next());
    }
     */

    //Challenge 2
    /*
    Integer[] arr = new Integer[] { 1, 4, 5, 2, 3, 6, 9, 8, 7 };
    Integer[] copy01OfArr = Arrays.copyOf(arr, arr.length);
    Integer[] copy02OfArr = Arrays.copyOf(arr, arr.length);

    displaySorted(new BubbleSort(), copy01OfArr);
    displaySorted(new MergeSort(), copy02OfArr);
     */

    //Challenge 3
    /*
    Apartment app01 = new Apartment("Crangasi01", 300);
    Apartment app02 = new Apartment("Crangasi01", 600);
    Apartment app03 = new Apartment("Crangasi01", 350);
    Apartment app04 = new Apartment("Crangasi01", 400);
    Apartment app05 = new Apartment("Crangasi01", 200);

    RealEstateAgentProxy proxy = new RealEstateAgentProxy();
    proxy.represent(app01);
    proxy.represent(app02);
    proxy.represent(app03);
    proxy.represent(app04);
    proxy.represent(app05);

    Student student01 = new Student("Ionescu", 500);
    Student student02 = new Student("Popescu", 330);

    Apartment apartmentForStudent01 = proxy.rent(student01);
    System.out.println(student01 + " rented " + apartmentForStudent01);
    Apartment apartmentForStudent02 = proxy.rent(student02);
    System.out.println(student02 + " rented " + apartmentForStudent02);
     */

    //Challenge 4
    /*
    Teacher teacher = new Teacher();
    Student s01 = new Student("Popescu");
    Student s02 = new Student("Ionescu");
    Student s03 = new Student("Dragomirescu");

    s01.listenTo(teacher);
    s02.listenTo(teacher);
    s03.listenTo(teacher);

    String[] javaTopics = new String[]{
            "basics",
            "oo",
            "design patterns"
    };
    for (int i = 0; i < javaTopics.length; i++)
    {
        teacher.teach(javaTopics[i]);
    }
     */

    //Challenge 5
    /*
    Integer[] arr = new Integer[] { 1, 4, 5, 2, 3, 6, 9, 8, 7 };
    Integer[] copy01OfArr = Arrays.copyOf(arr, arr.length);
    Integer[] copy02OfArr = Arrays.copyOf(arr, arr.length);

    AscBubleSort asc = new AscBubleSort();
    asc.sort(copy01OfArr);
    DescBubleSort desc = new DescBubleSort();
    desc.sort(copy02OfArr);

    displaySorted(copy01OfArr);
    displaySorted(copy02OfArr);
     */

    //Challenge 6
    /*
    Person person = new Person("Voicu", "Software engineer", "UPIT", "B", "Yes");
    System.out.println(person.name);
     */
  }
}

//Challenge 1
class Iterator
{
  private int[] array;
  private int current;

  public Iterator(int array[])
  {
    this.array = array;
    this.current = 0;
  }

  public boolean previous()
  {
    return this.current < this.array.length;
  }

  public int next() {
    return this.array[this.current++];
  }
}

//Challenge 2
interface SortingStrategy
{
  void sort(Integer[] list);
}

class StrategyExample
{
  public static void displaySorted(SortingStrategy strategy, Integer[] array)
  {
    strategy.sort(array);

    for (int i = 0; i < array.length; i++)
    {
      System.out.print(array[i] + " ");
    }
    System.out.println();
  }
}

class BubbleSort
{
  void bubbleSort(int array[])
  {
    int n = array.length;
    for (int i = 0; i < n-1; i++)
      for (int j = 0; j < n-i-1; j++)
        if (array[j] > array[j+1])
        {
          int temp = array[j];
          array[j] = array[j+1];
          array[j+1] = temp;
        }
  }

  void printArray(int array[])
  {
    int n = array.length;
    for (int i=0; i<n; ++i)
      System.out.print(array[i] + " ");
    System.out.println();
  }
}

class MergeSort
{
  void merge(int array[], int l, int m, int r)
  {
    int n1 = m - l + 1;
    int n2 = r - m;

    int L[] = new int[n1];
    int R[] = new int[n2];

    for (int i = 0; i < n1; ++i)
      L[i] = array[l + i];
    for (int j = 0; j < n2; ++j)
      R[j] = array[m + 1 + j];

    int i = 0, j = 0;

    int k = l;
    while (i < n1 && j < n2)
    {
      if (L[i] <= R[j])
      {
        array[k] = L[i];
        i++;
      } else {
        array[k] = R[j];
        j++;
      }
      k++;
    }

    while (i < n1)
    {
      array[k] = L[i];
      i++;
      k++;
    }

    while (j < n2)
    {
      array[k] = R[j];
      j++;
      k++;
    }
  }
}

//Challenge 3
class Student
{
  private final String name;
  private final int money;

  public Student(String studentName, int studentMoney)
  {
    name = studentName;
    money = studentMoney;
  }

  public String getName()
  {
    return name;
  }

  public int getMoney()
  {
    return money;
  }

  @Override
  public String toString()
  {
    return name + money;
  }
}

class Apartment
{
  private final String location;
  private final int rentCost;

  public Apartment(String apartamentLocation, int apartamentRentCost)
  {
    this.location = apartamentLocation;
    this.rentCost = apartamentRentCost;
  }

  public String getLocation()
  {
    return location;
  }

  public int getMonthlyRentCost()
  {
    return rentCost;
  }

  @Override
  public String toString()
  {
    return location +  rentCost ;
  }
}

//Am folosit logica default din folder
class RealEstateAgentProxy
{
  private Apartment[] appartments = new Apartment[0];

  public void represent(Apartment appartment)
  {
    this.appartments = Arrays.copyOf(this.appartments, this.appartments.length + 1);
    this.appartments[this.appartments.length - 1] = appartment;
  }

  public Apartment rent(Student student)
  {
    Apartment rentedAppartment = null;
    if (!student.getName().startsWith("P"))
    {
      for (int i = 0; i < appartments.length; i++)
      {
        if (this.appartments[i].getMonthlyRentCost() < student.getMoney())
        {
          rentedAppartment = this.appartments[i];

          int removedIndex = i;
          System.arraycopy(this.appartments, removedIndex + 1, this.appartments, removedIndex, this.appartments.length - 1 - removedIndex);
        }
      }
    }
    return rentedAppartment;
  }
}

//Challenge 4
interface Observer
{
  void update(String message);
}

interface ObservedSubject
{
  void register(Observer obj);
  void unregister(Observer obj);
  void notifyObservers(String message);
}

//La aceasta clasa m-am inspirat din folderul default
class Teacher implements ObservedSubject
{
  private Observer[] observers = new Observer[0];

  @Override
  public void register(Observer obj)
  {
    this.observers = Arrays.copyOf(this.observers, this.observers.length + 1);
    this.observers[this.observers.length - 1] = obj;
  }

  @Override
  public void unregister(Observer obj)
  {
    int removedIndex = -1;
    for (int i = 0; i < this.observers.length; i++)
    {
      if (this.observers[i].equals(obj))
      {
        removedIndex = i;
        break;
      }
    }
    System.arraycopy(this.observers, removedIndex + 1, this.observers, removedIndex, this.observers.length - 1 - removedIndex);

  }

  @Override
  public void notifyObservers(String message)
  {
    for (int i = 0; i < this.observers.length; i++)
    {
      this.observers[i].update(message);
    }
  }

  public void teach(String topic)
  {
    for (int j = 0; j < this.observers.length; j++)
    {
      this.observers[j].update(topic);
    }
  }
}

class StudentObserver implements Observer
{
  private String name;

  public void Student(String name)
  {
    this.name = name;
  }

  public void listenTo(Teacher teacher)
  {
    teacher.register(this);
  }

  @Override
  public void update(String message)
  {
    System.out.println("Student " + name + " learned about " + message);
  }
}

//Challenge 5
abstract class TemplateMethodBubleSort
{

  static void bubbleSort(int array[])
  {
    int size = array.length;


    for (int i = 0; i < size - 1; i++)
      for (int j = 0; j < size - i - 1; j++)
        if (array[j] > array[j + 1])
        {
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
  }

  public abstract boolean numbersInCorrectOrder(Integer i1, Integer i2);
}

class DescBubleSort extends TemplateMethodBubleSort
{
  @Override
  public boolean numbersInCorrectOrder(Integer i1, Integer i2)
  {
    return i1 < i2;
  }
}

class AscBubleSort extends TemplateMethodBubleSort
{
  @Override
  public boolean numbersInCorrectOrder(Integer i1, Integer i2)
  {
    return i1 > i2;
  }
}

class PrintArray
{
  public static void displaySorted(Integer[] array)
  {
    for (int i = 0; i < array.length; i++)
    {
      System.out.print(array[i]);
    }
    System.out.println();
  }
}

//Challenge 6
class Person
{
  String name;
  String job;
  String university;
  String drivingLicense;
  String isMarried;

  public Person(String name, String job, String university, String drivingLicense, String isMarried)
  {
    this.name = name;
    this.job = job;
    this.university = university;
    this.drivingLicense = drivingLicense;
    this.isMarried = isMarried;
  }
}
