package com.naukri.cloud.Steps.pageactions;

import com.naukri.cloud.Steps.pageobjects.demo;
//import com.naukri.cloud.test.pageobject.demo;
import org.openqa.selenium.WebDriver;
import test.Common;

import java.io.IOException;
import java.util.Map;

public class loginpage extends Common{

    Map<String,String> login=super.readFileWithJavaProperties(demo.siteAdmin);
    Common common;
    public loginpage(WebDriver driver) throws IOException {
        super(driver);
    }

    public void loginToNaukari() throws IOException {
        System.out.println("hemadrireddy"+login.get("emailtbx"));
        super.elementClick(reterivewLocaters(login.get("loginbtn")));
    }
}
