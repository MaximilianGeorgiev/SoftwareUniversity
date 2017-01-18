using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Text.RegularExpressions;


class RageQuit
{
    static void Main(string[] args)
    {
        string input = Console.ReadLine().ToUpper();
        string pattern = "(\\D+)(\\d+)";
        int uniqueSymbols = 0;

        Regex regex = new Regex(pattern);
        MatchCollection collection = regex.Matches(input);
        StringBuilder output = new StringBuilder();

        foreach (Match match in collection)
        {
            for (int i = 0; i < int.Parse(match.Groups[2].ToString()); i++)
            {
                output.Append(match.Groups[1]);
            }
        }

        uniqueSymbols = output.ToString().Distinct().Count();
        Console.WriteLine($"Unique symbols used: {uniqueSymbols}");
        Console.WriteLine(output);
    }
}