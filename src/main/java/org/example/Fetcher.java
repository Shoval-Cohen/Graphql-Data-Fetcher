package org.example;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.entities.Continent;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

/**
 * Hello world!
 */
public class Fetcher {

    public static final String COUNTRIES_GRAPHQL_URL = "https://countries.trevorblades.com";

    public static void main(String[] args) throws IOException, InterruptedException {

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .POST(HttpRequest.BodyPublishers.ofString(
                        "{\n" +
                                "  \"query\": \"" +
                                "{\\n  " +
                                "  continents {\\n    " +
                                "    code\\n    " +
                                "    name\\n    " +
                                "    countries {\\n      " +
                                "      code\\n      " +
                                "      name\\n      " +
                                "      native\\n      " +
                                "      phone\\n      " +
                                "      capital\\n      " +
                                "      currency\\n      " +
                                "      languages {\\n        " +
                                "        code\\n        " +
                                "        name\\n        " +
                                "        native\\n        " +
                                "        rtl\\n      " +
                                "      }\\n      " +
                                "      emoji\\n      " +
                                "      emojiU\\n      " +
                                "      states {\\n        " +
                                "        code\\n        " +
                                "        name\\n        " +
                                "        country {\\n          " +
                                "          capital\\n        " +
                                "        }\\n      " +
                                "      }\\n    " +
                                "    }\\n  " +
                                "  }\\n" +
                                "}\\r\\n" +
                                "\",\n" +
                                "  \"variables\": {}\n" +
                                "}"))
                .header("accept", "application/json")
                .header("Content-Type", "application/json")
                .uri(URI.create(COUNTRIES_GRAPHQL_URL))
                .build();


        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(response.body());
        String responseDataAsString = jsonNode.get("data").get("continents").toString();

        List<Continent> continents = objectMapper.readValue(responseDataAsString, new TypeReference<List<Continent>>() {
        });

        continents.forEach(System.out::println);
    }
}
