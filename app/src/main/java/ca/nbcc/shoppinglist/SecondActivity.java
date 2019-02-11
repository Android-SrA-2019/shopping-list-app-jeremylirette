package ca.nbcc.shoppinglist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    public static final String EXTRA_ITEM = "com.example.android.twoactivities.extra.REPLY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void buttonClick(View view){
        String item = (String)((Button)view).getText();
        switch(item){
            case "Go Back":
                finish();
                break;
            default:
               Intent replyIntent = new Intent();
               replyIntent.putExtra(EXTRA_ITEM,item);
               setResult(RESULT_OK,replyIntent);
               finish();
               break;
        }
    }
}
