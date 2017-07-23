package ru.startandroid.simplebrowser;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        (findViewById(R.id.btnWeb)).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = new String(((TextView) findViewById(R.id.url)).getText().toString());
                try{
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
                } catch (Exception e){
                    Toast.makeText(v.getContext(),e.getMessage(),Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
