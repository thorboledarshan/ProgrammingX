package com.marvellous.dependenciesinjection;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

@Component
public class HDD
{
    public String HDDDisplay()
    {
        return "Hard Disk is of 512 gb";
    }

}
