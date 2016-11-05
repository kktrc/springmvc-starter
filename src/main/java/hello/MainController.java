package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by mosl on 2016/11/4.
 */
@Controller
@RequestMapping("/main")
public class MainController {

  @RequestMapping("/index")
  public String index(){
    return "index";
  }
}
