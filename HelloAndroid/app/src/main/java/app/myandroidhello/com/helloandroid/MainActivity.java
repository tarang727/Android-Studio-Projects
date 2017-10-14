package app.myandroidhello.com.helloandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView showTextView;
    private Button showMeButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showMeButton = (Button) findViewById(R.id.buttonId);
        showTextView = (TextView) findViewById(R.id.textViewId);

        final String mountains[] = {"Everest", "Kilimanjaro", "K2", "Trevor", "Makalu", "Ultar", "Mana"};

        showMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //handle our events
                Random rand = new Random();
                int randomNum = rand.nextInt(mountains.length);

                showTextView.setText(mountains[randomNum]);


            }
        });


    }
}
