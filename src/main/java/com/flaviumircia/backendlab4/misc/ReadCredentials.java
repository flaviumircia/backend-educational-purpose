package com.flaviumircia.backendlab4.misc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ReadCredentials {

    public static Map<String,String> getCredentialsFromRelative(String path) throws FileNotFoundException {
        String localDir = System.getProperty("user.dir");
        File file = new File(localDir+path);
        Map<String,String> credentials=new HashMap<>();
        Scanner scanner = new Scanner(file);
        if(scanner.hasNextLine()) {
            String data = scanner.nextLine();
            credentials.put("username",data);
        }
        if(scanner.hasNextLine()){
            String data=scanner.nextLine();
            credentials.put("password",data);
        }
        return credentials;
    }
}
