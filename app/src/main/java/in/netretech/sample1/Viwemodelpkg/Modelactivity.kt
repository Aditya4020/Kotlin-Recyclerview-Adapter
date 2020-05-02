package `in`.netretech.sample1.Viwemodelpkg

import `in`.netretech.sample1.R
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.model_activity.*


class Modelactivity : AppCompatActivity() {
    private val TAG = this.javaClass.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.model_activity)


//        val model = ViewModelProvider(this).get(MainActivityViewModel::class.java)
//        val myRandomNumber = model.number
//        if (myRandomNumber != null) {
//            myRandomNumber.observe(this, Observer {
//                modeltextid.setText(myRandomNumber.toString())
//            })
//        }






        Log.i(TAG, "Random Number Set");

    }

}