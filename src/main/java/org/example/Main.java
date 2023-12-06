package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws IOException {
//        URL urlObj = new URL("https://api.agify.io/?name=Gabriel");
//        HttpURLConnection conexao = (HttpURLConnection)urlObj.openConnection();
//        conexao.setRequestMethod("GET");
//        int responseCode = conexao.getResponseCode();
//        if(responseCode == HttpURLConnection.HTTP_OK) {
//            BufferedReader in = new BufferedReader(new InputStreamReader(conexao.getInputStream()));
//            String inputLine;
//            StringBuffer response = new StringBuffer();
//
//            while ((inputLine = in.readLine()) != null) {
//                response.append(inputLine);
//            } in.close();
//
//            JSONObject jsonObject = new JSONObject(response.toString());
//            Entrada entrada = new Entrada();
//            entrada.setCount(jsonObject.getInt("count"));
//            entrada.setName(jsonObject.getString("name"));
//            entrada.setAge(jsonObject.getInt("age"));
//            System.out.println(entrada);
//        } else {
//            System.out.println("GET request did not work");
//        }


        URL urlObj = new URL("https://api.agify.io/?name=Gabriel");
        HttpURLConnection conexao = (HttpURLConnection)urlObj.openConnection();
        conexao.setRequestMethod("GET");
        int responseCode = conexao.getResponseCode();
        if(responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(new InputStreamReader(conexao.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            } in.close();

            ObjectMapper objectMapper = new ObjectMapper();
            RespostaJSON respostaJSON = objectMapper.readValue(response.toString(), RespostaJSON.class);

            System.out.println(respostaJSON.getName());
        } else {
            System.out.println("GET request did not work");
        }
    }
}