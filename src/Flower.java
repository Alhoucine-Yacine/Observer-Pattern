import javafx.fxml.Initializable;

import java.net.URL;
import java.util.Observable;
import java.util.Observer;
import java.util.ResourceBundle;

/**
 * Created by JUV on 06/12/2018.
 */
public class Flower extends Observable implements Initializable{
    @Override
    protected synchronized void setChanged() {
        super.setChanged();
    }

    String etat;

    @Override
    public synchronized void addObserver(Observer o) {
        super.addObserver(o);
    }

    @Override
    public void notifyObservers() {
        super.notifyObservers(getEtat());
    }

    public Flower(String etat) {
        this.etat = etat;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        etat="ouverte";
    }
}
