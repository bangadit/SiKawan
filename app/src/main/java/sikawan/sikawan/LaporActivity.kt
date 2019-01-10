package sikawan.sikawan

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class LaporActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lapor)
    }

    fun back(view: View) {
        finish()
    }

    fun lapor(view: View) {
        val intent = Intent(this@LaporActivity, Lapor2Activity::class.java)
        startActivity(intent)
    }
}
