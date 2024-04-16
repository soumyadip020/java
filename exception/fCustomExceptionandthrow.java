//custom exception and throw

class MyException extends Exception { // here we have to write this because exception is a special concept it knows
                                      // where we have to apply it and where not
  // so if we want to make a custom exception then we have to make a child class
  // of the exception
  public MyException() {

  }

  public MyException(String m) {
    super(m);// constructor to call the parent class construtor
  }

  /*
   * it is the duty of the exception class to print the message
   * it can be done by calling the super method
   */
}

public class fCustomExceptionandthrow {
  // exception is a special concept
  public static void main(String[] args) {
    int n = 8;
    int m = -2;
    // suppose the client says both of the numbers need to be a positive number
    // mandatorily
    try {
      if (m < 0) {
        // System.out.println("enter a valid number");//since this line is repeated
        // twice so we will try a different method
        Exception e = new MyException("negative number");// custom exception

        throw e;// by throw keyword we actually pass the object of the exception to the catch
                // method
        // throw and throws are different keyword
      } else {
        int r = n / m;
        System.out.println(r);
      }
    } catch (Exception e) {
      System.out.println("enter  a valid number" + e);// here e prints the object of the exception
      // here no exception is printed because we have created a exception of our own
      // type

      // the task to print the message is that of the exeception class.if we donot
      // create a constructor then the message e wouldnot be called

    }
  }
}
