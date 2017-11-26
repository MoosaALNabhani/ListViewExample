package itaoman.com.listviewexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    String[] name = {"android", "ios", "symbian", "webOs"};
    int[]image= {R.drawable.android_icon,R.drawable.ios_icon,R.drawable.symbian_icon, R.drawable.web_os_icon };
    ListView list;
    ArrayList<HashMap<String,String>> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        arrayList= new ArrayList<>();
        ListView list=(ListView) findViewById(R.id.list);
        for(int i=0;i<name.length;i++){
            HashMap<String,String> map = new HashMap<>();
            map.put("name",name[i]);
            map.put("image",image[i]+"");//"" to convert int to String
            map.put("name1",name[i]);
            map.put("image1",image[i]+"");
            arrayList.add(map);
        }
        String[] namekey={"name","image","name1","image1"};
        int[] listItem={R.id.text1,R.id.imageView,R.id.text2,R.id.imageView1};
        SimpleAdapter adapter= new SimpleAdapter(this,arrayList,R.layout.list_view_item,namekey,listItem);
        list.setAdapter(adapter);
    }
}
