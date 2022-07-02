package com.task.staff;

import com.task.staff.services.ReadServices;
import com.task.staff.utils.Constants;


public class App {
    public static void main(String[] args) {
        String path = Constants.BASE_PATH + "staff.json";
        ReadServices read = new ReadServices();
        read.reader(path);
    }
}
