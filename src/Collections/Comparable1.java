package Collections;


import java.util.ArrayList;
import java.util.Collections;

class Students implements Comparable<Students> {

   private int id;
   public String name;
   public String address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Students() {
    }

    public Students(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }


    @Override
    public int compareTo(Students o) {
        return this.id-o.id;
    }
}

public class Comparable1 {
    public static void main(String[] args) {


        ArrayList<Students> list = new ArrayList<>();
        list.add(new Students(12,"abhay saini","farakpur"));
        list.add(new Students(14,"sagaun","kalso"));
        list.add(new Students(8,"kesu","jahanpur"));
        list.add(new Students(25,"mohsin","muish"));
        list.add(new Students(0,"mack garry","josh"));

// sorting the list of the student based on id

        Collections.sort(list);
        System.out.println(list);





    }
}
