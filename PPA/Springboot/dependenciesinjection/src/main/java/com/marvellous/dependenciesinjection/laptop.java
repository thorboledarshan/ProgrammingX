package com.marvellous.dependenciesinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class laptop
{
    @Autowired
    public HDD hobj;
    @Autowired
    public RAM robj;

    @GetMapping("Laptop")
    public String LaptopDisplay()
    {
      return hobj.HDDDisplay()+ " and " + robj.RAMDisplay();

    }

}
