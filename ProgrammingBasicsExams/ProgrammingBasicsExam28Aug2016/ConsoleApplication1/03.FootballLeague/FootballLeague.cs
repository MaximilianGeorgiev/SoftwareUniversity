using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Text.RegularExpressions;

class FootballLeague
{
    static void Main(string[] args)
    {
        string key = Console.ReadLine();
        string input = Console.ReadLine();

        Dictionary<string, int> standings = new Dictionary<string, int>();
        Dictionary<string, int> goalStandings = new Dictionary<string, int>();

        Dictionary<int, string> positions = new Dictionary<int, string>();

        while (!input.Equals("final"))
        {
            string[] lineArgs = input.Split();
            string firstTeam = GetTeamName(lineArgs[0], key);
            string secondTeam = GetTeamName(lineArgs[1], key);


            int[] scores = input.Split()[2].Split(':').Select(int.Parse).ToArray();

            if (!(standings.ContainsKey(firstTeam)))
            {
                if (!standings.ContainsKey(secondTeam))
                {
                    if (scores[0] == scores[1])
                    {
                        standings[firstTeam] = 1;
                        standings[secondTeam] = 1;
 }
                    else if (scores[0] > scores[1])
                    {
                        standings[firstTeam] = 3;
                        standings[secondTeam] = 0;
                    }
                    else
                    {
                        standings[secondTeam] = 3;
                        standings[firstTeam] = 0;
                    }

                    goalStandings[firstTeam] = scores[0];
                    goalStandings[secondTeam] = scores[1];
                }
                else
                {
                    if (scores[0] == scores[1])
                    {
                        standings[firstTeam] = 1;
                        standings[secondTeam] += 1;

                    }
                    else if (scores[0] > scores[1])
                    {
                        standings[firstTeam] = 3;
                   }
                    else
                    {
                        standings[secondTeam] += 3;
                        standings[firstTeam] = 0;
                    }

                    goalStandings[firstTeam] = scores[0];
                    goalStandings[secondTeam] += scores[1];
                }

 }
            else
            {
                if (!standings.ContainsKey(secondTeam))
                {
                    if (scores[0] == scores[1])
                    {
                        standings[firstTeam] += 1;
                        standings[secondTeam] = 1;
   }
                    else if (scores[0] > scores[1])
                    {
                        standings[firstTeam] += 3;
                        standings[secondTeam] = 0;
                    }
                    else
                    {
                        standings[secondTeam] = 3;
                        standings[firstTeam] = 0;
                    }

                    goalStandings[firstTeam] += scores[0];
                    goalStandings[secondTeam] = scores[1];
                }
                else
                {
                    if (scores[0] == scores[1])
                    {
                        standings[firstTeam] += 1;
                        standings[secondTeam] += 1;

                    }
                    else if (scores[0] > scores[1])
                    {
                        standings[firstTeam] += 3;
                    }
                    else
                    {
                        standings[secondTeam] += 3;
                    }

                    goalStandings[firstTeam] += scores[0];
                    goalStandings[secondTeam] += scores[1];
                }

            }




            input = Console.ReadLine();
        }
        Console.WriteLine("League standings:");

        standings = standings.OrderByDescending(x => x.Value).ThenBy(y => y.Key).ToDictionary(x => x.Key, y => y.Value);

        int count = 1;

        foreach (KeyValuePair<string, int> team in standings)
        {
            Console.WriteLine("{0}. {1} {2}", count, team.Key, team.Value);
            count++;
        }

        Console.WriteLine("Top 3 scored goals:");

        goalStandings = goalStandings.OrderByDescending(x => x.Value).ThenBy(y => y.Key).ToDictionary(x => x.Key, y => y.Value);

        string[] topThreeNames = goalStandings.Keys.Take(3).ToArray();
        int[] topThreeGoals = goalStandings.Values.Take(3).ToArray();

        for (int i = 0; i < topThreeGoals.Length; i++)
        {
            Console.WriteLine("- {0} -> {1}", topThreeNames[i], topThreeGoals[i]);
        }
    }
    private static string GetTeamName(string teamName, string key)
    {
        int firstIndex = teamName.IndexOf(key) + key.Length;
        int secondIndex = teamName.LastIndexOf(key);
        int length = secondIndex - firstIndex;
        string name = teamName.Substring(firstIndex, length);
        return string.Join("", name.ToUpper().Reverse());
    }
}

