package demo;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v2/demo")
public class DemoService {

    List<People> DB = new ArrayList();

    @PostMapping
    public void addPeopleDB(@RequestBody People people){
        DB.add(people);
    }
    @GetMapping("/people")
    public List<People> getPeople(){
        return DB;
    }
}


