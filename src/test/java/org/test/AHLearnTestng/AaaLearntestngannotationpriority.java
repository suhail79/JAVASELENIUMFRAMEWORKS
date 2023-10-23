package org.test.AHLearnTestng;

import org.testng.annotations.Test;


/*

Setting up priority in the test cases---we can use priority attribute
======================================================================

It follows the order ( -3,-2,-1,0 & without priority,1,2,3)

*/
public class AaaLearntestngannotationpriority {


    @Test(priority = -10)
    private void login() {
        System.out.println("Login into the website");
    }

    @Test(priority = -5)
    private void SearchHotel() {
        System.out.println("search for hotel");
    }

    @Test
    private void SelectHotel() {
        System.out.println("select a hotel");
    }

    @Test(priority = 5)
    private void BookaHotel() {
        System.out.println("Book a hotel");
    }

    @Test(priority = 10)
    private void BookingConfirmation() {
        System.out.println("confirm booking");
    }
}