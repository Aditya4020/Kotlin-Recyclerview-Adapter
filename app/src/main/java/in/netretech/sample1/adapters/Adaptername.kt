package `in`.netretech.sample1.adapters

import `in`.netretech.sample1.Extensions.showtoast
import `in`.netretech.sample1.R
import `in`.netretech.sample1.models.id
import `in`.netretech.sample1.models.name
import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.list_item.view.*

class Adaptername(
    val context: Context,
    val namelist: List<name>,
    val idlist: List<id>
) : RecyclerView.Adapter<Adaptername.Viweholder>(){

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): Viweholder {
        val viwe = LayoutInflater.from(context).inflate(R.layout.list_item,p0,false)
        return Viweholder(viwe)
    }

    override fun getItemCount(): Int {
        return namelist.size
    }

    override fun onBindViewHolder(p0: Viweholder, p1: Int) {
        val namefinal = namelist[p1]
        val idlistfinal = idlist[p1]
        p0.setdata(namefinal,idlistfinal,p1)
    }

    inner class Viweholder(itemView: View) : RecyclerView.ViewHolder(itemView){

        var currentname = ""
        var currentposition = 0

        init {
            itemView.setOnClickListener(View.OnClickListener {
                context.showtoast(currentname+" current name ")
            })

            itemView.iteamimage.setOnClickListener {
                val intent = Intent()
                intent.action = Intent.ACTION_SEND
                intent.putExtra(Intent.EXTRA_TEXT, currentname)
                intent.type = "text/plain"
                context.startActivity(Intent.createChooser(intent,"Please Select Any One App"))
            }
        }

        fun setdata (name: name, idlistfinal: id, p1: Int){
            itemView.iteamlisttext.text = name.title.toUpperCase()
            itemView.idnamelisttext.text = idlistfinal.title.toString()
            currentname = name.title.toLowerCase()
            currentposition = p1
        }
    }

}


