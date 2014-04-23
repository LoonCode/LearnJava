package com.example.singleton;

/**
 * Created by Loon on 2014/4/23.
 *
 * @link http://www.programcreek.com/2011/07/java-design-pattern-singleton/
 */
public class AmericaPresident {
    private static AmericaPresident thePresident;

    private AmericaPresident() {
    }

    public static AmericaPresident getPresident() {
        if (thePresident == null)
            thePresident = new AmericaPresident();
        return thePresident;
    }
}
