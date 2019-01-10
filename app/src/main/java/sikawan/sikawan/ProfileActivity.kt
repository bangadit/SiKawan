package sikawan.sikawan

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
    }

    fun back(view: View) {
        finish()
    }

    fun ubahpassword(view: View) {
        val intent = Intent(this@ProfileActivity, PasswordActivity::class.java)
        startActivity(intent)
    }
}
