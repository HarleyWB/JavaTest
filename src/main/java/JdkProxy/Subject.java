package JdkProxy;

public interface Subject {
    void rent();

    void hello(String str) throws Exception;

    default void je() {

    }
}