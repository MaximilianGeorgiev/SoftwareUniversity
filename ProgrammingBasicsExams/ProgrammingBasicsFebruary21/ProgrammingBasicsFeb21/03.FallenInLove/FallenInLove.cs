using System;

class FallenInLove
{
    static void Main(string[] args)
    {
        int n = int.Parse(Console.ReadLine());

        
        Console.WriteLine("##" + new string('.', 2 * n) + "##" + new string('.', 2 * n) + "##");

    
        for (int i = 1; i <= n - 1; i++)
        {
            Console.WriteLine("#" + new string('~', i) + "#" + new string('.', 2 * n - 2 * i) + "#" + new string('.', 2 * i) + "#" + new string('.', 2 * n - 2 * i) + "#" + new string('~', i) + "#");
        }

      
        for (int i = 1; i <= n; i++)
        {
            Console.WriteLine(new string('.', 2 * i - 1) + "#" + new string('~', n - i + 1) + "#" + new string('.', 2 * n - 2 * i + 2) + "#" + new string('~', n - i + 1) + "#" + new string('.', 2 * i - 1));
        }

       
        Console.WriteLine(new string('.', 2 * n + 1) + "####" + new string('.', 2 * n + 1));

     
        for (int i = 1; i <= n; i++)
        {
            Console.WriteLine(new string('.', 2 * n + 2) + "##" + new string('.', 2 * n + 2));
        }
    }
}