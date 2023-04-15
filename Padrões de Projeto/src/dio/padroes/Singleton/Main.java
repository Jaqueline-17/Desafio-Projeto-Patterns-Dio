package dio.padroes.Singleton;

public class Main {

    public static void main(String[] args) {
        // Testes Relacionados ao Design Patern Singleton

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(lazy);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
        System.out.println(lazy);
        holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);
    }
}
