import java.util.*;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.map.IMap;

public class putHazelcast {
    public static void main(String[] args) {

        HazelcastInstance putData = Hazelcast.newHazelcastInstance();
        IMap<Object,Object> dataMap = putData.getMap("mapTest");

        int [] arr=new int[100000];
        Random rand = new Random();

        for (int i =0; i < 100000; i++){
            arr[i]=rand.nextInt(10000);
        }

        long start = System.nanoTime();

        for (int i =0; i < 100000; i++){
            dataMap.put(i,arr[i]);
        }

        long runTime = System.nanoTime() - start;
        double seconds = (double)runTime / 1000000000.0;

        System.out.println(seconds);

    }
}
