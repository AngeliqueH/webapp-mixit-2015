package com.angeliquehenry.controller;

import com.angeliquehenry.utils.MixitObject;
import java.util.HashMap;
import org.springframework.web.bind.annotation.*;

/**
 * Controller simulant une fuite mémoire.
 * @author Angélique Henry
 */
@RestController
public class LeakController {
    
    //Source de la fuite mémoire.
    private static HashMap<Long,MixitObject> cache = new HashMap<>();
    
    /**
     * Enregistre des String dans une map statique.
     * @return 
     */
    @RequestMapping(value = "/api/leak")
    @ResponseBody
    String leak() {
        String bigString = "{{\"patate\":\"chips\"}";
        for (int i=0; i<20000; i++){
            bigString=bigString+",{\"patate\":\"chips\"}";
        }
        bigString=bigString+"}";
       
       cache.put(System.currentTimeMillis(),new MixitObject(bigString));
       
       return "OK";
    }

}
