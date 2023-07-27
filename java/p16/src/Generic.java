public class Generic<E1 extends Number, E2> {
  public void printSomeGenericVariable(E1 one, E2 two) {
    System.out.println(one);
    System.out.println(two);
  }
}