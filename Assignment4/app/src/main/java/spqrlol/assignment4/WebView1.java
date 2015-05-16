package spqrlol.assignment4;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;


public class WebView1 extends ActionBarActivity {

    private static final String TAG = "MyActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view1);

        Button button;

        // button, Share
        button = (Button) findViewById(R.id.share);
        button.setOnClickListener(share);

        Boolean sj = getIntent().getExtras().getBoolean("sj");
        Boolean sc = getIntent().getExtras().getBoolean("sc");
        Boolean bbc = getIntent().getExtras().getBoolean("bbc");
        Boolean vc = getIntent().getExtras().getBoolean("vc");
        Log.v(TAG, "sj = " + sj);
        Log.v(TAG, "sc = " + sc);
        Log.v(TAG, "bbc = " + bbc);
        Log.v(TAG, "vc = " + vc);

        if (sj) {
            String url = "http://www.mercurynews.com";
            WebView view = (WebView) this.findViewById(R.id.webView);
            view.getSettings().setJavaScriptEnabled(true);
            view.loadUrl(url);

        }

        if (sc) {
            String url = "http://www.santacruzsentinel.com";
            WebView view = (WebView) this.findViewById(R.id.webView);
            view.setWebViewClient(new myWebClient());
            view.getSettings().setJavaScriptEnabled(true);
            view.loadUrl(url);
        }

        if (bbc) {
            String url = "http://www.bbc.com";
            WebView view = (WebView) this.findViewById(R.id.webView);
            view.setWebViewClient(new myWebClient());
            view.getSettings().setJavaScriptEnabled(true);
            view.loadUrl(url);
        }

        if (vc) {
            String url = "http://motherboard.vice.com/en_us";
            WebView view = (WebView) this.findViewById(R.id.webView);
            view.setWebViewClient(new myWebClient());
            view.getSettings().setJavaScriptEnabled(true);
            view.loadUrl(url);
        }

    }

    View.OnClickListener share = new View.OnClickListener() {
        public void onClick(View v) {




            Boolean sj = getIntent().getExtras().getBoolean("sj");
            Boolean sc = getIntent().getExtras().getBoolean("sc");
            Boolean bbc = getIntent().getExtras().getBoolean("bbc");
            Boolean vc = getIntent().getExtras().getBoolean("vc");

            if(sj)
            {
                String url = "http://www.mercurynews.com";
                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_TEXT, url); // your above url
                startActivity(Intent.createChooser(shareIntent, "Share..."));
            }

            if(sc)
            {
                String url = "http://www.santacruzsentinel.com";
                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_TEXT, url); // your above url
                startActivity(Intent.createChooser(shareIntent, "Share..."));
            }

            if(bbc)
            {
                String url = "http://www.bbc.com";
                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_TEXT, url); // your above url
                startActivity(Intent.createChooser(shareIntent, "Share..."));
            }

            if(vc)
            {
                String url = "http://motherboard.vice.com/en_us";
                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_TEXT, url); // your above url
                startActivity(Intent.createChooser(shareIntent, "Share..."));
            }


        }
    };

//    public void shareButton(View view) {
//
//        Intent sharingIntent = new Intent(Intent.ACTION_SEND);
//        sharingIntent.setType("text/html");
//        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, webview.getUrl());
//        startActivity(sharingIntent);
//    }

    public class myWebClient extends WebViewClient
    {
        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            // TODO Auto-generated method stub
            super.onPageStarted(view, url, favicon);
        }

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            // TODO Auto-generated method stub

            view.loadUrl(url);
            return true;

        }
    }

    // To handle "Back" key press event for WebView to go back to previous screen.
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event)
    {
        WebView view = (WebView) this.findViewById(R.id.webView);
        if ((keyCode == KeyEvent.KEYCODE_BACK) && view.canGoBack()) {
            view.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_web_view1, menu);
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
