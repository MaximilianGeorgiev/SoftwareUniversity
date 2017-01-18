using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Text.RegularExpressions;
using System.Threading.Tasks;

class CubicMessages
{
    static void Main(string[] args)
    {
        string input = Console.ReadLine().Trim();
        

        while (!input.Equals("Over!"))
        {
            int number = int.Parse(Console.ReadLine().Trim());

            MatchCollection matches = Regex.Matches(input, "^(\\d+)([A-Za-z]+)([^A-Za-z]*)$");

            if (matches.Count < 0)
            {
                input = Console.ReadLine();
              
                continue;
            }

            string firstNums = "";
            string message = "";
            string secondNums = "";

            foreach (Match match in matches)
            {
                firstNums = match.Groups[1].ToString();
                message = match.Groups[2].ToString();
                secondNums = match.Groups[3].ToString();
            }

            if (message.Length != number)
            {
                input = Console.ReadLine();
                
                continue;
            }

            int[] firstIndexes = new int[firstNums.Length];
            List<int> secondIndexes = new List<int>();

            for (int i = 0; i < secondNums.Length; i++)
            {
                if (Regex.IsMatch(secondNums[i].ToString(), "\\d+"))
                {
                    secondIndexes.Add(int.Parse(secondNums[i].ToString()));
                }
            }


            for (int i = 0; i < firstNums.Length; i++)
            {
                firstIndexes[i] = int.Parse(firstNums[i].ToString());
            }


            Console.Write(message + " == ");

            for (int i = 0; i < firstIndexes.Length; i++)
            {
                if (firstIndexes[i] >= 0 && firstIndexes[i] < message.Length)
                {
                    Console.Write(message[firstIndexes[i]]);
                }
                else
                {
                    Console.Write(" ");
                }


            }

            for (int i = 0; i < secondIndexes.Count; i++)
            {
                if (secondIndexes[i] >= 0 && secondIndexes[i] < message.Length)
                {
                    Console.Write(message[secondIndexes[i]]);
                }
                else
                {
                    Console.Write(" ");
                }
            }

            Console.WriteLine();
            input = Console.ReadLine().Trim();
            
        }



    }
}