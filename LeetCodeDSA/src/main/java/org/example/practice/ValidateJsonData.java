package org.example.practice;
import org.json.JSONArray;
import org.json.JSONObject;

public class ValidateJsonData {
    public static void main(String[] args){
        JSONObject request = new JSONObject();
        request.put("name", "Chethan");
        request.put("age", 26);

        JSONObject root = new JSONObject();
        root.put("testName", "CreateUser");
        root.put("request", request);
        root.put("expectedStatus", 201);

        JSONObject empDetails = new JSONObject();
        empDetails.put("Designation", "SDET-1");
        empDetails.put("Organization", "OneTrust");

        /* ---- JSON Array: skills ---- */
        JSONArray skills = new JSONArray();
        skills.put("Java");
        skills.put("Selenium");
        skills.put("API Automation");

        empDetails.put("skills", skills);

        /* ---- JSON Array: projects ---- */
        JSONArray projects = new JSONArray();

        JSONObject project1 = new JSONObject();
        project1.put("name", "Consent Management");
        project1.put("duration", "6 months");

        JSONObject project2 = new JSONObject();
        project2.put("name", "DSAR Automation");
        project2.put("duration", "4 months");

        projects.put(project1);
        projects.put(project2);

        empDetails.put("projects", projects);

        root.put("empDetails", empDetails);

        System.out.println(root.toString(2));

        System.out.println("--------------------------------------------------------------------------------");

        JSONArray jsonArray = empDetails.getJSONArray("projects");
        System.out.println("First JSON object in array : "+jsonArray.getJSONObject(0));
        System.out.println("Second JSON object in array : "+jsonArray.getJSONObject(1));
    }
}
