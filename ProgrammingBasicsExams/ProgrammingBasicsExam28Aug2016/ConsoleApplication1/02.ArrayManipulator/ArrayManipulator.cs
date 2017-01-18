using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;


class ArrayManipulator
{
    static void Main(string[] args)
    {
        string[] inputArray = Console.ReadLine().Split();

        List<int> inputArray2 = new List<int>();

        foreach (var number in inputArray)
        {
            inputArray2.Add(int.Parse(number));
        }
        // the list is useful for max and min commands


        string array = string.Join("", inputArray); // useful for exchange command

        string input = Console.ReadLine();

        while (!input.Equals("end"))
        {
            string command = input.Split()[0];

            if (command.Equals("exchange"))
            {
                int index = int.Parse(input.Split()[1]);


                if (index >= inputArray2.Count || index < 0)
                {
                    Console.WriteLine("Invalid index");
                    input = Console.ReadLine();
                    continue;
                }

                if (index == inputArray2.Count - 1 && index != 0)
                {
                    input = Console.ReadLine();
                    continue;
                }


                List<int> firstPart = new List<int>();
                List<int> secondPart = new List<int>();

                if (index == 0)
                {
                    int value = inputArray2[0];
                    inputArray2.RemoveAt(0);
                    inputArray2.Add(value);

                    input = Console.ReadLine();
                    continue;
                }

                bool containsError = false;

                for (int i = 0; i <= index; i++)
                {
                    if (inputArray2.Count > index)
                    {
                        firstPart.Add(inputArray2[i]);
                    }
                    else
                    {
                        Console.WriteLine("Invalid index");
                        input = Console.ReadLine();
                        containsError = true;
                        break;
                    }
                    
                }

                for (int i = index + 1; i < inputArray2.Count; i++)
                {
                    if (inputArray2.Count > index)
                    {
                        secondPart.Add(inputArray2[i]);
                    }
                    else
                    {
                        Console.WriteLine("Invalid index");
                        input = Console.ReadLine();
                        containsError = true;
                        break;
                    }
                }
                if (!containsError)
                {
                    inputArray2 = secondPart.Concat(firstPart).ToList();
                }

               


            }

            else if (command.Equals("max"))
            {
                GetMax(inputArray2, input);

            }
            else if (command.Equals("min"))
            {
                GetMin(inputArray2, input);
            }
            else if (command.Equals("first"))
            {
                GetFirst(inputArray2, input);
            }
            else if (command.Equals("last"))
            {
                GetLast(inputArray2, input);
            }


            input = Console.ReadLine();
        }


        Console.WriteLine("[" + string.Join(", ", inputArray2) + "]");


    }

    private static void GetLast(List<int> inputArray2, string input)
    {
       

        int count = int.Parse(input.Split()[1]);
        string type = input.Split()[2];
        string print = "";

        if (count > inputArray2.Count)
        {
            Console.WriteLine("Invalid count");
        }

        else
        {
            List<int> numsThatMeetRq = new List<int>();

            if (type.Equals("odd"))
            {
                for (int i = inputArray2.Count - 1; i >= 0; i--)
                {
                    if (inputArray2[i] % 2 != 0)
                    {
                        numsThatMeetRq.Add(inputArray2[i]);
                    }
                }

            }

            else if (type.Equals("even"))
            {
                for (int i = inputArray2.Count - 1; i >= 0; i--)
                {
                    if (inputArray2[i] % 2 == 0)
                    {
                        numsThatMeetRq.Add(inputArray2[i]);
                    }
                }

            }

            if (numsThatMeetRq.Count == 0)
            {
                Console.WriteLine("[]");
            }
            else
            {
               
                print = string.Join(", ", numsThatMeetRq.Take(count).Reverse());
                Console.WriteLine("[{0}]", print);
            }
        }
    }

