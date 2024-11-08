package ExceptionHandling;

class Negativeradiusexception extends Exception
{

    public Negativeradiusexception()
    {

        super("radius cannot be negative");
    }



}

class DivideByZero extends  Exception
{


    public DivideByZero()
    {
        super("cannot be divide by zero ......");
    }



}



public class Throw_Throws {

    public static double AreaOfcircle(int r) throws Negativeradiusexception
    {
        if(r<0)
        {
            throw new Negativeradiusexception();
        }


        return Math.PI*r*r;
    }

    public static double Divide(int a,int b) throws DivideByZero
    {
       if(b==0)
       {
           throw new DivideByZero();
       }

       return a/b;
    }




    public static void main(String[] args) throws DivideByZero {


  try{

      double divide = Divide(123, 0);
      System.out.println(divide);

  }
catch (DivideByZero e)
{
    System.out.println(e.getMessage());
    System.out.println(e.getMessage());

}


        int a=23*78;
        System.out.println("after the exception flow is continues result is "+a);



    }
}
