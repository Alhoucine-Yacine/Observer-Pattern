import java.util.Observable;
import java.util.Observer;

/**
 * Created by JUV on 06/12/2018.
 */
public class HummingBird extends Obs {
    @Override
    public void update(Observable o, Object arg) {
        if (arg.toString().equals("ouverte")) System.out.println("HummingBird : c'est le temps de manger");
        else System.out.println("HummingBird : HummingBird : c'est le temps de dormir ");
    }
}
