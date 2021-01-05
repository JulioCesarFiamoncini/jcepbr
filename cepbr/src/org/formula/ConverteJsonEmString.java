package org.formula;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

public class ConverteJsonEmString {
    public static String converteJsonEmString(BufferedReader buffereReader) throws IOException {
        String resposta, jsonEmString = "";
        while ((resposta = buffereReader.readLine()) != null) {
            jsonEmString += resposta;
        }
        return jsonEmString;
    }

    public static Endereco[] converteJsonEmArrayString(BufferedReader buffereReader) throws IOException {

        Gson gson = new Gson();
        String jsonEmString = readAll(buffereReader);
        Endereco[] EnderecoArray = gson.fromJson(jsonEmString, Endereco[].class);

//        for (Object nderecoArray : EnderecoArray) {
//            System.out.println(  nderecoArray.toString());
//        }
        return EnderecoArray;
    }

    private static String readAll(Reader rd) throws IOException {
        StringBuilder sb = new StringBuilder();
        int cp;
        while ((cp = rd.read()) != -1) {
            sb.append((char) cp);
        }
        return sb.toString();
    }

}
