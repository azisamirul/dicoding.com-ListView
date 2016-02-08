package id.web.azis.simplelistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private ListView lvItem;

    private String[] footbalClub= new String[]{
      "Arema", "Persija", "Mitra Kukar", "PS TNI", "Persib", "Persipura",
        "Sriwijaya FC","Pusam Borneo", "Bali United","Surabaya United"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvItem=(ListView) findViewById(R.id.lv_item);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1, android.R.id.text1,footbalClub);
        lvItem.setAdapter(adapter);

        lvItem.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Kamu Klik: "+footbalClub[position], Toast.LENGTH_SHORT).show();
            }
        });
    }

}
