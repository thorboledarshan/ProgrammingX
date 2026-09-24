package com.marvellous.dependenciesinjection;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;
@Component
public class RAM
{
  public String RAMDisplay()

  {
    return "RAM is of 8GB";
  }
}
