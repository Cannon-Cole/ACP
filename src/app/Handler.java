/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 * @author Cole
 */

import java.util.HashMap;

public interface Handler {
    public void handleIt(HashMap<String, Object> data);
}
