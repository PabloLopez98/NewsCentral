package pablo.myexample.newscentral

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import pablo.myexample.newscentral.Categories.*

class Adapter(fragment: Fragment) : FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int = 5

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> FirstCategory()
            1 -> SecondCategory()
            2 -> ThirdCategory()
            3 -> FourthCategory()
            else -> FifthCategory()
        }
    }
}