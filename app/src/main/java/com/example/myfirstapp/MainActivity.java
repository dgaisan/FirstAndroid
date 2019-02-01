package com.example.myfirstapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

/**
 * Description: Display four Text Widgets. Layout widgets vertically
 *  in center. Use Different Colors and Texts for all widgets. Colors
 *  and Text should be injected from resource files.
 */
public class MainActivity extends Activity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.setContentView(R.layout.activity_main);
    }
}
