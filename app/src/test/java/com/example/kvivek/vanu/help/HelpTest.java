package com.example.kvivek.vanu.help;

import android.view.View;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class HelpTest {

    Help help = new Help();

    @Test
    public void ShouldTestBackFeature(){
        View view = new View(null);
        help.back(view);
    }

}