using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

class TheaThePhotographer
{
    static void Main(string[] args)
    {
        int picturesCount = int.Parse(Console.ReadLine());
        int filterTime = int.Parse(Console.ReadLine());
        float filterFactor = float.Parse(Console.ReadLine());
        int uploadTime = int.Parse(Console.ReadLine());

        if ((int)picturesCount <= 0 || filterTime < 0 || filterFactor < 0 || uploadTime < 0)
        {
            Console.WriteLine("0:00:00:00");
            return;
        }

        float usefulPicsAsInt = (Math.Round(filterFactor * picturesCount / 100, MidpointRounding.AwayFromZero));
        usefulPicsAsInt = (int)usefulPicsAsInt;

        //double usefulPics = filterFactor * picturesCount / 100;

        //if (usefulPics % 1 >= Double.Epsilon)
        //{
        //    usefulPicsAsInt++;
        //}



        int filterTimeTotal = (int)picturesCount * (int)filterTime;
        int uploadTimeTotal = (int)usefulPicsAsInt * (int)uploadTime;

        int totalTime = filterTimeTotal + uploadTimeTotal;

        TimeSpan result = TimeSpan.FromSeconds(totalTime);

        string output = "";

        if (result.Days >= 10)
        {
           output = result.ToString("dd':'hh':'mm':'ss");
        }
        else
        {
             output = result.ToString("d':'hh':'mm':'ss");
        }

        Console.WriteLine(output);
        


    }
}

