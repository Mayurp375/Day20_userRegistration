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


}