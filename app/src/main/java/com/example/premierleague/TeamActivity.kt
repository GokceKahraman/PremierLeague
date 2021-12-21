package com.example.premierleague

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.premierleague.databinding.FragmentTeamDetailBinding

class TeamActivity: AppCompatActivity() {

    private lateinit var binding: FragmentTeamDetailBinding



    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        binding = FragmentTeamDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val team = intent.getStringExtra("team")
        val year = intent.getStringExtra("year")
        val manager = intent.getStringExtra("manager")
        val imageId = intent.getIntExtra("imageId", R.drawable.manchestercity)

//we binding the fragment_team_detail with team, year, manager, imageid from dataclass
        binding.teamProfile.text = team
        binding.yearProfile.text = year
        binding.managerProfile.text = manager
        binding.teamLogo.setImageResource(imageId)








    }
}

