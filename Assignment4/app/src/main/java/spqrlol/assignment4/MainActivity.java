package spqrlol.assignment4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    private static final String TAG = "MyActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button;

        // button1, San Jose
        button = (Button) findViewById(R.id.SanJose);
        button.setOnClickListener(sj);

        // button2, Santa Cruz
        button = (Button) findViewById(R.id.SantaCruz);
        button.setOnClickListener(sc);

        // button3, BBC
        button = (Button) findViewById(R.id.BBC);
        button.setOnClickListener(bbc);

        // button4, Motherboard
        button = (Button) findViewById(R.id.Vice);
        button.setOnClickListener(vice);



    }

//    public void clickButton(View v) {
//        Button button;
//
//        // button1, San Jose
//        button = (Button) findViewById(R.id.SanJose);
//        button.setOnClickListener(sj);
//
//        // button2, Santa Cruz
//        button = (Button) findViewById(R.id.SantaCruz);
//        button.setOnClickListener(sc);
//
//        // button3, BBC
//        button = (Button) findViewById(R.id.BBC);
//        button.setOnClickListener(bbc);
//
//        // button4, Motherboard
//        button = (Button) findViewById(R.id.Vice);
//        button.setOnClickListener(vice);
//
//
//    }



    View.OnClickListener sj = new View.OnClickListener() {
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, WebView1.class);
            intent.putExtra("sj", true);
            intent.putExtra("sc", false);
            intent.putExtra("bbc", false);
            intent.putExtra("vc", false);
            startActivity(intent);


        }
    };

    View.OnClickListener sc = new View.OnClickListener() {
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, WebView1.class);
            intent.putExtra("sj", false);
            intent.putExtra("sc", true);
            intent.putExtra("bbc", false);
            intent.putExtra("vc", false);
            startActivity(intent);


        }
    };

    View.OnClickListener bbc = new View.OnClickListener() {
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, WebView1.class);
            intent.putExtra("sj", false);
            intent.putExtra("sc", false);
            intent.putExtra("bbc", true);
            intent.putExtra("vc", false);
            startActivity(intent);


        }
    };

    View.OnClickListener vice = new View.OnClickListener() {
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, WebView1.class);
            intent.putExtra("sj", false);
            intent.putExtra("sc", false);
            intent.putExtra("bbc", false);
            intent.putExtra("vc", true);

            startActivity(intent);

        }
    };












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
}
