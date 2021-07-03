package sg.edu.iss.orc.controller;

import static org.springframework.http.HttpStatus.FORBIDDEN;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;

import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/")
public class MainController {
	
    private final AtomicLong counter = new AtomicLong();
    
    @RequestMapping(
            path = {"fibonacciArray", "fibonacciArray/{length}"},
            method = GET,
            produces = {APPLICATION_JSON_VALUE})
    public ResponseArray getFibonacciArray(HttpServletResponse response, @PathVariable(required = false) Optional<Integer> length) {
        final ResponseArray rtn = new ResponseArray(counter.incrementAndGet());
        try {
            rtn.setFibonacci(Impl.getFibonacci(length.orElse(Impl.LEN_MAX)));
            rtn.setSorted(Impl.getFibonacciSorted(length.orElse(Impl.LEN_MAX)));
        } catch (IllegalArgumentException ex) {
            //rtn.setError(ex.getMessage());
            response.setStatus(FORBIDDEN.value());
        }
        return rtn;
    }
    
    @RequestMapping(
            path = "fibonacciArray",
            method = PUT,
            produces = {APPLICATION_JSON_VALUE})
    public ResponseArray putFibonacciArray(HttpServletResponse response, Request fibReq) {
        final ResponseArray rtn = new ResponseArray(counter.incrementAndGet());
        try {
            rtn.setFibonacci(Impl.getFibonacci((Optional.of(fibReq.getValue())).orElse(Impl.LEN_MAX)));
            rtn.setSorted(Impl.getFibonacciSorted(Optional.of(fibReq.getValue()).orElse(Impl.LEN_MAX)));
        } catch (IllegalArgumentException ex) {
            //rtn.setError(ex.getMessage());
            response.setStatus(FORBIDDEN.value());
        }
        return rtn;
    }
}
