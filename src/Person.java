/**
 * Created by 154424 on 12/10/2018.
 */
public class Person {
    private String name;
    private int iq;

    public Person(){
        name = "";
        iq = 100;
    }

    public Person(String n, int i){
        name = n;
        iq = i;
    }

    public int getIq() {
        return iq;
    }

    public String getName() {
        return name;
    }

}
