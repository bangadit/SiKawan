package sikawan.sikawan

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class PasswordActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_password)
    }

    fun back(view: View) {
        finish()
    }
}
