package org.example.practice;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONObject;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) throws JsonProcessingException {
        Employee emp = new Employee(969,"Chethan Kumar N","QE");

        // Serialization - converting Java object to JSON
        ObjectMapper mapper = new ObjectMapper();
        String empDetails =  mapper.writeValueAsString(emp);
        System.out.println(empDetails);

        JSONObject json = new JSONObject(empDetails);

        ArrayList<String> list = new ArrayList<>(json.keySet());
        for(String key:list){
            System.out.println("Value for Key "+key+" : "+json.get(key));
        }

        System.out.println("--------------------------------------------");

        // DeSerialization - converting JSON object to Java object
        Employee emp1 = mapper.readValue(empDetails, Employee.class);

        System.out.println(emp1.getEmployeeId());
        System.out.println(emp1.getEmployeeName());
        System.out.println(emp1.getDepartment());
    }
}
