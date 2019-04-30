package www.xyz.icmi;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Index extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.index);
        Button bt1 = (Button)findViewById(R.id.bt1);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Index.this,"首页",Toast.LENGTH_SHORT).show();
                Intent i = new Intent(Index.this,Find.class);
                startActivity(i);
            }
        });

        Button i_intent = (Button)findViewById(R.id.y_intent);
        i_intent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent("android.intent.action.ACTION_START");
                startActivity(i);
            }
        });
    }

    public boolean onCreateOptionsMenu(Menu m){
        getMenuInflater().inflate(R.menu.index,m);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem m){
        switch (m.getItemId()){
            case R.id.i_add:
                Toast.makeText(Index.this,"i_add",Toast.LENGTH_SHORT).show();
                //测试隐式跳转Intent
                Intent i = new Intent("android.intent.action.ACTION_MailList");
                startActivity(i);
                break;
            case R.id.i_delete:
                Toast.makeText(Index.this,"i_delete",Toast.LENGTH_SHORT).show();
                //Intent隐式传参
                Intent i2 = new Intent("android.intent.action.action_two");
                i2.addCategory("android.intent.action.action_two");
                startActivity(i2);
                break;
            case R.id.i_update:
                Toast.makeText(Index.this,"i_update",Toast.LENGTH_SHORT).show();
                // Intent隐式其他用法
                Intent  i3 = new Intent(Intent.ACTION_VIEW);
                i3.setData(Uri.parse("http://www.baidu.com"));
                startActivity(i3);
                break;
            case R.id.i_select:
                Log.d("Index","断点1");
                Toast.makeText(Index.this,"i_select",Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }
}
