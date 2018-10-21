/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.HashMap;

/**
 *
 * @author Cole
 */
public class DisplayName implements Handler{
    @Override
    public void handleIt(HashMap<String, Object> dataMap){
        System.out.println("Cole");
    }
}
