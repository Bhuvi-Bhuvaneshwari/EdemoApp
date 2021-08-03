package com.app.demoapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.karumi.dexter.Dexter;
import com.karumi.dexter.MultiplePermissionsReport;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.multi.MultiplePermissionsListener;
import com.karumi.dexter.listener.single.PermissionListener;
import com.wafflecopter.multicontactpicker.ContactResult;
import com.wafflecopter.multicontactpicker.LimitColumn;
import com.wafflecopter.multicontactpicker.MultiContactPicker;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {

    private static final int CONTACT_PICKER_REQUEST = 202;
    private EditText txt_message,txt_number,txt_count;
    private Button btn_manual,btn_sms,btn_whatsup,btn_choose;
    List<ContactResult> results=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txt_message=findViewById(R.id.txt_msg);
        txt_number=findViewById(R.id.txt_mbl);
        txt_count=findViewById(R.id.txt_cnt);

        btn_manual=findViewById(R.id.btn_manual);
        btn_sms=findViewById(R.id.btn_sms);
        btn_whatsup=findViewById(R.id.btn_whatsup);
        btn_choose=findViewById(R.id.btn_choose);



        Dexter.withContext(this)
                .withPermissions(
                        Manifest.permission.READ_CONTACTS,
                        Manifest.permission.SEND_SMS
                ).withListener(new MultiplePermissionsListener() {
            @Override public void onPermissionsChecked(MultiplePermissionsReport report) {/* ... */}
            @Override public void onPermissionRationaleShouldBeShown(List<PermissionRequest> permissions, PermissionToken token) {/* ... */}
        }).check();

        btn_sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (!results.isEmpty()) {
                        for (int j = 0; j < results.size(); j++) {

                            for (int i = 0; i < Integer.parseInt(txt_count.getText().toString()); i++) {
                                SmsManager smsManager = SmsManager.getDefault();
                                smsManager.sendTextMessage(results.get(j).getPhoneNumbers().get(0).getNumber(),null, txt_message.getText().toString(), null, null);
                                Toast.makeText(MainActivity2.this, "SMS Send : count" + (i + 1), Toast.LENGTH_SHORT).show();
                            }
                        }
                    }
                }catch (Exception e){
                    Toast.makeText(MainActivity2.this, "SMS Sending failed", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btn_choose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MultiContactPicker.Builder(MainActivity2.this) //Activity/fragment context
                        .hideScrollbar(false) //Optional - default: false
                        .showTrack(true) //Optional - default: true
                        .searchIconColor(Color.WHITE) //Option - default: White
                        .setChoiceMode(MultiContactPicker.CHOICE_MODE_MULTIPLE) //Optional - default: CHOICE_MODE_MULTIPLE
                        .handleColor(ContextCompat.getColor(MainActivity2.this, R.color.quantum_googred50)) //Optional - default: Azure Blue
                        .bubbleColor(ContextCompat.getColor(MainActivity2.this, R.color.quantum_googred50)) //Optional - default: Azure Blue
                        .bubbleTextColor(Color.WHITE) //Optional - default: White
                        .setTitleText("Select Contacts") //Optional - default: Select Contacts
                        .setLoadingType(MultiContactPicker.LOAD_ASYNC) //Optional - default LOAD_ASYNC (wait till all loaded vs stream results)
                        .limitToColumn(LimitColumn.NONE) //Optional - default NONE (Include phone + email, limiting to one can improve loading time)
                        .setActivityAnimations(android.R.anim.fade_in, android.R.anim.fade_out,
                                android.R.anim.fade_in,
                                android.R.anim.fade_out) //Optional - default: No animation overrides
                        .showPickerForResult(CONTACT_PICKER_REQUEST);
            }
        });

        btn_manual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btn_whatsup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == CONTACT_PICKER_REQUEST){
            if(resultCode == RESULT_OK) {
                results = MultiContactPicker.obtainResult(data);
                StringBuilder names= new StringBuilder(results.get(0).getDisplayName());
                for (int j=0;j<results.size();j++){
                    if (j!=0)

                names.append(",").append(results.get(j).getDisplayName());
                }
               txt_number.setText(names);
                Log.d("MyTag", results.get(0).getDisplayName());
            } else if(resultCode == RESULT_CANCELED){
                System.out.println("User closed the picker without selecting items.");
            }
        }
    }
}