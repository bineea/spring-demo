package my.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ThirdService {

    @Autowired
    public FirstService firstService;
}
