package com.google.haodong.macroreprosample;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

  private static final int GREEN = 0;
  private static final int RED = 1;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    ConstraintLayout mainLayout = findViewById(R.id.mainLayout);

    MaterialButton button = new MaterialButton(this);
    mainLayout.addView(button);

    TypedArray a = obtainStyledAttributes(R.style.ButtonAppearance_MacroReproSample_Main, R.styleable.ButtonAppearance);
    int colorCode = a.getInt(R.styleable.ButtonAppearance_buttonColor, GREEN);

    switch(colorCode){
      case GREEN:
        button.setBackgroundColor(Color.GREEN);
        break;
      case RED:
        button.setBackgroundColor(Color.RED);
        break;
    }
    button.setText(a.getString(R.styleable.ButtonAppearance_buttonLabel));
  }
}