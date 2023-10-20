package duarte.marcos;

/**
 * Singleton "Lazy Holder".
 *
 * @see <a href="https://stackoverflow.com/a/24018148">Referencia</a>
 * @author MarcosMDuarte
 *
 *
 */
public class SingletonLazyHolder {
    private static class IntanceHolder {
        public static SingletonLazyHolder intancia = new SingletonLazyHolder();
    }
    private SingletonLazyHolder(){
        super();
    }

    public static SingletonLazyHolder getInstancia(){
        return IntanceHolder.intancia;
    }
}
