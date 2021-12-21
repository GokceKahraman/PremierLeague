package com.example.premierleague

data class TeamInformation_DataClass(  //data class
    var teamName: String,
    var teamFoundingYear: Int,
    var teamManager: String,
    var imageId: Int
     ) {
    constructor(teamName: String, teamFoundingYear: Any, teamManager: String, imageId: Int) : this("Man City",1880,"Pep Guardiola","manchestercity")
}


/*val puppyList = listOf(
    TeamInformation(1001, "Man City", 1880, "Pep Guardiola"),
    TeamInformation(1002, "Man United", 1878, "Ole Gunnar Solskjær", images[1]),
    TeamInformation(1003, "Leicester City", 1884, "Brendan Rodgers", images[2]),
    TeamInformation(1004, "Chelsea", 1905, "Thomas Tuchel", images[3]),
    TeamInformation(1005, "Liverpool", 1892, "Jürgen Klopp", images[4]),
    TeamInformation(1006, "West Ham", 1895, "David Moyes", images[5]),
    TeamInformation(1007, "Totten Ham", 1882, "Ryan Mason", images[6]),
    TeamInformation(1008, "Everton", 1878, "Carlo Ancelotti", images[7]),
    TeamInformation(1009, "Arsenal", 1886, "Mikel Arteta", images[8]),
    TeamInformation(1010, "Leeds United", 1919, "Marcelo Bielsa", images[9]),
    TeamInformation(1011, "Aston Villa", 1874, "Dean Smith", images[10]),
    TeamInformation(1012, "Wolves", 1877, "Nuno Espírito Santo", images[11]),
    TeamInformation(1013, "Southampthon", 1885, "Ralph Hasenhüttl", images[12]),
    TeamInformation(1014, "Crystal Palace", 1905, "Roy Hodgson", images[13]),
    TeamInformation(1015, "Burnley", 1882, "Sean Dyche", images[14]),
    TeamInformation(1016, "Newcastle", 1892, "Steve Bruce", images[15]),
    TeamInformation(1017, "Brighton", 1901, "Graham Potter", images[16]),
    TeamInformation(1018, "Fulham", 1879, "Scott Parker", images[17]),
    TeamInformation(1019, "West Brom", 1878, "Sam Allardyce", images[18]),
    TeamInformation(1020, "Sheffield United", 1889, "Paul Heckingbottom", images[19])
                     )
*/