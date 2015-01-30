package practicalcoding.swatchbharat.main;

import practicalcoding.swatchbharat.others.TeamListAdapter;
import practicalcoding.swatchbharat.others.TeamObject;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.ListView;

public class AboutActivity extends Activity {

	 private ListView listView;

	    @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_about);
	        
	        TeamObject weather_data[] = new TeamObject[]
	        {
	            new TeamObject(R.drawable.sir1, "Basavraj"),
	            new TeamObject(R.drawable.deepali1, "Deepali"),
	            new TeamObject(R.drawable.madhu3, "Madhu"),
	            new TeamObject(R.drawable.namrata, "Namrata"),
	            new TeamObject(R.drawable.samata, "Samata"),
	            new TeamObject(R.drawable.shwetha, "Shwetha"),
	            new TeamObject(R.drawable.sonia2, "Sonia"),
	            new TeamObject(R.drawable.soumya, "Soumya")
	        };
	        
	        TeamListAdapter adapter = new TeamListAdapter(this, 
	                R.layout.listview_team_row, weather_data);
	        
	        
	        listView = (ListView)findViewById(R.id.listView1);
	         
	       // View header = (View)getLayoutInflater().inflate(R.layout.listview_header_row, null);
	        //listView1.addHeaderView(header);
	        
	        listView.setAdapter(adapter);
	    }
}
