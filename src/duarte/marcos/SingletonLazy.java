package duarte.marcos;

/**
 * Singleton "preguiçoso".
 * @author MarcosMDuarte
 *
 *
 */
public class SingletonLazy {

    private static SingletonLazy intancia;

    private SingletonLazy(){
        super();
    }

    public static SingletonLazy getInstancia(){
        if (intancia == null){
            intancia = new SingletonLazy();
        }
        return intancia;
    }
}
