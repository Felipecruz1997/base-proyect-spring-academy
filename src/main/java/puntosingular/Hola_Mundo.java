package puntosingular;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/base")
public class Hola_Mundo {
private final static Logger LOG = Logger.getLogger("puntosingular");
@GetMapping("holaMundo")
public ResponseEntity<?> holaMundo() {
	Map<String, Object> respuesta = new HashMap<>();
	//System.aout.println("HolaMundo");
	LOG.info("Hola Mundo desde Srping boot donde no me quedaba");
	respuesta.put("respuesta","Hola Mundo desde Srping boot donde no me quedaba - 202Accepted");
	return new ResponseEntity<Map<String,Object>>(respuesta,HttpStatus.ACCEPTED);
}

}
