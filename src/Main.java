import java.util.ArrayList;

public class Main {

    public static void main(String[]args){
ArrayList<Tier> test= new ArrayList<Tier>();
        for (int i = 0; i <10 ; i++) {
          test.add(new Hund());
          test.add(new Katze());
        }

        for (int i = 0; i <test.size() ; i++) {
            test.get(i).laut();
        }
    }


}
