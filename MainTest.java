package org.example;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest extends Main {


    @Test
    public void validate_name_with_caharcter(){
        boolean actualValue = Main.validateName("Mayur"); // 15
        Assert.assertEquals(true, actualValue);
    }
    @Test
    public void validate_Lastname_with_caharcter(){
        boolean actualValue = Main.validateName("Polojwar"); // 15
        Assert.assertEquals(true, actualValue);
    }


    @Test
    public void test_Validate_EmailName() {
        boolean actualValue = Main.validateEmailName("91 7878787878");
        Assert.assertEquals(false,actualValue);
    }
}