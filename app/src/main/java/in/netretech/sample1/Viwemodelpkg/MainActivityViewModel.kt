package `in`.netretech.sample1.Viwemodelpkg

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.util.*

class MainActivityViewModel : ViewModel() {

    private val TAG = this.javaClass.simpleName
    private var myRandomNumber: MutableLiveData<String>? = null

    val number: MutableLiveData<String>?
        get() {
            Log.i(TAG, "Get number")
            if (myRandomNumber == null) {
                myRandomNumber = MutableLiveData<String>()
                createNumber()
            }
            return myRandomNumber
        }

    private fun createNumber() {
        Log.i(TAG, "Create new number")
        val random = Random()
        myRandomNumber!!.postValue("Number: " + (random.nextInt(10 - 1) + 1))

    }

    override fun onCleared() {
        super.onCleared()
        Log.i(TAG, "ViewModel Destroyed")
    }
}


