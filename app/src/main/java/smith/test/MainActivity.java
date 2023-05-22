package smith.test;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import smith.test.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding b;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(b.getRoot());


        b.scoverview.setImageResource(smith.lib.views.cover.R.drawable.img);
        b.scoverview.setTextShadeColor(Color.CYAN);
        b.scoverview.setTextColor(Color.BLACK);
        b.scoverview.setText("Hi I'm Hussein Smith, I'm the developer of this library!");
        b.scoverview.setTextPadding(12);
        b.scoverview.setCorners(50);
    }

    public void message(View view) {
        Toast.makeText(this, "clicked", Toast.LENGTH_SHORT).show();
    }
}
