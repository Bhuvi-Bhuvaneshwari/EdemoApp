package com.app.demoapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class EmcNumActivity extends AppCompatActivity implements View.OnClickListener{

    ViewGroup tcont;
    LinearLayout ll1,ll2,ll3,ll4,ll5,ll6,ll7,ll8,ll9,ll0;
    TableLayout tl1,tl2,tl3,tl4,tl5,tl6,tl7,tl8,tl9,tl0;
    boolean visible;
    private static final int REQUEST_CALL = 1;
    private TextView ct1,ct2,ct3,ct4,ct5,ct6,ct7,ct8,ct9,ct0;
    de.hdodenhof.circleimageview.CircleImageView bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Objects.requireNonNull(getSupportActionBar()).hide();

        setContentView(R.layout.activity_emc_num);

        de.hdodenhof.circleimageview.CircleImageView btn = findViewById(R.id.bloc1);
        btn.setOnClickListener(v -> startActivity(new Intent(EmcNumActivity.this,MapsActivity.class)));

        tcont=findViewById(R.id.tranCont);

        ll1=findViewById(R.id.linearLayout1);
        ll1.setOnClickListener(this);
        ll2=findViewById(R.id.linearLayout2);
        ll2.setOnClickListener(this);
        ll3=findViewById(R.id.linearLayout3);
        ll3.setOnClickListener(this);
        ll4=findViewById(R.id.linearLayout4);
        ll4.setOnClickListener(this);
        ll5=findViewById(R.id.linearLayout5);
        ll5.setOnClickListener(this);
        ll6=findViewById(R.id.linearLayout6);
        ll6.setOnClickListener(this);
        ll7=findViewById(R.id.linearLayout7);
        ll7.setOnClickListener(this);
        ll8=findViewById(R.id.linearLayout8);
        ll8.setOnClickListener(this);
        ll9=findViewById(R.id.linearLayout9);
        ll9.setOnClickListener(this);
        ll0=findViewById(R.id.linearLayout0);
        ll0.setOnClickListener(this);

        tl1=findViewById(R.id.tableLayout1);
        tl2=findViewById(R.id.tableLayout2);
        tl3=findViewById(R.id.tableLayout3);
        tl4=findViewById(R.id.tableLayout4);
        tl5=findViewById(R.id.tableLayout5);
        tl6=findViewById(R.id.tableLayout6);
        tl7=findViewById(R.id.tableLayout7);
        tl8=findViewById(R.id.tableLayout8);
        tl9=findViewById(R.id.tableLayout9);
        tl0=findViewById(R.id.tableLayout0);

        ct1 = findViewById(R.id.tcall1);
        ct2 = findViewById(R.id.tcall2);
        ct3 = findViewById(R.id.tcall3);
        ct4 = findViewById(R.id.tcall4);
        ct5 = findViewById(R.id.tcall5);
        ct6 = findViewById(R.id.tcall6);
        ct7 = findViewById(R.id.tcall7);
        ct8 = findViewById(R.id.tcall8);
        ct9 = findViewById(R.id.tcall9);
        ct0 = findViewById(R.id.tcall0);

        bt1 = findViewById(R.id.bcall1);
        bt2 = findViewById(R.id.bcall2);
        bt3 = findViewById(R.id.bcall3);
        bt4 = findViewById(R.id.bcall4);
        bt5 = findViewById(R.id.bcall5);
        bt6 = findViewById(R.id.bcall6);
        bt7 = findViewById(R.id.bcall7);
        bt8 = findViewById(R.id.bcall8);
        bt9 = findViewById(R.id.bcall9);
        bt0 = findViewById(R.id.bcall0);

        bt1.setOnClickListener(v -> bcall1());
        bt2.setOnClickListener(v -> bcall2());
        bt3.setOnClickListener(v -> bcall3());
        bt4.setOnClickListener(v -> bcall4());
        bt5.setOnClickListener(v -> bcall5());
        bt6.setOnClickListener(v -> bcall6());
        bt7.setOnClickListener(v -> bcall7());
        bt8.setOnClickListener(v -> bcall8());
        bt9.setOnClickListener(v -> bcall8());
        bt0.setOnClickListener(v -> bcall0());


    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.linearLayout1:
                TransitionManager.beginDelayedTransition(tcont);
                visible = !visible;
                tl1.setVisibility(visible? View.VISIBLE:View.GONE);
                break;

            case R.id.linearLayout2:
                TransitionManager.beginDelayedTransition(tcont);
                visible = !visible;
                tl2.setVisibility(visible? View.VISIBLE:View.GONE);
                break;

            case R.id.linearLayout3:
                TransitionManager.beginDelayedTransition(tcont);
                visible = !visible;
                tl3.setVisibility(visible? View.VISIBLE:View.GONE);
                break;

            case R.id.linearLayout4:
                TransitionManager.beginDelayedTransition(tcont);
                visible = !visible;
                tl4.setVisibility(visible? View.VISIBLE:View.GONE);
                break;

            case R.id.linearLayout5:
                TransitionManager.beginDelayedTransition(tcont);
                visible = !visible;
                tl5.setVisibility(visible? View.VISIBLE:View.GONE);
                break;

            case R.id.linearLayout6:
                TransitionManager.beginDelayedTransition(tcont);
                visible = !visible;
                tl6.setVisibility(visible? View.VISIBLE:View.GONE);
                break;

            case R.id.linearLayout7:
                TransitionManager.beginDelayedTransition(tcont);
                visible = !visible;
                tl7.setVisibility(visible? View.VISIBLE:View.GONE);
                break;

            case R.id.linearLayout8:
                TransitionManager.beginDelayedTransition(tcont);
                visible = !visible;
                tl8.setVisibility(visible? View.VISIBLE:View.GONE);
                break;

            case R.id.linearLayout9:
                TransitionManager.beginDelayedTransition(tcont);
                visible = !visible;
                tl9.setVisibility(visible? View.VISIBLE:View.GONE);
                break;

            case R.id.linearLayout0:
                TransitionManager.beginDelayedTransition(tcont);
                visible = !visible;
                tl0.setVisibility(visible? View.VISIBLE:View.GONE);
                break;

            default:
                Toast.makeText(this,"no options",Toast.LENGTH_SHORT).show();
                break;
        }

    }

    private void bcall1() {
        String number = ct1.getText().toString();
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(EmcNumActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(EmcNumActivity.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }
    private void bcall2() {
        String number = ct2.getText().toString();
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(EmcNumActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(EmcNumActivity.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }
    private void bcall3() {
        String number = ct3.getText().toString();
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(EmcNumActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(EmcNumActivity.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }
    private void bcall4() {
        String number = ct4.getText().toString();
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(EmcNumActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(EmcNumActivity.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }
    private void bcall5() {
        String number = ct5.getText().toString();
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(EmcNumActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(EmcNumActivity.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }
    private void bcall6() {
        String number = ct6.getText().toString();
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(EmcNumActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(EmcNumActivity.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }
    private void bcall7() {
        String number = ct7.getText().toString();
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(EmcNumActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(EmcNumActivity.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }
    private void bcall8() {
        String number = ct8.getText().toString();
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(EmcNumActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(EmcNumActivity.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }
    private void bcall9() {
        String number = ct9.getText().toString();
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(EmcNumActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(EmcNumActivity.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }
    private void bcall0() {
        String number = ct0.getText().toString();
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(EmcNumActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(EmcNumActivity.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull  int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);{
            if (requestCode == REQUEST_CALL) {
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    bcall1();
                    bcall2();
                    bcall3();
                    bcall4();
                    bcall5();
                    bcall6();
                    bcall7();
                    bcall8();
                    bcall9();
                    bcall0();
                } else {
                    Toast.makeText(this, "permission DENIED", Toast.LENGTH_SHORT).show();
                }
            }
        }
    }

}