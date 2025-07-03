package com.example.bluetooth;

import androidx.appcompat.app.AppCompatActivity;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1, b2, b3, b4;
        ListView lv;
       private  BluetoothAdapter ba;
        protected void onCreate(Bundle savedInstanceStat){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            b1 = (Button) findViewById(R.id.btn1);
            b2=(Button)findViewById(R.id.btn2);
            b3=(Button)findViewById(R.id.btn3);
            b4=(Button)findViewById(R.id.btn4);
            ba= BluetoothAdapter.getDefaultAdapter();
            lv=(ListView)findViewById(R.id.listv);
        }

        private Set<BluetoothDevice> pairedDevices;
       // ListView lv;
    }

    @Override

    public void on(View view)
    {
        if (!ba.isEnabled())
        {
            Intent turnon=new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
            startActivityForResult(turnon,0);
            Toast.makeText(getApplicationContext(),"Turned On",Toast.LENGTH_LONG).show();
        }
    }

    public void off(View view)
    {
        ba.disable();
        Toast.makeText(getApplicationContext(),"Turned Off",Toast.LENGTH_LONG).show();
    }
    public void visible(View view)
    {
        Intent getvisible=new Intent(BluetoothAdapter.ACTION_REQUEST_DISCOVERABLE);
        startActivityForResult(getvisible,0);
    }

    public void list(View view)
    {
         paired getBondedDevices();
       ArrayList list=new ArrayList();
        for (BluetoothDevice bt:paireDevice)
        {
            list.add(bt.getName());
            Toast.makeText(getApplicationContext(),"Showing Paired Devices",Toast.LENGTH_LONG).show();
            final ArrayAdapter adapter=new ArrayAdapter(this, android.R.layout.simple_list_item_1);
            lv.setAdapter(adapter);
}
}



}