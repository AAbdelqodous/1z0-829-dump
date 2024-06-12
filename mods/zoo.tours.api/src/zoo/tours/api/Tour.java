package zoo.tours.api;

/**
 * @apiNote Service provider interface
 * @author A. Abdelqodous */
public interface Tour {
    String name();
    int length();
    Souvenir getSouvenir();
}
