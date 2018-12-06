/**
 * Created by JUV on 06/12/2018.
 */
public class Client {
    Flower flower=new Flower("ouverte");





    public static void main(String args[]){
        HummingBird hummingBird=new HummingBird();
        Bee bee=new Bee();
        Flower flower =new Flower("ouverte");
        flower.addObserver(hummingBird);
        flower.addObserver(bee);
        flower.setChanged();
        flower.notifyObservers();
        flower.setEtat("fermé");
        flower.setChanged();
        flower.notifyObservers();


    }

}

