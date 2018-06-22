package com.amazon.ask.helloworld.data;

import java.util.ArrayList;
import java.util.List;

public class InputData {
    public static int index = 0;
    public static List<String> names = new ArrayList<String>();
    public static void init() {
        names.add("Name1");
        names.add("Name2");
    }
}
