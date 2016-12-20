package com.example.kvivek.vanu.help;

import android.view.View;

import org.junit.Test;

public class HelpTest {

    Help help = new Help();

    @Test
    public void ShouldTestBackFeature() {
        View view = new View(null);
        help.back(view);
    }
}