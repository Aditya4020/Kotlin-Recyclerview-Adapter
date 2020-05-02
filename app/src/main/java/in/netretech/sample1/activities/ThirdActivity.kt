package `in`.netretech.sample1.activities

import `in`.netretech.sample1.adapters.Adaptername
import `in`.netretech.sample1.models.Modelname
import `in`.netretech.sample1.R
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.third_activity.*

class ThirdActivity:AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.third_activity)

        val layoutmanager = LinearLayoutManager(this)
        layoutmanager.orientation = LinearLayoutManager.VERTICAL
        recyclerview1.layoutManager = layoutmanager


        val adapter = Adaptername(
            this,
            Modelname.namelist,
            Modelname.idlist
        );
        recyclerview1.adapter = adapter


    }
}