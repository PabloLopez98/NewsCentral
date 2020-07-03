package pablo.myexample.newscentral

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.fragment_collection.*

class CollectionFragment : Fragment() {

    private lateinit var collectionAdapter: Adapter
    private lateinit var viewpager2: ViewPager2

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_collection, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        collectionAdapter = Adapter(this)
        viewpager2 = view.findViewById(R.id.view_pager_2)
        viewpager2.adapter = collectionAdapter
        val tabLayout = view.findViewById<TabLayout>(R.id.tab_layout)
        TabLayoutMediator(tabLayout, viewpager2){tab, position ->
            when(position){
                0 -> tab.text = "Sports"
                1 -> tab.text = "Business"
                2 -> tab.text = "Science"
                3 -> tab.text = "Covid-19"
                4 -> tab.text = "Entertainment"
            }
        }.attach()
    }
}
