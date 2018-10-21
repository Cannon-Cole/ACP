/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Cole
 */
public class ACP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AppControl.mapCommand("name", new DisplayName());
        AppControl.mapCommand("number", new DisplayNumber());
        AppControl.mapCommand("text", new DisplayText());

        String input = "";
        Scanner sc = new Scanner(System.in);
        do {

            System.out.println("Enter command (q to quit) ");
            input = sc.nextLine();

            if (input.equals("q")) {
                continue;
            }

            String command = input;
            HashMap<String, Object> dataMap = new HashMap();
            AppControl.handleRequest(command, dataMap);
        }
        while (!input.equals("q"));

    }

}
