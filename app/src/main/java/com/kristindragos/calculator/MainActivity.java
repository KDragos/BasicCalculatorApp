package com.kristindragos.calculator;

import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    private EditText operand1;
    private EditText operand2;
    private Button btnAddition;
    private Button btnSubtraction;
    private Button btnDivision;
    private Button btnMultiplication;
    private TextView result;
    private Button btnClear;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        operand1 = (EditText) findViewById(R.id.editOperand1);
        operand2 = (EditText) findViewById(R.id.editOperand2);
        btnAddition = (Button) findViewById(R.id.btnAddition);
        btnSubtraction = (Button) findViewById(R.id.btnSubtraction);
        btnDivision = (Button) findViewById(R.id.btnDivision);
        btnMultiplication = (Button) findViewById(R.id.btnMultiplication);
        result = (TextView) findViewById(R.id.txtResult);
        btnClear = (Button) findViewById(R.id.btnClear);

        btnAddition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((operand1.getText().length()>0) && (operand2.getText().length()>0)){
                    double num1 = Double.parseDouble(operand1.getText().toString());
                    double num2 = Double.parseDouble(operand2.getText().toString());

                    double answer = num1 + num2;
                    result.setText(Double.toString(answer));
                }
                else{
                    Toast toastMsg = Toast.makeText(MainActivity.this, R.string.number_Entry,Toast.LENGTH_LONG);
                    toastMsg.show();
                }
            }
        });

        btnSubtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((operand1.getText().length()>0) && (operand2.getText().length()>0)){
                    double num1 = Double.parseDouble(operand1.getText().toString());
                    double num2 = Double.parseDouble(operand2.getText().toString());

                    double answer = num1 - num2;
                    result.setText(Double.toString(answer));
                }
                else{
                    Toast toastMsg = Toast.makeText(MainActivity.this, R.string.number_Entry,Toast.LENGTH_LONG);
                    toastMsg.show();
                }
            }
        });

        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((operand1.getText().length()>0) && (operand2.getText().length()>0)){
                    double num1 = Double.parseDouble(operand1.getText().toString());
                    double num2 = Double.parseDouble(operand2.getText().toString());

                    double answer = num1 / num2;
                    result.setText(Double.toString(answer));
                }
                else{
                    Toast toastMsg = Toast.makeText(MainActivity.this, R.string.number_Entry,Toast.LENGTH_LONG);
                    toastMsg.show();
                }
            }
        });

        btnMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((operand1.getText().length()>0) && (operand2.getText().length()>0)){
                    double num1 = Double.parseDouble(operand1.getText().toString());
                    double num2 = Double.parseDouble(operand2.getText().toString());

                    double answer = num1 * num2;
                    result.setText(Double.toString(answer));
                }
                else{
                    Toast toastMsg = Toast.makeText(MainActivity.this, R.string.number_Entry,Toast.LENGTH_LONG);
                    toastMsg.show();
                }
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                operand1.setText("");
                operand2.setText("");
                result.setText("0.0");
                operand1.requestFocus();
            }
        });

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.kristindragos.calculator/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.kristindragos.calculator/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}
