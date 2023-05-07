package com.flaviumircia.backendlab4.misc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ReadCredentials {
    /**

     Reads the credentials from a file at a relative path to the current directory and returns them in a Map.
     The file should contain two lines, the first being the username and the second being the password.
     @param path the relative path to the file containing the credentials
     @return a Map containing the username and password as key-value pairs
     @throws FileNotFoundException if the file cannot be found
     */
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
