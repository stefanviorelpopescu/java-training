package code._4_student_effort;

public class Main
{

  public static void main(String[] args)
  {
    //Challenge 1
    /*
    ExchangeDesk exchangeDesk = new ExchangeDesk();
    Ron lei = new Ron(1);
    Usd dollar = exchangeDesk.convert(lei, Usd.class, 0.24);
    System.out.println(dollar.toString());
     */

    //Challenge 2
    /*
    Running runningShoe1 = new Running("RED", 41);
    Running runningShoe2 = new Running("RED", 41);
    Pair<Running> pairOK = new Pair<>(runningShoe1, runningShoe2);

    Boot bootShoe = new Boot("BLACK", 45);

    Running runningShoe3 = new Running("RED", 41);
    Running runningShoe4 = new Running("RED", 42);
    Pair<Running> pair1 = new Pair<>(runningShoe3, runningShoe4);
     */

  }
}

//Challenge 1
abstract class Currency
{
  private double units;

  public Currency()
  {
  }

  public Currency(double units)
  {
    this.units = units;
  }

  public void setUnits(double units)
  {
    this.units = units;
  }

  public double getUnits()
  {
    return units;
  }
}

class Ron extends Currency
{

  public Ron()
  {
  }

  public Ron(double units)
  {
    super(units);
  }

  public double lei()
  {
    return super.getUnits();
  }

  @Override
  public String toString()
  {
    return lei() + " RON";
  }
}

class Usd extends Currency
{

  public Usd()
  {
  }

  public Usd(double units)
  {
    super(units);
  }

  public double dollars()
  {
    return super.getUnits();
  }

  @Override
  public String toString()
  {
    return dollars() + " USD";
  }
}

class ExchangeDeskConversionException extends RuntimeException
{
  public ExchangeDeskConversionException(String message)
  {
    super(message);
  }
}

class ExchangeDesk
{

  <T extends Currency, F extends Currency> T convert(F fromCurrency, Class<T> toClass, double rate)
  {
    T toCurrency = null;
    try
    {
      toCurrency = toClass.getDeclaredConstructor().newInstance();
      toCurrency.setUnits(fromCurrency.getUnits() * rate);
    }
    catch (Exception e)
    {
      throw new ExchangeDeskConversionException(e.getMessage());
    }
    return toCurrency;
  }
}

//Challenge 2

interface Shoe
{
  String getColor();

  double getSize();
}

class Pair<S extends Shoe>
{
  private S first;
  private S second;

  public Pair(S firstElement, S secondElement)
  {
    first = firstElement;
    second = secondElement;
    match(firstElement, secondElement);
  }

class Running implements Shoe
  {
    private String color;
    private double size;

    public Running(String color, double size)
    {
      this.color = color;
      this.size = size;
    }

    @Override
    public String getColor()
    {
      return color;
    }

    @Override
    public double getSize()
    {
      return size;
    }
  }

class Heels implements Shoe
  {
    private String color;
    private double size;

    public Heels(String color, double size)
    {
      this.color = color;
      this.size = size;
    }

    @Override
    public String getColor()
    {
      return color;
    }

    @Override
    public double getSize()
    {
      return size;
    }
  }

  class Boot implements Shoe
  {
    private String color;
    private double size;

    public Boot(String color, double size)
    {
      this.color = color;
      this.size = size;
    }
    @Override
    public String getColor()
    {
      return color;
    }

    @Override
    public double getSize()
    {
      return size;
    }
  }

  private void match(S firstElement, S secondElement)
  {
    if (firstElement.getSize() != secondElement.getSize())
    {
      throw new SizesDoNotMatchException("Marimile nu corespund");
    }
    if (!firstElement.getColor().equals(secondElement.getColor()))
    {
      throw new SizesDoNotMatchException("Culorile nu corespund");
    }
  }

  public S getFirst()
  {
    return first;
  }

  public S getSecond()
  {
    return second;
  }
}

  class ColorsDoNotMatchException extends RuntimeException
  {
    public ColorsDoNotMatchException(String message)
    {
      super(message);
    }
  }

  class SizesDoNotMatchException extends RuntimeException
  {
    public SizesDoNotMatchException(String message)
    {
      super(message);
    }
  }

//Challenge 3

class node<T>
{
  T data;
  node<T> next;

  {
    this.data = data;
    this.next = null;
  }

  public node(T data)
  {
  }
}

class list<T>
{
  node<T> head;
  private int length = 0;

  list()
  {
    this.head = null;
  }

  void add(T data)
  {
    node<T> temp = new node<>(data);
    if (this.head == null)
    {
      head = temp;
    }
    else
    {
      node<T> X = head;

      while (X.next != null)
      {
        X = X.next;
      }

      X.next = temp;
    }
    length++;
  }
  void add(int position, T data)
  {
    if (position > length + 1)
    {
      System.out.println("Elementul de pe pozitia respectiva nu se afla in lista");
      return;
    }
    if (position == 1)
    {
      node<T> temp = head;

      head = new node<T>(data);
      head.next = temp;

      return;
    }
    node<T> temp = head;

    node<T> prev = new node<T>(null);

    while (position - 1 > 0) {
      prev = temp;
      temp = temp.next;
      position--;
    }
    prev.next = new node<T>(data);
    prev.next.next = temp;
  }
  void remove(T key)
  {
    node<T> prev = new node<>(null);
    prev.next = head;
    node<T> next = head.next;
    node<T> temp = head;

    boolean exists = false;

    if (head.data == key)
    {
      head = head.next;

      exists = true;
    }

    while (temp.next != null)
    {

      if (String.valueOf(temp.data).equals(
              String.valueOf(key)))
      {
        prev.next = next;
        exists = true;
        break;
      }
      prev = temp;
      temp = temp.next;
      next = temp.next;
    }

    if (exists == false
            && String.valueOf(temp.data).equals(
            String.valueOf(key)))
    {
      prev.next = null;
      exists = true;
    }
    if (exists)
    {
      length--;
    }
    else
    {
      System.out.println("Valoarea nu se afla in lista");
    }
  }
  void clear()
  {
    head = null;
    length = 0;
  }
  boolean empty()
  {
    if (head == null)
    {
      return true;
    }
    return false;
  }
  int length()
  {
    return this.length;
  }
  public String toString()
  {
    String S = "{ ";

    node<T> X = head;

    if (X == null)
      return S + " }";

    while (X.next != null) {
      S += String.valueOf(X.data) + " -> ";
      X = X.next;
    }

    S += String.valueOf(X.data);
    return S + " }";
  }
}

//Challenge 5

class BinarySearchGeneric<T extends Comparable<T>>
{
  public int search(T[] array, T element)
  {
    int start = 0;
    int end = array.length - 1;
    int mid = (start + end) / 2;

    while(!element.equals(array[mid]) && end != 0)
    {
      if (element.equals(array[mid]))
      {
        return mid;
      } else if (array[mid].compareTo(element) < 0)
      {
        end = mid - 1;
        mid = (start + end) / 2;
      } else if(array[mid].compareTo(element) > 0)
      {
        start = mid + 1;
        mid = (start + end) / 2;
      }
    }
    return -1;
  }
}