package com.alicisindan;

import java.util.ArrayList;

public class AdvertisementTest {
    public static ArrayList<Advertisement> advertisements = createSampleAdvertisements();
    public static ArrayList<Advertisement> createSampleAdvertisements() {
        ArrayList<Advertisement> ads= new ArrayList<>();
        ads.add(new Advertisement("I want the best Car", "I want the best car of all time",
                R.drawable.ic_launcher_background, "5.000.000 TL"));
        ads.add(new Advertisement("I want a very good car", "I want the second best car of all time",
                R.drawable.ic_launcher_background, "4.000.000 TL"));
        ads.add(new Advertisement("I want a good car", "I want the third best car of all time",
                R.drawable.ic_launcher_background, "3.000.000 TL"));
        ads.add(new Advertisement("I want a car", "I want the fourth best car of all time",
                R.drawable.ic_launcher_background, "2.000.000 TL"));
        ads.add(new Advertisement("car", "I want the fifth best car of all time",
                R.drawable.ic_launcher_background, "1.000.000 TL"));
        ads.add(new Advertisement("Classic car", "I want the best classic car of all time",
                R.drawable.ic_launcher_background, "20.000.000 TL"));
        ads.add(new Advertisement("Fast car", "I want the fastest car of all time",
                R.drawable.ic_launcher_background, "8.000.000 TL"));
        ads.add(new Advertisement("Flying car", "I want the best flying car of all time",
                R.drawable.ic_launcher_background, "100.000.000 TL"));
        return ads;
    }
}

