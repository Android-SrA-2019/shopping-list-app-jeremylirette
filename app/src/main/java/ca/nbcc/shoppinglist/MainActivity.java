package ca.nbcc.shoppinglist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    public static final int TEXT_REQUEST = 1;
    private TextView item1;
    private TextView item2;
    private TextView item3;
    private TextView item4;
    private TextView item5;
    private TextView item6;
    private TextView item7;
    private TextView item8;
    private TextView item9;
    private TextView item10;
    private String item_1 = "";
    private String item_2  = "";
    private String item_3  = "";
    private String item_4  = "";
    private String item_5  = "";
    private String item_6  = "";
    private String item_7  = "";
    private String item_8  = "";
    private String item_9  = "";
    private String item_10  = "";
    private int item_1_qty = 1;
    private int item_2_qty = 1;
    private int item_3_qty = 1;
    private int item_4_qty = 1;
    private int item_5_qty = 1;
    private int item_6_qty = 1;
    private int item_7_qty = 1;
    private int item_8_qty = 1;
    private int item_9_qty = 1;
    private int item_10_qty = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        item1 = findViewById(R.id.item1);
        item2 = findViewById(R.id.item2);
        item3 = findViewById(R.id.item3);
        item4 = findViewById(R.id.item4);
        item5 = findViewById(R.id.item5);
        item6 = findViewById(R.id.item6);
        item7 = findViewById(R.id.item7);
        item8 = findViewById(R.id.item8);
        item9 = findViewById(R.id.item9);
        item10 = findViewById(R.id.item10);
    }

    public void launchSecondActivity(View view){
        Log.d(LOG_TAG,"Button clicked");
        Intent intent = new Intent(this,SecondActivity.class);
        startActivityForResult(intent,TEXT_REQUEST);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode,resultCode,data);
        if(requestCode == TEXT_REQUEST){
            if(resultCode == RESULT_OK){
                String item = data.getStringExtra(SecondActivity.EXTRA_ITEM);
                if(item_1.equals(item)) {
                    item_1_qty++;
                    String new_text = item_1 + " Qty: " + item_1_qty;
                    item1.setText(new_text);
                }
                if(item_2.equals(item)) {
                    item_2_qty++;
                    String new_text = item_2 + " Qty: " + item_2_qty;
                    item2.setText(new_text);
                }
                if(item_3.equals(item)) {
                    item_3_qty++;
                    String new_text = item_3 + " Qty: " + item_3_qty;
                    item3.setText(new_text);
                }
                if(item_4.equals(item)) {
                    item_4_qty++;
                    String new_text = item_4 + " Qty: " + item_4_qty;
                    item4.setText(new_text);
                }
                if(item_5.equals(item)) {
                    item_5_qty++;
                    String new_text = item_5 + " Qty: " + item_5_qty;
                    item5.setText(new_text);
                }
                if(item_6.equals(item)) {
                    item_6_qty++;
                    String new_text = item_6 + " Qty: " + item_6_qty;
                    item6.setText(new_text);
                }
                if(item_7.equals(item)) {
                    item_7_qty++;
                    String new_text = item_7 + " Qty: " + item_7_qty;
                    item7.setText(new_text);
                }
                if(item_8.equals(item)) {
                    item_8_qty++;
                    String new_text = item_8 + " Qty: " + item_8_qty;
                    item8.setText(new_text);
                }
                if(item_9.equals(item)) {
                    item_9_qty++;
                    String new_text = item_9 + " Qty: " + item_9_qty;
                    item9.setText(new_text);
                }
                if(item_10.equals(item)) {
                    item_10_qty++;
                    String new_text = item_10 + " Qty: " + item_10_qty;
                    item10.setText(new_text);
                }

                if(item1.getText() == null || item1.getText() == ""){
                    String set_text = item + " Qty: 1";
                    item1.setText(set_text);
                    item_1 = item;
                    item_1_qty = 1;
                }
                else if(item2.getText() == null || item2.getText() == ""){
                    String set_text = item + " Qty: 1";
                    item2.setText(set_text);
                    item_2 = item;
                    item_2_qty = 1;
                }
                else if(item3.getText() == null || item3.getText() == ""){
                    String set_text = item + " Qty: 1";
                    item3.setText(set_text);
                    item_3 = item;
                    item_3_qty = 1;
                }
                else if(item4.getText() == null || item4.getText() == ""){
                    String set_text = item + " Qty: 1";
                    item4.setText(set_text);
                    item_4 = item;
                    item_4_qty = 1;
                }
                else if(item5.getText() == null || item5.getText() == ""){
                    String set_text = item + " Qty: 1";
                    item5.setText(set_text);
                    item_5 = item;
                    item_5_qty = 1;
                }
                else if(item6.getText() == null || item6.getText() == ""){
                    String set_text = item + " Qty: 1";
                    item6.setText(set_text);
                    item_6 = item;
                    item_6_qty = 1;
                }
                else if(item7.getText() == null || item7.getText() == ""){
                    String set_text = item + " Qty: 1";
                    item7.setText(set_text);
                    item_7 = item;
                    item_7_qty = 1;
                }
                else if(item8.getText() == null || item8.getText() == ""){
                    String set_text = item + " Qty: 1";
                    item8.setText(set_text);
                    item_8 = item;
                    item_8_qty = 1;
                }
                else if(item9.getText() == null || item9.getText() == ""){
                    String set_text = item + " Qty: 1";
                    item9.setText(set_text);
                    item_9 = item;
                    item_9_qty = 1;
                }
                else if(item10.getText() == null || item10.getText() == ""){
                    String set_text = item + " Qty: 1";
                    item10.setText(set_text);
                    item_10 = item;
                    item_10_qty = 1;
                }
            }
        }
    }
}
