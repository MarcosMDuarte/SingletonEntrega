package duarte.marcos;

/**
 * Singleton "apressado".
 * @author MarcosMDuarte
 *
 *
 */
public class SingletonEager {

    private static SingletonEager intancia = new SingletonEager();

    private SingletonEager(){
        super();
    }

    public static SingletonEager getInstancia(){
        return intancia;
    }
}
