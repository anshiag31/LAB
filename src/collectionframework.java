import java.util.*;
public class collectionframework {
    public static void main(String[] args) {
        HashMap<Integer,Integer>obj= new HashMap<>();
        obj.put(10,100);
        System.out.println(obj.get(10));
        System.out.println(obj.getOrDefault(10,0));
        for(Map.Entry<Integer,Integer>Res:obj.entrySet())
        {
            System.out.println(Res.getKey());
            System.out.println(Res.getValue());
        }
    }
}
