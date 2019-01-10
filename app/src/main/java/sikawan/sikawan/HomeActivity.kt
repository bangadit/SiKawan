package sikawan.sikawan

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }

    fun profile(view: View) {
        val intent = Intent(this@HomeActivity, ProfileActivity::class.java)
        startActivity(intent)
    }

    fun listlaporan(view: View) {
        val intent = Intent(this@HomeActivity, ListLaporanActivity::class.java)
        startActivity(intent)
    }

    fun lapor(view: View) {
        val intent = Intent(this@HomeActivity, LaporActivity::class.java)
        startActivity(intent)
    }
}
