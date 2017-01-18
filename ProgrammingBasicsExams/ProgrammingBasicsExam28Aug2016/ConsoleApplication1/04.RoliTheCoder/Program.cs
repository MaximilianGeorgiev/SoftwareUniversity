using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Text.RegularExpressions;

class RoliTheCoder
{
    static void Main(string[] args)
    {
        string input = Console.ReadLine();

        Dictionary<int, string> eventInfo = new Dictionary<int, string>();
        Dictionary<string, List<string>> eventParticipants = new Dictionary<string, List<string>>();


        while (!input.Equals("Time for Code"))
        {
            if (!input.Contains('#'))
            {
                input = Console.ReadLine();
                continue;
            }


            string[] split = input.Split(new char[] { '#' }, StringSplitOptions.RemoveEmptyEntries).ToArray();
            int eventId = int.Parse(split[0].Trim());
            string remainingStuff = split[1].Trim();
            string eventName = remainingStuff.Split(new char[] { '@' }, StringSplitOptions.RemoveEmptyEntries)[0].Trim();

            List<string> participantsList = new List<string>();


            MatchCollection matches = Regex.Matches(input, @"(@[A-Za-z0-9]+)");

            foreach (Match match in matches)
            {
                participantsList.Add(match.Groups[1].ToString());
            }

            participantsList = participantsList.Distinct().ToList();

            if (!eventInfo.ContainsKey(eventId))
            {
                eventInfo[eventId] = eventName;
                eventParticipants[eventName] = participantsList;
            }

            else
            {
                if (eventInfo[eventId] == eventName)
                {
                    List<string> participantsAlreadyThere = eventParticipants[eventName];

                    for (int i = 0; i < participantsList.Count; i++)
                    {
                        if (!participantsAlreadyThere.Contains(participantsList[i]))
                        {
                            participantsAlreadyThere.Add(participantsList[i]);
                        }
                    }
                   
                }
                
            }
        
            input = Console.ReadLine();
        }
        eventParticipants = eventParticipants
            .OrderByDescending(x => x.Value.Count()).ThenBy(x => x.Key).ToDictionary(x => x.Key, y => y.Value);



        foreach (KeyValuePair<string, List<string>> validEvent in eventParticipants)
        {
            Console.WriteLine(validEvent.Key + " - " + validEvent.Value.Count());

            if (validEvent.Value.Count() <= 0)
            {
                continue;
            }

            List<string> participants = validEvent.Value
                                                  .OrderBy(x => x)
                                                  .ToList();

            foreach (var participant in participants)
            {
                Console.WriteLine(participant);
            }

        }

    }
}

