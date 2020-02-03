/*
package com.lambton;

import org.json.JSONObject;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;

public class JSONParser {
    public static void main(String[] args) {
        JSONParser jsonParser = new JSONParser();
        JSONObject json;
        try
        {
            FileReader reader = new FileReader("customer.json");
            //Read JSON file
            JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);
            String value = (String) jsonObject.get("firstName");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    }
*/
