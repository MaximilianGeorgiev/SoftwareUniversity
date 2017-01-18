using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

class CommandInterpreter
{
    static void Main(string[] args)
    {
        List<string> array = Console.ReadLine()
            .Split(new char[] { }, StringSplitOptions.RemoveEmptyEntries)
            .ToList();

        string command = Console.ReadLine();

        while (!command.Equals("end"))
        {
            string[] commandSplit = command.Split(new char[] { }, StringSplitOptions.RemoveEmptyEntries);

            if (commandSplit[0].Equals("reverse"))
            {
                int startPos = int.Parse(commandSplit[2]);
                int count = int.Parse(commandSplit[4]);

                if (startPos < 0
                    || startPos >= array.Count
                    || startPos + count > array.Count
                    || count < 0)
                {
                    Console.WriteLine("Invalid input parameters.");
                    command = Console.ReadLine();
                    continue;
                }
                List<string> currList = array.Skip(startPos).Take(count).Reverse().ToList();

                array.RemoveRange(startPos, count);
                array.InsertRange(startPos, currList);
            }

            else if (commandSplit[0].Equals("sort"))
            {
                int startPos = int.Parse(commandSplit[2]);
                int count = int.Parse(commandSplit[4]);

                if (startPos < 0
                    || startPos >= array.Count
                    || startPos + count > array.Count
                    || count < 0)
                {
                    Console.WriteLine("Invalid input parameters.");
                    command = Console.ReadLine();
                    continue;
                }

                List<string> currList = array.Skip(startPos).Take(count).OrderBy(str => str).ToList();
                array.RemoveRange(startPos, count);
                array.InsertRange(startPos, currList);

            }

            else if (commandSplit[0].Equals("rollLeft"))
            {
                int count = int.Parse(commandSplit[1]);

                if (count < 0)
                {
                    Console.WriteLine("Invalid input parameters.");
                    command = Console.ReadLine();
                    continue;
                }
                if (count == 0)
                {
                    command = Console.ReadLine();
                    continue;

                }

                for (int i = 0; i < count % array.Count; i++)
                {
                    string firstElement = array[0];
                    array.RemoveAt(0);
                    array.Add(firstElement);

                }
            }
            else if (commandSplit[0].Equals("rollRight"))
            {
                int count = int.Parse(commandSplit[1]);

                if (count < 0)
                {
                    Console.WriteLine("Invalid input parameters.");
                    command = Console.ReadLine();
                    continue;
                }

                if (count == 0)
                {
                    command = Console.ReadLine();
                    continue;

                }

                for (int i = 0; i < count % array.Count; i++)
                {
                    string firstElement = array[array.Count - 1];
                    array.RemoveAt(array.Count - 1);
                    array.Insert(0, firstElement);
                }

            }

            command = Console.ReadLine();
        }
        string output = string.Join(", ", array);

        Console.WriteLine($"[{output}]");




    }
}

