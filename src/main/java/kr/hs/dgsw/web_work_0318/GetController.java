package kr.hs.dgsw.web_work_0318;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetController {
    @Autowired
    private CalculateService cs;

    @GetMapping("/calculate")
    public double sayHi(@RequestParam int num1, @RequestParam int num2, @RequestParam String sign){
        return cs.returnResult(num1, num2, sign);
    }
}
