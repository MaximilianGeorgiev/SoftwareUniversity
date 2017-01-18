using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

class SweetDesert
{
    static void Main(string[] args)
    {
        double cash = double.Parse(Console.ReadLine());
        long guests = long.Parse(Console.ReadLine());
        double banana = double.Parse(Console.ReadLine());
        double egg = double.Parse(Console.ReadLine());
        double berries = double.Parse(Console.ReadLine());

        double multiplier = guests % 6;

        long portions = guests / 6;

        if (multiplier == 0)
        {
            double productsPrice = portions * 2 * banana + portions * 4 * egg + portions * 0.2 * berries;

            if (cash >= productsPrice)
            {
                Console.WriteLine("Ivancho has enough money - it would cost {0:F2}lv.", productsPrice);
            }
            else
            {
                Console.WriteLine("Ivancho will have to withdraw money - he will need {0:F2}lv more.", productsPrice - cash);
            }


        }
        else
        {
            portions++;
            double productsPrice = portions * 2 * banana + portions * 4 * egg + portions * 0.2 * berries;

            if (cash >= productsPrice)
            {
                Console.WriteLine("Ivancho has enough money - it would cost {0:F2}lv.", productsPrice);
            }
            else
            {
                Console.WriteLine("Ivancho will have to withdraw money - he will need {0:F2}lv more.", productsPrice - cash);
            }

        }

        

    }
}