    private static void GetFirst(List<int> inputArray2, string input)
    {
        int count = int.Parse(input.Split()[1]);
        string type = input.Split()[2];
        string print = "";

        if (count > inputArray2.Count)
        {
            Console.WriteLine("Invalid count");
        }

        else
        {
            List<int> numsThatMeetRq = new List<int>();

            if (type.Equals("odd"))
            {
                for (int i = 0; i < inputArray2.Count; i++)
                {
                    if (inputArray2[i] % 2 != 0)
                    {
                        numsThatMeetRq.Add(inputArray2[i]);
                    }
                }

            }

            else if (type.Equals("even"))
            {
                for (int i = 0; i < inputArray2.Count; i++)
                {
                    if (inputArray2[i] % 2 == 0)
                    {
                        numsThatMeetRq.Add(inputArray2[i]);
                    }
                }

            }
            if (numsThatMeetRq.Count == 0)
            {
                Console.WriteLine("[]");
            }
            else
            {
                print = string.Join(", ", numsThatMeetRq.Take(count));
                Console.WriteLine("[{0}]", print);
            }
        }
    }

    private static void GetMin(List<int> inputArray2, string input)
    {
        string type = input.Split()[1];

        if (type.Equals("odd"))
        {
            List<int> evenNumbers = new List<int>();

            for (int i = 0; i < inputArray2.Count; i++)
            {
                if (inputArray2[i] % 2 != 0)
                {
                    evenNumbers.Add(inputArray2[i]);
                }
            }
            if (evenNumbers.Count == 0)
            {
                Console.WriteLine("No matches");
            }
            else
            {
                int minNum = int.MaxValue;

                for (int i = 0; i < evenNumbers.Count; i++)
                {
                    if (evenNumbers[i] < minNum)
                    {
                        minNum = evenNumbers[i];
                    }
                }
                Console.WriteLine(inputArray2.LastIndexOf(minNum));
            }

        }
        else if (type.Equals("even"))
        {
            List<int> oddNumbers = new List<int>();

            for (int i = 0; i < inputArray2.Count; i++)
            {
                if (inputArray2[i] % 2 == 0)
                {
                    oddNumbers.Add(inputArray2[i]);
                }
            }

            if (oddNumbers.Count == 0)
            {
                Console.WriteLine("No matches");
            }
            else
            {
                int minNum = int.MaxValue;

                for (int i = 0; i < oddNumbers.Count; i++)
                {
                    if (oddNumbers[i] < minNum)
                    {
                        minNum = oddNumbers[i];
                    }

                }
                Console.WriteLine(inputArray2.LastIndexOf(minNum));
            }


        }
    }

    private static void GetMax(List<int> inputArray2, string input)
    {
        string type = input.Split()[1];


        if (type.Equals("odd"))
        {
            List<int> oddNumbers = new List<int>();

            for (int i = 0; i < inputArray2.Count; i++)
            {
                if (inputArray2[i] % 2 != 0)
                {
                    oddNumbers.Add(inputArray2[i]);
                }
            }

            if (oddNumbers.Count == 0)
            {
                Console.WriteLine("No matches");
            }
            else
            {
                int maxValue = int.MinValue;

                for (int i = 0; i < oddNumbers.Count; i++)
                {
                    if (oddNumbers[i] > maxValue)
                    {
                        maxValue = oddNumbers[i];
                    }

                }
                Console.WriteLine(inputArray2.LastIndexOf(maxValue));
            }
        }

        else if (type.Equals("even"))
        {
            List<int> evenNumbers = new List<int>();

            for (int i = 0; i < inputArray2.Count; i++)
            {
                if (inputArray2[i] % 2 == 0)
                {
                    evenNumbers.Add(inputArray2[i]);
                }
            }

            if (evenNumbers.Count == 0)
            {
                Console.WriteLine("No matches");
            }
            else
            {
                int maxNum = int.MinValue;

                for (int i = 0; i < evenNumbers.Count; i++)
                {
                    if (evenNumbers[i] > maxNum)
                    {
                        maxNum = evenNumbers[i];
                    }

                }
                Console.WriteLine(inputArray2.LastIndexOf(maxNum));
            }


        }



    }
}

