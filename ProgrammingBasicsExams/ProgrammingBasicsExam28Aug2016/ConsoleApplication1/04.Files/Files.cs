using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Text.RegularExpressions;
using System.Threading.Tasks;

class Files
{
    static void Main(string[] args)
    {
        ulong numberOfFiles = ulong.Parse(Console.ReadLine());

        Dictionary<string, Dictionary<string, ulong>> filesCollection = new Dictionary<string, Dictionary<string, ulong>>();
       

        string pattern = @"([^\\]+)\\(?:(?:[^\\]+)\\)*([^\.]+).([^;]+);([0-9]+)";

        for (ulong i = 0; i < numberOfFiles; i++)
        {
            string input = Console.ReadLine();

            Match match = Regex.Match(input, pattern);

            if (!match.Success || !(match.Length == input.Length))
            {
                continue;
            }

            string rootFolder = match.Groups[1].ToString();
            string fileName = match.Groups[2].ToString() + "." + match.Groups[3].ToString();

            ulong size = ulong.Parse(match.Groups[4].ToString());
          
            if (!filesCollection.ContainsKey(rootFolder))
            {
                Dictionary<string, ulong> nameAndSize = new Dictionary<string, ulong>();
                nameAndSize[fileName] = size;
                filesCollection[rootFolder] = nameAndSize;
            }

            else
            {
                filesCollection[rootFolder][fileName] = size;
            }
        }

        string searchRequirements = Console.ReadLine();
        string fileExtensionToSearch = searchRequirements.Split()[0];
        string directoryToSearch = searchRequirements.Split()[2];

        bool containsValidFiles = false;

        Dictionary<string, ulong> nameAndSizeInRoot = new Dictionary<string, ulong>();

        if (filesCollection.ContainsKey(directoryToSearch))
        {
            nameAndSizeInRoot = filesCollection[directoryToSearch]
                                             .OrderByDescending(x => x.Value)
                                             .ThenBy(x => x.Key)
                                             .ToDictionary(x => x.Key, x => x.Value);
          
            foreach (KeyValuePair<string, ulong> item in nameAndSizeInRoot)
            {
               
                string fileBase = item.Key.Split('.')[0];
                string fileExtension = item.Key.Split('.').Last();

                if (fileExtension.Equals(fileExtensionToSearch))
                {
                    containsValidFiles = true;
                    Console.WriteLine($"{item.Key} - {item.Value} KB");
                }

            }

        }

        if (!containsValidFiles)
        {
            Console.WriteLine("No");
        }
    }
}