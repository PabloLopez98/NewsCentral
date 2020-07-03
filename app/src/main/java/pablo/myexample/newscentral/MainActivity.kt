package pablo.myexample.newscentral

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if(savedInstanceState == null){
            val frag = CollectionFragment()
            supportFragmentManager.beginTransaction().add(R.id.main_frame_layout, frag).commit()
        }
    }
}
