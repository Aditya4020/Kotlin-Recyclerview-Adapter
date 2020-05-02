package `in`.netretech.sample1.activities

import `in`.netretech.sample1.Extensions.showtoast
import `in`.netretech.sample1.R
import `in`.netretech.sample1.models.constantvalue
import android.content.Intent
import android.nfc.Tag
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_splash_screen.*
import android.util.DisplayMetrics
import java.util.*


class SplashScreen : AppCompatActivity() {

    var TAG = "Splashscreen";
    var edittextvalue : String = "";
    var myLocale: Locale? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        setLocale("hi");


        val iddata : TextView = findViewById(R.id.testid1)
        iddata.setText("alok first project");

       toastmessageshow.setOnClickListener {
           TAG = "toastmessage"
           edittextvalue = aloktext.text.toString()
           Log.i(TAG,edittextvalue)
           showtoast(edittextvalue,Toast.LENGTH_LONG)


           ////////////////////Intent Method CAll with value////////////////////////
           val intent = Intent(this, Secondactivity::class.java)
           constantvalue.messageintent = "idea1"
           val value = constantvalue.messageintent
           TAG = "checkvalue"
           Log.i(TAG, value)
           intent.putExtra(constantvalue.messageintent,edittextvalue)
           startActivity(intent)
       }

        implicit_button.setOnClickListener {
            edittextvalue = aloktext.text.toString()

            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT, edittextvalue)
            intent.type = "text/plain"

            startActivity(Intent.createChooser(intent,"Please Select Any One App"))

        }

        recycler_button.setOnClickListener {
            showtoast("value change",Toast.LENGTH_LONG)
            val intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)
        }



    }

    override fun onResume() {
        super.onResume()
        setContentView(R.layout.activity_splash_screen)
    }

    private fun setLocale(s: String) {

        ///////////////Laungauge Change System////////////////////////////
        myLocale = Locale(s)
        val res = resources
        val dm = res.displayMetrics
        val conf = res.configuration
        conf.locale = myLocale
        res.updateConfiguration(conf, dm)
//        val refresh = Intent(this, SplashScreen::class.java)
//        startActivity(refresh)

    }
}
