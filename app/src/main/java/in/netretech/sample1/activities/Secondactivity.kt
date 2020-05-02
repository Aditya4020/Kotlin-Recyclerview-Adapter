package `in`.netretech.sample1.activities

import `in`.netretech.sample1.R
import `in`.netretech.sample1.models.constantvalue
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.second_activity.*

class Secondactivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)

        ////////////////////Intent Method get value////////////////////////
        secondactivitytext.setText(intent.getStringExtra(constantvalue.messageintent))
    }

}