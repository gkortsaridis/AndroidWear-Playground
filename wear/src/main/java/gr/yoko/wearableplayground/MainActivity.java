package gr.yoko.wearableplayground;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.wearable.view.WatchViewStub;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    private TextView mTextView;
    private Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,berase;
    private long number = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final WatchViewStub stub = (WatchViewStub) findViewById(R.id.watch_view_stub);
        stub.setOnLayoutInflatedListener(new WatchViewStub.OnLayoutInflatedListener() {
            @Override
            public void onLayoutInflated(WatchViewStub stub) {
                mTextView = (TextView) stub.findViewById(R.id.tv1);
                mTextView.setText("Type Phone number");

                b1 = (Button) stub.findViewById(R.id.b1);
                b2 = (Button) stub.findViewById(R.id.b2);
                b3 = (Button) stub.findViewById(R.id.b3);
                b4 = (Button) stub.findViewById(R.id.b4);
                b5 = (Button) stub.findViewById(R.id.b5);
                b6 = (Button) stub.findViewById(R.id.b6);
                b7 = (Button) stub.findViewById(R.id.b7);
                b8 = (Button) stub.findViewById(R.id.b8);
                b9 = (Button) stub.findViewById(R.id.b9);
                b0 = (Button) stub.findViewById(R.id.b0);
                berase = (Button) stub.findViewById(R.id.erase);

                b0.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        number = number*10+0;
                        mTextView.setText(""+number);
                    }
                });

                b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        number = number*10+1;
                        mTextView.setText(""+number);
                    }
                });

                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        number = number*10+2;
                        mTextView.setText(""+number);
                    }
                });

                b3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        number = number*10+3;
                        mTextView.setText(""+number);
                    }
                });

                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        number = number*10+4;
                        mTextView.setText(""+number);
                    }
                });

                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        number = number*10+4;
                        mTextView.setText(""+number);
                    }
                });

                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        number = number*10+5;
                        mTextView.setText(""+number);
                    }
                });

                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        number = number*10+6;
                        mTextView.setText(""+number);
                    }
                });

                b7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        number = number*10+7;
                        mTextView.setText(""+number);
                    }
                });

                b8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        number = number*10+8;
                        mTextView.setText(""+number);
                    }
                });

                b9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        number = number*10+9;
                        mTextView.setText(""+number);
                    }
                });

                berase.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        number = 0;
                        mTextView.setText("Type Phone number");
                }
                });

            }
        });
    }
}
