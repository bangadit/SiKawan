package sikawan.sikawan

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Lapor2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lapor2)
    }

    fun back(view: View) {
        finish()
    }

    fun laporkan(view: View) {
        val intent = Intent(this@Lapor2Activity, ListLaporanActivity::class.java)
        startActivity(intent)
    }
}
