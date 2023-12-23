package ua.ucu.edu.Task_3;

import org.json.JSONObject;

import lombok.SneakyThrows;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Scanner;

public class OpenAIEnricher {

    @SneakyThrows
    public static Map<String, String> extract(String domain) {
        String API_KEY = "";
        URL url = new URL(domain);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        // connection.setRequestProperty("X-Api-Key", API_KEY);
        connection.connect();
        String text = new Scanner(connection.getInputStream()).useDelimiter("\\Z").next();
        // JSONObject jsonObject = new JSONObject(text);
        System.out.println(text);
        return null;
    }
}
