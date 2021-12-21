package com.example.premierleague

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyAdapter(private val context: Activity,private val arrayList: ArrayList<TeamInformation_DataClass>):
    ArrayAdapter<TeamInformation_DataClass>(context, R.layout.list_item,arrayList)
{
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val inflater: LayoutInflater = LayoutInflater.from(context)
        val view: View = inflater.inflate(R.layout.list_item, null)

        val imageView: ImageView = view.findViewById(R.id.team_logo)
        val teamName: TextView = view.findViewById(R.id.teamName)
        val teamManager: TextView = view.findViewById(R.id.teamManager)

        imageView.setImageResource(arrayList[position].imageId)
        teamName.text = arrayList[position].teamName
        teamManager.text = arrayList[position].teamManager



        return view
    }

}