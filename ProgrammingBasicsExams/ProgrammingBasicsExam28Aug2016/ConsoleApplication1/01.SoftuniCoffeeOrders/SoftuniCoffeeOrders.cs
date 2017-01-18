using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Globalization;

class SoftuniCoffeeOrders
{
    static void Main(string[] args)
    {
        long n = long.Parse(Console.ReadLine());
        decimal totalMoney = 0.0M;

        if (n > 0)
        {

            for (int i = 0; i < n; i++)
            {
                decimal pricePerCapsule = decimal.Parse(Console.ReadLine());
                DateTime orderDate2 = DateTime.ParseExact(Console.ReadLine(), "d/M/yyyy", CultureInfo.InvariantCulture);

                long capsulesCount = long.Parse(Console.ReadLine());
                int daysinMonth = DateTime.DaysInMonth(orderDate2.Year, orderDate2.Month);
                decimal orderPrice = (daysinMonth * capsulesCount) * pricePerCapsule;

                totalMoney += orderPrice;

                Console.WriteLine("The price for the coffee is: ${0:F2}", orderPrice);
            }
        }
        Console.WriteLine("Total: ${0:F2}", totalMoney);


    }
}

