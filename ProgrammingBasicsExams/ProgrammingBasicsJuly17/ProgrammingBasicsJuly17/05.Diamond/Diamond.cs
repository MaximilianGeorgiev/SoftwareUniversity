using System;

class Diamond
{
    static void Main(string[] args)
    {
        int n = int.Parse(Console.ReadLine());

      
        Console.WriteLine(new string('.', n) + new string('*', 3 * n) + new string('.', n));

       
        for (int i = 1; i <= n - 1; i++)
        {
            Console.WriteLine(new string('.', n - i) + "*" + new string('.', 3 * n + 2 * i - 2) + "*" + new string('.', n - i));
        }

        
        Console.WriteLine(new string('*', 5 * n));

      
        for (int i = 1; i <= 2 * n + 1; i++)
        {
            if (i == 2 * n + 1)
            {
                Console.WriteLine(new string('.', 2 * n + 1) + new string('*', 5 * n - 2 * (2 * n + 1)) + new string('.', 2 * n + 1));
                break;
            }
            Console.WriteLine(new string('.', i) + "*" + new string('.', 5 * n - 4 - 2 * i + 2) + "*" + new string('.', i));
        }
    }
}