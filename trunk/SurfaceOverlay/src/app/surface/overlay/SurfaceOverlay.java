package app.surface.overlay;

import android.app.Activity;
import android.view.View.OnClickListener;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SurfaceOverlay extends Activity {
    /** Called when the activity is first created. */
	 View toggle_view;
	 View hideBtn1;
	 View hideBtn2;
	 Button button_toggle;
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.main);
        toggle_view = findViewById(R.id.toggleView);
        hideBtn1 = findViewById(R.id.button_hide);
        hideBtn2 = findViewById(R.id.button_hide2);
        
        button_toggle = (Button) findViewById(R.id.button_toggle);
        
        button_toggle.setOnClickListener(buttonToggleClick);
        hideBtn1.setOnClickListener(showSecondButton);
        hideBtn2.setOnClickListener(hide);
    }
    
    OnClickListener buttonToggleClick = new OnClickListener(){
    	public void onClick(View v){
    		if(toggle_view.getVisibility() == View.INVISIBLE){
    			toggle_view.setVisibility(View.VISIBLE);
    			button_toggle.setText("Hide");
    		}else{
    			toggle_view.setVisibility(View.INVISIBLE);
    			button_toggle.setText("Show");
    		}
    	}
    };
    
    OnClickListener showSecondButton = new OnClickListener() {
    	public void onClick(View v) {
    		hideBtn2.setVisibility(View.VISIBLE);
    	}
    };
    
    OnClickListener hide = new OnClickListener() {
    	public void onClick(View v) {
    		v.setVisibility(View.INVISIBLE);
    	}
    };
}