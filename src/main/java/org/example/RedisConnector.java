package org.example;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.client.RedisClient;
import org.redisson.client.RedisClientConfig;
import org.redisson.config.Config;

public class RedisConnector {

    public static RedissonClient redisson = null;

    public static RedissonClient getInstance() {
        if (redisson == null) {
            redisson = createConnector();
        }
        return redisson;
    }

    public static RedissonClient createConnector() {

        return Redisson.create();
    }
}
