package dio.padroes.Singleton;

public class SingletonLazy { // Singleton "pregiçosos"

    private static SingletonLazy instancia;

    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstancia() {
        if(instancia == null){
            instancia = new SingletonLazy(); 
        }
        return instancia;
    }
}