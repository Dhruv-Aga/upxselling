package api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class UserController {

    private final UserRespository userRespository;
    @Autowired
    MailService notificationService;

    public UserController(UserRespository userRespository) {
        this.userRespository = userRespository;
    }

    @GetMapping("/docapi")
    public List<UserDetails> index(){
        return userRespository.findAll();
    }

    @GetMapping("/docapi/{id}")
    public UserDetails show(@PathVariable String id){
        Long docapiId = Long.parseLong(id);
        return userRespository.findById(docapiId).orElseThrow(() -> new UserNotFoundException(docapiId));
    }

    @PostMapping("/docapi/search")
    public List<UserDetails> search(@RequestBody Map<String, String> body){
        int from = Integer.parseInt(body.get("from"));
        int to = Integer.parseInt(body.get("to"));
        return userRespository.findAllLimit(from, to);
    }

    @PostMapping("/docapi")
    public UserDetails create(@RequestBody Map<String, String> body){
        String name = body.get("name");
        String email = body.get("email");
        int age = Integer.parseInt(body.get("age"));
        UserDetails store = userRespository.save(new UserDetails(name, age ,email));
        if(store.getId()>-1){
            String message = store.toString();
            String subject = "Testing Mail API";
            try {
                notificationService.sendEmail(store.getEmail(),message,subject);
            } catch (MailException mailException) {
                System.out.println(mailException);
            }
        }
        return store;
    }

    @PutMapping("/docapi/{id}")
    public UserDetails update( @RequestBody UserDetails body,@PathVariable String id){
        System.out.println(body);
        Long docapiId = Long.parseLong(id);
        return userRespository.findById(docapiId).map(user -> {
            user.setEmail(body.getEmail());
            user.setName(body.getName());
            user.setAge(body.getAge());
            return userRespository.save(user);
        })
        .orElseGet(() -> {
            body.setId(Integer.valueOf(id));
            return userRespository.save(body);
        });

    }

    @DeleteMapping("docapi/{id}")
    public boolean delete(@PathVariable String id){
        Long docapiId = Long.parseLong(id);
        userRespository.deleteById(docapiId);
        return true;
    }

}