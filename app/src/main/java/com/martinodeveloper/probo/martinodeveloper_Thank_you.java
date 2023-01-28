package com.martinodeveloper.probo;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;


public class martinodeveloper_Thank_you extends AppCompatActivity {
    public void onBackPressed() {
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.martinodeveloper_thank_you);
        getWindow().setFlags(1024, 1024);
        getWindow().setFlags(1024, 1024);
        ((ImageView) findViewById(R.id.visitr)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                martinodeveloper_Thank_you.this.finishAffinity();
                martinodeveloper_Thank_you.this.finish();
            }
        });
    }

    /* access modifiers changed from: protected */

}
