package com.example.kvivek.vanu.help;

import android.view.View;

import org.junit.Test;

public class HelpTest {

    private final Help HELP = new Help();

    @Test
    public void ShouldTestBackFeature() {
        View view = new View(null);
        HELP.back(view);
    }
}
