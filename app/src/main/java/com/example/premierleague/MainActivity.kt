package com.example.premierleague


/**
 *  <h1>PremierLeague Teams!!</h1>
 *Shows premierre league teams and their info
 * @author Gokce
 * @version 1.0
 * @since 05.17.2021
 */


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.premierleague.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.list_item.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var teamArrayListDataClass : ArrayList<TeamInformation_DataClass>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imageId = intArrayOf(
            R.drawable.manchestercity, R.drawable.manunited,R.drawable.leicestercity,
            R.drawable.chelsea,R.drawable.liverpool, R.drawable.tottenham,
            R.drawable.westham,R.drawable.everton, R.drawable.arsenal,
            R.drawable.leedsunited, R.drawable.astonvilla, R.drawable.wolverhampton,
            R.drawable.crystalpalace, R.drawable.southampton,
            R.drawable.burnley, R.drawable.newcastle, R.drawable.brighton,
            R.drawable.fulham, R.drawable.westbrom, R.drawable.sheffield
        )

        val teamName = arrayOf(
            "Man City", "Man United", "Leicester City", "Chelsea", "Liverpool", "West Ham", "Totten Ham",
            "Everton","Arsenal", "Leeds United", "Aston Villa", "Wolves", "Southampthon", "Crystal Palace",
            "Burnley", "Newcastle", "Brighton",  "Fulham",  "West Brom",  "Sheffield United"
            )


        val teamMaganer = arrayOf(
            "Pep Guardiola", "Ole Gunnar Solskjær", "Brendan Rodgers","Thomas Tuchel","Jürgen Klopp",
            "David Moyes","Ryan Mason", "Carlo Ancelotti", "Mikel Arteta", "Marcelo Bielsa", "Dean Smith",
            "Nuno Espírito Santo", "Ralph Hasenhüttl", "Roy Hodgson", "Sean Dyche","Steve Bruce","Graham Potter",
            "Scott Parker","Sam Allardyce","Paul Heckingbottom"
        )

        val teamFoundingYear = arrayOf(
            "1880", "1878", "1884","1905", "1892","1895", "1882", "1878", "1886", "1919", "1874", "1877", "1885", "1905",
            "1882","1892", "1901", "1879", "1879", "1878", "1889"
        )




        teamArrayListDataClass = ArrayList()

        for(i in teamName.indices){

            val team = TeamInformation_DataClass(
                teamName[i],
                teamManager[i],
                teamFoundingYear[i],
                imageId[i]
            )
            teamArrayListDataClass.add(team)

        }

        binding.listview.isClickable = true
        binding.listview.adapter = MyAdapter(this, teamArrayListDataClass)
        binding.listview.setOnItemClickListener { parent, view, position, id ->

            val team = teamName[position]
            val year = teamFoundingYear[position]
            val manager = teamMaganer[position]
            val imageId =imageId[position]

            val i = Intent(this, TeamActivity::class.java)
            i.putExtra("team", teamName)
            i.putExtra("year", teamFoundingYear)
            i.putExtra("manager", teamMaganer)
            i.putExtra("imageId", imageId)

            startActivity(i)
        }

    }

private operator fun TextView.get(i: Int) {}
}

