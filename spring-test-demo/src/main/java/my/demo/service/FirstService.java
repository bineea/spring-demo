package my.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FirstService {

    @Autowired
    public SecondService secondService;

    @Autowired
    public ThirdService thirdService;
}
