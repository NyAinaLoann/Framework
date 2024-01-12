package oh ;

import model.Ohatra ; 
import java.util.List ; 
import org.springframework.http.ResponseEntity ; 
import org.springframework.web.bind.annotation.* ; 
 

@RestController
@RequestMapping("/Ohatra")
public class OhatraController   {  

    @GetMapping()
    public List<Ohatra> readOhatra() { 
        return null ;
    }


    @GetMapping("{id}")
    public Ohatra readOhatra( @PathVariable int id ) { 
        return null ;
    }


    @PostMapping()
    public Ohatra createOhatra( @RequestBody Ohatra requestBody ) { 
        return null ;
    }

    @PostMapping()
    public Ohatra createOhatra( @PathVariable int id , @RequestBody Ohatra requestBody ) { 
        return null ;
    }

    @DeleteMapping("{id}")
    public Ohatra deleteOhatra( @PathVariable int id ) { 
        return null ;
    }

}