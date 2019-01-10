package sikawan.sikawan

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MasukActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_masuk)
    }

    fun masuk(view: View) {
        val intent = Intent(this@MasukActivity, HomeActivity::class.java)
        startActivity(intent)
    }
}
