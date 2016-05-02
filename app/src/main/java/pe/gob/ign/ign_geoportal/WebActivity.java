package pe.gob.ign.ign_geoportal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import static android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN;

/**
 * Created by Administrador on 01/05/2016.
 */
public class WebActivity extends AppCompatActivity {
    WebView webview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visor);
        //Quitamos barra de titulo de la aplicacion
        //this.requestWindowFeature(Window.FEATURE_NO_TITLE);
      //Quitamos barra de notificaciones
        //this.getWindow().setFlags(FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        webview = (WebView) findViewById(R.id.wvGeo);
        webview.loadUrl("http://idep.gob.pe/geox/mapasbases.html");
        webview.setWebViewClient(new WebViewClient() {
            public boolean shouldOverriderUrlLoading(WebView view,String Url){
                return false;
            }
        }

        );

    }
}
