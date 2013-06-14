package com.HACK.codersbestfriend;

import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;

/**
 * Created by demouser on 6/13/13.
 */
public class TaskManager {
    public static ArrayList<LinkedHashMap<String, String>> filter(ArrayList<LinkedHashMap<String, String>> tasks, String tag) {
        ArrayList<LinkedHashMap<String, String>> ans = new ArrayList<LinkedHashMap<String, String>>();
        if (tasks == null) return ans;
        for (LinkedHashMap<String, String> item : tasks) {
            Log.i("TASK", "" + "Title: " + item.get("Title") + "Tags: " + item.get("Tags") + " Keys: " + Arrays.toString(item.keySet().toArray()));
            if (!item.get("Title").equals("") && !item.get("Tags").equals("")) {
                Task task = new Task(item.get("Title"), item.get("Tags"));
                if (task.hasTag(tag)) ans.add(item);
            }
        }
        return ans;
    }
}
