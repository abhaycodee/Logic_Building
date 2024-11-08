package SuperKeyword;

class Animal{

    String name;
    public Animal(String name)
    {
        this.name=name;
    }

    void display()
    {
        System.out.println("name of the animal is = "+name);
    }

    Animal(){

    }

}

class Dog extends Animal{
String name;

 Dog(String name)
{

    this.name=name;
}

void display()
{
   super.display();
}

}



public class Super {
    public static void main(String[] args) {


        Dog babbur = new Dog("babbur");

        String name = babbur.name;
        babbur.display();
        System.out.println(name);


    }
}
