using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;


class Program
{
    static void Main(string[] args)
    {
        int fieldsize = int.Parse(Console.ReadLine());
        string[] indexes = Console.ReadLine().Split(new char[] { ' ' }, StringSplitOptions.RemoveEmptyEntries);
        int[] field = new int[fieldsize];
        string command = Console.ReadLine();

        foreach (var index in indexes)
        {
            int validIndex = int.Parse(index);

            if (validIndex >= 0 && validIndex < fieldsize)
            {
                field[validIndex] = 1;
            }
        }

        while (!command.Equals("end"))
        {
            int startPos = int.Parse(command.Split()[0]);
            string direction = command.Split()[1];
            int flylength = int.Parse(command.Split()[2]);

            if (startPos > fieldsize || startPos < 0) // doesn't do shit
            {
                continue;
            }

            if (direction.Equals("right"))
            {
                int finalPos = startPos + flylength;

                if (field[startPos] == 0)
                {
                    continue;
                }


                field[startPos] = 0;

                bool alreadyTaken = true;

                if (finalPos < fieldsize)
                {
                    while (alreadyTaken)
                    {

                        if (field[finalPos] == 1)
                        {
                            finalPos += flylength;

                        }
                        else if (field[finalPos] != 1)
                        {
                            alreadyTaken = false;
                            continue;
                        }
                    }
                }

                if (finalPos < fieldsize) // check again because we modify the finalpos
                {
                    field[finalPos] = 1;
                }
            }

            else if (direction.Equals("left"))
            {
                int finalPos = startPos - Math.Abs(flylength);

                if (field[startPos] == 0)
                {
                    continue;
                }

                field[startPos] = 0;

                bool alreadyTaken = true;


                if (finalPos >= 0)
                {
                    while (alreadyTaken)
                    {

                        if (field[finalPos] == 1)
                        {
                            finalPos -= flylength;

                        }

                        else if (field[finalPos] != 1)
                        {
                            alreadyTaken = false;
                            continue;
                        }

                    }
                }

                if (finalPos >= 0) // check again because we modify the finalpos
                {
                    field[finalPos] = 1;
                }

            }




            command = Console.ReadLine();
        }

        foreach (var bug in field)
        {
            Console.Write(bug + " ");
        }


    }
}