package kr.hs.dgsw.web_work_0318;

import org.springframework.stereotype.Service;

@Service
public class CalculateServiceImpl implements CalculateService {
    @Override
    public double returnResult(int num1, int num2, String sign) {
        if (sign.equals("a")){
            return num1+num2;
        }else if (sign.equals("s")){
            return  num1-num2;
        }else if (sign.equals("m")){
            return num1*num2;
        }else if (sign.equals("d")){
            return num1/num2;
        }
        return 0.0;
    }
}
