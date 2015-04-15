package com.angeliquehenry.controller;

import com.angeliquehenry.utils.ThreadDeLaMort;
import org.springframework.web.bind.annotation.*;

/**
 * Controller simulant un bloquage de threads.
 * @author Angélique Henry
 */
@RestController
public class InfiniteThreadController {
    
    /**
     * Enregistre des String dans une map statique.
     * @return 
     */
    @ResponseBody
    @RequestMapping(value = "/api/thread")
    String infiniteThread() {
       ThreadDeLaMort thread = new ThreadDeLaMort();
       thread.start();
       return "\nOK\n";
    }

}
