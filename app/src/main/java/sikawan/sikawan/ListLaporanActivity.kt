package sikawan.sikawan

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ListLaporanActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_laporan)
    }

    fun back(view: View) {
        finish()
    }

    fun laporkan(view: View) {
        val intent = Intent(this@ListLaporanActivity, LihatLaporanActivity::class.java)
        startActivity(intent)
    }
}
