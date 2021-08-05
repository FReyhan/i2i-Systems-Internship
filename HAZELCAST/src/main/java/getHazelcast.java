import com.hazelcast.client.HazelcastClient;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.map.IMap;

public class getHazelcast {
    public static void main(String[] args) throws InterruptedException {

        HazelcastInstance getData = HazelcastClient.newHazelcastClient();
        IMap<Object,Object> dataMap = getData.getMap("mapTest");

        int i = 0;
        Object takenNumber = 0;

        long start = System.nanoTime();

        while(takenNumber!=null){
            takenNumber= dataMap.get(i);
            i++;
        }

        long runTime = System.nanoTime() - start;
        double seconds = (double)runTime / 1000000000.0;

        System.out.println(seconds);
    }
}
