package org.example;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.entities.IEntity;
import org.redisson.api.RMap;

import java.util.List;
import java.util.Map;

public class RedisAPI {

    public static void writeToDbAsRMap(List<? extends IEntity> messages) {
        RMap<String, String> entityMap = RedisConnector.getInstance()
                .getMap(messages.get(0).getClass().getName());
        messages.forEach(entity -> {
            JsonNode entityJson = new ObjectMapper().valueToTree(entity);
            entityMap.put(entity.getCode(), entityJson.toPrettyString());
        });
    }

    public static Map<String, String> getAllEntitiesOfType(String clazz) {
        return RedisConnector.getInstance().getMap(clazz);
    }
}
