using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

class LadyBugs
{
    static void Main(string[] args)
    {
        int fieldsize = int.Parse(Console.ReadLine());
        int[] ladybugs = new int[fieldsize];
        int[] indexes = Console.ReadLine()
            .Split()
            .Select(int.Parse)
            .ToArray();

        foreach (var index in indexes)
        {
            if (index >= 0 || index < ladybugs.Length)
            {
                ladybugs[index] = 1;
            }

        }

        string command = Console.ReadLine();

        while (command != "end")
        {
            string[] split = command.Split();
            int position = int.Parse(split[0]);
            string direction = split[1];
            int flyLength = int.Parse(split[2]);

            int currentIndex = 0;

            bool hasBeenCompleted = false;


            if (direction == "left")
            {
                currentIndex = position - flyLength;

                while (!hasBeenCompleted)
                {
                    if (currentIndex < 0 || currentIndex >= ladybugs.Length)
                    {
                        ladybugs[position] = 0;
                        hasBeenCompleted = true;
                        continue;
                    }

                    else
                    {
                        ladybugs[position] = 0;

                        if (ladybugs[currentIndex] == 1)
                        {
                            currentIndex -= flyLength;
                        }

                        if (currentIndex < 0 || currentIndex >= ladybugs.Length)
                        {
                            hasBeenCompleted = true;
                            continue;
                        }

                        ladybugs[currentIndex] = 1;
                        hasBeenCompleted = true;


                    }
                }
            }

            else if (direction == "right")
            {
                currentIndex = position + flyLength;
                ladybugs[position] = 0;

                while (!hasBeenCompleted)
                {
                    if (currentIndex >= 0 && currentIndex < ladybugs.Length)
                    {
                        if (ladybugs[currentIndex] == 1)
                        {
                            currentIndex += flyLength;
                            continue;
                        }

                        if (currentIndex >= 0 && currentIndex < ladybugs.Length)
                        {
                            ladybugs[currentIndex] = 1;
                            hasBeenCompleted = true;
                            continue;
                        }
                        else
                        {
                            hasBeenCompleted = true;

                        }

                    }
                    else
                    {
                        hasBeenCompleted = true;

                    }

                


                command = Console.ReadLine();
            } }
        }
        foreach (var bug in ladybugs)
        {
            Console.Write("{0} ", bug);
        }

    }



}

