package com.oops.pk.beginner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.oops.pk.beginner.MESSAGE";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }



    public void onSearchButton(View view){
        Intent cardViewIntent =new Intent(this,cardview.class);
        EditText search = (EditText) findViewById(R.id.editText);
        String word=search.getText().toString();

        cardViewIntent.putExtra(EXTRA_MESSAGE,word);
        startActivity(cardViewIntent);
    }

    public void searchMeaning() throws MalformedURLException {
        HttpURLConnection connection;

        try {
            URL url = new URL("url goes here");
            connection=(HttpURLConnection)url.openConnection();
            connection.connect();
        }catch (MalformedURLException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

//    public void onClickListner(){
//        Button b1=(Button)findViewById(R.id.button);
//        b1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                EditText search = (EditText) findViewById(R.id.editText);
//                String word=search.getText().toString();
//                EditText definition=(EditText)findViewById(R.id.editText2);
//                definition.setText(word);
//
//                Intent cardViewIntent =new Intent(packageContext:this,cardview.class);
//                //Toast.makeText(MainActivity.this,search.getText(),Toast.LENGTH_LONG).show();
//                //System.out.println(word);
//            }
//        });
//    }

}