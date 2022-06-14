package mauriciomds.github.io.financialtransactionsanalyzer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ImportController {

  @GetMapping("/import")
  public String importFile(){
    return "import";
  }

  @PostMapping("/import")
  public String uploadFile(String file){
    System.out.println(file);
    return "import";
  }
  
}
