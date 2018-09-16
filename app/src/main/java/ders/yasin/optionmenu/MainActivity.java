package ders.yasin.optionmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView listIller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listIller=(ListView) findViewById(R.id.list_Iller);
        final String [] iller=getResources().getStringArray(R.array.iller);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(getApplicationContext(),R.layout.style_list,iller);
        listIller.setAdapter(adapter);
        listIller.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"Seçilen il:"+iller[position],Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu,menu);
        return  true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        switch (id){
            case R.id.item_delete:
                Toast.makeText(getApplicationContext(),"Delete seçildi",Toast.LENGTH_SHORT).show(); break ;
            case R.id.item_setting:
                Toast.makeText(getApplicationContext(),"Setting seçildi",Toast.LENGTH_SHORT).show(); break ;
            case R.id.item_share:
                Toast.makeText(getApplicationContext(),"Share seçildi",Toast.LENGTH_SHORT).show(); break ;
        }
        return true;

    }
}
