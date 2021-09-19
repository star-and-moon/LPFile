package xyz.linliyop.linglitel.lpfile.UI

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import xyz.linliyop.linglitel.lpfile.R
import xyz.linliyop.linglitel.lpfile.databinding.ActivityAddServerBinding
import xyz.linliyop.linglitel.lpfile.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var intent = Intent(this, AddServerActivity::class.java)
        startActivity(intent)
    }
}