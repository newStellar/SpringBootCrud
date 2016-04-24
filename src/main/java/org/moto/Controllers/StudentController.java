package org.moto.Controllers;

import com.google.gson.*;
import org.moto.Models.Student;

import org.moto.Services.StudentService;
import org.omg.CORBA.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Paths;
import java.util.Map;

/**
 * Created by Nahid on 4/14/2016.
 */


@RestController
public class StudentController {

    @Autowired
    private Environment env;

    @Autowired
    private StudentService service;

    @RequestMapping(value="/create", method = RequestMethod.GET)
    @ResponseBody
    public String createStudent(@RequestParam Map<String,String> params ){

        try {
            String name = params.get("name");
            String email = params.get("email");
            service.createStudent(name, email);
        } catch (Exception e){

            return "Somethig wrong with parameter";
        }
        return "all okay";
    }

    @RequestMapping("/")
    public ModelAndView index(){
        return new ModelAndView("home");
    }



    /*
    * JSON for this method this inside the resources-public-example_JSON.json
    *
    * */
    @RequestMapping(value="/insert", method = RequestMethod.POST)
    public String postTest(@RequestBody String request){

        System.out.println(request);
        JsonElement jsElement = new JsonParser().parse(request);
        JsonObject jsonObject= jsElement.getAsJsonObject();

        JsonObject student = jsonObject.getAsJsonObject("Student");
        Student newStd = new Gson().fromJson(student, Student.class);

        JsonArray jsonAr =  jsonObject.getAsJsonArray("phoneNumbers");
        System.out.println(student+ "---------"+ newStd.getName()+ jsonAr.get(1).getAsJsonObject().get("number"));



        return "all okay";
    }
}
