package com.newton.Hashmap;

import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> hmap=new HashMap<>();
        // add keys and values in hashmap
        hmap.put("newton",20);
        hmap.put("school",25);
        System.out.println("before modification "+hmap);
        //modifying value for key
        hmap.put("newton",Integer.valueOf(14));
        hmap.put("school",Integer.valueOf(11));
//        hmap.clear();
        System.out.println("after modification "+hmap);
        // getting value of the key
        System.out.println(hmap.get("school"));
        System.out.println(hmap.get("newton"));
        //checking for keys in hmap
        System.out.println(hmap.containsKey("newton"));
        //checking for values in hmap
        System.out.println(hmap.containsValue(11));
        for(String key: hmap.keySet()){
            System.out.println(key+" "+hmap.get(key));
        }
    }
    
}
