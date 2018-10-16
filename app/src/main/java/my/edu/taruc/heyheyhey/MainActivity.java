package my.edu.taruc.heyheyhey;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //a module level variable
    private TextView textViewMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //onCreate = main() function
        super.onCreate(savedInstanceState);

        //display UI
        //R = resources class
        //layout = folder name
        setContentView(R.layout.activity_main);

        //Linking UI to program
        textViewMsg = findViewById(R.id.textViewMessage);
    }

    //View = class
    //v = an instance of a class
    public void showMessage(View v){
        textViewMsg.setText("Hello, Kururu.");
    }

    public void clearScreen(View v){
        textViewMsg.setText("");
    }

}
