package com.samarthgupta.sfa_app.Activities;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.IntentCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import com.google.gson.GsonBuilder;
import com.samarthgupta.sfa_app.DataInterface;
import com.samarthgupta.sfa_app.POJO.JobTicket;
import com.samarthgupta.sfa_app.POJO.ProcessesNO;
import com.samarthgupta.sfa_app.POJO.Progress;
import com.samarthgupta.sfa_app.R;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.samarthgupta.sfa_app.POJO.GlobalAccess.baseUrl;
import static com.samarthgupta.sfa_app.POJO.GlobalAccess.jobTicket;

public class QcDetailsActivity extends AppCompatActivity {

    Button btProceed;
    Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qc_details);

        dialog = new Dialog(QcDetailsActivity.this);
        dialog.setContentView(R.layout.layout_alert_processes);
        dialog.setCancelable(false);

        btProceed = (Button) findViewById(R.id.bt_proceed_qc);
        btProceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {










            }
        });
    }
}
