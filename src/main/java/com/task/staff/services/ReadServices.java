package com.task.staff.services;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.task.staff.entity.Staff;


import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadServices {
    public void reader(String path) {
        try {
            Gson gson = new Gson();

            Reader reader = Files.newBufferedReader(Paths.get(path));

            List<Staff> staffList = gson.fromJson(reader,
                    new TypeToken<List<Staff>>() {
                    }.getType());

            PrintServices print = new PrintServices();
            print.print(staffList);

            reader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
