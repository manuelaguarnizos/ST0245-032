import java.util.*;
public class Taller9 {

    public static void agregar(HashMap empresas, String key, String number) {
        empresas.put(number , key);
    }

    public static boolean buscar(HashMap empresas, String key) {
        if(empresas.containsKey(key))
        {
            return true;             
        }
        else return false;
    }

    public static boolean contieneValue(HashMap empresas, String value) {
        return empresas.containsValue(value);
    }
}