package com.Game_League;

import java.util.*;

public class Main {

    public static League<Team<FootballPlayer>> footballLeague = new League<>("AFL");
    public static League<Team<BaseballPlayer>> baseBallPlayer = new League<>("BPL");
    private static ArrayList<Team<FootballPlayer>> listOFTeams = new ArrayList<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;


        while(!quit) {
            int action = scanner.nextInt();
            String teamName;
            int score1;
            int score2;


            scanner.nextLine();

            switch(action) {
                case 0:
                    System.out.println("League ended.");
                    quit = true;
                    break;
                case 1:
                    // add football team
                   teamName=scanner.next();
                   listOFTeams.add(new Team<>(teamName));

                    break;

                case 2:
                    // add baseball team
                    //Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");

                    break;
                case 3:

                    break;
                case 4:
                    // add to league
                   // printList(playList);

                    break;
                case 5:
                    // add score
                    //printMenu();
                    listOFTeams.get(0).matchResult(listOFTeams.get(1), 1, 0);

                    break;

                case 6:

                    ///check league result

                    break;

            }
        }


        League<Team<FootballPlayer>> footballLeague = new League<>("AFL");
        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        Team<FootballPlayer> hawthorn= new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle= new Team<>("Fremantle");
        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(adelaideCrows, 3, 8);

        adelaideCrows.matchResult(fremantle, 2, 1);

        footballLeague.add(adelaideCrows);
        footballLeague.add(melbourne);
        footballLeague.add(hawthorn);
        footballLeague.add(fremantle);


        footballLeague.showLeagueTable();

        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");
        Team rawTeam = new Team("Raw Team");
        rawTeam.addPlayer(beckham); // unchecked warning
        rawTeam.addPlayer(pat);     // unchecked warning

        footballLeague.add(rawTeam);     // unchecked warning

        League<Team> rawLeague = new League<>("Raw");
        rawLeague.add(adelaideCrows);     // no warning
        rawLeague.add(baseballTeam);    // no warning
        rawLeague.add(rawTeam);         // no warning

        League reallyRaw = new League("Really raw");
        reallyRaw.add(adelaideCrows);     // unchecked warning
        reallyRaw.add(baseballTeam);    // unchecked warning
        reallyRaw.add(rawTeam);         // unchecked warning




    }




}
