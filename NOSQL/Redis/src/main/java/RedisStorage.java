import org.redisson.client.RedisConnectionException;
import redis.clients.jedis.Jedis;

import java.util.Date;

public class RedisStorage {

    private Jedis jedis;

    private final static String KEY = "DATING_SITE";

    private double getTs() {
        return new Date().getTime();
    }

    void init() {
        try {
            jedis = new Jedis("127.0.0.1", 6379);
            jedis.flushDB();
        }
        catch (RedisConnectionException ex){
            System.out.println("Не удалось подключиться к Redis");
            System.out.println(ex.getMessage());
        }
    }

    void logRegistration(String user_id){
        jedis.zadd(KEY, getTs(), user_id);
    }

    String getRandomUser(int max){
        String user;
        int min = 1;
        int x = (int) Math.floor(Math.random() * (max - min + 1)) + min;
        user = Integer.toString(x);
        return user;
    }

    String getUser(){
        return jedis.zpopmin(KEY).getElement();
    }
}