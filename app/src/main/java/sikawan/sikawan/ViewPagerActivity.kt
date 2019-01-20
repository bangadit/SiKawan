package sikawan.sikawan

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_view_pager.*
import sikawan.sikawan.fragments.View1Fragment
import sikawan.sikawan.fragments.View2Fragment
import sikawan.sikawan.fragments.View3Fragment

class ViewPagerActivity : AppCompatActivity() {

    var pagerAdapter: CostompagerAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_pager)

        pagerAdapter = CostompagerAdapter(supportFragmentManager)
        pagerAdapter!!.addFragments(View1Fragment(), "Games")
        pagerAdapter!!.addFragments(View2Fragment(), "Movies")
        pagerAdapter!!.addFragments(View3Fragment(), "Film")

        //adding pageradapter to viewpager
        costomViewPager.adapter = pagerAdapter
        //Now setting up viewpager with tablayout
    }
}
