package com.common;

import net.sf.json.JSONArray;

import java.util.ArrayList;
import java.util.List;

public class jsonToList {
    public static List<Object> jsonToList1(String json){
        List<Object> List = new ArrayList<>();
        JSONArray jsonarray = JSONArray.fromObject(json);
        System.out.println(jsonarray);
        for(int i = 0 ;i<jsonarray.size();i++){
            List.add(jsonarray.get(i));
        }
        return List;
    }
}
